package Assignment8_8;
 
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintNum {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,35,45,50,60,75,85,90);
		
		Consumer<List<Integer>>dispList = (list1) -> System.out.println(list1);;
		 
		Thread newthread = new Thread( ()-> dispList.accept(list) );
		
		newthread.start();
 	 
	}
  
}