package com.app.maffan.retrofitexample;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by maffan on 12/19/2016.
 */

@Entity
public class User {

    @Id
    private Long id;

    @NotNull
    private String title;

    @NotNull
    private String first;

    @NotNull
    private String last;

    @NotNull
    private String email;

    @NotNull
    private String dob;

    @NotNull
    private String phone;

    @NotNull
    private String cell;

    @NotNull
    private String thumbnailPic;

    @NotNull
    private String mediumPic;

    @NotNull
    private String largePic;


    @Generated(hash = 586692638)
    public User() {
    }

    @Generated(hash = 1535292734)
    public User(Long id, @NotNull String title, @NotNull String first,
            @NotNull String last, @NotNull String email, @NotNull String dob,
            @NotNull String phone, @NotNull String cell,
            @NotNull String thumbnailPic, @NotNull String mediumPic,
            @NotNull String largePic) {
        this.id = id;
        this.title = title;
        this.first = first;
        this.last = last;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.cell = cell;
        this.thumbnailPic = thumbnailPic;
        this.mediumPic = mediumPic;
        this.largePic = largePic;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return this.last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return this.dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCell() {
        return this.cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getThumbnailPic() {
        return this.thumbnailPic;
    }

    public void setThumbnailPic(String thumbnailPic) {
        this.thumbnailPic = thumbnailPic;
    }

    public String getMediumPic() {
        return this.mediumPic;
    }

    public void setMediumPic(String mediumPic) {
        this.mediumPic = mediumPic;
    }

    public String getLargePic() {
        return this.largePic;
    }

    public void setLargePic(String largePic) {
        this.largePic = largePic;
    }



}
