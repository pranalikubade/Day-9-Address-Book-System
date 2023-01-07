package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static void AddContact() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Creating New Contact-----");
        System.out.println("Enter First Name :");
        String FirstName = scanner.next();
        System.out.println("Enter Last Name :");
        String LastName = scanner.next();
        System.out.println("Enter Address Information");
        System.out.println("Enter City :");
        String city = scanner.next();
        System.out.println("Enter State :");
        String state = scanner.next();
        System.out.println("Enter Zip Code :");
        int zip = scanner.nextInt();
        System.out.println("Enter Phone Number :");
        long phone = scanner.nextInt();
        System.out.println("Enter Email Address :");
        String emailID = scanner.next();
    }

    public static void main(String[] args) {
        System.out.println("          -_-_-_-_-_Welcome to Address Book Program-_-_-_-_-_          ");
        Contact contact = new Contact();
        AddContact();
    }
}
