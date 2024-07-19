class ChainRunner
{
	 public static void main(String[] args) 
	 {
		double carat = Chain.caratOfGold();
		System.out.println("carat:"+carat);
		String type = Chain.typeOfGold();
		System.out.println("type:"+type);
		double cost = Chain.costPerGram();
		System.out.println("cost per gram :"+cost);
		String quality = Chain.quality();
		System.out.println("quality: "+quality);
		int grams = Chain.quantity();
		System.out.println("total grams:"+grams);	
		double wastage = Chain.wastage();
		System.out.println("wastage:"+wastage);		
		double serviceCharge = Chain.serviceCharge();
		System.out.println("service charge:"+serviceCharge);		
		double goodsServicetx=Chain. goodsServiceTax();
	    System.out.println("GST:"+goodsServicetx);
	 }
}

		 