class Ananya{
	long mobileNo;
	Knife knife;
	Ananya(long mobileNo,Knife knife){
		this.mobileNo=mobileNo;
		this.knife=knife;
	}
	public void displayKnifeInfo(){
		System.out.println("mobile number:"+mobileNo);
		knife.showKnifeInfo();
	}
}
		