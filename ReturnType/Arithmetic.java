//1.Explain method with return as the last statement with return type
//2.Explain method without return as the last statement with return type
//3. Use return with void type

class Arithmetic{
	public static int addition(int a,int b){
		int result = a+b;
		return result; // return statement as the last statement
	}
//When a method has a return type, it must include a return statement as the last statement in the method body. The return statement specifies the value to be returned to the caller.
//In the above method, the addition method takes two int parameters, a and b, adds them together, and returns the result as an int value.
// The return statement is the last statement in the method body, and it specifies the value to be returned to the caller.

	public static int subtraction(int c,int d){
	int difference = a-b; //without return statement
	}
//The above code snippet will not compile, because the subtraction method is declared to return an int value, but there is no return statement to specify the value to be returned.	

	public static void greeting(){
			System.out.println("Ola!!");
			return;
			// no return statement needed
	}
//the greeting method has a void return type, which means it does not return any value to the caller.
// The method simply prints a message to the console and does not need to include a return statement.
}