class DonationRunner
{
	public static void main(String[]args)
	{
		String antigen=Blood.group();
			System.out.println("antigen type:"+antigen);
		String name=Blood.personName();
			System.out.println("name:"+name);
		double totalCharge=Blood.cost();
			System.out.println("total cost:"+totalCharge);
		String nameOfHospital=Blood.hospitalTested();
			System.out.println("name of hospital:"+nameOfHospital);
		boolean sick=Blood.sicknessConfirmation();
			System.out.println("sickness confirmed or not:"+sick);
		boolean donated=Blood.donationApprove();
			System.out.println("donated or not:"+donated);
	}
}
	