class Tablet
{
	String name;
	double price;
	
	public void display()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Price :"+this.price); //this keyword here is optional
	}
	public void setName(String name)
	{
		this.name=name;
		//instance method
	}	
	public void setPrice(double price)
	{
		this.price=price;
	
	}
}