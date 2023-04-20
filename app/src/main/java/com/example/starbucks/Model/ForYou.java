package com.example.starbucks.Model;

public class ForYou {

    private int image;
    private String caption;

    public ForYou(int image, String caption) {
        this.image = image;
        this.caption = caption;
    }

    public ForYou() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
