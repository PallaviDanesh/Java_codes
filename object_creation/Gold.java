class Gold {
    double weight;
    double purity;
    String source;

    public Gold(double weightLocal, double purityLocal, String sourceLocal) {
        weight = weightLocal;
        purity = purityLocal;
        source = sourceLocal;
		System.out.printl("weight of gold:"+weight);
		System.out.println("purity:"+purity);
		System.out.printl("source:"+source);
		
    }
}