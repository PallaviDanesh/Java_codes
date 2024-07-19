class DeliveryVehicle
{
	public static void deliver(String item,String location)
	{
		System.out.println("Running deliver in delivery vehicle: ");
		System.out.println("item name: "+item);
		System.out.println("location name is: "+location);
		Company.deliver(item,location);
		
	}
}

