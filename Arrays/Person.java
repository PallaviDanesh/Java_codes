class Person{
	public static void main(String[] info){
		 if (info.length <12) {
            System.out.println("Please provide the required information.");
        }
		else{
        String personName = info[0];
        String personEmail = info[1];
        String personAge = info[2];
        String personPassword = info[3];

        // Forest
        String forestName = info[4];
        String forestArea = info[5];
        String forestEstablishedYear = info[6];
        String forestState = info[7];

        // Palace 
        String palaceName = info[8];
        String palaceLocation = info[9];
        String palaceBuiltBy = info[10];
        String palaceBuildYear =info[11];

        System.out.println("Person Information:");
        System.out.println("Name: " + personName);
        System.out.println("Email: " + personEmail);
        System.out.println("Age: " + personAge);
        System.out.println("Password: " + personPassword);

        System.out.println("\nForest Information:");
        System.out.println("Name: " + forestName);
        System.out.println("Area: " + forestArea);
        System.out.println("Established Year: " + forestEstablishedYear);
        System.out.println("State: " + forestState);

        System.out.println("\nPalace Information:");
        System.out.println("Name: " + palaceName);
        System.out.println("Location: " + palaceLocation);
        System.out.println("Built By: " + palaceBuiltBy);
        System.out.println("Build Year: " + palaceBuildYear);
		}
    }
}