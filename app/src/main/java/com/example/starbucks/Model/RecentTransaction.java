package com.example.starbucks.Model;

public class RecentTransaction {

    private String orderName;
    private String orderDate;
    private String orderAmount;
    private int orderImage;

    public RecentTransaction(String orderName, String orderDate, String orderAmount, int orderImage) {
        this.orderName = orderName;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.orderImage = orderImage;
    }

    public RecentTransaction() {

    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    public int getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(int orderImage) {
        this.orderImage = orderImage;
    }
}
