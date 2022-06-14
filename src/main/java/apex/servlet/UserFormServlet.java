package apex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UserFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserFormServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName =request.getParameter("fullName");
		String phoneNumber =request.getParameter("phoneNumber");
		String gender =request.getParameter("gender");
		String lang =request.getParameter("lang");
		
		response.getWriter().print("<h1> My detail form GET </h1>");
		response.getWriter().print("<h2> </h1>"+ fullName +" = " + phoneNumber+" = " + gender +" = " +lang);
	}
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName =request.getParameter("fullName");
		String phoneNumber =request.getParameter("phoneNumber");
		String gender =request.getParameter("gender");
		String lang =request.getParameter("lang");
		
		response.getWriter().print("<h1> My detail form GET </h1>");
		response.getWriter().print("<h2> </h1>"+ fullName +" = " + phoneNumber+" = " + gender +" = " +lang);
		
	}

}
