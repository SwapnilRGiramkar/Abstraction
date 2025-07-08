//shape class
package abstraction;

public abstract class Shape 
{
	public abstract double CalculateArea();
	
	public void displayMessage()
	{
		System.out.print("This is shape of ");
	}
}
//----------------------------------------------------------
//Circle class
package abstraction;

public class Circle extends Shape
{
	private double radius;
	public Circle()
	{
		
	}
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double CalculateArea()
	{
		double res= Math.PI * radius*radius;
		return res;
	}
}
//-----------------------------------------------------------
//Rectangle class
package abstraction;

public class Rectangle extends Shape 
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		
	}
	public Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double CalculateArea()
	{
		double res=length*width;
		return res;
	}

}
//---------------------------------------------------------------
//Shape Driver 
package abstraction;

public class ShapeDriver {

	public static void main(String[] args) 
	{
		Shape s=new Circle(5.8);
		//s.CalculateArea();
		s.displayMessage();
		System.out.println("Area of Circle : " + s.CalculateArea());
		
		Shape s1=new Rectangle(3.4,5.6);
		
		s1.displayMessage();
		System.out.print("Rectangle : "+s1.CalculateArea());
		
	}

}
//-----------------------------------------------------------------------
