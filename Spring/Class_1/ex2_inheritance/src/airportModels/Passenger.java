package airportModels;

import ex2_inheritance.Airport;

public class Passenger extends Airport {
	private int passportNum;
	
	public Passenger() {}

	public Passenger(String firstName, String surname, int passportNum) {
		super(firstName, surname);
		this.passportNum = passportNum;
	}

	public int getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(int passportNum) {
		this.passportNum = passportNum;
	}
	
	public String display() {
		return ("Passenger [" + super.display() + ", passportNum=" + passportNum + "]");
	}

}