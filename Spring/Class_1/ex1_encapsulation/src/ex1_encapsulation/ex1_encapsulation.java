package ex1_encapsulation;

import models.Chair;
import models.Flashlight;
import models.Speaker;

public class ex1_encapsulation {

	public static void main(String[] args) {
		
		Speaker speakerOne = new Speaker();
		speakerOne.setColor("Black");
		speakerOne.setVolume(2);
		callSpeakerFuncs(speakerOne);

		Speaker speakerTwo = new Speaker();
		speakerTwo.setColor("Red");
		speakerTwo.setVolume(8);
		callSpeakerFuncs(speakerTwo);
		
		Flashlight flashlightOne = new Flashlight();
		flashlightOne.setColor("Blue");
		flashlightOne.setLength(6);
		flashlightOne.setLuminosity(100);
		flashlightOne.setBatteryNum(1);
		callFlashlightFuncs(flashlightOne);
		

		Flashlight flashlightTwo = new Flashlight();
		flashlightTwo.setColor("Yellow");
		flashlightTwo.setLength(9);
		flashlightTwo.setLuminosity(150);
		flashlightTwo.setBatteryNum(2);
		callFlashlightFuncs(flashlightTwo);
		
		Chair chairOne = new Chair();
		chairOne.setMaterialType("Wood");
		chairOne.setColor("Green");
		chairOne.setLength(10);
		chairOne.setWidth(11.3);
		chairOne.setHeight(20.5);
		System.out.println(chairOne.toString()); 
		
		Chair chairTwo = new Chair();
		chairTwo.setMaterialType("Plastic");
		chairTwo.setColor("White");
		chairTwo.setLength(102.5);
		chairTwo.setWidth(110.3);
		chairTwo.setHeight(100.9);
		System.out.println(chairTwo.toString()); 
	}
	
	public static void callSpeakerFuncs(Speaker speaker) {
		speaker.turningOn();
		speaker.makeSound();
		speaker.turningOff();
		System.out.println(speaker.toString()); 
	}
	
	public static void callFlashlightFuncs(Flashlight flashlight) {
		flashlight.turningOn();
		flashlight.changeBattery();
		flashlight.turningOff();
		System.out.println(flashlight.toString()); 
	}

}
