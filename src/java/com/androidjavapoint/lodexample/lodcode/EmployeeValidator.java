package com.androidjavapoint.lodexample.lodcode;

public class EmployeeValidator {

    public static void main(String args[]) {
        Employee employee = new Employee();
        employee.setName("Employee1");

        Email email = new Email();
        email.setPrimaryEmailAddress("mail1@gmail.com");

        ContactNumber contactNumber = new ContactNumber();
        contactNumber.setMobile(987654321);

        employee.setEmail(email);
        employee.setContactNumber(contactNumber);

        boolean isValidEmployee = isValidEmployee(employee);
        System.out.println("Is Valid Employee : " + isValidEmployee);
    }

    private static boolean isValidEmployee(Employee employee) {
        boolean isValidPrimaryEmailAddress = employee.isValidPrimaryEmailAddress();

        boolean isValidMobile = employee.isValidMobile();

        // some good conditions
        if (isValidPrimaryEmailAddress && isValidMobile) {
            return true;
        }
        return false;
    }

}
