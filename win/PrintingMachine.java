class PrintingMachine
{
	String brand;
	String speed;
	
	PrintingMachine(String brandLocal , String speedLocal)
	{
		brand=brandLocal;
		speed=speedLocal;
		
		System.out.println("Created PrintingMachine with brand, speed");
		System.out.println("brand :"+brand);
		System.out.println("speed   :"+speed);
		System.out.println("brand Local :"+brandLocal);
		System.out.println("speed Local :"+speedLocal);
		
	}
}