package com.example.starbucks.Model;

public class News {

    private int newsImage;
    private String newsCaption;

    public News(int newsImage, String newsCaption) {
        this.newsImage = newsImage;
        this.newsCaption = newsCaption;
    }

    public News() {

    }

    public int getNewsImage() {
        return newsImage;
    }

    public void setNewsImage(int newsImage) {
        this.newsImage = newsImage;
    }

    public String getNewsCaption() {
        return newsCaption;
    }

    public void setNewsCaption(String newsCaption) {
        this.newsCaption = newsCaption;
    }
}
