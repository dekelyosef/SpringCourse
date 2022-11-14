package ex_homework_cup;

public class EspressoCup extends CoffeeCup {
	private String logo;

	public EspressoCup() {
		super();
	}

	public EspressoCup(int size, TYPES type, String logo) {
		super(size, type);
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String display() {
		return "EspressoCup" + super.display() + ", [logo=" + logo + "]";
	}

	@Override
	public String toString() {
		return "EspressoCup";
	}

}
