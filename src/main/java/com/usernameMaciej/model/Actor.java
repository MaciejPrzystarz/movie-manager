package com.usernameMaciej.model;

public class Actor {
    private String firstName;
    private String lastName;
    private String countryOrigin;

    public Actor(String firstName, String lastName, String countryOrigin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOrigin = countryOrigin;
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

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", countryOrigin='" + countryOrigin + '\'' +
                '}';
    }
}
