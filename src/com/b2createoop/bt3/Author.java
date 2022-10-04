package com.b2createoop.bt3;

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Author: " + name + "Email: " + email + "Gender: " + gender;
    }
}