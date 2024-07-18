class WealthRunner
{
	public static void main(String[]args)
	{
		if(args.length==4)
		{
		String medicineName=args[0];
		long dateOfManufacture=Long.parseLong(args[1]);
		double cost=Double.parseDouble(args[2]);
		int quantity=Integer.parseInt(args[3]);
	Wealth.medicine(medicineName,dateOfManufacture,cost,quantity);		
	}
	}
}


	