package com.iptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletSample extends HttpServlet{
	private static final long serialVersionUID = 6538173776240513272L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello Servlet Get</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<title>Example</title>" + "<body bgcolor=FFFFFF>");

		out.println("<h2>Button Clicked</h2>");

		String DATA = request.getParameter("DATA");

		if (DATA != null) {
			out.println(DATA);
		} else {
			out.println("No text entered.");
		}

		out.println("<P>Return to <A HREF=\"../simpleHTML.html\">Form</A>");
		out.close();
	}
}
