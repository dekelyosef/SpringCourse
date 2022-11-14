package ex6;

import java.util.PriorityQueue;

public class NoBugAirport {
	
	private static PriorityQueue<Airplane> landingList = new PriorityQueue<>();
	private static PriorityQueue<Airplane> takeoffList = new PriorityQueue<>(100);


	public static void main(String[] args) {
		Airplane airplaneJambo =  new Airplane(200, 60);
		Airplane airplaneAirbus =  new Airplane(100, 20);
		Airplane airplaneBoieng =  new Airplane(250, 50);
		
		Airport airport = new Airport();

		while(true) {

			if (takeoffList.size() <= 100) {
				Landing landing = new Landing(airplaneJambo);
				Thread t1 = new Thread(landing);
				t1.start();
			}
			if(!takeoffList.isEmpty()) {
				Airplane airplane = takeoffList.peek();
				Takeoff tekaoff = new Takeoff(airplane);
				Thread t2 = new Thread(tekaoff);
				t2.start();
			}
		}
	}
	
	public void landing(Airplane airplane) {
		airplanes.add(airplane);
		
	}
	
	public void takeoff(Airplane airplane) {
		airplanes.remove(airplane);
		
	}
	


}
