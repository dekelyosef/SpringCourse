package ex5_furniture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FurnitureProject {
	
	public static void main(String[] args) {

		System.out.println(Dimensions.counter);
		
		List<Dimensions> furnitureList = new ArrayList<Dimensions>(20);
		String[] colors = {"Black", "White", "Blue", "Red", "Yellow"};
		Random randomGenerator = new Random();

		for (int i = 1; i <= 20; i++){
		    int rand = randomGenerator.nextInt(3) + 1;
		    if (rand == 1){
		    	furnitureList.add(new Chair(getRandom(10, 100), getRandom(10, 100), getRandom(10, 100),
		    			colors[randomGenerator.nextInt(colors.length)], (randomGenerator.nextInt(4) + 2)));
		    } else if (rand == 2){
		    	furnitureList.add(new Table(getRandom(10, 100), getRandom(10, 100), getRandom(10, 100),
		    			colors[randomGenerator.nextInt(colors.length)], (randomGenerator.nextInt(4) + 2)));
		    } else if (rand == 3){
		    	furnitureList.add(new Bed(getRandom(10, 100), getRandom(10, 100), getRandom(10, 100),
		    			colors[randomGenerator.nextInt(colors.length)], randomGenerator.nextBoolean()));
		    }
		}
		
		for (Dimensions x : furnitureList) {
			System.out.println(x.display());
			x.draw();
		    if(x instanceof Chair) {
		    	System.out.println(((Chair)x).getLegsNum());
		    }
		    if(x instanceof Table) {
		    	System.out.println(((Table)x).getSeatsNum());
		    }
		    if(x instanceof Bed) {
		    	System.out.println(((Bed)x).getIsEven());
		    }
		}

		System.out.println(Dimensions.counter);
	}
	
	public static double getRandom(int min, int max) {
		  return Math.random() * (max - min) + min;
		}

}
