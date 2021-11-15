package Springcore_Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Springcore_Assignment1.Customer;

public class Customer {


	public void test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("A1beans.xml");
		Customer cust = (Customer)context.getBean("customerConstructor");
		
		 
		Customer obj2 = new Customer();
		
		
		if (((Customer) cust).getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			System.out.println("Not yet implemented");
		}
	}

	private Object getCustomerName() {
		// TODO Auto-generated method stub
		return null;
	}
}
