class TrainRunner
{
   public static void main(String[] args)
	  {
		  System.out.println("running main method in TrainRunner");
		  Train.book("Rajajinagar","Vijaynagar");
		  Train.book("Rajajinagar","Vijaynagar",4);
		  Train.book("Rajajinagar","Vijaynagar",4,25.70);
		  Train.cancel(2706);
		  Train.cancel("Rajajinagar","Vijaynagar");
	  }	  
}