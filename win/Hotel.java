//Hotel : name:literal, Owner:literal
//Declare a method to print details

class Hotel
{
	String name="Prema";
	Owner owner=new Owner("Suni",20,'M');
	
    Hotel()
	{
	System.out.println("created  constructor with no parameter");
	}
	
	public void display()
	{
		owner.display();
	
	}
}