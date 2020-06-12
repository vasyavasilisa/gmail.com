package com.softclub.gmail.com.models;

import lombok.*;

@Getter
@Setter
@Builder(toBuilder = true)
public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String login, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
    }
}