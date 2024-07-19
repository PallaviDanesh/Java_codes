class AeroPlane
{
	public static void book(String source,String destination)
	{
		System.out.println("source (from which place you start the journey): "+source);
		System.out.println("Destination(which place you want to reach): "+destination);
	}
	public static void book(String source,String destination,int quantity)
	{
		System.out.println("source (from which place you start the journey): "+source);
		System.out.println("Destination(which place you want to reach): "+destination);
		System.out.println("number o people travelling:"+quantity);
	}
	public static void book(String source,String destination,int quantity,double price)
	{
		System.out.println("source (from which place you start the journey): "+source);
		System.out.println("Destination(which place you want to reach): "+destination);
		System.out.println("number of people travelling:"+quantity);
		System.out.println("fair of each ticket: "+price);
	}
	public static void cancel(long ticketNo)
	{
		System.out.println("Ticket number : "+ticketNo);
	}
	public static void cancel(String source,String destination)
	{
		System.out.println("source : "+source);
		System.out.println("Destination: "+destination);
	}
}
