package Assignment5_2;

import java.util.HashMap;
public class HoldRandomNumbers {

	public static void main(String[] args) {
		 
		HashMap<Integer,Double> RandomNum=new HashMap<>();
		
		RandomNum.put(0, 50.0);
		RandomNum.put(1, 800.0);
		RandomNum.put(6, 600.0);
		RandomNum.put(0, 400.0);
		RandomNum.put(2, 30.0);
		RandomNum.put(8,750.0);
		RandomNum.put(4, 200.0);
		RandomNum.put(8, 80.0);
		RandomNum.put(3, 50.0);
		RandomNum.put(2, 300.0);
          
		System.out.println(RandomNum);
	}

}
