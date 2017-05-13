package com.androidjavapoint.lodexample.lodcode;

public class Employee {

    String name;
    Email email;
    ContactNumber contactNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public ContactNumber getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ContactNumber contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isValidPrimaryEmailAddress() {
        return email.getPrimaryEmailAddress() != null;
    }

    public boolean isValidMobile() {
        return contactNumber.getMobile() != 0;
    }
}
