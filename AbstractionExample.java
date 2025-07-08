//Example of Abstraction 
package abstraction;
//Example of Abstraction
public abstract class Calculator 
{
	public abstract void addition(int a,int b);
	public abstract void substraction(int n1,int n2);
	public void division(int num,int den)
	{
		int res =num/den;
		System.out.println(res);
	}
	public abstract void multiplication(int a1,int a2);
}
//-------------------------------------------------------------------
//class CalculatorImplimentation
package abstraction;
//Example of Abstraction
public class CalculatorImp extends Calculator 
{
	public void addition (int a,int b)
	{
		int res =a+b;
		System.out.println(res);
	}
	public void substraction(int n1,int n2)
	{
		int res=n2-n1;
		System.out.println(res);
	}
	public void multiplication(int a1,int a2) 
	{
		int res = a1*a2;
		System.out.println(res);
	}

}
//----------------------------------------------------------------------
//class CalculatorDriver
package abstraction;
//Example of Abstraction
public class CalculatorDriver {

	public static void main(String[] args)
	{
		Calculator c1= new CalculatorImp();
		c1.addition(10, 20);
		c1.substraction(23,56);
		c1.division(50, 5);
		c1.multiplication(12, 3);

	}

}
//-------------------------------------------------------------------------
