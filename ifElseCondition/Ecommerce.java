class Ecommerce{
	public static String countryDetails(int countryCode){
		System.out.println("---Fetching countryDetails in Ecommerce---");
		if (countryCode == 32){
			return "Belgium";
		}
		if (countryCode == 55){
			return "Brazil";
		}
		if (countryCode == 1){
			return "Canada";
		}
		if (countryCode == 91){
			return "India";
		}
		if (countryCode == 86){
			return "China";
		}
		return "NA";
	}
	public static double productCost(String item){
		System.out.println("__Fetching productCost in Ecommerce__");
		if(item == "NoteBook"){
			return 50;
		}
		if(item == "Colour Pallet"){
			return 100;
		}	
		if(item == "Sneakers"){
			return 500;
		}
		if(item =="Wallet"){
			return 1000.50;
		}
		if(item == "USB fan"){
			return 1000;
		}
		return 0;
	}
	public static String movie(String movieName){
		System.out.println("****Running Movie in Ecommerce****");
		if(movieName == "Roberrt")
		{
			return "Tarun Sudhir ";
		}
		if(movieName == "KGF"){
			return "Prashant neel";
		}
		if(movieName == "Don"){
			return "Riesh Sidhwani";
		}
		if(movieName == "Lagaan"){
			return "Amir Khan";
		}
		if(movieName == "The dirty picture"){
			return "Ekta kapoor";
		}
	return "NA";
	}
}

		
		
	
			
	
		