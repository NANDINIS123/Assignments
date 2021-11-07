package Assignment7_1;

	@interface test
	{	
	}
	class a
	{
		public void show() 
		{
			System.out.println("this is a method a");
		}
	}
	@test
	class b extends a
	{
		public void show() 
		{
			System.out.println("this is a method b");	
	    }
	}
public class Custom_Annotation
	{
		public static void main(String[] args) 
		{
			
			b object =new b();
			object.show();
			a object1=new a();
			object1.show();
		}	
	}

