class Medicine{
	public static double medicineDetails(String nameOfMedicine){
			System.out.println("--MedicineDetails in medicine--");
			if(nameOfMedicine=="Paracetamol"){
				return 56.50;
			}
			if(nameOfMedicine=="dolo"){
				return 70.45;
			}
			if(nameOfMedicine=="Calpal"){
				return 45.78;
			}
			return 0;
	}
	public static String disease(String symptom)
	{
		System.out.println("--disease details in medicine--");
		if(symptom=="fever"){
			return "dolo";
		}
		if(symptom=="runny nose"){
			return "Paracetamol";
		}
		return "Healthy";
	}
	public static String appointment(String doctorName){
		System.out.println("---appointment in Medicine--");
		if(doctorName=="Dr.Merry"){
			return "9am to 1pm";
		}
		if(doctorName=="Dr.Jansi"){
			return "2pm to 5pm";
		}
		return "NA";
	}
}
		