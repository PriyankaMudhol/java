class Comp
{	
	public static int employeesalary(int age)
	{
		int basicSalary=20000;
		int incrementSalary=basicSalary+2000;
		int againIncrement=incrementSalary+2000;
		if(age>=18 &&age<25)
		{
			return basicSalary;
		}
		else if(age>=25 &&age<30){
			
			return incrementSalary;
			
		}else if(age>=30){
			
			return againIncrement;
			
		}
		return 0;
	}
	
}
