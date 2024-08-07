class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	double salary;
	SoftwareEngineer(String name,int experience,String designation,double salary){
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		System.out.println("software engineer is created using arguments");
	}
	public void printSEInfo(){
		System.out.println("name:"+this.name);
		System.out.println("experience:"+this.experience);
		System.out.println("designation:"+designation);
		System.out.println("salary:"+this.salary);
	}
}
		