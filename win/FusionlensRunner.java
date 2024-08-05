class FusionlensRunner
{
	public static void main(String[] args)
	  {
		  System.out.println("running main method in TrainRunner");
		  Fusionlens.detect("dog");
		  Fusionlens.detect("dog","brown");
		  Fusionlens.detect("dog","brown","mesocephalic");
		  Fusionlens.detect("dog",4,"mesocephalic");
		  Fusionlens.detect("dog",4,2500.80);
	  }  
}