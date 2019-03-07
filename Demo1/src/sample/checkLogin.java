package sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/checkLogin")
public class checkLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//System.out.println("start");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("uname");
		String password=request.getParameter("psswrd");
		out.println("Username : " +userName);
		out.println("Password : "+password);
	}

}
