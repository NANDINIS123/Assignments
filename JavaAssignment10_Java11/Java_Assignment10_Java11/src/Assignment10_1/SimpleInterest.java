package Assignment10_1;

public class SimpleInterest 
{
	public static void main(String[] args) 
	{
		var P=5000;
		var R=9;
		var T=3;
		CalculateSI obj = (var a,var b,var c) -> (a*b*c)/100;
		System.out.println(obj.sI(P, R, T));
	}

}

interface CalculateSI{
	double sI(double P,double R,double T);
}