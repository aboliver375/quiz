package com.reiquiz.solution;

import com.reiquiz.solution.models.RangePair;

import java.util.ArrayList;
import java.util.List;

public class RangeCalculator {

  public List<RangePair> findIncreasing(final int[] values) {
    final List<RangePair> result = new ArrayList<>();
    RangePair pair = new RangePair();

    for (int count = 0, prev = 0, position = 1; position < values.length; position++, prev++) {
      if (values[position] > values[prev]) {

        if (pair.getStart() == null) {
          pair.setStart(prev);
        }
        count++;
      } else {
        if (count > 0) {

          if (pair.getStart() != null) {
            pair.setEnd(prev);
            result.add(pair);
            count = 0;
          }
          pair = new RangePair();
        }
      }
    }

    //Add final value if array ends on a pair
    if (pair.getEnd() == null && pair.getStart() != null) {
      pair.setEnd(values.length - 1);
      result.add(pair);
    }
    return result;
  }
}
