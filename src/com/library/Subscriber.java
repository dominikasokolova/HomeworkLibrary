package com.library;

public class Subscriber {
    private String firstName;
    private String lastName;
    private SubscriberAddress address;
    private String email;
    private int age;

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress address, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public boolean isUnderage() {
        return age < 18 ;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address.toString() + ", " + email + ", " + age;
    }
}
