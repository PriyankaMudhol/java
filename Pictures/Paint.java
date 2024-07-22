class Paint
{
  public static void pink(String brand)
  {  
  System.out.println("running pink in Paint with String parameter");
  System.out.println("Brand:"+brand);
  }
  
  public static void pink(String brand,String color)
  {
	System.out.println("running pink in Paint with String parameter");
    System.out.println("Brand:"+brand); 
    System.out.println("Color:"+color);
  }
  
  public static void pink(String brand,double price)
  {
	System.out.println("running pink in Paint with String parameter");
    System.out.println("Brand:"+brand); 
	System.out.println("Price:"+price); 
  }
  
  public static void pink(String color,String type,double price)
  {
	System.out.println("running pink in Paint with String parameter");
    System.out.println("Color:"+color); 
    System.out.println("Type:"+type);
    System.out.println("Price:"+price);	
  } 
}