class Ringtone
{
	 public static void main (String[] args)
	 {
		 int noOfStudents=20;
		 int noOfdaysInAWeek=7;
		 
		 boolean same=(noOfStudents==noOfdaysInAWeek);
		 System.out.println("Same :"+same);
		 
		 char tshirtSize='M';
		 char shirtSize='S';
		
		boolean sameShirt =tshirtSize==shirtSize;
		System.out.println("sameShirt:"+sameShirt); 
		
		double salary=23.5;	
		double salary1=23.5;	
		
		boolean checkSalary=salary==tshirtSize;
		System.out.println("checkSalary:"+checkSalary);
		
		boolean rainYesterday=false;
		boolean rainToday=false;
		
		boolean rain=rainYesterday==rainToday;//incomparable types
		System.out.println("rain:"+rain);
		char direction=67;
		System.out.println("Direction:"+direction);

        int big='S';
		System.out.println("Big:"+big);
		
		






	
	 }
   
}