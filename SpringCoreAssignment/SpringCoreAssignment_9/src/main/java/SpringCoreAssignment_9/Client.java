package SpringCoreAssignment_9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Client {

	public static void main(String[] args)
		throws Exception
	{

		AbstractApplicationContext cap= new ClassPathXmlApplicationContext(	"SpringCoreAssignment_9/config.xml");

		//Below hook method calls the drestroy method in xml 
		// below hook method is from  abstract appliaction Context
		cap.registerShutdownHook();
	}
}