package apex.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CallValidationServlet")
public class CallValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CallValidationServlet() {
        super();      
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName =request.getParameter("fullName");
		String phoneNumber =request.getParameter("phoneNumber");
		String gender =request.getParameter("gender");
		
		// For Servlet chaining / SOD
		RequestDispatcher rd = request.getRequestDispatcher("/ValidationServlet");
		
		//1st prg with forwrd
		//rd.forward(request, response);
		
		//2st prg with forwrd
		rd.include(request, response);
		response.getWriter().print("<h1>My Detail</h1>");
		response.getWriter().print("<h2 style=\"color: blue; font-family: serif; font-style: italic\">" +fullName+"--"+phoneNumber+"--"+gender+"--"+"</h2>");
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
