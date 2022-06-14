package apex.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SendRedirectServlet")
public class SendRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String websiteName = request.getParameter("websiteName");
        
        if(null==websiteName) {
        	websiteName = "http://www.google.com";
        }else {
        	websiteName =new StringBuffer("http://www.").append(websiteName).append(".com").toString();
        }
		response.sendRedirect(websiteName);
	}

}
