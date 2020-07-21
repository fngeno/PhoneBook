package PhoneBook;

import java.util.Scanner;

public class Menu {
	static Scanner input = new Scanner(System.in);

	public static void mainMenu() {
		boolean isEnd = false;

		do {
			displayRecords();
			displayMenu();

			System.out.println("\nchoice: ");
			String choice = input.nextLine();

			switch (choice) {
			case "1":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println(
						"\nEnter record in this order : FirstName LastName,Street address, city,state, zipcode, phoneNumber: ");
				String newRecord = input.nextLine();
				addNewRecord(newRecord);

				System.out.println(newRecord);

				break; // end of case 1

			case "2":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println(" Enter phone number to delete record: ");
				String deleteNumber = input.nextLine();
				Directory.deleteRecord(deleteNumber);

				System.out.println("\nThe  client record has been deleted");
				break;// end of case 2
			case "3":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println("Find Record by Telephone Number:");
				String phoneNumber = input.nextLine();
				Directory.getByPhoneNumber(phoneNumber);

				System.out.println("\nThe client information: " + phoneNumber);
				break;

			case "4":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println("Find record by First Name:");
				String firstName = input.nextLine();
				Directory.getByFirstName(firstName);

				System.out.println("\nThe client information: ");

				break;

			case "5":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println("\nFind record by Last Name: ");
				String lastName = input.nextLine();
				Directory.getByLastName(lastName);

				System.out.println("\nThe client information:");

				break;
			case "6":
				System.out.println("______________________________________________\n\t\t- Menu -\n");
				System.out.println("What phone number do you want to update? ");
				String upDateRecord = input.nextLine();
				System.out.println("Do you want to update: 1 Name, 2: Address, 3. Phonenumber");

				String selection = input.nextLine();

				switch (selection) {
				case "1":
					System.out.println("Follow the prompts for record update");
					System.out.println("Enter first Name");
					String newFirstName = input.nextLine();

					System.out.println("Enter last Name");
					String newLastName = input.nextLine();

					System.out.println("Enter fullname Name");
					String fullName = input.nextLine();

					Directory.upDate(upDateRecord).setFirstName(newFirstName);
					Directory.upDate(upDateRecord).setLastName(newLastName);
					Directory.upDate(upDateRecord).setFullName(fullName);
					break;

				case "2":
					System.out.println(" Enter the address components you want to change");
					Address newAddress = new Address();

					System.out.println(" Enter street Name below: ");
					newAddress.setStreetName(input.nextLine());

					System.out.println("Enter city name below: ");
					newAddress.setCity(input.nextLine());

					System.out.println("Enter state name below: ");
					newAddress.setState(input.nextLine());

					System.out.println("Enter zipcode below: ");
					newAddress.setZipCode(input.nextLine());

					Directory.upDate(upDateRecord).setMyAddress(newAddress);

					break;

				case "3":
					System.out.println("Enter the new number you would like: ");
					String newPhonenumber = input.nextLine();

					Directory.upDate(upDateRecord).setphoneNumber(newPhonenumber);
					break;

				}

				break;
			case "7":
				System.out.println("Exit");

				isEnd = true;
				break;
			default:
				System.out.println("Illegal choice! Please try again.");
				break;

			} // end of switch

		} while (isEnd != true);

	}// end of Main

	private static void addNewRecord(String newRecord) { // this method is for adding the person to the directory.
		String[] newRecordArray = newRecord.split(","); // tell java identify the different strings by commas

		String fullName = newRecordArray[0];

		String[] nameArray = fullName.split(" ");
		String firstName = nameArray[0];
		String lastName = newRecordArray[nameArray.length - 1];
		String streetName = newRecordArray[1];
		String city = newRecordArray[2];
		String state = newRecordArray[3];
		String zipCode = newRecordArray[4];
		String phoneNumber = newRecordArray[5].strip();

		Address address = new Address(streetName, city, state, zipCode);
		Person newPerson = new Person(fullName, firstName, lastName, address, phoneNumber);
		Directory.currentDirectory = Directory.addEntry(newPerson);

	} // end of addNewRecord

	static void displayRecords() {
		System.out.println("\nWelcome to My Phone Book Directory Application.");

		System.out.println("______________________________________________\n\t\t- Directory -\n");

		for (int i = 0; i < Directory.currentDirectory.length; i++) {
			if (Directory.currentDirectory[i] == null) {
				System.out.println("--");
				
			} else {
				System.out.println((i + 1) + ". " + (Directory.currentDirectory[i]));
				
	
			}
		} // end display records

	}

	static void displayMenu() {
		System.out.println("______________________________________________\n\t\t- Menu -\n");
		System.out.println("Enter 1:)  Add new Record: ");
		System.out.println("Enter 2:)  Delete Record: ");
		System.out.println("Enter 3:)  Find Record by Telephone Number: ");
		System.out.println("Enter 4:)  Find record by First Name: ");
		System.out.println("Enter 5:)  Find Record by Last Name: ");
		System.out.println("Enter 6:)  Update a Record: ");
		System.out.println("Enter 7:)  Exit");
	}
} // end of class
