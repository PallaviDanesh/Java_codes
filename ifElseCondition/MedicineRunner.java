class MedicineRunner{
	public static void main(String[]args){
		double priceOfMedicine=Medicine.medicineDetails("Paracetamol");
		System.out.println("price of paracetamol :"+priceOfMedicine);
		double costOfMedicine = Medicine.medicineDetails("dolo");
		System.out.println("price of dolo:"+costOfMedicine);
		double rateOfMedicine = Medicine.medicineDetails("azithroMycine");
		System.out.println("price of azitromycin"+rateOfMedicine);
		//disease details
		String disease = Medicine.disease("runny nose");
		System.out.println("medicine for runny nose:"+disease);
		String symptomAppeared = Medicine.disease("fever");
		System.out.println("medicine for fever:"+symptomAppeared);
		String mainSymptom = Medicine.disease("nausea");
		System.out.println("medicine for nausea:"+mainSymptom);
		//appointment 
		String availability = Medicine.appointment("Dr.Merry");
		System.out.println("Dr.Merry is available from: "+availability);
		String schedule = Medicine.appointment("Dr.Jansi");
		System.out.println("Dr.Jansi available from :"+schedule);
		String appointment=Medicine.appointment("Dr.John");
		System.out.println("Dr.John availability:"+appointment);
		
}
}