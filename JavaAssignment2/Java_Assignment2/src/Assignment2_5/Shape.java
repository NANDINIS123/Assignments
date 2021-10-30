package Assignment2_5;

public class Shape {

	public static void main(String[] args)
	{
		Shapes line=new Line();
		Shapes rectangle=new Rectangle();
		Shapes cube=new Cube();
		
		line.draw();
		rectangle.draw();
		cube.draw();
	}
}
abstract class Shapes
{
	abstract void draw();
}
class Line extends Shapes
{
    void draw()
    {
    	System.out.println("Drawing Line");
    }
}
class Rectangle extends Shapes
{
	void draw()
    {
    	System.out.println("Drawing Rectangle");
    }
}
class Cube extends Shapes
{
	void draw()
    {
    	System.out.println("Drawing Cube");
    }	
}