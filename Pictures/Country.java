//Declare country class with Below methods
//1. Method to take states: String[] : 29

class Country{
	public static void states(String[] args){
		System.out.println("starts main country");
		for (int position=0;position<=29;position++){
		String ref=states[position];
		System.out.println("states:"+ref);	
	}
	    System.out.println("ends main country");
    }
	
	
//2. Methods to take pincode: int[]: 10
	
	public static  void pincode(int[] args){
		System.out.println("starts main country");
		for(int city=0;city<=10;city++){
		int ref=pincode[city];
		System.out.println("int:"+ref);	
		}	
		System.out.println("ends main country");
	}
	
//3. Method to take primeminister:String[]: All


public static void primeMinister(String[] args){
	System.out.println("starts main country");
	for(int panel=0;panel<=15;panel++){
		String ref=primeMinister[panel];
		System.out.println("string:"+ref);	
	}
	System.out.println("ends main country");
}
	
	

//4. Method to take Cabinet ministers:String[]: 30
	
	
	public static void cabnetMinister(String[] args){
	System.out.println("starts main country");
	for(int position=0;position<=30;position++){
		String ref=cabinetMinister[position];
		System.out.println("string:"+ref);	
	}
	System.out.println("ends main country");
}
	
	
	
	
//5. Method to take political parties:String[]: 5


    public static void politicalParties(String[] args){
	System.out.println("starts main country");
	for(int position=0;position<=5;position++){
		String ref=politicalParties[position];
		System.out.println("string:"+ref);	
	}
	System.out.println("ends main country");
}	
	
}