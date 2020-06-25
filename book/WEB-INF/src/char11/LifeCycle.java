package char11;

import java.io.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import tool.Page;

@WebServlet(urlPatterns={"/char11/life"})
public class LifeCycle extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	public void service (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		System.out.println("service");
		super.service(request, response);
	}
	
	public void doGet (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		System.out.println("doGet");
	}

	public void doPost (HttpServletRequest request, 
	HttpServletResponse response) throws ServletException, 
	IOException {
		System.out.println("doPost");
	}

	public void destroy() {
		System.out.println("destroy");
	}

}
