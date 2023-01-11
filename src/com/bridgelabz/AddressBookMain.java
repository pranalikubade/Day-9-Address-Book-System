package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("          -_-_-_-_-_Welcome to Address Book Program-_-_-_-_-_          ");
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact();
        addressBook1.addContact();
        System.out.println(addressBook1.contactList);

    }
}
