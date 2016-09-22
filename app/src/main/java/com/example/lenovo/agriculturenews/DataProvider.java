package com.example.lenovo.agriculturenews;

/**
 * Created by Lenovo on 9/20/2016.
 */
public class DataProvider {

    int image;
    String date;
    String headline;


    public DataProvider(int image, String date, String headline) {
        this.image = image;
        this.date = date;
        this.headline = headline;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }
}
