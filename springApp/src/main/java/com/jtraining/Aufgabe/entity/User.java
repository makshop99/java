package com.jtraining.Aufgabe.entity;

public class User
{
    // contructors -------------------------------------------------------------


    public User() {
    }

    public User(String lastName, String firstName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    private String firstName;
    private String lastName;


    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
