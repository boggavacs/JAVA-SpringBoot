package ro.products;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SquarrootServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String receivedReq = (String) req.getAttribute("k");
		res.getWriter().println(receivedReq);
	}

}
