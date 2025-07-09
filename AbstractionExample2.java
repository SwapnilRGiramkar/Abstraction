//Abstraction Example Bio details
//abstract class
package abstraction;

public abstract class Bio 
{
	public abstract void personalDetails(String name,String fName,String surName);
	
	public abstract void address(String building,String street,String area,int pin);
	
	public abstract void education(String perc10,String perc12,String graduation);
	
	public void university() 
	{
		String name="SPPU";
		System.out.println("University Name "+name);
		String address="Pune";
		System.out.println("University address "+address);
		int pin=411009;
		System.out.println("University Pincode "+pin);
	}
	public abstract void uCode(int uniCode);
}
//------------------------------------------------------------------------
//Implemented class
package abstraction;

public class BioImp extends Bio
{
	public void personalDetails(String name,String fName,String surName)
	{
		System.out.println(name+" "+fName+" "+surName+" ");
	}
	public void address(String building,String street,String area,int pin)
	{
		
		System.out.println(building+" "+street+" "+area+" "+pin);
	}
	public void education(String perc10,String perc12,String graduation)
	{
		
		System.out.println(" 10 : "+perc10+" 12 : "+perc12+" graduation: "+graduation);
	}
	public void uCode(int uniCode)
	{
		
		System.out.println(uniCode);
	}
}
//----------------------------------------------------------------------------------
//Driver class 
package abstraction;

public class BioDriver 
{
	public static void main(String[] args) 
	{
		Bio b=new BioImp();
		b.personalDetails("Swapnil","Rajendra", "Giramkar");
		b.address("Sai", "Laxminagar", "Sahakarnagar", 411009);
		b.education("76.60%", "58.15%", "90.00%");
		b.university();
		b.uCode(4111);
		
	}
}

