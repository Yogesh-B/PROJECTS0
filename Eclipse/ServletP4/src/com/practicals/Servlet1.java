package com.practicals;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet
{	
	private int visit;
	public void init()
	{
	    visit = 0;
    }
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		visit++;
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.print("<html>"
				+ "<body>"
				+ "<h1> Total Visits = </h1>"+visit
				+ "</body>"
				+ "</html>");
		
	}
}
