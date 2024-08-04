class MaskRunner{
	public static void main(String[]args)
	{
		Mask mask=new Mask();
		System.out.println("cost:"+mask.cost);
		System.out.println("size:"+mask.size);
		System.out.println("Material:"+mask.material);
	Mask mask1=new Mask(20);
		System.out.println("cost:"+mask1.cost);
		System.out.println("size:"+mask1.size);
		System.out.println("Material:"+mask1.material);
	Mask mask2=new Mask('M');
		System.out.println("cost:"+mask2.cost);
		System.out.println("size:"+mask2.size);
		System.out.println("Material:"+mask2.material);
	Mask mask3=new Mask("teflon");
		System.out.println("cost:"+mask3.cost);
		System.out.println("size:"+mask3.size);
		System.out.println("Material:"+mask3.material);
	Mask mask4=new Mask(50,'M',"Microfiber");
		System.out.println("cost:"+mask4.cost);
		System.out.println("size:"+mask4.size);
		System.out.println("Material:"+mask4.material);
	Mask mask5=new Mask('S',70);
		System.out.println("cost:"+mask5.cost);
		System.out.println("size:"+mask5.size);
		System.out.println("Material:"+mask5.material);
	} 
}
