//method to take cabinetministers :String[]:30

class CabinetministersRunner{

public static void cabinetministersName(String[] ministers){
	
	System.out.println("start main");
	
	for(int start=0;start<ministers.length;start++){
	
	String ref= ministers[start];
	System.out.println("minister name:"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	String[] cabinetministersNames={"Rajnath Singh","Amit Shah","Nitin Jairam Gadkari","Nirmala Sitharaman",
	   "Shivraj Singh Chouhan","Subrahmanyam Jaishankar","Subrahmanyam Jaishankar","Jagat Prakash Nadda",
	   "Manohar Lal","H. D. Kumaraswamy","Piyush Goyal","Dharmendra Pradhan","Jitan Ram Manjhi","Rajiv Ranjan Singh",
	   "Sarbananda Sonowal","Kinjarapu Rammohan Naidu","Pralhad Joshi","Jual Oram","Giriraj Singh"," Ashwini Vaishnaw",
	   "Jyotiraditya M. Scindia","Bhupender Yadav","Gajendra Singh Shekhawat","Annpurna Devi","Virendra Kumar",
	   "Kiren Rijiju","Hardeep Singh Puri","Mansukh Mandaviya","Kishan Reddy","Chirag Paswan"};
	
	
	cabinetministersName(cabinetministersNames);
	
}


}