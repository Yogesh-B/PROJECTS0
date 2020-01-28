/*
properties
*/
using System;

public class Test
{
	int bal;
	string type;
	public Test(int b, string t)
	{
		bal=b;
		type=t;
	}
	
	public int a_bal
	{
		get
		{
			return bal;
		}
		set
		{
			bal=value;
		}
	}
	
	public string a_type
	{
		get
		{
			return type;
		}
	}
}
public class Example
{
	public static void Main()
	{
		Test obj=new Test(1000,"Savings");
		
		Console.WriteLine("Accessing by Properties:\t"+obj.a_bal+"\t"+obj.a_type);
		
		//uncomment below line for default names of class,,,gives error
		// Console.WriteLine("Accessing by Default:\t"+obj.bal+"\t"+obj.type);
		
	}
}


