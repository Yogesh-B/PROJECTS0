package com.practicals;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setIntHeader("Refresh",1);
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1>Time : " + System.currentTimeMillis()/1000 );
		pw.flush();
		
		
		
	
		
	}

}
