package ex3_vehicle;

import java.util.ArrayList;
import java.util.List;

public class ex3_vehicleProject {

	public static void main(String[] args) {
		
		System.out.println(Vehicle.counter);
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(new ElectricCar("Black", 4, true, true));
		vehicleList.add(new PetrolCar("Blue", 4, true, 2015));
		vehicleList.add(new ElectricTruck("White", 6, 10, "AAA"));
		vehicleList.add(new PetrolTruck("Yellow", 6, 10, "YYY"));
		
		for(Vehicle vehicle : vehicleList) {
			System.out.println(vehicle.toString());
			System.out.println(vehicle.display());
		}
		
		System.out.println(Vehicle.counter);
	}

}
