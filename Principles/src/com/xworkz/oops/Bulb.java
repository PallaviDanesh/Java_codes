package com.xworkz.oops;

public class Bulb {
	public int watt;

	public Bulb() {
		System.out.println("Bulb runs in no-argumnet constructor");
	}

	public Bulb(int watt) {
		super();
		this.watt = watt;
		// System.out.println("bulb is glowing at "+watt+" watts");
	}

	public void bulbFeature() {
		System.out.println("Bulb is glowing at " + watt + " watts");
	}

}
