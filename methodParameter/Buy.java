class Buy{
	public static void product(String brand,double price){
		System.out.println("----running product in buy----");
		if(price > 0.00 && price <=500.00)
			System.out.println("valid,please proceed");
		else
			System.out.println("price is not valid");
	}
	public static void product(String name,int quantity,String quality,double price){
		System.out.println("----Running product in buy----");
		if(quantity > 0 && quantity < 100)
			System.out.println("valid,please proceed");
		else
			System.out.println("quantity is not valid");
		if (price >0.00 && price < 1000.00 )
			System.out.println("valid,please proceed");
		else
			System.out.println("price is not valid");
			
	}
	public static void bookMovieTicket(String name,String theatreName,int quantity,double price){
		System.out.println("---Running bookMovieTicket in buy---");
		if((quantity>0 && quantity<20)&&(price>0.00 && price < 3000))
			System.out.println("valid,please proceed");
		else
			System.out.println("price/quantity is not valid");
	}
	public static void buyEgg(int total,double pricePerEgg){
		System.out.println("---Running buyEgg in buy---");
		if(total > 0 && total <500)
			System.out.println("valid,please proceed");
		else
			System.out.println("total is not valid");
		if(pricePerEgg>0.00 && pricePerEgg<=7.00)
			System.out.println("valid,please proceed");
		else
			System.out.println("it is not valid");
		}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
		System.out.println("---Running buyCake in buy---");
		if(cost>0.00 && cost <5000.00)
			System.out.println("valid,please proceed to buy cake");
		
		else
			System.out.println("not valid,do not proceed to buy cake");
		if(quantity>0 && quantity<5)
			System.out.println("valid,please proceed to buy cake");
		else
			System.out.println("not valid,do not proceed to buy cake");
			
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manufDate){
		System.out.println("---Running buyShampoo in buy---");
		if(price>0 && price<1000)
			System.out.println("valid price,please proceed to buy Shampoo");
		else
			System.out.println("not valid,do not proceed to buy Shampoo");
		if(quantityInMl>0 && quantityInMl<1000)
			System.out.println("valid quantity,please proceed to buy Shampoo");
		else
			System.out.println("not valid,do not proceed to buy Shampoo");
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int hardDisk,int ramSize){
		System.out.println("---Running buyLaptop in buy---");
		if(batteryCapacity>0 && batteryCapacity<2000)
			System.out.println("valid battery Capacity,please proceed to buy laptop");
		else
			System.out.println("not valid,do not proceed to buy laptop");
		if(hardDisk>0 && hardDisk<=512)
			System.out.println("valid");
		else
			System.out.println("not valid");
		if(ramSize>0 && ramSize<64)
			System.out.println("valid");
		else
			System.out.println("not valid");
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("---Running buySmartWatch in buy---");
		if(price>0 && price<10000)
			System.out.println("valid price,please proceed to buy smart watch");
		else
			System.out.println("not valid,do not proceed to buy Smart watch");
		if(color<0 && color <=7)
			System.out.println("valid");
		else
			System.out.println("not valid");
		if(mode>0 && mode<=2)
			System.out.println("valid mode,please proceed to buy smart watch");
		else
			System.out.println("not a valid mode,do not proceed to buy smart watch");
	}
}	
			
				
			
		
			
		
			
		
	
				


			