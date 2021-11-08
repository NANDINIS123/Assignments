package Assignment8_1;

interface Arithmatic
{
	public void calculation(int a,int b);
}

public class Arithematic 
{

	public static void main(String[] args) 
	{
		
		int a=20;
		int b=20;
		 
		Arithmatic add = (c,d) -> System.out.println("Add : " + (c+d)); //Addition
		Arithmatic substract = (c,d) -> System.out.println("Subtract : " + (c-d)); //Subtraction
		Arithmatic multiply = (c,d) -> System.out.println("Multiply : " + (c*d)); //Multiplication
		Arithmatic division = (c,d) -> System.out.println("Division : " + (c/d));  //Division

		add.calculation(a, b);
		substract.calculation(a, b);
		multiply.calculation(a, b);
		division.calculation(a, b);
	}

}


