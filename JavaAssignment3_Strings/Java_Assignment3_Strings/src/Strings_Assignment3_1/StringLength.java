package Strings_Assignment3_1;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) 
	{
		int i=0;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		int n=str.length();
		System.out.println("Length of string="+n);
		char ch[]=str.toCharArray();
		int n2=ch.length;
		System.out.println("Length of string="+n2);
		
	}

}
