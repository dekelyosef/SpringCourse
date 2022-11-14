package ex_homework_cup;

import java.util.ArrayList;
import java.util.List;

public class CupProject {

	public static void main(String[] args) {
		
		System.out.println(Cup.counter);

		List<Cup> cups = new ArrayList<Cup>();
		cups.add(new CoffeeMug(300, TYPES.filter, true));
		cups.add(new EspressoCup(100, TYPES.espresso, "Enjoy youe coffee..."));
		cups.add(new TeaCup(250, true));
		
		for(Cup c: cups) {
			System.out.println(c.display());
			System.out.println(c.toString());
		}
		
		System.out.println(Cup.counter);
		
	}

}
