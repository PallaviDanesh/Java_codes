class Task{
	public static void main(String[]args){
		System.out.println("method overloading");
	}
	public static int main(String[]args,int num)
	{
		System.out.println("method overloading");
		return 0; 
	}
}
//instantiation - instace creation
//class is non  primitive data type in object creation
// class_name(here we used as datatype) reference(variable)=new constructor_name() --->instance creation
//static - if we made static only one instance will created in memory
//instance - if we are using instance variable , we can create multiple instance in memory-----> static datatype variable_name;
//these are class levels
//four ways to create and assign values to variable ---> literal , method , constuctor , reference