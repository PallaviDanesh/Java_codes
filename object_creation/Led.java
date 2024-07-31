class Led {
    String color;
    int brightness;
    double voltage;

    public Led(String colorLocal, int brightnessLocal, double voltageLocal) {
        color = colorLocal;
        brightness = brightnessLocal;
        voltage = voltageLocal;
		System.out.printl("color of led:"+color);
		System.out.println("brightness:"+brightness);
		System.out.printl("voltage:"+voltage);
    }
}