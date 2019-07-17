package com.stackroute;

public class User {
    String username;
    String Password;


    public User(String username, String password) {
        this.username = username;
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
