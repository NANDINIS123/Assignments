package Assignment4_3b;

class IllegalBankTransactionException extends Exception 
{
	    String message;
	public IllegalBankTransactionException  (String message) {
		this.message=message;
	}
	public String toString()
	{
		return message;
	}
}