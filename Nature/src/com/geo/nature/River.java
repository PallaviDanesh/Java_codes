package com.geo.nature;

public class River {
	private String[] riverNames = new String[7];
	private int index = 0;

	public void storeRiverName(String riverName) {

		riverNames[index] = riverName;
		index++;

	}

	public void printRiverNames() {
		for (String NameOfRiver : riverNames) {
			System.out.println("name of river: " + NameOfRiver);
		}
	}


}
