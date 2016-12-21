package com.app.maffan.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by maffan on 12/20/2016.
 */

public class UserPicture {

    @SerializedName("large")
    private String large;
    @SerializedName("medium")
    private String medium;
    @SerializedName("thumbnail")
    private String thumbnail;

    public UserPicture(String large, String medium, String thumbnail) {
        this.large = large;
        this.medium = medium;
        this.thumbnail = thumbnail;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLarge() {
        return large;
    }

    public String getMedium() {
        return medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }
}
