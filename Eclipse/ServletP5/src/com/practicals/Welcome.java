package com.practicals;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcome extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		 String enroll = req.getParameter("enroll");
		 int subject1 = Integer.parseInt(req.getParameter("subject1"));
		 int subject2 = Integer.parseInt(req.getParameter("subject2"));
		 int subject3 = Integer.parseInt(req.getParameter("subject3"));
		 User u1 = new User();
		
		 if(u1.addExam(enroll,subject1,subject2,subject3)){
		      double percentage = (subject1+subject2+subject3)/3.0;
		      String message = "<h1 style='color:green'>Data Saved to Database</h1>";
		      message += ("<h2>Percentage is : "+percentage+"</h2>");
		      pw.println(message);
		   }else
		    pw.println("<h1 style='color:red'>Data is not Inserted</h1>");
	}
}
