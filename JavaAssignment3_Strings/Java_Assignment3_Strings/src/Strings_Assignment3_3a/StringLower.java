package Strings_Assignment3_3a;

import java.util.Scanner;

public class StringLower {

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:");
		String line=in.nextLine();
		line= line.toLowerCase();
		System.out.println(line);

	}

}
