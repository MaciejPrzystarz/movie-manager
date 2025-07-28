package com.usernameMaciej.model;

public class Actor {
    private String firstName;
    private String lastName;
    private String countryBorn;

    public Actor(String firstName, String lastName, String countryBorn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryBorn = countryBorn;
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

    public String getCountryBorn() {
        return countryBorn;
    }

    public void setCountryBorn(String countryBorn) {
        this.countryBorn = countryBorn;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", kraj urodzenia:" + countryBorn;
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
