package ex_homework_animal;

public class Lion extends Carnivore implements Soundable {
	private int weight;

	public Lion() {
		super();
	}

	public Lion(String father, String mother, boolean isCarnivore, int weight) {
		super(father, mother, isCarnivore);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String display() {
		return "Lion " + super.display() + ", weight=" + weight + "]";
	}

	@Override
	public void makeSound() {
		System.out.println("whaaa......");
	}

}
