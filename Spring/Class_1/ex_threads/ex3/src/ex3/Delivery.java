package ex3;

public class Delivery {
	
	private int departureTime;
	private String shippingContents;
	
	public Delivery() {
		this.departureTime = 3000;
		this.shippingContents = "";
	}
	
	public Delivery(int departureTime, String shippingContents) {
		this.departureTime = departureTime;
		this.shippingContents = shippingContents;
	}
	
	public int getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}
	
	public String getShippingContents() {
		return shippingContents;
	}
	
	public void setShippingContents(String shippingContents) {
		this.shippingContents = shippingContents;
	}

	@Override
	public String toString() {
		return "Delivery [departure time=" + departureTime + ", shipping contents=" + shippingContents;
	}
	

}
