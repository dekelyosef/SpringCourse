package airportModels;

enum Class {Economy, Buisness, First}

public class FlightAttendant extends Attendant {
	private String aircraftClass;
	
	public FlightAttendant() {}

	public FlightAttendant(String firstName, String surname, int seniority, String origin, String aircraftClass) {
		super(firstName, surname, seniority, origin);
		this.setAircraftClass(aircraftClass);
	}

	public String getAircraftClass() {
		return aircraftClass;
	}

	public void setAircraftClass(String aircraftClass) {
		for (Class c : Class.values()) {
			if (c.name().equals(aircraftClass)) {
				this.aircraftClass = aircraftClass;
			}
		}
	}
	
	public String display() {
		return ("FlightAttendant [" + super.display() + ", aircraftClass=" + aircraftClass + "]");
	}
	
}
