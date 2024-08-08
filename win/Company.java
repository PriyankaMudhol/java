//Company : id,name,location: constructor ,SoftwareEnginner:literal
//Declare a method to print details

class Company 
{
	int id;
	String name;
	String location;
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("vamshi",20,"java Developer",2000);
	
	Company ()
	{
		System.out.println("created  constructor with no parameter");
	}
	
	Company(int id,String name,String location)
	{
	this.id=id;
	this.name=name;
	this.location=location;
	
	System.out.println("created  constructor with  parameter");
	}
	
	public void create()
	{
		System.out.println("Company id:"+id);
		System.out.println("Company name:"+name);
		System.out.println("Company location:"+location);
		
		softwareEnginner.create();
	}
}