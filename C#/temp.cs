using System;

//base class
class b
{
	int bx;
	public b()
	{
		Console.WriteLine("Default base");
	}
	public b(int val)
	{
		bx=val;
		Console.WriteLine("Base with value");
	}
	public void display()
	{
		Console.WriteLine("bx= "+bx );
	}	
}

//derived class 
class d:b
{
	int dx;
	public d()
	{
		Console.WriteLine("Default derived");
	}
	public d(int val)
	{
		dx=val;
		Console.WriteLine("Derived with value");
	}
	public new void display()
	{
		Console.WriteLine("dx= "+dx );
	}	
}

class demo
{
	public static void Main()
	{
		b b1=new b(2);
		b1.display();
		
		d d1=new d(3);
		d1.display();
		
		b b2=new d(5);
		b2.display();
		
		d d2=new d();
		d2.display();
	}
}

