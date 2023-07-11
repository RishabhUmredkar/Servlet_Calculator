	

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegServ extends HttpServlet {
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		

		
		
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");	
		
		
		
		
		if(pass.equals("abc123") && name.equals("rishabh")){
			RequestDispatcher dispatcher = request.getRequestDispatcher("calc");
			dispatcher.forward(request, response);

		}
		else{
			out.print("<center>");
			out.print("Enter correct PassWord<br>");
			out.print("You are neither Admin nor User");
			out.print("</center>");

			out.print("<br>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
			dispatcher.include(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}



