package Assignment2_7;

import java.util.Scanner;

public class DesertShop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DesertItems candy=new Candy();
		DesertItems cookies=new Cookies();
		DesertItems iceCream=new Candy();
		Owner owner=new Owner();
		Customer customer=new Customer();
		Boolean isTrue=true;
		
		while(isTrue)
		{
			System.out.println("\n\nOwner or Cuustomer");
			System.out.println("0 to exit");
			String person=sc.nextLine();
			if(person.equalsIgnoreCase("Owner"))
			{
				System.out.println("\n"+"Owner:");
				
				owner.addDesert(candy,cookies,iceCream);
				
			}else if(person.equalsIgnoreCase("Customer"))
			{
				customer.placeOrder(candy,cookies,iceCream);
			}else
			{
				int num=sc.nextInt();
				if(num==1)
				{
					isTrue=false;
				}
			}
			
		}
		

	}

}
