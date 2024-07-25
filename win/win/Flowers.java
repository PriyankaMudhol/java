class Flowers{
	public static void rose()
	{
		System.out.println("running rose in flowers");
	}
	public static void jasmine()
	{
		System.out.println("running jasmine in flowers");
		Flowers.lilly();
		Flowers.lilly();
		Flowers.lilly();
		
	}
	public static void lilly()
	{
		System.out.println("running lilly in flowers");
	}
	public static void lotus()
	{
		System.out.println("running lotus in flowers");
	}
	public static void hibiscus()
	{
		System.out.println("running hibiscus in flowers");
	}

}