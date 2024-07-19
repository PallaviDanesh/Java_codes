class EcommerceRunner{
	public static void main(String[]args){
		//country codes 
		String country=Ecommerce.countryDetails(55);
		System.out.println("country having code 32 is:"+country);
		String countrySouth=Ecommerce.countryDetails(57);
		System.out.println("country having code 57 is:"+countrySouth);
		String countryEast=Ecommerce.countryDetails(1);
		System.out.println("country having code 1 is:"+countryEast);
		String countryWest=Ecommerce.countryDetails(86);
		System.out.println("country having code 86 is:"+countryWest);
		String countryNorth=Ecommerce.countryDetails(91);
		System.out.println("country having code 91 is:"+countryNorth);
		//product details
		double priceOfProduct=Ecommerce.productCost("Colour Pallet");
		System.out.println("Price of colour Pallet: "+priceOfProduct);
		double priceOfSecProduct=Ecommerce.productCost("USB fan");
		System.out.println("price of USB fan is:"+priceOfSecProduct);
		double teraProduct = Ecommerce.productCost("Wallet");
		System.out.println("price of wallet is:"+teraProduct);
		double tetraProduct = Ecommerce.productCost("Sneakers");
		System.out.println("price of sneakers:"+tetraProduct);
		double productPenta= Ecommerce.productCost("watch");
		System.out.println("price of watch is:"+productPenta);
		//Movie Details
		String nameOfProducer = Ecommerce.movie("The dirty picture");
		System.out.println("Producer of dirty picture is:"+nameOfProducer);
		String producerName = Ecommerce.movie("Don");
		System.out.println("Producer of Don movie is:"+producerName);
		String investorOfMovie = Ecommerce.movie("Roberrt");
		System.out.println("Producer of Roberrt movie:"+investorOfMovie);
		String name = Ecommerce.movie("KGF");
		System.out.println("Producer of KGF:"+name);
		String producer = Ecommerce.movie("Bahubali");
		System.out.println("Producer of Bahubali:"+producer);	
	}
}