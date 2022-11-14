package ex_homework_animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalProject {

	public static void main(String[] args) {
		System.out.println(Animal.counter);

		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Rabbit("Momi", "Mimi", "carrot", 80));
		animals.add(new Lion("Arie", "Aria", true, 80));
		animals.add(new Hyena("Sol", "Soli", false, 10));
		animals.add(new Man("Moshe", "Miriam", false, 123456789));

		for(Animal a: animals) {
			System.out.println(a.display());
			a.makeSound();
		}
		
		System.out.println(Animal.counter);

	}

}
