package wahidsircodes20th;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//last time in "helloservlet" we did "impliments"
// now we will do extends - GenericServlet
public class HiServlet extends GenericServlet
{
// generic servlet is an abstract class
// it has only 1 method to be over ridden 
// in case when we to "impliment" in place 
// of "extend" we need to override all init , service .. etc 
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		//this method is to request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hi welcome to GENERIC servlet program! </h1>");
		out.print("</html></body>");
		System.out.println("Servlet request processing completed...");
		
	}

}
