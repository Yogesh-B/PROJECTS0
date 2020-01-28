/*
Indexers....
*/
using System;
public class Data
{
	int[] vals;
	int length;
	
	public Data(int l)
	{
		length=l;
		vals=new int[length];
	}
	
	public int this[int index]
	{
		get{return vals[index];}
		set{ vals[index]=value;}
	}
}

public class Test
{
	public static void Main()
	{
		int n=5;
		Data d=new Data(n);
		int j=0;
		
		for(int i=0;i<n/2+1;i++)
		{
			d[i]=j;
			j+=2;
		}
		
		for(int i=0;i<n/2+1;i++)
		{
			Console.Write(d[i]);
		}
	}
}