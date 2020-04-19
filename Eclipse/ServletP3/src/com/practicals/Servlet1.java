package com.practicals;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();

		String str[] = req.getHeader("referer").split(".*ServletP3/");
		String str1 = str[1];
		String str2[] = str1.split(".html");
		String str3 = str2[0];
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>Showing picture of  :" + str3 + "</h1>");
		pw.print("<img src=\"" + req.getContextPath() + "/Images/" + str3 + ".jpg\" alt=\" Image here\" />");
		pw.print("</body>");
		pw.print("</html>");

		pw.flush();

	}
}
