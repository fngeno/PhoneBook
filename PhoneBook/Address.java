package PhoneBook;

public class Address {
	private String streetName;
	private String city;
	private String state;
	private String zipCode;

	public Address() {

	}

	public Address(String streetName, String city, String state, String zipCode) { // constructors: to initialize the
																					// declared variable.
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreetName() { // getter
		return this.streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() { // getter
		return this.city;
	}

	public void setCity(String city) { // setter
		this.city = city;
	}

	public String getState() { // Add getter
		return this.state;
	}

	public void setState(String state) { // setters
		this.state = state;
	}

	public String getZipCode() { // Add getters
		return this.zipCode;
	}

	public void setZipCode(String zipCode) { // setters
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return streetName + ", " + city + ", " + state + ", " + zipCode; // overriding method for the address from address class
	}

}
