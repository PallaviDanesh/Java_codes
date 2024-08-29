package com.xworkz.wisdom;

public class Gun {
	private String name;
	private String countryMade;
	private String type;

	public Gun() {
		super();
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
	}

	public void fire() {
		System.out.println("gun fired...");

	}

	public void display() {
		System.out.println("name of the gun: " + this.name);
		System.out.println("made in: " + this.countryMade);
		System.out.println("type of gun: " + this.type);
	}

}

//four ways to import the packages- statements , in line , wild cards, static
/*
 * 6 ways to use class- as local variable, static variable,parameter,return data
 * type,instance variable,parent
 */
