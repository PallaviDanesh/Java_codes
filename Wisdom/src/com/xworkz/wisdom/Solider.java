package com.xworkz.wisdom;

public class Solider {
	
	public void purpose() {
		Gun gun=new Gun("Ak-47","Russia","Rifle");
		if(gun!=null) {
			//System.out.println("soldier use gun for "+this.gun+" purpose");
			gun.display();	
		}
	}

}
