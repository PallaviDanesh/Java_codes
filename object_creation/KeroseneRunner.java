class KeroseneRunner{
	public static void main(String[]args){
		Kerosene keros=new Kerosene();
		System.out.println("price:"+keros.price);
		System.out.println("quantity:"+keros.quantity);
		System.out.println("quality:"+keros.quality);
		Kerosene keros1=new Kerosene(200,2,true);
		System.out.println("price:"+keros1.price);
		System.out.println("quantity:"+keros1.quantity);
		System.out.println("quality:"+keros1.quality);
		Kerosene keros2=new Kerosene(true);
		System.out.println("price:"+keros2.price);
		System.out.println("quantity:"+keros2.quantity);
		System.out.println("quality:"+keros2.quality);
		Kerosene keros3=new Kerosene(100);
		System.out.println("price:"+keros3.price);
		System.out.println("quantity:"+keros3.quantity);
		System.out.println("quality:"+keros3.quality);
		
	}
}
