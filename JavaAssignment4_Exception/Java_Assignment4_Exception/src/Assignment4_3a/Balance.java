package Assignment4_3a;

import java.util.Scanner;

public class Balance {
    static double current_balance=2000;
	public static void main(String[] args) throws MinimumAccountBalance {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the withdrawal amount:");
	int n=sc.nextInt();
	try {
		if(current_balance<n)
		{
			throw new MinimumAccountBalance("Insufficient Balance and your current"
					+ " balance is"+current_balance);
		} else 
		{
			System.out.println("Please take the Money:"+n);
		}
	} catch(MinimumAccountBalance eb) {
		eb.printStackTrace();
	}

	}

}
