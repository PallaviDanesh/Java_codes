class PrinterA{
	
	 public static void printDocument() {
        System.out.println("Printing a document in printer");
        scanDocument();
    }

    public static void scanDocument() {
        System.out.println("Scanning a document in printer");
        checkPaper();
    }

    public static void checkPaper() {
        System.out.println("Checking paper count in rinter");
        copyDocument();
    }

    public static void copyDocument() {
        System.out.println("Copying a document in printer");
        replaceColour();
		
    }

    public static void replaceColour() {
        System.out.println("Replacing colour in printer");
		printDocument();
		
    }
public static void main(String[]args){
	copyDocument();	
	
}
}