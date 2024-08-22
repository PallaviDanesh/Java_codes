class Market{
	static int priceApple=100;
	static	int amountMango=150;
	static	int costPine=250;
	static	int amtGrape=250;
	static	int amtOrange=250;
	static	int mixAmt=500;
		
	public static double veggie(String vegName,int quantity,boolean mixVeggie){
		double total=0;
		
		if (vegName=="apple"){
			if(mixVeggie==true){
				return mixAmt;
			}
			else{
			total=quantity*priceApple;
			return total;
			}
		}
		if(vegName=="mango"){
			if(mixVeggie==true){
			return mixAmt;
			}
			else{
			total=amountMango*quantity;
			return total;
			}
		}
		if(vegName=="pineapple"){
			if(mixVeggie==true){
				return mixAmt;
			}
			else{
			total=costPine*quantity;
			return total;
			}
		}
		if(vegName=="grapes"){
			if(mixVeggie==true){
				return mixAmt;
			}
			else{
			total=amtGrape*quantity;
			return total;
			}
		}
		if(vegName=="Orange"){
			if(mixVeggie==true){
				return mixAmt;
			}
			else{
			total=amtOrange*quantity;
			return total;
			}
		}
			return total;
	}
}
			