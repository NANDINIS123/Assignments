package Assignment6_2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Unique {
	

	public static void main(String[] args) 
	{
		Products product1=new Products("Apple");
		Products product2=new Products("Box");
		Products product3=new Products("Cream");
		
		Set<Products> unique=new TreeSet<>();
		
		unique.add(product1);
		unique.add(product2);
		unique.add(product3);
		
		unique.add(product1);
		Iterator<Products> i=unique.iterator();
				while(i.hasNext())
				{
					System.out.println(i.next().Name);
				}
		

	}

}

class Products implements Comparable<Products>
{
	String Name;
	
	public Products(String name)
	{
		super();
		this.Name=name;
	}
	public int compareTo(Products o)
	{
		if(Name.compareTo(o.Name)>0)
		{
			return 1;
		}
		else if(Name.compareTo(o.Name)<0)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
}