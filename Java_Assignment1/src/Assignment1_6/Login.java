package Assignment1_6;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String userId="Nandini";
		String password="12345";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userId");
		String entereduserId=sc.nextLine();
		System.out.println("Enter password");
		String enteredpassword=sc.nextLine();
		
		if(userId.equals(entereduserId))
		{
			for(int i=0;i<3;i++)
			{
				if(password.equals(enteredpassword))
				{
					System.out.println("Login successfully");
					break;
				}
				else if(i==2)
				{
					System.out.println("contact Admin");
					break;
				}
			}
			System.out.println("Wrong password Enter Again");
			enteredpassword=sc.nextLine();			
		}
		else
		{
			System.out.println("Wrong Username");
		}
			

	}

}
