package com.geo.nature;

public class DamRunner {

	public static void main(String[] args) {
		Dam reservior = new Dam();

		reservior.storeDamName("Bhadra dam");
		reservior.storeDamName("Savehaklu dam");
		reservior.storeDamName("Chakra dam");
		reservior.storeDamName("shivana samudra dam");
		reservior.storeDamName("tungabhadra dam");
		reservior.storeDamName("KRS dam");
		reservior.storeDamName("gagana chukki dam");

		
		reservior.showDamNames();

	}

}
