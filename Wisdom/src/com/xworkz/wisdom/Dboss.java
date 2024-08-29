package com.xworkz.wisdom;

public class Dboss {
	 Gun dbossGun;

	public Dboss(Gun dbossGun) {
		super();
		this.dbossGun = dbossGun;
	}
	 public void showGun()
	 {
		 if(dbossGun!=null) {
			 dbossGun.display();
		 }
		 else {
			 System.out.println("Dboss has no gun");
		 }
		
	 }

}
