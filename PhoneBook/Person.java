package PhoneBook;

public class Person {

	private String firstName; // declaring the variable as private
	private String lastName;
	private String fullName;
	private String phoneNumber;
	public Address myAddress;
	

//sets parameters for the new person
	public Person(String fullName, String firstName, String lastName, Address myAddress, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.myAddress = myAddress;
		this.fullName = fullName;
	}
	public Person(String fullName, Address myAddress, String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.myAddress = myAddress;
		this.fullName = fullName;
	}
	
	public Address getmyAddress() {
		return this.myAddress;
	}
	
	public void setMyAddress( Address myAddress) {
		this.myAddress = myAddress;
	}

	public String getFirstName() { // first name getters
		return this.firstName;
	}

	public void setFirstName(String firstName) { //
		this.firstName = firstName;
	}

	public String getLastName() { // last getters
		return this.lastName;
	}

	public void setLastName(String lastName) { // last name setters
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() { // getter
		return this.phoneNumber;
	}
  

	public void setphoneNumber(String phoneNumber) { // setter
		this.phoneNumber = phoneNumber;
	}

	public String toString() {
		return fullName + "," + myAddress + " (" + phoneNumber.substring(0, 3) + ")-"
				+ phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6) + "\n";
	}
	
}