//method to take states :String[]:29

class pincodes{

public static void pincodesnumbers(int[] numbers){
	
	System.out.println("start main");
	
	for(int start=0;start<numbers.length;start++){
	
	String ref= numbers[start];
	System.out.println("numbers"+ref);
	}


}
public static void main(String[] args){
	
	System.out.println("run main method ");
	
	int[] pincodesnumberslist{591112,500001,591113,591114,592221,591116,
	591118,591117,591118,591111};
	 pincodesnumbers( pincodesnumberslist);
	
}


}