package com.geo.nature;

public class RiverRunner {

	public static void main(String[] args) {
		River river = new River();

		river.storeRiverName("Yamuna ");
		river.storeRiverName("Ganga");
		river.storeRiverName("Tunga");
		river.storeRiverName("kaveri");
		river.storeRiverName("Krishna");
		river.storeRiverName("bhadra");
		river.storeRiverName("godavari");

		
		river.printRiverNames();
		
	}

}
