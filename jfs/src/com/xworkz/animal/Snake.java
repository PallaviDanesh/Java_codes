package com.xworkz.animal;

public class Snake {
	
	//ctrl+space for suggestion like sys.out. will become System.out.println
	// ctrl+shift+f for formatting code ----beautify
	private String name;
	private int length;
	private String type;

	public Snake(String name, int length, String type) {
		this.name = name;
		this.length = length;
		this.type = type;
	}

	public void display() {
		System.out.println("Name of Snake:" + this.name);
		System.out.println("length of snake:" + this.length);
		System.out.println("Type of snake:" + this.type);
	}
}
