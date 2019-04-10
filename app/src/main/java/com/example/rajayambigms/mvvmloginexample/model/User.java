package com.example.rajayambigms.mvvmloginexample.model;

public class User {

    String username;
    String password;

    public User(String s, String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
