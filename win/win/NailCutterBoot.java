class NailCutterBoot
{
	public static void main(String[] args)
	{
		System.out.println("Start main in NailCutterBoot");
		new NailCutter(); //java will allocate the memory whenever we use new keyword and invokes the constructor
		new BlueBook();
		System.out.println("End main in NailCutterBoot");
	}
	
}
