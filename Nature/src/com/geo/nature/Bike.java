package com.geo.nature;

public class Bike {

	private String[] bikeNames = new String[7];
	private int index = 0;

	public void storeBikeName(String bikeName) {

		bikeNames[index] = bikeName;
		index++;

	}

	public void displayBikeNames() {
		for (String bikeName : bikeNames) {
			System.out.println("Bike: " + bikeName);
		}
	}

}


//types of import ---- Inline(import specific package at line), wild card(*)[importing all packages],static,name ambiguities,
