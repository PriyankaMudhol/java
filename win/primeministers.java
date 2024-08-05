//method to take primeministers :String[]:All

class primeministers{

public static void primeministersName(String[] ministers){
	
	System.out.println("start main");
	
	for(int start=0;start<ministers.length;start++){
	
	String ref= ministers[start];
	System.out.println("minister name:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] primeministersNames={"Jawahar Lal Nehru","Rajiv Gandhi","Lal Bahadur Shastri","Gulzari Lal Nanda",
		"Indira Gandhi","Morarji Desai","Charan Singh","V. P. Singh","Chandra Shekhar","P. V. Narasimha Rao",
		"Atal Bihari Vajpayee","H. D. Deve Gowda","Inder Kumar Gujral","Manmohan Singh","Narendra Modi"};
	
	
	primeministersName(primeministersNames);
	
}


}