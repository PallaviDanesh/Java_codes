package com.xworkz.data;

public class MarketData {
	private String name;
	private String location;
	public MarketData(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public void showMarketInfo() {
		System.out.println("Name of market: "+this.name);
		System.out.println("Location of market: "+this.location);
		System.out.println();
	}

}
