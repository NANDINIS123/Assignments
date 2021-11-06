package Assignment6_1;

public class Data {

	long phoneNum;
	String name;
	String gender;
	String email;
	
	
	public Data (long phoneNum,String name,String email,String gender ) 
	{
		super();
		this.phoneNum=phoneNum;
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
		
    public String toString()
	{
		return"[Num=" +phoneNum+",Name=" + name +",Email=" +email+",Gender="+gender+"]";
	}



}

