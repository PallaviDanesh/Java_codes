package com.geo.nature;

public class City {
	private String[] cityNames = new String[7];
	private int indexOfCity = 0;

	public void storeCityName(String cityName) {

		cityNames[indexOfCity] = cityName;
		indexOfCity++;

	}

	public void displayCityNames() {
		for (String nameOfCity : cityNames) {
			System.out.println("City name: " + nameOfCity);
		}
	}

}
