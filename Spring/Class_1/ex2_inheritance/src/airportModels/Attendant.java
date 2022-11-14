package airportModels;

import ex2_inheritance.Airport;

public class Attendant extends Airport {
	private int seniority;
	private String origin;
	
	public Attendant() {}
	
	public Attendant(String firstName, String surname, int seniority, String origin) {
		super(firstName, surname);
		this.seniority = seniority;
		this.origin = origin;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String display() {
		return (super.display() + ", seniority=" + seniority + ", origin=" + origin);
	}
	
	public boolean isSenior() {
		if(this.seniority >= 5) {
			return true;
		}
		return false;
	}

}
