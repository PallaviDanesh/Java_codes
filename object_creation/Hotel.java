class Hotel{
	String name="Ayodhya Upachar";
	Owner owner = new Owner("Mehali",35,'F');
	
	public void printHotelInfo(){
		System.out.println("hotel name:"+this.name);
		owner.printOwnerInfo();
	}
}