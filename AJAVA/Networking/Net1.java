//java program for testing InetAddress class
import java.net.*;
import java.io.*;

public class Net1
{
	public static void main(String args[]) throws Exception
	
	{
		while(true)
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\n\nWebsite name=");
			String str=br.readLine();
			
			if(str=="exit")
				break;
	
			else
			{
				
				try{
					InetAddress ia=InetAddress.getByName(str);
		
					System.out.println("\nDetails from InetAddress class");
					System.out.println("Name="+ia.getHostName());
					System.out.println("Address="+ia.getHostAddress());
					System.out.println("Canonical Host Name="+ia.getCanonicalHostName());
					System.out.println("IP address as string="+ia.toString());
				}
				catch(Exception e){
					System.out.println("Host not found");
				}
		
			}
		}
		
		System.out.println("\nDetails from URL class");
	}
}