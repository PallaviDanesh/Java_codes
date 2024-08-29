package com.xworkz.oops;

//led is a child class or derived class
public class Led extends Bulb {
	private String colour;

	public Led() {
		super();
		System.out.println("led runs in no-argumnet constructor");
	}

	public Led(String colour) {
		this.colour = colour;
		System.out.println("color of led is " + this.colour);
	}

	public static void main(String[] args) {

		//System.out.println("led is glowing");
		Bulb bulb = new Led();
		Led led = new Led();
		led.watt = 20;
		led.colour = "red";
		led.bulbFeature();
		Led led1 = new Led("Green"); // using same class
		Bulb bulb1 = new Led("red"); // using parent class , we instantiated the child class
		Bulb bulb2 = new Bulb(30);
		bulb2.bulbFeature();

	}

}
