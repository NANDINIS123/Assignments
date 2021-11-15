package Springcore_Assignment1;

import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Springcore_Assignment1.Customer;
import org.junit.Test;

public class CustomerTest {
	
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("A1beans.xml");
		Customer cust = (Customer)context.getBean("customerConstructor");
		
		 
		Customer obj2 = new Customer(1, "Nandini", 997788676l ,new Address("Abc", "Bangalore", "Karnataka", "560002", "India"));
		
		
		if (cust.getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
	}

}