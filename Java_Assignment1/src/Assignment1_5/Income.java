package Assignment1_5;
 import java.util.Scanner;
 
public class Income {

	public static void main(String[] args) {
		double tax=0,it;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income");
		it=sc.nextDouble();
		if(it<=180000)
		{
			tax=0;
		}
		else if (it>181000 && it<=300000)
			tax=0.1*it;
		else if (it>300000 && it<=500000)
			tax=0.2*it;
		else if (it>500000 && it<=1000000)
			tax=0.3*it;
		else
			tax=0.4*it;
		System.out.println("Income tax Amount is:"+tax);

	}

}
