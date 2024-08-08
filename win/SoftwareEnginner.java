//SoftwareEnginner: name,experience,designation,salary : constructor
//Declare a method to print details

class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	SoftwareEnginner()
	{
		System.out.println("created  constructor with no parameter");
	}
	
	SoftwareEnginner(String name,int experience,String designation,int salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
		
		System.out.println("created  constructor with  parameter");
	}
	public void create()
	{
		System.out.println("SoftwareEnginner Name :"+name);
		System.out.println("SoftwareEnginner Experience :"+experience);
		System.out.println("SoftwareEnginner Designation :"+designation);
		System.out.println("SoftwareEnginner Salary :"+salary);
		
	}
}