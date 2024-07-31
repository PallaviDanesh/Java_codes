class Lens {
    String type;
    double focalLength;

    public Lens(String typeLocal, double focalLengthLocal) {
        type = typeLocal;
        focalLength = focalLengthLocal;
		System.out.printl("type of lens:"+type);
		System.out.println("focal length of lens:"+focalLength);
	}	
    
}