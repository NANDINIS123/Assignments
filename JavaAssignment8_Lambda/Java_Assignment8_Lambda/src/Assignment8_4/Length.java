package Assignment8_4;

import java.util.ArrayList;

public class Length
{

    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Nandini");
        students.add("Roopa");
        students.add("poo");
        students.add("Sun");
        students.add("Moon");
        students.removeIf(n ->( n.length())%2!=0);
        System.out.println("Students name with odd length ");
        for (String str : students) 
        {
            System.out.println(str);
        }
        
        ArrayList<Integer> students1 = new ArrayList<Integer>();

        students1.add(20);
        students1.add(30);
        students1.add(67);
        students1.add(43);
        students1.add(87);
        students1.removeIf(n -> (n %2!=0));
        
        System.out.println("Students name with odd lengths is removed");
        for (int i: students1) 
        {
            System.out.println(i);
        }
    }
}
