package Strings_Assignment3_Builder_2;

public class StringBuilderInsert {

	public static void main(String[] args) 
	{
		StringBuilder str= new StringBuilder("It is used to _ at specified index position");
        System.out.println("string ="+str);
        str.insert(str.indexOf("_"), "insert text");
       //str.insert(15, "insert text");
        System.out.println("After insertion:");
        System.out.println(str.toString());
	
          
	}
}
