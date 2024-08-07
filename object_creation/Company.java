class Company{
	int id;
	String name;
	String location;
	SoftwareEngineer se=new SofwareEngineer("bhoomi",'LTmindtree',B.E.6500000);
	Company(int id,String name,String location){
		this.id=id;
		this.name=name;
		this.location=location;
		System.out.println("company is created by using arguments");
	}
	
	public void printCompanyInfo(){
		System.out.println("company id :"+this.id);
		System.out.println("company name :"+this.name);
		System.out.println("company location :"+this.location);
		System.out.println("company is created with no arguments");
		softwareEngineer.printSEInfo();
	}
}