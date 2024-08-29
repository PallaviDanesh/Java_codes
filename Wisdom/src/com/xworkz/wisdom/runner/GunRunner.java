package com.xworkz.wisdom.runner;

import com.xworkz.wisdom.Dboss;
import com.xworkz.wisdom.Godse;
import com.xworkz.wisdom.Gun;
import com.xworkz.wisdom.Police;
import com.xworkz.wisdom.Solider;

public class GunRunner {

	public static void main(String[] args) {
		
		
		Solider solider=new Solider();
		solider.purpose();
		Gun gun = new Gun("glock 17","Australia","handgun");
		Police police=new Police();
		police.use(gun);
		Gun gun1=new Gun("glock 17","Australia","handgun");
		Dboss dboss=new Dboss(gun1);
		Godse godse=new Godse();
		godse.getGun();
		
	}

}
