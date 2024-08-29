package com.xworkz.wisdom;

public class Police {
	
	public void use(Gun gun) {
		//System.out.println("name of gun given to police:"+gun);
		if(gun!=null) {
			gun.display();
		}
		else {
			System.out.println("no gun provided");
		}
	}

}
