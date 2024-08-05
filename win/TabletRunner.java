class TabletRunner
{
	public static void main(String[] args)
	{
		//instantiation : copy
		Tablet tablet=new Tablet();
		tablet.setName("dolo"); //setter method
		tablet.setPrice(10); //argument
		
		tablet.display();
		
		//System.out.println("tablet name :"+tablet.name);
		//System.out.println("tablet price :"+tablet.price);
		
		Tablet tablet1=new Tablet();
		tablet1.display();
		System.out.println("tablet1 name :"+tablet1.name);
		System.out.println("tablet1 price :"+tablet1.price);
		tablet1.setName("Crocin");
		tablet1 .setPrice(8);
		tablet1.display();
		System.out.println("tablet updated name :"+tablet1.name);
		System.out.println("tablet updated price :"+tablet1.price);
		
	}
}class TabletRunner
{
	public static void main(String[] args)
	{
		//instantiation : copy
		Tablet tablet=new Tablet();
		tablet.setName("dolo"); //setter method
		tablet.setPrice(10); //argument
		
		tablet.display();
		
		//System.out.println("tablet name :"+tablet.name);
		//System.out.println("tablet price :"+tablet.price);
		
		Tablet tablet1=new Tablet();
		tablet1.display();
		System.out.println("tablet1 name :"+tablet1.name);
		System.out.println("tablet1 price :"+tablet1.price);
		tablet1.setName("Crocin");
		tablet1 .setPrice(8);
		tablet1.display();
		System.out.println("tablet updated name :"+tablet1.name);
		System.out.println("tablet updated price :"+tablet1.price);
		
	}
}