package Assignment1_3;

import java.util.Scanner;
class SiCi
{
  public static void main(String args[])
  {
    double pr,rate,time,sim,com;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the amount:");
    pr=sc.nextDouble();
    System.out.print("Enter the No. of years:");
    time=sc.nextDouble();
    System.out.println("Enter Rate of interest:");
    rate=sc.nextDouble();
    sim=(pr*time*rate)/100;
    com=pr*Math.pow(1.0+rate/100.0,time)-pr;
    System.out.println("Simple Interest="+sim);
    System.out.println("compound Interst="+com);
  }   
}