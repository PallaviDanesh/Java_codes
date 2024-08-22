package com.xworkz.animal;

public class SubmarineRunner {

	public static void main(String[] args) {

		Submarine submarine1 = new Submarine("Seawolf", 100, 134, 500, "Nuclear");
		Submarine submarine2 = new Submarine("Tsunami", 170, 160, 400, "Diesel");
		Submarine submarine3 = new Submarine("Vikram", 115, 132, 600, "Nuclear");
	
		Submarine[]ship=new Submarine[3];
		ship[0] = submarine1;
		ship[1] = submarine2;
		ship[2] = submarine3;
		
		for(Submarine war:ship)
		{
			System.out.println(war);
			war.displaySubmarineInfo();
		}
	}
	

}
