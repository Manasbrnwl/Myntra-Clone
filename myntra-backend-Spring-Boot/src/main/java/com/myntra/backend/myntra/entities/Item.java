package com.myntra.backend.myntra.entities;

public class Item {

  private String id;
  private String image;
  private String company;
  private String itemName;
  private double originalPrice;
  private double currentPrice;
  private int discountPercentage;
  private int returnPeriod;
  private String deliveryDate;
  private Rating rating;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public double getOriginalPrice() {
    return originalPrice;
  }

  public void setOriginalPrice(double originalPrice) {
    this.originalPrice = originalPrice;
  }

  public double getCurrentPrice() {
    return currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  public int getDiscountPercentage() {
    return discountPercentage;
  }

  public void setDiscountPercentage(int discountPercentage) {
    this.discountPercentage = discountPercentage;
  }

  public int getReturnPeriod() {
    return returnPeriod;
  }

  public void setReturnPeriod(int returnPeriod) {
    this.returnPeriod = returnPeriod;
  }

  public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public Item(String id, String image, String company, String itemName, double originalPrice, double currentPrice,
      int discountPercentage, int returnPeriod, String deliveryDate, Rating rating) {
    this.id = id;
    this.image = image;
    this.company = company;
    this.itemName = itemName;
    this.originalPrice = originalPrice;
    this.currentPrice = currentPrice;
    this.discountPercentage = discountPercentage;
    this.returnPeriod = returnPeriod;
    this.deliveryDate = deliveryDate;
    this.rating = rating;
  }

  public Item() {
  }

  @Override
  public String toString() {
    return "item [id=" + id + ", image=" + image + ", company=" + company + ", itemName=" + itemName
        + ", originalPrice=" + originalPrice + ", currentPrice=" + currentPrice + ", discountPercentage="
        + discountPercentage + ", returnPeriod=" + returnPeriod + ", deliveryDate=" + deliveryDate + ", rating="
        + rating + "]";
  }

}
