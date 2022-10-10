package day3Homework1;

public class Person extends Customer{
	private String natioanlIdentity;
	private String firstName;
	private String lastName;

	public String getNatioanlIdentity() {
		return natioanlIdentity;
	}

	public void setNatioanlIdentity(String natioanlIdentity) {
		this.natioanlIdentity = natioanlIdentity;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
