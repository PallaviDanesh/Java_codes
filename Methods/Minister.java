class Minister{
	
	public static void serve(){
		System.out.println("Ministers are serve for the nation");
		Assistant.help();
	}
}
//we have separate classes and we should link each other by invoking.
class Assistant{
	public static void help(){
			System.out.println("Minister has an assistant,who will help in his daily works");
			 Driver.drive();
	}
}
class Driver{
	public static void drive(){
			System.out.println("Minister has a car, for that he appointed a driver who drives the car");
			Vehicle.transport();
	}
}
class Vehicle{
	public static void transport(){
			System.out.println("Vehicles are mean for transportation");
			MusicSystem.play();
	}
}
class MusicSystem{
	public static void play(){
		System.out.println("Car has music system in it , can play the music");
		Application.run();
	}
		
}
class Application{
		public static void run(){
			System.out.println("To play the music we need to run the application");
			Internet.stream();
		}
}
class Internet{
		public static void stream(){
			System.out.println("To streaming the music we need internet");
			Server.connect();
	}
}
class Server{
		public static void connect(){
			System.out.println("Server connects to cloud to stream the music");
			Location.display();
	}
}
class Location{
	public static void display(){
		System.out.println("Car has GPS system which displays the current location");
		Building.openGate();
	}
}
class Building{
	public static void openGate(){
		System.out.println("Building has gate , gate should open when the car comes");
		Metal.strength();
	}
}
class Metal{
	public static void strength(){
		System.out.println("gate is made up of metal ,which has strength");
		Factory.make();
	}
}
class Factory{
	public static void make(){
		System.out.println("factory makes gates");
		Machine.design();
	}
}
class Machine{
	public static void design(){
		System.out.println("gates are designed by machines");
		Engineer.nothing();
	}
}
class Engineer{
	public static void nothing(){
	System.out.println("Engineers does nothing");
	}
}

//static methods can only accessed by static method only
//non static methods can accessed by both static and non- static methods