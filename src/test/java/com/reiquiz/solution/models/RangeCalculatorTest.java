package com.reiquiz.solution.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class RangeCalculatorTest {

  @Test
  public void testRanges() {
    int[] example = new int[] {1, 2, 3, 4, 5, 6, 3, 6, 8, 5, 8, 9, 4, 3, 5};
    int[] test1 = new int[] {1, 0, 2, 0, 3, 0, 0, 4};
    int[] empty = new int[0];
    int[] descending = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    RangeCalculator rangeCalculator = new RangeCalculator();

    List<RangePair> expected = new ArrayList<RangePair>();
    expected.add(new RangePair(0, 5));
    expected.add(new RangePair(6, 8));
    expected.add(new RangePair(9, 11));
    expected.add(new RangePair(13, 14));
    compareRangeLists(expected, rangeCalculator.findIncreasing(example));

    expected = new ArrayList<RangePair>();
    expected.add(new RangePair(1, 2));
    expected.add(new RangePair(3, 4));
    expected.add(new RangePair(6, 7));
    compareRangeLists(expected, rangeCalculator.findIncreasing(test1));

    expected = new ArrayList<RangePair>();
    assertEquals(expected, rangeCalculator.findIncreasing(empty));
    assertEquals(expected, rangeCalculator.findIncreasing(descending));
  }

  private void compareRangeLists(List<RangePair> expected, List<RangePair> actual) {
    for (int i = 0; i < expected.size(); i++) {
      assertEquals(actual.get(i), expected.get(i));
    }
  }
}
