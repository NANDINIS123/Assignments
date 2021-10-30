package Strings_Assignment3_3b;

import java.util.Scanner;

public class StringUpper 
{
		public static void main(String[] args) 
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter a string:");
			String line=in.nextLine();
			line= line.toUpperCase();
			System.out.println(line);

		}

	}

