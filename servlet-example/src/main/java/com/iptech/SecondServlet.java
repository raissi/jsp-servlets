package com.iptech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	private static final long serialVersionUID = 4104134435904244625L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<title>Title written using write</title>");
		out.println("<body bgcolor=FFFFFF>");
		out.print("<h2>Header written using print</h2>");
		out.println("<br/><strong>Param 1 is: </strong>"+request.getParameter("param1"));
		out.println("<br/><span style=\"color:red\">Param 2 is: </span>"+request.getParameter("param2"));
		out.println("<br/><span style=\"color:blue\">Param 3 is: </span>"+request.getParameter("param3"));
		out.println("<br/><strong>Session id is: </strong>"+request.getSession().getId());
		out.println("<br/><strong>Query string is: </strong>"+request.getQueryString());
		
		out.println("</body>");
		out.println("</html>");
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
