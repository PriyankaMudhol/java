class AirConditionBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		AirCondition airCondition =new AirCondition();
		
		String name=airCondition.name;
		double price=airCondition.price;
		int quantity=airCondition.quantity;
		
		System.out.println("AirCondition name:"+name);
		System.out.println("AirCondition price:"+price);
		System.out.println("AirCondition quantity:"+quantity);
		
		airCondition.name="AC";
		airCondition.price=2000;
		airCondition.quantity=256;
		
		System.out.println("Application Updated name:"+airCondition.name);
		System.out.println("Application Updated price:"+airCondition.price);
		System.out.println("Application Updated quantity:"+airCondition.quantity);
		
		System.out.println("END");
	}	
		
		
		
}