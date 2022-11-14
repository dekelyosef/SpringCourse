package ex_homework_animal;

public class Rabbit extends Herbivore implements Soundable {
	private int jumpsInMinute;

	public Rabbit() {
		super();
	}

	public Rabbit(String father, String mother, String favoritePlant, int jumpsInMinute) {
		super(father, mother, favoritePlant);
		this.jumpsInMinute = jumpsInMinute;
	}

	public int getJumpsInMinute() {
		return jumpsInMinute;
	}

	public void setJumpsInMinute(int jumpsInMinute) {
		this.jumpsInMinute = jumpsInMinute;
	}

	public String display() {
		return "Rabbit " + super.display() + ", jumpsInMinute=" + jumpsInMinute + "]";
	}

	@Override
	public void makeSound() {
		System.out.println("pss...pss...");
	}
	
}
