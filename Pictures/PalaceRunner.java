class PalaceRunner
{
	public static void main(String[] information)
	{
	    if (information.length==4)
		{
		    System.out.println("getting four infomations in main method");
		    String name=information[0];
		    String location=information[1];
		    String builtBy=information[2];
		    String builtYear=information[3];
		
		    System.out.println("name:"+name);
		    System.out.println("location:"+location);
		    System.out.println("builtBy:"+builtBy);
		    System.out.println("builtYear:"+builtYear);
		}
		else
		{
		System.out.println(" not getting four infomations in Palace");
		}
		
	}
	
	
}