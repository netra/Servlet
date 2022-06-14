package apex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserFormServletWithValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserFormServletWithValidation() {
        super();
        
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName =request.getParameter("fullName");
		String phoneNumber =request.getParameter("phoneNumber");
		String gender =request.getParameter("gender");
		
		if (fullName.isEmpty()|| phoneNumber.length()<10) {
			response.getWriter().append("<h1>Data you entered is not correct...<br><br></h1>");	
		} else {
			response.getWriter().append("<h1> Data is fine.....<br><br></h1>");
			response.getWriter().append("Welcome "+ fullName);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
