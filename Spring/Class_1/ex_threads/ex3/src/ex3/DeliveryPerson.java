package ex3;

public class DeliveryPerson implements Runnable {
	public Delivery delivey;
	
	public DeliveryPerson() {}
	
	public DeliveryPerson(Delivery delivey) {
		this.delivey = delivey;
	}
	
	public Delivery getDelivey() {
		return delivey;
	}
	
	public void setDelivey(Delivery delivey) {
		this.delivey = delivey;
	}

	@Override
	public void run() {
		try {
			int time = getRandomInt();
			Thread.sleep(time);
			System.out.println(this.delivey.toString() + ", delivery time=" + time + "]");
		} 
		catch (Exception e) { 
			e.printStackTrace(); 
		}
	}

	public int getRandomInt() {
		  return (int) Math.floor(Math.random() * (60 - 0) + 0);
	}
	

}
