package com.practicals;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.practicals.User;

public class Login extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String user = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		
		User u1 = new User();
		
		if(u1.auth(user,pwd)){
		      HttpSession session = req.getSession();
		      session.setAttribute("username",user);
		      res.sendRedirect("welcomePage.html");
		    }
		    else
		    pw.println("<h1 style='color:red'>Failed to Login</h1>");
	}
}
