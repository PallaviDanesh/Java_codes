public class PrinterClass {
    public static void printDocument() {
        System.out.println("Printing document in the same class");
    }

    public static void scanDocument() {
        System.out.println("Scanning document in the same class");
    }

    public static void main(String[] args) {
        printDocument();
        scanDocument();
    }
}
