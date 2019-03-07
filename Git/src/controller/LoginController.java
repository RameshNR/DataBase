package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String un=request.getParameter("username");
		String pw=request.getParameter("password");
		
		if(un.equals("ram") && pw.equals("ram"))
		{
			response.sendRedirect("Success.jsp");
			return;
		}
		else
		{
			response.sendRedirect("failiure.jsp");
			return;
		}
		
	}

}
