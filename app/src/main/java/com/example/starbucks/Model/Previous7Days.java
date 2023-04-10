package com.example.starbucks.Model;

public class Previous7Days {

    private String type;
    private String date;
    private String cost;
    private String rewardPoints;
    private int typeImage;

    public Previous7Days(String type, String date, String cost, String rewardPoints, int typeImage) {
        this.type = type;
        this.date = date;
        this.cost = cost;
        this.rewardPoints = rewardPoints;
        this.typeImage = typeImage;
    }

    public Previous7Days() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(String rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public int getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(int typeImage) {
        this.typeImage = typeImage;
    }
}
