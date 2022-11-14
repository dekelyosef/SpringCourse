package ex6_play;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Play {

	public static void main(String[] args) {
		List<Card> cardsList = new ArrayList<Card>(3);
		Random randomGenerator = new Random();

		cardsList.add(new Card());
		cardsList.add(new BlueCard());
		cardsList.add(new GreenCard());
		
		int player1 = 100;
		int player2 = 100;

		int card = 0;
		int blueCard = 0;
		int greenCard = 0;
		
		for(int i = 0; i < 5; i++) {
			Card c = cardsList.get(randomGenerator.nextInt(cardsList.size()));
			if(c instanceof BlueCard) {
				blueCard++;
			}else if(c instanceof GreenCard) {
				greenCard++;
			} else {
				card++;
			}
			player1 = c.doMagic(player1);
		}
		

		for(int i = 0; i < 5; i++) {
			Card c = cardsList.get(randomGenerator.nextInt(cardsList.size()));
			if(c instanceof BlueCard) {
				blueCard++;
			}else if(c instanceof GreenCard) {
				greenCard++;
			} else {
				card++;
			}
			player2 = c.doMagic(player2);
		}
		
		System.out.println(player1);
		System.out.println(player2);
		
		if(player1 > player2) {
			System.out.println("Player1 is the winner");
		} else if(player1 < player2) {
			System.out.println("Player2 is the winner");
		} else {
			System.out.println("It's a tie");
		}
		
		System.out.println("Card raffled " + card + " times");
		System.out.println("Blue Card raffled " + blueCard + " times");
		System.out.println("Green Card raffled " + greenCard + " times");
	}

}
