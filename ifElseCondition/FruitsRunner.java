class FruitsRunner{
	public static void main(String[] args){
		double juicePrice =Fruits.juiceCenter("Mango juice","yes");
		System.out.println("price:"+juicePrice);
	}
}




//Syntax of main method:
//public static void main(String[]args)
//{
//}
//public - access specifier , main method needs to be public so that JRE can access and execute this method. if method isn't public,then access is restricted.
//static - there is no object of the class present ,main metod has to be static , so that the jv;m can load the class into memory and call the main method without creating the instance of the class first. 
//void -because it doesn;t return anything.when the main method is finishing executing , program will terminates, so there in no need of returned object;
//main- when the java program starts , it always looks for main method.
//String[]args-accepts
