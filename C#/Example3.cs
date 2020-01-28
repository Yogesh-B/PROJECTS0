/*
Reflection.........
*/
using System;
using Syestem.Reflection;

public class Demo
{
	int x,y;
	
	public Demo(int a)
	{
		x=a;
	}
	
	public int calculate(int b)
	{
		return x+b;
	}
	
	public void show()
	{
		Console.WriteLine("Reflecting Class...");
	}
}

public class Test
{
	public static void Main()
	{
		Type t=new Type(Demo);
		
		ConstructorInfo[] c=t.GetConstructors();
		MethodInfo[] m=t.GetMethods();
		
		Console.WriteLine("Information of Constructors...");
		
		for(int i=0; i<c.Length;i++)
		{
			Console.WriteLine(c[i].ToString());
		}
		
		foreach(MethodInfo mi in m)
		{
			Console.WriteLine(mi.ReturnType.Name+"  "+mi.Name);
		}
		
		ParameterInfo[] p=mi.GetParameters();
		
		foreach(ParameterInfo pi in p)
		{
			Console.WriteLine(p.ParameterInfo());
		}
	}
}