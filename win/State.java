//State: name,language: constructor CapitalCity : literal
//Declare a method to print details

class State
{
	String name;
	String language;
	
	CapitalCity.capitalCity=new CapitalCity("sourab",2000);
	
	State ()
	{
		System.out.println("created  constructor with no parameter");
	}
	
	State(String name,String language)
	{
		this.name=name;
		this.language=language;
		
		System.out.println("created  constructor with  parameter");
	}
	
	public void display()
	{
		System.out.println("State name:"+name);
		System.out.println("State language:"language);
		capitalCity.display();
	}
	
}