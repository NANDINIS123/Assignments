package Assignment5_1;


import java.util.Set;

public class Employee 
{
       String name;
       String dept;
       int age;
       int id;
       int salary;
       
       public Employee(int id,String name,int salary,String dept)
       {
    	   this.id=id;
    	   this.name=name;
    	   this.salary=salary;
    	   this.dept=dept;
       }
       public String toString()
       {
    	   return("id="+ id + " " + "Name='" +name+'\''+", salary="+salary+ ", dept="+dept);
      
       }
       
}    

