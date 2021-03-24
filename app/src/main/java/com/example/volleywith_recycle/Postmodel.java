package com.example.volleywith_recycle;

public class Postmodel {
    int userid;
    String title;
    String description;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Postmodel(int userid, String title, String description,String email) {
        this.userid = userid;
        this.title = title;
        this.description = description;
        this.email=email;
    }
}
