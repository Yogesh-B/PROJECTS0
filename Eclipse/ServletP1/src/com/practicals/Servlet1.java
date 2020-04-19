package com.practicals;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.Date;
import java.util.Calendar;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter pw = res.getWriter();
		Date d = new Date();
		
		pw.print("<h1> Date : "+  d.getDate() + " / " + d.getMonth() + " / " + (d.getYear()+1900) + "<br/> Time : "+ d.getHours()+" hrs "+ d.getMinutes() +" mins " + "</h1>" );
		
	}

}
