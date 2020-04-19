package com.practicals;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.practicals.User;

public class CreateUser extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String user = req.getParameter("user");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String contact = req.getParameter("contact");

		User u1 = new User();

		if (u1.add(user, pwd, email, contact))
			res.sendRedirect("login.html");
		else
			pw.println("<h1 style='color:red'>Failed to Create Account</h1>");
	}
}
