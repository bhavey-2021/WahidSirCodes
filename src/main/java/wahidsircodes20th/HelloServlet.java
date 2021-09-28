package wahidsircodes20th;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloServlet implements Servlet
{
	ServletConfig config = null;
// we will use this servlet to setup a config inside out config method 
	
	@Override
	public void init(ServletConfig config) throws ServletException 
	{
		// TODO Auto-generated method stub
		// init is used for loading the system resources 
		// init is use to initialise all possible resources 
		this.config = config;
		System.out.println("Servlet is isnitialised...");	
	}
	//hello
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		//this method is to request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>hello welcome to servlet program! </h1>");
		out.print("</html></body>");
		System.out.println("Servlet request processing completed...");	
	}
	@Override
	public void destroy() 
	{
		System.out.println("--! Servlet is destroyed !--");
	}
	@Override
	public ServletConfig getServletConfig() 
	{
		// TODO Auto-generated method stub
		return config;
	}
	@Override
	public String getServletInfo() 
	{
		// TODO Auto-generated method stub
		return "This is a servlet interface implimented class";
	}
}
