package com.xworkz.oops;

public class Halwa {
	public String color;
	public String texture;
	public String sugarLevel;
	public Halwa() {
		super();
		System.out.println("Halwa runs with no-argument constructor");
	}
	public Halwa(String color, String texture, String sugarLevel) {
		super();
		this.color = color;
		this.texture = texture;
		this.sugarLevel = sugarLevel;
		System.out.println("Halwa runs with parameterized constructor");
	}
	public void sweetInfo()
	{
		System.out.println("color of sweet: "+this.color);
		System.out.println("texture of sweet: "+this.texture);		
	}
	public void sweetness() {
		System.out.println("sugar level in sweet:"+this.sugarLevel);
	}

}
