class JuiceRunner
{
	public static void main(String[]args)
	{
		if(args.length==5)
		{
			String name = args[0];
			String brand = args[1];
			String flavour = args[2];
			double convertedCost = Double.parseDouble(args[3]);
			int convertedQuantity = Integer.parseInt(args[4]);
		Juice.juiceInfo(name,brand,flavour,convertedCost,convertedQuantity);
		}
	}
}
			
		