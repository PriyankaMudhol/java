//method to take politicalparties :String[]:5

class PoliticalpartiesRunner{

public static void politicalpartiesName(String[] parties){
	
	System.out.println("start main");
	
	for(int start=0;start<parties.length;start++){
	
	String ref= parties[start];
	System.out.println("parties name:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[]  politicalpartiesNames={"Bharatiya Janata Party","Communist Party of India","Indian National Congress",
		"Aam Aadmi Party","Bahujan Samaj Party"};
	
	
	 politicalpartiesName( politicalpartiesNames);
	
}


}