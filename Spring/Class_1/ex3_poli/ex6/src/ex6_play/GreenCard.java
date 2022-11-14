package ex6_play;

public class GreenCard extends Card {
	public GreenCard() {}
	
	@Override
	public int doMagic(int value) {
		return value / 2;
	}	

}