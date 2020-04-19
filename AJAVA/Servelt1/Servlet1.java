//servlet 1 example

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 implements Servlet
{
	ServletConfig sc=null;
	public void init(ServletConfig sc)
	{
		this.sc=sc;
		System.out.println("Service Initialized!");
	}
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.print("<html><body>");
		out.print("<h1>Hello world, This is Servlet first</h1>");
		out.print("</body></html>");
	}
	public void destroy()
	{
		System.out.println("Servlet destroyed..!!");
	}
	public ServletConfig getServletConfig()
	{
		return sc;
	}
	public String getServletInfo()
	{
		return "Copyright@GECR_CE";
	}
}