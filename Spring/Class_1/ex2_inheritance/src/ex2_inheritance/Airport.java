package ex2_inheritance;

public abstract class Airport {
	private String firstName;
	private String surname;
	
	public Airport() {}

	public Airport(String firstName, String surname) {
		this.firstName = firstName;
		this.surname = surname;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String display() {
		return ("firstName=" + firstName + ", surname=" + surname);
	}

}
