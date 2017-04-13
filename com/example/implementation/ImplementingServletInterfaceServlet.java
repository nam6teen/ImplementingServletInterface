package com.example.implementation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ImplementingServletInterfaceServlet extends HttpServlet {

	ServletConfig config = null;

	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Servlet is initialised..");
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();
		out.println("Hello! This is a basic servlet.");
	}

	public void destroy() {
		System.out.println("Servlet is destroyed..");
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return "copyright 2007-1010";
	}

}
