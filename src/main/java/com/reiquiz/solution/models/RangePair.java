package com.reiquiz.solution.models;

public class RangePair {

  private Integer start;
  private Integer end;

  public RangePair() {
  }

  public RangePair(Integer start, Integer end) {
    this.start = start;
    this.end = end;
  }

  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public Integer getEnd() {
    return end;
  }

  public void setEnd(Integer end) {
    this.end = end;
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

    if (start != null ? !start.equals(rangePair.start) : rangePair.start != null) {
      return false;
    }
    return !(end != null ? !end.equals(rangePair.end) : rangePair.end != null);

  }

  @Override
  public int hashCode() {
    int result = start != null ? start.hashCode() : 0;
    result = 31 * result + (end != null ? end.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return new StringBuilder()
        .append("(")
        .append(start)
        .append(",")
        .append(end)
        .append(")")
        .toString();
  }
}
