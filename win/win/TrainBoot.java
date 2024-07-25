class TrainnBoot
{
	public static void main(String[] args)
	{
			System.out.println("start main ");

			Train train= new Trainn();
			
			Alien alien= new Alien();
			Train alien1= new Trainn();
			train=alien1;
			
			//allocate the memory
			//invoke the constructor
			//return the location
			System.out.println("end main ");
	}
}