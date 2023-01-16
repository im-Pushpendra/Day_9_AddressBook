package com.bridgelabz.day9.UC_AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner sc = new Scanner(System.in);

	ContactPerson contact = new ContactPerson();
	ArrayList<ContactPerson> contactsArrayList = new ArrayList<ContactPerson>();

	public void addContact() {
		ContactPerson contact = new ContactPerson();

		System.out.println("Enter your FirstName: ");
		contact.setFirstName(sc.next());
		System.out.println("Enter your LastName: ");
		contact.setLastName(sc.next());
		System.out.println("Enter your Email: ");
		contact.setEmail(sc.next());
		System.out.println("Enter your Address: ");
		contact.setAddress(sc.next());
		System.out.println("Enter your City: ");
		contact.setCity(sc.next());
		System.out.println("Enter your State: ");
		contact.setState(sc.next());
		System.out.println("Enter your Zipcode: ");
		contact.setZip(sc.nextInt());
		System.out.println("Enter your Mobile Number: ");
		contact.setMobile(sc.nextLong());

		contactsArrayList.add(contact);
	}

	public void showContacts() {
		System.out.println(contact.toString());
		for (int i = 0; i < contactsArrayList.size(); i++) {
			ContactPerson contacts = contactsArrayList.get(i);
			System.out.println(contacts.toString());
		}

	}

	public void editContact() {

		System.out.println("Enter the First Name to Edit : ");
		String FirstName = (sc.next());
		boolean IsAvaible = false;

		for (ContactPerson contact : contactsArrayList) {
			if (contact.getFirstName().equals(FirstName)) {
				IsAvaible = true;

				System.out.println("Enter your FirstName: ");
				contact.setFirstName(sc.next());
				System.out.println("Enter your LastName: ");
				contact.setLastName(sc.next());
				System.out.println("Enter your Email: ");
				contact.setEmail(sc.next());
				System.out.println("Enter your Address: ");
				contact.setAddress(sc.next());
				System.out.println("Enter your City: ");
				contact.setCity(sc.next());
				System.out.println("Enter your State: ");
				contact.setState(sc.next());
				System.out.println("Enter your Zipcode: ");
				contact.setZip(sc.nextInt());
				System.out.println("Enter your Mobile Number: ");
				contact.setMobile(sc.nextLong());
			}
		}

		if (IsAvaible == false) {
			System.out.println("Contact Doesn't exist.");
		}
	}

}
