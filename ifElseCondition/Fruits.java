class Fruits{
	public static double juiceCenter(String nameOfJuice,String wantIce){
		if(nameOfJuice=="Orange juice"){
			if( wantIce=="yes"){
			return 50;
			}
		else
			return 40;
		}
		if(nameOfJuice=="Mango juice"){
			if(wantIce=="yes"){
			return 60;
		}
		else
			return 50;
		}
		if(nameOfJuice=="MuskMelon juice"){
			if(wantIce=="yes"){
			return 40;
		}
		else
			return 30;
		}
		if(nameOfJuice=="WaterMelon juice"){
			if(wantIce=="yes"){
			return 40;
		}
		else
			return 30;
		}
		if(nameOfJuice=="PineApple juice"){
			if(wantIce=="yes"){
			return 30;
		}
		else
			return 20;
		}
		return 0;
	}
	}
