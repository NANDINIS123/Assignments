package Assignment2_2;

public class Employee 
{
	public int salary(int amt)
	{
		System.out.println("salary of an employee is:"+amt);
		return amt;
	}
}
class Manager extends Employee
{
	public int salary(int amt)
	{
		System.out.println("Intensive of manager is:"+amt);
		return amt;
	}
}
class Labour extends Employee
{
	public int salary(int amt)
	{
		System.out.println("overtime for labour is:"+amt);
		return amt;
	}
}

	