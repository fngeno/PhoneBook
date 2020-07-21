package PhoneBook;

public class Main {

	public static void main(String[] args) {

		Person client1 = new Person("John Doe", "John", "Doe", new Address(" 114 Market St", " St. Louis", " MO", " 63403"),
				"6366435698");
		Person client2 = new Person("John E Doe", "John", "Doe", new Address(" 324 Main St", "St. Charles", " MO", " 63403"),
				"8475390126");
		Person client3 = new Person("John Micheal West Doe", "John", "Doe",
				new Address(" 114 Market St", " St. Louis", " MO", " 63403"), "6364356980");

		Directory.currentDirectory = Directory.addEntry(client1);
		Directory.currentDirectory = Directory.addEntry(client2);
		Directory.currentDirectory = Directory.addEntry(client3);

		System.out.println(Directory.currentDirectory[0].getPhoneNumber());

		Menu.mainMenu();
		
	}
}