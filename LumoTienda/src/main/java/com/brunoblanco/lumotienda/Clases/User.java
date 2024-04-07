package com.brunoblanco.lumotienda.Clases;

public class User {
    private String user;
    private String pass;

    public User() {
        this.user = "admin";
        this.pass = "admin123";
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
