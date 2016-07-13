package com.upa.codeRefactoring;

//Demonstrate how to extract a class, and move methods and fields
//Classes with too many responsibilities must me split
//1. Look for a set of data that goes together
//2. Create a new class with a name that describes that data
//3. Move all the fields and methods
//4. Decide how to provide access to the new class

public class Customer {

	private String firstName = "";
	private String lastName = "";

	private Address address = null;

	private Birthday birthDay = null;

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String firstName, String lastName, String street,
			String city, String state, int postalCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street, city, state, postalCode);
	}

	public Customer(String firstName, String lastName, Address address,
			Birthday birthDay) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDay = birthDay;
	}

	public static void main(String[] args) {

		Customer sallySmith = new Customer("Sally", "Smith", "123 Main St",
				"Perry", "Iowa", 50220);

		// The positive of accessing fields through accessor methods is that
		// subclasses can override the way fields are accessed and the fields
		// can be protected. The negative is that the code is hard to read

		System.out.println("Customer Name: " + sallySmith.getFirstName() + " "
				+ sallySmith.getLastName());
		System.out.println("Address: " + sallySmith.address.getStreet() + " "
				+ sallySmith.address.getCity() + " "
				+ sallySmith.address.getState() + " "
				+ sallySmith.address.getPostalCode());

		Address markJonesAddress = new Address("123 Main St", "Perry", "Iowa",
				50220);

		Birthday markJonesBirthday = new Birthday(12, 21, 1974);

		Customer markJones = new Customer("Mark", "Jones", markJonesAddress,
				markJonesBirthday);

		// I can call for the birthday directly because I have toString() in
		// Birthday

		System.out.println(markJones.birthDay);

		// Versus this, or the call to accessor methods

		System.out.println(markJones.birthDay.getBirthDate());

		// I can do the same with Address

		System.out.println(markJones.address);

	}

}

class Address {

	private String street = "";
	private String city = "";
	private String state = "";
	private int postalCode = 0;

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public Address(String street, String city, String state, int postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {

		return this.getStreet() + " " + this.getCity() + " " + this.getState()
				+ " " + this.getPostalCode();

	}

}

// Early in development many fields are represented as primitives
// or Strings. Later in development custom objects make more sense

class Birthday {

	private int day;
	private int month;
	private int year;

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Birthday(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String getBirthDate() {

		return this.getDay() + " / " + this.getMonth() + " / " + this.getYear();

	}

	@Override
	public String toString() {

		return this.getDay() + " / " + this.getMonth() + " / " + this.getYear();

	}

}