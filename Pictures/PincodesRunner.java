//method to take pincodes :int[]:10

class PincodesRunner{

public static void citynumber(int[] number){
	
	System.out.println("start main");
	
	for(int start=0;start<number.length;start++){
	
	int ref= number[start];
	System.out.println("number"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	int[] citynumbers={591112,500001,591113,591114,592221,591116,
591118,591117,591118,591111};
	 citynumber( citynumbers);
	
}


}