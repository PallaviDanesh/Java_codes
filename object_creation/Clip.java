class Clip{
	String color;
	String type;
	Clip(String color,String type)
	{
		this.color=color;
		this.type=type;
	}
	public void clipDetails(){
		System.out.println("color of clip:"+color);
		System.out.println("type of clip:"+type);
	}
}