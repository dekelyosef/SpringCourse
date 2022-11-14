package ex3;

import java.util.ArrayList;

public class Main {
	
	public static ArrayList<Delivery> deliveriesList = new ArrayList<>();

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			deliveriesList.add(new Delivery(getRandomInt(), "delivery contains " + i + " items"));
		}

		for(int i = 0; i < 10; i++) {
			DeliveryPerson deliveryPerson = new DeliveryPerson(getNextDelivery());
			Thread t = new Thread(deliveryPerson);
			t.start();
		}
		
	}
	
	public static int getRandomInt() {
		  return (int) Math.floor(Math.random() * (2459 - 0000) + 0000);
	}
	
	public static Delivery getNextDelivery() {
		Delivery nextDelivery = new Delivery();
		for(Delivery d: deliveriesList) {
			if (d.getDepartureTime() < nextDelivery.getDepartureTime()) {
				nextDelivery = d;
			}
		}
		deliveriesList.remove(nextDelivery);
		return nextDelivery;
	}

}
