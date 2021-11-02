package Assignment5_1;

import java.util.HashSet;
import java.util.Set;

class Main
{
public static void main(String args[])
{
	
Employee e1=new Employee(120,"sun",20000,"CS\n");
Employee e2=new Employee(100,"moon",30000,"IS\n");
Employee e3=new Employee(150,"star",40000,"ECE\n");
Employee e4=new Employee(190,"Galaxy",6000,"IT\n");

Set<Employee> employees=new HashSet<>();
employees.add(e1);
employees.add(e2);
employees.add(e3);
employees.add(e4);
System.out.println(employees);
}
}

