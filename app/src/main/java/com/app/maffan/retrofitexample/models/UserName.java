package com.app.maffan.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by maffan on 12/20/2016.
 */

public class UserName {

    @SerializedName("title")
    private String title;
    @SerializedName("first")
    private String first;
    @SerializedName("last")
    private String last;


    public UserName(String title, String first, String last) {
        this.title = title;
        this.first = first;
        this.last = last;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
