package apex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;



public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String SESSION_COOKIE = "sessionID";
	private static final String USERNAME_COOKIE ="userNameCookie" ; 
    
    public CookieServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("Cookie Servlet is invoked...");
		Cookie[] cookies = request.getCookies();
		
		boolean cookieFound =false;
		
		if(null != cookies) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals(USERNAME_COOKIE)) {
				     cookieFound = true;
				     response.getWriter().append("<html><body><h3> User :: "+
				     request.getParameter("userName")+" is alredy logged in with the cookie value :: " +
				    	cookie.getValue()+ "</h3></body></html>" );
				     break;
			}	
		}
	
	  }
         if(cookieFound == false) {
        	 
        	 Cookie userNameCookie = new Cookie(USERNAME_COOKIE, request.getParameter("userName"));
        	 response.addCookie(userNameCookie);
        	 response.getWriter().append("Added the username Cookie....");
        	Cookie sessionCookie = new Cookie(SESSION_COOKIE, LocalDateTime.now().toString());
        	response.addCookie(sessionCookie);
        	 response.getWriter().append("Added the session id and username Cookie....");
        	 
         }
	}
	private void validateTheUser(HttpServletRequest request) {
		
	}
        	 
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
