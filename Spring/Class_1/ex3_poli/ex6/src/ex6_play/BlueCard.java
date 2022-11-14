package ex6_play;

public class BlueCard extends Card {
	public BlueCard() {}
	
	@Override
	public int doMagic(int value) {
		return 2 * value;
	}	

}