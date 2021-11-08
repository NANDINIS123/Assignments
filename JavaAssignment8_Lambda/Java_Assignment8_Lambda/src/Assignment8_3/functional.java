package Assignment8_3;

import java.util.function.Supplier;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class functional
	{
		
		public static void main(String[] args) 
		{
			String[] s= {"Nandini","Roopa","Poo"};
			
			Supplier<String> supp=()-> Arrays.toString(s);
			System.out.println(supp.get());
			
			Consumer<String[]> cons=(String)->System.out.println(Arrays.toString(String));
			cons.accept(s);
			
			Predicate<String[]> pred =(String)->Arrays.toString(String).contains("Nandini");
			System.out.println(pred.test(s));
			
			Function<String[],String> func=(String)->Arrays.toString(String);
			System.out.println(func.apply(s));
		}
	}