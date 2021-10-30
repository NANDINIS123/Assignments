package Assignment2_7;

import java.util.Scanner;

public class Customer {
	int noofCandy,noofCookies,noofIcecream;
	
	public void placeOrder(DesertItems candy,DesertItems cookies,DesertItems iceCream)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		Boolean isTrue=true;
		while(isTrue)
		{
			System.out.println("Select your order :"+"\n"+ "1. Candy(60rs)"+"\n"+""
					+ "2. Cookies(50)"+"\n"+"3. Icecream(70)"+"\n"+"Press 1 for candy,"
							+ " 2 for cookies,3 for icecream"+"\n");
			 int selected =sc.nextInt();
			 switch(selected) 
			 {
			 case 1:
			 {
				 System.out.println("Enter number of candy to add:");
				 noofCandy=sc.nextInt();
				 candy.numOfDesert -= noofCandy;
				 break;
			 }
			 case 2:
			 {
				 System.out.println("Enter number of cookies to add:");
				 noofCookies=sc.nextInt();
				 cookies.numOfDesert -= noofCookies;
				 break;
			 }
			 case 3:
			 {
				 System.out.println("Enter number of icecream to add:");
				 noofIcecream=sc.nextInt();
				 iceCream.numOfDesert -= noofIcecream;
				 break;
			 }
			 default:
				 System.out.println("Wrong option");
			 }
			 System.out.println("Enter 1 to select more and 0 if exit:");
			 int num=sc.nextInt();
			 if(num==0)
			 {
				 isTrue=false;
			 }
		}
		System.out.println("Added successfully");
		showOrder(candy.getCost(),cookies.getCost(),iceCream.getCost());
	}
	public void showOrder(int a,int b,int c)
	{
		System.out.println("Your order is:"+"\n"+"Deserts "+"Qty "+"Amount"+"\n"+"1. candy "+noofCandy+" "
				+ ""+(a*noofCandy)+"\n"+"2. cookies "+noofCookies+" "+(b*noofCookies)+"\n"
				          +"3. Icecream "+noofIcecream+" "+(c*noofIcecream)+"\n"+"--------"+"\n"+"Total bill"+" "
				          		+ ""+((a*noofCandy)+(b*noofCookies)+(c*noofIcecream)));
				
	}
}
