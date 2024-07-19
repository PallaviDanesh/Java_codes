class AeroPlaneRunner
{
		public static void main(String[]args)
		{
			Train.book("India","Europe");
			Train.book("India","Europe",1);
			Train.book("India","Europe",1,256485.91);
			Train.cancel(2134532);
			Train.cancel("India","Europe");
		}
}