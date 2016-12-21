package com.app.maffan.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maffan on 12/19/2016.
 */

public class User {

    @SerializedName("gender")
    private String gender;
    @SerializedName("name")
    private UserName name;
    @SerializedName("email")
    private String email;
    @SerializedName("dob")
    private String dob;
    @SerializedName("registered")
    private String registered;
    @SerializedName("phone")
    private String phone;
    @SerializedName("cell")
    private String cell;
    @SerializedName("picture")
    private UserPicture picture;

    public User(String gender, UserName name,String email, String dob, String registered, String phone, String cell,UserPicture picture) {

        this.gender = gender;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.registered = registered;
        this.phone = phone;
        this.cell = cell;
        this.picture = picture;
    }

    public String getGender() {
        return gender;
    }

    public UserName getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    public String getDob() {
        return dob;
    }

    public String getRegistered() {
        return registered;
    }

    public String getPhone() {
        return phone;
    }

    public String getCell() {
        return cell;
    }

    public UserPicture getPicture() {
        return picture;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(UserName name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setRegistered(String registered) {
        this.registered = registered;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public void setPicture(UserPicture picture) {
        this.picture = picture;
    }
}
