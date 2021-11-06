package Assignment6_1;
import java.util.Map;

import java.util.Collections;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class Tree{

	public static void main(String[] args) {

    Data obj1 =new Data(789072289,"sun","sun@gmail.com","Male");
    Data obj2=new Data(880012566,"Moon","Moon@gmail.com","Male");
    Data obj3=new Data(567002289,"Flower","Flower@gmail.com","Female");
    
    Map<Long,Data>data=new TreeMap<Long,Data>(Collections.reverseOrder());
    data.put((long) 5678, obj1);
    data.put((long) 785678, obj2);
    data.put((long) 3455678, obj3);
    
    System.out.println("Keys: "+data.keySet() +"\n");
    System.out.println("Values: "+data.values() +"\n");
    System.out.println(data +"\n");
	}

}
