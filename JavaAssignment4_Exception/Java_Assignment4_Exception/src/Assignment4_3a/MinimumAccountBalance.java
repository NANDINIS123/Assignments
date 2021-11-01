package Assignment4_3a;
import java.util.Scanner;

class MinimumAccountBalance extends Exception
{
    String message;
public MinimumAccountBalance (String message) {
	this.message=message;
}
public String toString()
{
	return message;
}
}

