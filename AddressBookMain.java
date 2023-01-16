package com.bridgelabz.day9.UC_AddressBook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book system Program ");
		AddressBook addressBook = new AddressBook();
		int option;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT ");
			System.out.println("Enter the Operation Number");
			option = sc.nextInt();

			switch (option) {
			case 1:
				addressBook.addContact();
				break;
			case 2:
				addressBook.showContacts();
				break;
			default:
				System.out.println("Wrong Operation Number");
				break;
			}
		} while (option < 3);

	}

}
