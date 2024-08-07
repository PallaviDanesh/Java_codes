

//literal means assigning value to the instance variable
//when we are try to print the value of non-primitive instance , it will print the datatype @(separator)location
class Owmer{
	String name;
	int age;
	char gender;
	Owner(String name,int age,char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("Owner is created by using arguments");
	}
	public void printOwnerInfo(){
		
		System.out.println("name:"+this,name);
		System.out.println("age:"+this.age);
		System.out.println("gender:"+this.gender);
	}
}