package com.geo.nature;

public class Dam {
	private String[] damNames = new String[7];
	private int indexOfDam = 0;

	public void storeDamName(String damName) {

		damNames[indexOfDam] = damName;
		indexOfDam++;

	}

	public void showDamNames() {
		for (String nameOfDam : damNames) {
			System.out.println("name of reservior: " + nameOfDam);
		}
	}


}
