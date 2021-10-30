package Strings_Assignment3_3c;

import java.util.Scanner;

public class StringReplace 
{
		public static void main(String[] args) 
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter a string:");
			String line=in.nextLine();
			line= line.replace('a','$');
			System.out.println(line);

		}

	}
