/*This is a testing file*/
using System;

public class temp
{
	public static void Main()
	{
		Console.WriteLine("Enter Decimal No.:::");
		double n=double.Parse(Console.ReadLine());
		int mul=1,r=2,temp=0;
		double sum=0;
			//integer part
		while(n!=0)
		{
			temp=(int)n%2;
			n=n/r;
			sum+=temp;
			mul*=10;
		}
			//decimal part
		while(false)
		{
			
		}
		Console.Write(sum);
	}
}





// Console.WriteLine("Enter binary no.:::");
		// double n=double.Parse(Console.ReadLine());
		// int c1=-1,c2=0,r=2;double sum=0;
		// double y=n%1;
			
			// //integer part
		// while(n!=0)
		// {
			
			// c1++;
			// int x=(int)n%10; 	//last digit
			// n/=10;			//number changed
			// sum+=(x*Math.Pow(r,c1));
		
		// }
			// //decimal part
		// while(y!=0)
		// {
			// c2++;	//index
			// y*=10;
			// int x=(int)y/1;	//division
			// y%=1;		//update y
			// sum+=x*(int)Math.Pow(r,-c2);			
		// }
		// Console.Write(sum);