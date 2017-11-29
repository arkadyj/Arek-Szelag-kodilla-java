package com.kodilla.good.patterns.challenges;

public class User {

    private String sname;
    private String fname;

    public User(String sname, String fname) {
        this.sname = sname;
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public String getFname() {
        return fname;
    }
}
