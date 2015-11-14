package com.reiquiz.solution;

import com.reiquiz.solution.models.RangePair;

import java.util.ArrayList;
import java.util.List;

public class RangeCalculator {

  public List<RangePair> findIncreasing(final int[] values) {
    int prev = 0;
    int count = 0;

    RangePair pair = new RangePair();
    final List<RangePair> result = new ArrayList<RangePair>();

    for (int i = 1; i < values.length; i++) {
      if (values[i] > values[prev]) {

        if (pair.getMin() == null) {
          pair.setMin(prev);
        }
        count++;
      } else {
        if (count > 0) {

          if (pair.getMin() != null) {
            pair.setMax(prev);
            result.add(pair);
            count = 0;
          }
          pair = new RangePair();
        }
      }
      prev = i;
    }

    //Add final value if array ends on a pair
    if (pair.getMax() == null && pair.getMin() != null) {
      pair.setMax(values.length - 1);
      result.add(pair);
    }
    return result;
  }
}
