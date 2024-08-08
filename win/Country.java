//Country : name , continent, State:literal
//Declare a method to print details

class Country
{
	String name;
	Sting continent;
	State.state=new State("Tamilnadu","tamil");
	
	Country()
	{
		System.out.println("created  constructor with no parameter");
	}
	Country(String name,Sting continent)
	{
		this.name=name;
		this.continent=continent;
		
		System.out.println("created  constructor with  parameter");
	}
	
	pubic void display()
	{
		System.out.println("Country name:"+name);
		System.out.println("Country continent:"+continent);
		
		State.display();
	}
	
	
}