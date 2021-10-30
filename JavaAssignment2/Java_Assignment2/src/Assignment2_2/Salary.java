package Assignment2_2;

public class Salary {

	public static void main(String[] args) {
		int total=0;
		Employee E=new Employee();
		total+=E.salary(20000);
		E=new Manager();
		total+=E.salary(25000);
		E=new Labour();
		total+=E.salary(10000);
		System.out.println("Total salary of an employee is:"+total);
		
	}

}
