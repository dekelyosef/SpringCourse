package ex_homework_animal;

public class Hyena extends Carnivore implements Soundable {
	private int age;

	public Hyena() {
		super();
	}

	public Hyena(String father, String mother, boolean isCarnivore, int age) {
		super(father, mother, isCarnivore);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String display() {
		return "Hyena " + super.display() + ", age=" + age + "]";
	}

	@Override
	public void makeSound() {
		System.out.println("whii...whii...");
	}

}
