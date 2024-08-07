class KeyBunch{
	String material;
	Key key;
	KeyBunch(String material,Key key){
		this.material=material;
		this.key=key;
	}
	public void display(){    //non-static metod
		System.out.println("material of keybunch:"+material);
		//System.out.println("key:"+key);
		key.details();
	}
	
}
