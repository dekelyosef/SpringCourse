package ex2_inheritance;

import airportModels.FlightAttendant;
import airportModels.GroundAttendant;
import airportModels.Passenger;
import airportModels.Pilot;
import musicalModels.Drum;
import musicalModels.GrandPiano;
import musicalModels.Guitar;
import musicalModels.Piano;

public class ex2_inheritance {

	public static void main(String[] args) {
//		MusicalInstrument();
		Airport();
	}
	
	private static void Airport() {
		Pilot pilot = new Pilot("Avi", "Ron", 123456, 5);
		System.out.println(pilot.display());

		FlightAttendant flightAttendant = new FlightAttendant("Tzila", "Kabina", 3, "Israel", "Buisness");
		System.out.println(flightAttendant.display());

		GroundAttendant groundAttendant = new GroundAttendant("Araz", "Tlevd", 4, "Israel", "Security");
		System.out.println(groundAttendant.display());

		Passenger passenger = new Passenger("Simcha", "Gora", 123123);
		System.out.println(passenger.display());
	
	}

	public static void MusicalInstrument() {
		Guitar guitar = new Guitar("A", "B", "Green", 4);
		System.out.println(guitar.display());
		guitar.makeSound();

		Drum drum = new Drum("AA", "BB", "Blue", 64);
		System.out.println(drum.display());
		drum.makeSound();

		Piano piano = new Piano("AAA", "BBB", "Black", 157);
		System.out.println(piano.display());
		piano.makeSound();

		GrandPiano grandPiano = new GrandPiano("A", "B", "Black", 165, 300);
		System.out.println(grandPiano.display());
		grandPiano.makeSound();
	}

}
