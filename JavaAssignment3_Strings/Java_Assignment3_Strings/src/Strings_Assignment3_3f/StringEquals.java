package Strings_Assignment3_3f;
public class StringEquals {

	public static void main(String[] args) 
	{
		String str1="Java String pool refers to collection of string which are stored in heap memory";
		String str2="java string pool refers to collection of string which are stored in heap memory";
		 boolean areEqual=str1.equals(str2);
		  if(areEqual==true) 
		  {
			  System.out.println("Str1 matches Str2");
		  }
		  else
			  System.out.println("Str1 does not match Str2");
	}

}
