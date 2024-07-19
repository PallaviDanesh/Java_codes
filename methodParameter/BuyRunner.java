class BuyRunner{
	public static void main(String[]args){
		Buy.product("H&M",400.00);
		Buy.product("H&M",1000.00);
		Buy.product("T-Shirts",10,"Premium",1000.00);
		Buy.product("T-Shirts",200,"Premium",2000.00);
		Buy.bookMovieTicket("Kalki","Bharath cinema",25,4000);
		Buy.bookMovieTicket("Kalki","Bharath cinema",15,2000);
		Buy.buyEgg(500,6.5);
		Buy.buyEgg(700,8);
		Buy.buyCake('M',"Birthday Cake","Chocolate",1000.00,2);
		Buy.buyCake('B',"Birthday Cake","Chocolate",6000.50,7);
		Buy.buyShampoo(500,350,"SunSilk","5/4/2024");
		Buy.buyShampoo(1200,1500,"SunSilk","7/4/2024");
		Buy.buyLaptop("HP",32100,30220,1240,12,"Mac OS",256,32);
		Buy.buyLaptop("HP",42040,80220,1670,32,"Mac OS",1024,128);
		Buy.buySmartWatch("apple",1400.50,4,'s',1);
		Buy.buySmartWatch("apple",20000.60,8,'m',3);
	}
}
		