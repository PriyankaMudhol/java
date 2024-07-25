class Raj
{

public static String name(String usn){
		
		System.out.println("running name in Raj");
	
	if(usn=="2ag20cs064")
	{
		return "priya" ;
	}
	 if(usn=="2ag20cs410")
	{
		return "darsh";
	}
	return "danu";
}

public static String vote(int age){
		
		System.out.println("running name in Raj");
	
	if(age>=18)
	{
		return "vote" ;
	}
	else
	{
		return "na";
	}
}


public static void access(String name){
	
	System.out.println("run");
	return ;
}

public static void main(String[] args){
	name("2ag20cs030");
	vote(15);
	access("priya");
}


}