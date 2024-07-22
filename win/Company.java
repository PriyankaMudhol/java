class Company
{
 public static void tcs()
 {
	 System.out.println("company has tcs");
 }
 public static void infosys()
 {
	 System.out.println("company has infosys");
 }
 public static void amazon()
 {
	 System.out.println("company has amazon");
	 Company.flipkart(); //invoke
 }
 public static void flipkart ()
 {
	 System.out.println("company has flipkart");
	 Company.amazon(); //invoke
 }
 
}