package Assignment8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

	
class Orders
{  
	    
	    String status;  
	    float price;  
	    public Orders( String status, float price) 
	    {  
	      //  super();  
	       
	        this.status = status;  
	      this.price = price;  
	    }                                                               
}
	
public class Order 
{
		public static void main(String[] args) 
		{  
	        List<Orders> list=new ArrayList<Orders>();  
	        list.add(new Orders("Order Status:Accepted",100f));  
	        list.add(new Orders("Order Status:Completed",800f));  
	        list.add(new Orders("Order Status:Accepted",9000f));  
	        list.add(new Orders("Order Status:Completed",800f));  
	        list.add(new Orders("Order Status:Out For Delivery",60000f));  
	        list.add(new Orders("Order Status:Processing",900f));  
	        list.add(new Orders("Order Status:Processing",900f));  
	      
	        // using lambda to filter data  
	        Stream<Orders> filtered_data = list.stream().filter(p -> p.price > 10000 && p.status.startsWith("Order Status:Accepted") 
	        		|| p.status.startsWith("Order Status:Completed"));

	        filtered_data.forEach(Orders -> System.out.println("Order Price is "+Orders.price+ " & "+Orders.status));  
	    }  
} 