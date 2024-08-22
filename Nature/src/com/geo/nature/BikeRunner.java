package com.geo.nature;

public class BikeRunner {
	public static void main(String[] args) {
		Bike bike = new Bike();

		bike.storeBikeName("Yamaha ");
		bike.storeBikeName("Honda CBR");
		bike.storeBikeName("Royal Enfield Classic 350");
		bike.storeBikeName("Pulsar");
		bike.storeBikeName("KTM ");
		bike.storeBikeName("TVS Apache RTR 160");
		bike.storeBikeName("Suzuki Gixxer");

		
		bike.displayBikeNames();
	}
}
