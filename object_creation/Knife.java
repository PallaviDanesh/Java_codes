class Knife{
	double weight;
	float height;
	Knife(double weight,float height){
		this.weight=weight;
		this.height=height;	
	}
	public void showKnifeInfo(){
		System.out.println("weight of knife:"+weight);
		System.out.println("height of knife:"+height);
	}
}