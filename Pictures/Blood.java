//Declare a class Blood with following methods
//1. Method to return group
//2. Method to return personName
//3. Method to return cost
//4. Method to return hospitalTested
//5. Method to return sickness or not
//6. Method to return donate or no



class Blood
{
	public static char group()
	{
		System.out.println("running group in Blood");
		char type='A';
		return type;
	}
	public static String personName()
	{
		System.out.println("running personNamein blood");
		String name="PIYU";
		return name;
	}
	public static double cost()
	{
		System.out.println("running cost in blood");
		double price=1787.46;
		return price;
	}
	public static boolean hospitalTested()
	{
		System.out.println("running hospitalTested in blood");
		boolean isTested=true;
		return isTested;
	}
	public static boolean sickness()
	{
		System.out.println("running sickness in blood");
		boolean yesOrNo= false;
		return yesOrNo;
	}
	public static char donate()
	{
		System.out.println("running donate in blood");
		char XZ='A';
		return XZ;
	}
}


