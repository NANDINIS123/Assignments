package Assignment2_3;

public class Cash {

	public static void main(String[] args) 
	{
		Bank newBank=new Bank();
		newBank.showTotal();
		
		Bank savingsAc=new SavingsAccount();
		Bank current=new CurrentAccount();
		
		savingsAc.addAmt(5000);
		current.addAmt(10000);
		
		newBank.addToTotalBankCash(current);
		newBank.addToTotalBankCash(savingsAc);
		
		current.showTotal();
		savingsAc.showTotal();
				
		newBank.showTotal();

	}

}
