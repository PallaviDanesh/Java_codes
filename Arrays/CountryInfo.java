class CountryInfo
{	
public static void stateInfo(String[] names)
{
		System.out.println(" StateNames are running in Country");
		
			for(int start=names.length-1;start>=0;start--){
				String ref=names[start];
				System.out.println("state name are:"+ref);

			}
	}
                          	
	public static void codesOf(int pincode){
		System.out.println("pin code are running in Country");
		int[] codes={577528,577204,577506,530068,560001,560002,560003,564398,568765,562367};
		
		for(int pin=codes.length-1;pin>=0;pin++){
				int codepins=codes[pin];
				System.out.println("pincodes are:"+codepins);

			}
	}
	
	                          	

	public static void ministerNames(String primeMinister){
		System.out.println("primeMinister are running in Country");
		String[] primeMinisterNames={"Jawaharlal Nehru","Gulzarilal nanda","Lal Bahadur Shastri","Indira gandhi",
		"Morarji Desai","Charan singh","rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar",
		"P V Narasimha Rao","Atal Bihari Vajpayee","H D Deve Gowda","Inder kumar Gujaral","Manamohan Singh",
		"Narendra Modi"};
		
			for(int start=primeMinisterNames.length;start>=0;start++){
				String namesOfPrime=primeMinisterNames[start];
				System.out.println("primeMinisters are:"+namesOfPrime);

			}
	}
	                          	

	
	public static void ministerOfCabinet(String cabinetMinisters){
		System.out.println("cabinetMinisters are running in Country");
		String[] ministers={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin jairam Gadkari",
		"smt.Nirmala Sitaraman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda",
		"Shri Manohar Lal","Shri H D Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra pradhan","Shri Jitan Ram Manjhi",
		"Shri rajiv Ranjan Singh Alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Pralhad Joshi",
		"Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M Scindia","Shri Bhupender Yadav",
		"Shri Gajendra Singh Shekhawat","smt Annapurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri",
		"Dr. Mansukh Mandaviya","Shri G Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		
			for(int name=ministers.length;name>=0;name++){
				String namesOfCabinet=ministers[name];
				System.out.println("cabinet Ministers are:"+namesOfCabinet);

			}
	}
	

	public static void parties(String politicalParties){
		System.out.println("parties are running in Country");
		String[] partiesNames={"Bharatiya Janatha Party","Indian National Congress","Aam Aadmi Party",
		"National Peoples party","Communist party of India"};
		
			for(int party=partiesNames.length;party>=0;party++){
				String names=partiesNames[party];
				System.out.println("political parties are:"+names);
								

			}
	}
	
}
 