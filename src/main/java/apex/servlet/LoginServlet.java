package apex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static int counter = 0;
    
    
    public LoginServlet() {
        super();
         
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
		counter++;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw =response.getWriter();
		response.setContentType("text/html");
		
		String name = request.getParameter("fullName");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		if(gender.equalsIgnoreCase("female"))
           pw.println("<h1>Hi"+name+"Welcome Home W</h1>");
        else
           pw.println("<h1>Hi"+name+"Welcome Home M </h1>");
		pw.println("<lable>Counting number of visits " +counter+"</lable>");
		System.out.println("your password : " +password+"is saved");
		pw.close();

}}
