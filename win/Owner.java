//Owner : name,age,gender : constructor
//Declare a method to print details

class Owner
{
	String name;
	int age;
	char gender;
	
	Owner()
	{
		System.out.println("created  constructor with no parameter");
	}
	
	Owner(String name,int age,char gender)
	{
	this.name=name;
	this.age=age;
	this.gender=gender;
	
	System.out.println("created  constructor with  parameter");
	}
	public void display()
	{
		System.out.println("Owner Name :"+name);
		System.out.println("Owner Age :"+age);
		System.out.println("Owner Gender :"+gender);
	}
}