package PhoneBook;

public class Directory {

	public static Person[] currentDirectory = new Person[0];

	public static Person[] addEntry(Person newEntry) {
		Person[] newArray = new Person[currentDirectory.length + 1];
		for (int i = 0; i < currentDirectory.length; i++) {
			newArray[i] = currentDirectory[i];
		}
		newArray[newArray.length - 1] = newEntry;
		return newArray; // this is the index of the last entry element of the Person array.
	}

	////////////////////////////////////////////////////////////////////////////////////////////

	public static void deleteRecord(String telephoneNum) {
		Person[] newArray = new Person[currentDirectory.length - 1];
		int counter = 0; // this to count number of entry present
		for (int i = 0; i < currentDirectory.length; i++) {
			if (!currentDirectory[i].getPhoneNumber().equals(telephoneNum)) {
				newArray[counter] = currentDirectory[i];
				counter++; // tract the index of the new array
			}
		}
		currentDirectory = newArray;
		for (Person person : newArray) {
			System.out.println(person);
		}

	}

	//////////////////////////////////////////////////////////////////////////////////////////////

	public static Person[] getByPhoneNumber(String phoneNumber) { // searching the person by phone number, logic
																	// everyone
		Person[] newArray = new Person[currentDirectory.length]; // has one phone number in the directory
		int counter = 0;
		for (int i = 0; i < currentDirectory.length; i++) {
			if (currentDirectory[i].getPhoneNumber().equalsIgnoreCase(phoneNumber)) {
				newArray[counter] = currentDirectory[i];
				counter++; // tract the index of the new array
			}
		}
		for (Person person : newArray) {
			System.out.println(person);
		}
		return newArray;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static Person[] getByFirstName(String firstName) {

		// Person[] newArray = new Person[currentDirectory.length];
		int counter = 0;
		// loop through the original array to find out the size of the new array.
		for (int i = 0; i < currentDirectory.length; i++) {
			System.out.println(currentDirectory[i].getFirstName());
			if (currentDirectory[i].getFirstName().equalsIgnoreCase(firstName)) {

				counter++; // track the index of the new array
			}
		}
		// create the size of the array based on the size of the counter
		Person[] newArray = new Person[counter];
		int x = 0;
		// loops through adding each new person to the new array and increasing the x
		// variable
		for (int j = 0; j < currentDirectory.length; j++) {
			if (currentDirectory[j].getFirstName().equalsIgnoreCase(firstName)) {
				newArray[x] = currentDirectory[j];
				x++;
			}
		}
		return newArray;
	}

	////////////////////////////////////////////////////////////////////////////////////////////////

	public static Person[] getByLastName(String lastName) {

		int counter = 0;

		for (int i = 0; i < currentDirectory.length; i++) {
			System.out.println(currentDirectory[i].getLastName());
			if (currentDirectory[i].getLastName().equalsIgnoreCase(lastName)) {
				counter++;
			}
		}

		Person[] newArray = new Person[counter];
		int x = 0;

		for (int j = 0; j < currentDirectory.length; j++) {
			if (currentDirectory[j].getLastName().equalsIgnoreCase(lastName)) {
				newArray[x] = currentDirectory[j];
				x++;
			}
		}
		return newArray;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////

	public static Person upDate(String upDatedEntry) {
		for (Person person : currentDirectory) {
			if (person.getPhoneNumber().equals(upDatedEntry)) {
				return person;
			}
		}
		return null;

	}

	public static void sortCurrentDirectory(Person[] currentDirectory) {
		Person temp;
		for (int i = 0; i < currentDirectory.length; i++) { // sort the first name with first letter as capital letter.
			for (int j = i + 1; j < currentDirectory.length; j++) {
				if (currentDirectory[i].getFullName().compareTo(currentDirectory[j].getFullName()) > 0) {
					temp = currentDirectory[i];
					currentDirectory[i] = currentDirectory[j];
					currentDirectory[j] = temp;
				}

			}
		}

	}

}
