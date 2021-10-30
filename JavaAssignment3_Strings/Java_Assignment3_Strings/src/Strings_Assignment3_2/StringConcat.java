package Strings_Assignment3_2;

import java.util.Scanner;

public class StringConcat 
{
	public static void main(String[] args) 
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string 1");
		str1=sc.nextLine();
		System.out.println("Enter string 2");
		str2=sc.nextLine();
		System.out.println("Concatenated String");
		System.out.println(str1.concat(str2));	
	}

}