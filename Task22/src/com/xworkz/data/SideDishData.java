package com.xworkz.data;

public class SideDishData {

	private String name;
	private double price;
	private String type;

	public SideDishData(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public void showInfo() {
		System.out.println("Name of side dish:" + this.name);
		System.out.println("Price of side dish:" + this.price);
		System.out.println("Type of side dish:" + this.type);
		System.out.println();
	}
}
