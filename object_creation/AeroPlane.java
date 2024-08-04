class AeroPlane{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	public AeroPlane(){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
	public AeroPlane(String company,int noOfSeats,double ticketPrice,String source,String destination){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
	public AeroPlane(String source,String destination,String company){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
	public AeroPlane(double ticketPrice,String source,String destination,String company){
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
	}
}
