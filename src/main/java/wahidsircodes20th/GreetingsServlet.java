package wahidsircodes20th;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//last time in "HiServlet" we did "extends"-"GenericServlet" 
//now we will do extends - HttpServlet
public class GreetingsServlet extends HttpServlet 
{
// within hhtpservlet , no need of
// writing any method , or any servlet lifecycle 
// related method BUT 
// WE NEED TO WRITE A REQUEST PROCESSING METHOD
// IN A DIFFERENT WAY AS BELOW (doGet||doPost)
	protected void doGet(HttpServletRequest request , HttpServletResponse response ) throws IOException
//HTTP has protected do get method 
// mapped - request will help us to handle incoming data [I/P]
// mapped - response will help us handle outgoing data [O/P]
	{
		//this method is to request processing
		//set response content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>GREETINGS welcome to HTTP servlet program! </h1>");
		out.print("</html></body>");
		System.out.println("Servlet request processing completed for greetings...");
	}
}
