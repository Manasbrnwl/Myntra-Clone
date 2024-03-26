package com.myntra.backend.myntra.entities;

public class Rating {
  private double stars;
  private int count;

  public double getStars() {
    return stars;
  }

  public void setStars(double stars) {
    this.stars = stars;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public String toString() {
    return "Rating [stars=" + stars + ", count=" + count + "]";
  }

  public Rating(double stars, int count) {
    this.stars = stars;
    this.count = count;
  }

  public Rating() {
  }

}