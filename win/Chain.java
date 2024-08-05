//Declare a class Chain
//1. Method to return carat
//2. Method to return cost per gram
//3. Method to return type
//4. Method to return quality
//5. Method to return quantity
//6. Method to return wastage
//7. Method to return serviceCharge
//8. Method to return GST


class Chain{
	public static int carat()
	{
		System.out.println("Running carat in Chain");
		int carat=30;
		return carat;
	}
	
	public static double costPerGram()
	{
		System.out.println("Running costPerGram in Chain");
		int costPerGram=6078;
		return costPerGram;
	}
	
	public static String type()
	{
		System.out.println("Running type in Chain");
		String type="Silver";
		return type;
	}
	
	public static String quality()
	{
		System.out.println("Running quality in Chain");
		String quality="good";
		return quality;
	}
	
	public static double quantity()
	{
		System.out.println("Running quantity in Chain");
		double quantity=777.99;
		return quantity;
	}
	
	public static byte wastage()
	{
		System.out.println("Running wastage in Chain");
		byte wastage=9;
		return wastage;
	}
	public static double serviceCost()
	{
		System.out.println("Running serviceCost in Chain");
		double serviceCost=1789.06;
		return serviceCost;
	}
	public static float gst()
	{
		System.out.println("Running gst in Chain");
		float gst=23.98f;
		return gst;
	}
}




