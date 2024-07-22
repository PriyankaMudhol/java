class Fusionlens
{
	public static void detect(String name)
	{
		System.out.println("running detect in Fusionlens with String parameter");
		System.out.println("name:"+name);		
	}
	
	public static void detect(String name,String color)
	{
		System.out.println("running detect in Fusionlens with String parameter");
		System.out.println("name:"+name);
		System.out.println("color:"+color);			
	}
	
	public static void detect(String name,String color,String shape)
	{
		System.out.println("running detect in Fusionlens with String parameter");
		System.out.println("name:"+name);
		System.out.println("color:"+color);	
		System.out.println("shape:"+shape);
	}
	
	public static void detect(String name,float weight,String shape)
	{
		System.out.println("running detect in Fusionlens with String parameter");
		System.out.println("name:"+name);
		System.out.println("weight:"+weight);	
		System.out.println("shape:"+shape);		
	}
	
	public static void detect(String name,float weight,double price)
	{
		System.out.println("running detect in Fusionlens with String parameter");
		System.out.println("name:"+name);
		System.out.println("weight:"+weight);	
		System.out.println("price:"+price);
	}	
}