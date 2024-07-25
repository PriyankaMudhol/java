class WashingMachine{
	
	public static void wash() //declared a public static method with return type void and with wash declaration//
	{
		System.out.println("running wash in WashingMachine");
	}
	public static void makesNoise()
	{
		System.out.println("running makesNoise in WM");
		WashingMachine.shake(); //using class name is optional
	}
	public static void shake()
	{
		System.out.println("running shake in WM");
	}
}
