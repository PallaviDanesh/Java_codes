package com.xworkz.animal;

public class PlantRunner {

	public static void main(String[] args) {

		Plant plant1 = new Plant("Rose", 100, "Flowering", true, 2);
		Plant plant2 = new Plant("Periwinkle", 50, "flowering", false, 50);
		Plant plant3 = new Plant("Sunflower", 30, "Flowering", true, 1);
		
		Plant[]sapling  = new Plant[3];
		sapling[0] = plant1;
		sapling[1] = plant2;
		sapling[2] = plant3;
		
		//syntax for foreach loop is class name reference:array_name
		for (Plant value : sapling) {
			System.out.println(value);
			value.printDetails();
	}

}
}