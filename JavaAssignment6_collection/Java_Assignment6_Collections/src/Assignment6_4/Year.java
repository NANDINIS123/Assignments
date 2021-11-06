package Assignment6_4;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.*;

public class Year {

	public static void main(String[] args) {
		LinkedList<LocalDate> D1=new LinkedList<LocalDate>();
		LinkedList<Integer> D2=new LinkedList<Integer>();
		LocalDate D11=LocalDate.of(2010, 12, 13);
		if(D11.isLeapYear())
		{
			D2.add(1);
		}
		else D2.add(0);
		LocalDate D12=LocalDate.of(2020, 12, 23);
		if(D12.isLeapYear())
		{
			D2.add(1);
		}
		else D2.add(0);
		LocalDate D13=LocalDate.of(2021, 12, 23);
		if(D13.isLeapYear())
		{
			D2.add(1);
		}
		else D2.add(0);
		
		D1.add(D11);
		D1.add(D12);
		D1.add(D13);
		for(int i=0;i<D2.size();i++)
		{
		    int j=D2.get(i);
		    if(j==1)
		    	System.out.println("your date of birth :"+D1.get(i)+" It is a Leap year");
		    else
		    	if(j==0)
		    		System.out.println("your date of birth :"+D1.get(i)+" It is not a Leap year");	
		}
	}

}
