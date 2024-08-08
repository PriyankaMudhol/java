//CapitalCity: name,population
//Declare a method to print details

class CapitalCity
{
	String name;
	double population;
	
	CapitalCity()
	{
		System.out.println("created  constructor with no parameter");
	}
	
	CapitalCity(String name,long population)
	{
		this.name=name;
		this.population=population;
	
	System.out.println("created  constructor with  parameter");
	}
	public void display()
	{
		System.out.println("CapitalCity Name :"+name);
		System.out.println("CapitalCity Population :"+population);
	}
}