class SweetsRunner
{
	public static void main (String[ ] args)
	{
		String favSweet="Gulabjamun";
		String orangeColorSweet="Jalebi";
		String tastySweet="Bundi";
		String kajuSweet="KajuKatlet";
		String halwaSweet="GajarHalwa";
		String pedaSweet="DharwadPeda";
		String ladooSweet="Besan";
		String normalSweet="ShankarPale";
		String kadbuSweet="Kadbu";
		String SugarSweet="sugar";
		
		String[] Sweets={favSweet,orangeColorSweet,tastySweet,kajuSweet,halwaSweet,
		pedaSweet,ladooSweet,normalSweet,kadbuSweet,SugarSweet};
		
		int number=Sweets.length;
		System.out.println("total number of sweets No:"+number);
		for(int i=0;i<number;i++)
		{
			System.out.println(Sweets[i]);
		}
	}
}