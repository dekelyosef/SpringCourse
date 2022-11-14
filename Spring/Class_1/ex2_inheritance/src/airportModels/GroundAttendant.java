package airportModels;

public class GroundAttendant extends Attendant {
	private String role;
	
	public GroundAttendant() {}
	
	public GroundAttendant(String firstName, String surname, int seniority, String origin, String role) {
		super(firstName, surname, seniority, origin);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isSenior() {
		return super.isSenior();
	}

	public String display() {
		return ("GroundAttendant [" + super.display() + ", role=" + role + "]");
	}
	
}
