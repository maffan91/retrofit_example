package com.app.maffan.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by maffan on 12/20/2016.
 */

public class UserInfo {

    @SerializedName("seed")
    private String seed;
    @SerializedName("results")
    private int results;
    @SerializedName("page")
    private int page;
    @SerializedName("version")
    private String version;


    public UserInfo(String seed, int results, int page, String version) {
        this.seed = seed;
        this.results = results;
        this.page = page;
        this.version = version;
    }

    public void setSeed(String seed) {
        this.seed = seed;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSeed() {
        return seed;
    }

    public int getResults() {
        return results;
    }

    public int getPage() {
        return page;
    }

    public String getVersion() {
        return version;
    }
}
