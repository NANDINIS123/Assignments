package Assignment2_3;

public class SavingsAccount extends Bank{

	private String name="Saving Account";
	
	public void showTotal()
	{
		System.out.println("Your Fixed Deposits"+name+"balance is"+totalAmount);
	}

}
