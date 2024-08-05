//Array is a datatype
//Store the reference
//datatype[] refname
//Two ways to init array , literal or new keyword
//Array is stored in instance memory
//size of array is fixed
//element is ref stored in array
//index start with zero, incremet1
//length is variable, total elements in array

//Task :
1. Store 15 emails in array and print all elements from array
2. Store 20 characters in array and print all elements from array
3. Store 10 sweets in array and print all elements from array

class EmailRunner
{
	public static void main (String[ ] artgs)
	{
		String priyankaEmailId="pm.mudholpriyanka84@gmail.com";
		String nidhiEmailId="nj.nidhishree2@gmail.com";
		String tejuEmailId="tj.tejuxworkz1@gmail.com";
		String divyaEmailId="dg.divyagm67@gmail.com";
		String laxmiEmailId="ln.laxminaik34@gmail.com";
		String pratiEmailId="pratipatil63@gmail.com";
		String heenaEmailId="hk.heenama9@gmail.com";
		String rachuEmailId="rh.rachana@gmail.com";
		String geetaEmailId="gm.geetamath3@gmail.com";
		String sushmaEmailId="sp.sushmapawar4@gmail.com";
		String kavyaEmailId="kk.kavyakurab3@gmail.com";
		String mahiEmailId="mahimathpati9@gmail.com";
		String pushpaEmailId="ph.pushpahamar7@gmail.com";
		String saruEmailId="sp.sarupatik4@gmail.com";
		String harshEmailId="ha.harshamar8@gmail.com";
		
		String[] emailId={priyankaEmailId,nidhiEmailId,tejuEmailId,divyaEmailId,
		laxmiEmailId,pratiEmailId,heenaEmailId,rachuEmailId,geetaEmailId,sushmaEmailId,
		kavyaEmailId,mahiEmailId,pushpaEmailId,saruEmailId,harshEmailId};
		 
		int number=emailId.length;
		System.out.println("total number of emailId No:"+number);
	    for(int i=0;i<number;i++)
		{
			System.out.println(emailId[i]);
		}
	}
}
