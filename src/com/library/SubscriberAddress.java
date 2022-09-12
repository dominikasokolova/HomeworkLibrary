package com.library;

public class SubscriberAddress {
    private String streetName;
    private int streetNumber;
    private String city;
    private String country;
    private int zipCode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipCode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return streetName + " " + streetNumber + " " + city + " " + country + " " + zipCode;
    }
}
