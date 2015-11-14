package com.reiquiz.solution.models;

public class RangePair {

  private Integer min;
  private Integer max;

  public RangePair() {
  }

  public RangePair(Integer min, Integer max) {
    this.min = min;
    this.max = max;
  }

  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    RangePair rangePair = (RangePair) o;

    if (min != null ? !min.equals(rangePair.min) : rangePair.min != null) {
      return false;
    }
    return !(max != null ? !max.equals(rangePair.max) : rangePair.max != null);

  }

  @Override
  public int hashCode() {
    int result = min != null ? min.hashCode() : 0;
    result = 31 * result + (max != null ? max.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("(")
        .append(min)
        .append(",")
        .append(max)
        .append(")")
        .toString();
  }
}
