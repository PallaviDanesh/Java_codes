class Board {
    String type;
    double length;
    double width;

    public Board(String typeLocal, double lengthLocal, double widthLocal) {
        type = typeLocal;
        length = lengthLocal;
        width = widthLocal;
		System.out.printl("type of board:"+type);
		System.out.println("length:"+length);
		System.out.printl("width:"+width);
    }
}