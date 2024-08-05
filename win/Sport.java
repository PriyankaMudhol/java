class Sport
{
	public static void player(String name , String country)
	{
		System.out.println("running player in sport with String parameter");
		System.out.println("name:"+name);
		System.out.println("country:"+country);
	}
	public static void player(int jersey)
	{
		System.out.println("running jersey");
		System.out.println("jersey:"+jersey);
	}
	public static void player(String hesru , int age)
	{
		System.out.println("eno ond");
		System.out.println("hesru:"+ hesru);
		System.out.println("age: "+ age);
		
	}
	
	 public static void main(String[] args)
	  {
		  System.out.println("running player method ");
		  Sport.player("vihan","jermany");
		  Sport.player(13);
		  Sport.player("vikki",30);
	  }  		  		  
}