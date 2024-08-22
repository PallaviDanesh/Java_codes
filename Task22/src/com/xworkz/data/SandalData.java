package com.xworkz.data;

public class SandalData {

	private String brand;
	private char size;
	private double cost;
	private String color;

	public SandalData(String brand, char size, double cost, String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.cost = cost;
		this.color = color;
	}

	public void showData() {

		System.out.println("brand of sandal: " + this.brand);
		System.out.println("size of sandal: " + this.size);
		System.out.println("price of sandal: " + this.cost);
		System.out.println("Color of sandal: " + this.color);
		System.out.println();

	}

}
