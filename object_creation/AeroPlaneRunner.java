class AeroPlaneRunner
{
	public static void main(String[]args)
	{
		AeroPlane plane=new AeroPlane();
		System.out.println("company:"+plane.company);
		System.out.println("number of seats:"+plane.noOfSeats);
		System.out.println("ticket price:"+plane.ticketPrice);
		System.out.println("source:"+plane.source);
		System.out.println("destination:"+plane.destination);
		AeroPlane plane1=new AeroPlane("Kingfisher",450,10000,"Bangalore","German");
		System.out.println("company:"+plane1.company);
		System.out.println("number of seats:"+plane1.noOfSeats);
		System.out.println("ticket price:"+plane1.ticketPrice);
		System.out.println("source:"+plane1.source);
		System.out.println("destination:"+plane1.destination);
		AeroPlane plane2=new AeroPlane("Goa","Bangkok","IndiGo");
		System.out.println("company:"+plane2.company);
		System.out.println("number of seats:"+plane2.noOfSeats);
		System.out.println("ticket price:"+plane2.ticketPrice);
		System.out.println("source:"+plane2.source);
		System.out.println("destination:"+plane2.destination);
		AeroPlane plane3=new AeroPlane(7000,"Shivamogga","Goa","AirIndia");
		System.out.println("company:"+plane3.company);
		System.out.println("number of seats:"+plane3.noOfSeats);
		System.out.println("ticket price:"+plane3.ticketPrice);
		System.out.println("source:"+plane3.source);
		System.out.println("destination:"+plane3.destination);
	}
}
