package com.xworkz.oops;

public class BadamHalwa extends Halwa{
	  public double price;
	  

	public BadamHalwa() {
		super();
	}

	public static void main(String[] args) {

		BadamHalwa halwa = new BadamHalwa();
		halwa.price=150;
		Halwa sihi = new BadamHalwa();
		sihi.color="yellow";
		sihi.texture="soft";
		sihi.sugarLevel="medium";
		sihi.sweetInfo();
		sihi.sweetness();
		

	}

}
