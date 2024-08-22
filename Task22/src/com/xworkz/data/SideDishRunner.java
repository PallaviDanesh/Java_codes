package com.xworkz.data;

public class SideDishRunner {
	public static void main(String[] args) {
		SideDishStore store = new SideDishStore();
		SideDishData data1 = new SideDishData("Stir fry subzi", 100, "veg");
		store.save(data1);
		SideDishData data2 = new SideDishData("Raita", 250, "gravy");
		store.save(data2);
		SideDishData data3 = new SideDishData("Dahi vada",350, "Fried");
		store.save(data3);
		SideDishData data4 = new SideDishData("Saag aloo", 250, "Greavy");
		store.save(data4);
		SideDishData data5 = new SideDishData("Pakora", 100, "Fried");
		store.save(data5);
		store.showSideDishes();
	}

}
