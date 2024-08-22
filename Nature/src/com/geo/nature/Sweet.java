package com.geo.nature;

public class Sweet {

	private String[] sweetNames = new String[7];
	private int position = 0;

	public void storeSweetName(String sweetName) {
		sweetNames[position] = sweetName;
		position++;
	}
	public void showSweetNames() {
		for (String nameOfSweet : sweetNames) {
			System.out.println("sweet Name: " + nameOfSweet);
		}
	}
}
