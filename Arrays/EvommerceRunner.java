class EcommerceRunner{
	public static void main(String[]args){
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
	}
}