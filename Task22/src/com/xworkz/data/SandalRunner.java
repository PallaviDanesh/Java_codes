package com.xworkz.data;

public class SandalRunner {

	public static void main(String[] args) {
		SandalStore store = new SandalStore();
		SandalData data1 = new SandalData("Bata", 'M', 350, "blue");
		store.save(data1);
		SandalData data2 = new SandalData("Paragon", 'L', 250, "black");
		// store.showDetails();
		store.save(data2);
		SandalData data3 = new SandalData("Walkmate", 'S', 350, "blue");
		// store.showDetails();
		store.save(data3);
		SandalData data4 = new SandalData("Nexaa", 'M', 250, "Grey");
		// store.showDetails();
		store.save(data4);
		SandalData data5 = new SandalData("zudio", 'L', 250, "Pink");
		// store.showDetails();
		store.save(data5);
		store.showDetails();
	}

}
