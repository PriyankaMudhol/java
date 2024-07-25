class JuiceBoot
{
	public static void main(String[] args)
	{
		System.out.println("START");
		Juice juice=new Juice();
		
		String name=juice.name;
		double price=juice.price;
		int quantity=juice.quantity;
		System.out.println("Juice name :"+name);
		System.out.println("Juice price :"+price);
		System.out.println("Juice quantity :"+quantity);
		juice.name="Orange";
		juice.price=45;
		juice.quantity=250;
		System.out.println("Alcohol Updated name :"+juice.name);
		System.out.println("Alcohol updated price :"+juice.price);
		System.out.println("Alcohol Updated quantity :"+juice.quantity);
		System.out.println("END");
	}
}