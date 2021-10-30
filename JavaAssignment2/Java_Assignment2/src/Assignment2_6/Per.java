package Assignment2_6;

public class Per {

	public static void main(String[] args)
	{
		FilePersistence obj1=new FilePersistence();
		DatabasePersistence obj2=new DatabasePersistence();

		obj1.persist();
		obj2.persist();
	}

}
