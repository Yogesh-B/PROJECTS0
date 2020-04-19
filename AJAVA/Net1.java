/* 
Write a program to read name of a website from user and display its ip address 
 
*/ 
import java.net.*; 
import java.io.*; 
 
public class Net1 
{ 
	public static void main(String args[]) throws IOException 
	{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		String site=br.readLine(); 
		InetAddress ip=InetAddress.getByName(site);		 
		//unknown host exception 
		System.out.println("\n\nIP address is:"+ip); 
	} 
}