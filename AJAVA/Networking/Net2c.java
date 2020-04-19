//tcp client
import java.io.*;
import java.net.*;

public class Net2c
{
	public static void main(String[] args) throws Exception
	{
		//set parameters
		String ip="localhost";
		int port=9999;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		// create socket and get data tobe sent
		Socket s=new Socket(ip,port);
		OutputStreamWriter osw=new OutputStreamWriter(s.getOutputStream());
		PrintWriter pw=new PrintWriter(osw);
		
		System.out.print("Enter message:");
		String message=br.readLine();
		
		
		
		System.out.print("message  :              "+message);
		
		osw.write(message);
		osw.flush();
	}
}