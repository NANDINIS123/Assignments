package Assignment5_4;

public class Generic {

	public static void main(String[] args) {
		Pair<String, String>obj1=new Pair<String, String> ("Hello","World");
		Pair<String, java.util.Date> obj2=new Pair<>("Today is:", new java.util.Date());
        
		System.out.println(obj1.showData());
		System.out.println(obj2.showData());
	}

}
