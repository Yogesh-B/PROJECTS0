//tcp server
import java.io.*;
import java.net.*;

public class Net2s
{
		public static void main(String[] args) throws Exception
	{
		//set parameters
		String ip="localhost";
		int port=9999;
		
		//create socket and get data 
		ServerSocket ss=new ServerSocket(port);
		Socket s=ss.accept();
		System.out.println("Client connected...!!!");
		
		// InputStreamReader isr=new InputStreamReader(s.getInputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str=br.readLine();
		System.out.println("Client: "+str);
		
		
	}
}