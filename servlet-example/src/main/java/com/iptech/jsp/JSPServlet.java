package com.iptech.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp-number-servlet")
public class JSPServlet extends HttpServlet{
	private static final long serialVersionUID = -5697971524535207184L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		try{
			Double num = Double.parseDouble(request.getParameter("range"));
			NumberBean bean = new NumberBean(num);
			request.setAttribute("number-bean", bean);
			System.out.println("Attribute set in request, value: "+bean.getNumber());
			RequestDispatcher dispatcher =
					request.getRequestDispatcher("/display-bean.jsp");
					dispatcher.forward(request, response);

		}catch(NumberFormatException nfe){
			throw new ServletException("Unable to parse range: \""+request.getParameter("range")+"\" as a number");
		}

	}

}
