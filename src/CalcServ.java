

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class CalcServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");

		out.print("<head>");
		  out.print("<link rel='stylesheet' href='css/style1.css'>");
		  out.print("<link href='https://fonts.googleapis.com/css?family=Ubuntu' rel='stylesheet'>");
		  out.print("<meta name='viewport' content='width=device-width, initial-scale=1' />");
		  out.print("<link rel='stylesheet' href='style1.css'>");
		  out.print("<title> Sign in </title>");
		out.print("</head>");

		out.print("<body>");
		  out.print("<div class='main'>");
		      out.print("<form action='reg'>");
				out.print("<div id='digit1'>");
					out.print("<input type='checkbox' id='d1-1' class='number1'>");
					out.print("<input type='checkbox' id='d1-2' class='number2'>");
					out.print("<input type='checkbox' id='d1-3' class='number3'>");
					out.print("<input type='checkbox' id='d1-4' class='number4'>");
					out.print("<input type='checkbox' id='d1-5' class='number5'>");
					out.print("<input type='checkbox' id='d1-6' class='number6'>");
					out.print("<input type='checkbox' id='d1-7' class='number7'>");
					out.print("<input type='checkbox' id='d1-8' class='number8'>");
					out.print("<input type='checkbox' id='d1-9' class='number9'>");
					out.print("<div id='digit2'>");
						out.print("<input type='checkbox' id='d2-0' class='number0'>");
						out.print("<input type='checkbox' id='d2-1' class='number1'>");
						out.print("<input type='checkbox' id='d2-2' class='number2'>");
						out.print("<input type='checkbox' id='d2-3' class='number3'>");
						out.print("<input type='checkbox' id='d2-4' class='number4'>");
						out.print("<input type='checkbox' id='d2-5' class='number5'>");
						out.print("<input type='checkbox' id='d2-6' class='number6'>");
						out.print("<input type='checkbox' id='d2-7' class='number7'>");
						out.print("<input type='checkbox' id='d2-8' class='number8'>");
						out.print("<input type='checkbox' id='d2-9' class='number9'>");
						out.print("<div id='digit3'>");
							out.print("<input type='checkbox' id='d3-0' class='number0'>");
							out.print("<input type='checkbox' id='d3-1' class='number1'>");
							out.print("<input type='checkbox' id='d3-2' class='number2'>");
							out.print("<input type='checkbox' id='d3-3' class='number3'>");
							out.print("<input type='checkbox' id='d3-4' class='number4'>");
							out.print("<input type='checkbox' id='d3-5' class='number5'>");
							out.print("<input type='checkbox' id='d3-6' class='number6'>");
							out.print("<input type='checkbox' id='d3-7' class='number7'>");
							out.print("<input type='checkbox' id='d3-8' class='number8'>");
							out.print("<input type='checkbox' id='d3-9' class='number9'>");
							out.print("<div id='digit4'>");
								out.print("<input type='checkbox' id='d4-0' class='number0'>");
								out.print("<input type='checkbox' id='d4-1' class='number1'>");
								out.print("<input type='checkbox' id='d4-2' class='number2'>");
								out.print("<input type='checkbox' id='d4-3' class='number3'>");
								out.print("<input type='checkbox' id='d4-4' class='number4'>");
								out.print("<input type='checkbox' id='d4-5' class='number5'>");
								out.print("<input type='checkbox' id='d4-6' class='number6'>");
								out.print("<input type='checkbox' id='d4-7' class='number7'>");
								out.print("<input type='checkbox' id='d4-8' class='number8'>");
								out.print("<input type='checkbox' id='d4-9' class='number9'>");
								out.print("<div id='digit5'>");
									out.print("<input type='checkbox' id='d5-0' class='number0'>");
									out.print("<input type='checkbox' id='d5-1' class='number1'>");
									out.print("<input type='checkbox' id='d5-2' class='number2'>");
									out.print("<input type='checkbox' id='d5-3' class='number3'>");
									out.print("<input type='checkbox' id='d5-4' class='number4'>");
									out.print("<input type='checkbox' id='d5-5' class='number5'>");
									out.print("<input type='checkbox' id='d5-6' class='number6'>");
									out.print("<input type='checkbox' id='d5-7' class='number7'>");
									out.print("<input type='checkbox' id='d5-8' class='number8'>");
									out.print("<input type='checkbox' id='d5-9' class='number9'>");
									out.print("<div id='digit6'>");
										out.print("<input type='checkbox' id='d6-0' class='number0'>");
										out.print("<input type='checkbox' id='d6-1' class='number1'>");
										out.print("<input type='checkbox' id='d6-2' class='number2'>");
										out.print("<input type='checkbox' id='d6-3' class='number3'>");
										out.print("<input type='checkbox' id='d6-4' class='number4'>");
										out.print("<input type='checkbox' id='d6-5' class='number5'>");
										out.print("<input type='checkbox' id='d6-6' class='number6'>");
										out.print("<input type='checkbox' id='d6-7' class='number7'>");
										out.print("<input type='checkbox' id='d6-8' class='number8'>");
										out.print("<input type='checkbox' id='d6-9' class='number9'>");
										out.print("<div id='digit7'>");
											out.print("<input type='checkbox' id='d7-0' class='number0'>");
											out.print("<input type='checkbox' id='d7-1' class='number1'>");
											out.print("<input type='checkbox' id='d7-2' class='number2'>");
											out.print("<input type='checkbox' id='d7-3' class='number3'>");
											out.print("<input type='checkbox' id='d7-4' class='number4'>");
											out.print("<input type='checkbox' id='d7-5' class='number5'>");
											out.print("<input type='checkbox' id='d7-6' class='number6'>");
											out.print("<input type='checkbox' id='d7-7' class='number7'>");
											out.print("<input type='checkbox' id='d7-8' class='number8'>");
											out.print("<input type='checkbox' id='d7-9' class='number9'>");
											out.print("<div id='digit8'>");
												out.print("<input type='checkbox' id='d8-0' class='number0'>");
												out.print("<input type='checkbox' id='d8-1' class='number1'>");
												out.print("<input type='checkbox' id='d8-2' class='number2'>");
												out.print("<input type='checkbox' id='d8-3' class='number3'>");
												out.print("<input type='checkbox' id='d8-4' class='number4'>");
												out.print("<input type='checkbox' id='d8-5' class='number5'>");
												out.print("<input type='checkbox' id='d8-6' class='number6'>");
												out.print("<input type='checkbox' id='d8-7' class='number7'>");
												out.print("<input type='checkbox' id='d8-8' class='number8'>");
												out.print("<input type='checkbox' id='d8-9' class='number9'>");
												out.print("<div id='operations'>");
													out.print("<input type='checkbox' id='add'>");
													out.print("<input type='checkbox' id='subtract'>");
													out.print("<input type='checkbox' id='multiply'>");
													out.print("<input type='checkbox' id='divide'>");
													out.print("<input type='checkbox' id='equals'>");
													out.print("<main>");
														out.print("<div id='screen'>");
															out.print("<div id='input'>");out.print("</div>");
															out.print("<div id='output'>");out.print("</div>");
														out.print("</div>");
														out.print("<div id='buttons'>");
															out.print("<button type='button'>");
																out.print("<label for='d8-7' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-7' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-7' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-7' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-7' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-7' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-7' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-7' class='digit1'>");out.print("</label>");
																out.print("7");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-8' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-8' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-8' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-8' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-8' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-8' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-8' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-8' class='digit1'>");out.print("</label>");
																out.print("8");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-9' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-9' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-9' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-9' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-9' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-9' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-9' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-9' class='digit1'>");out.print("</label>");
																out.print("9");
															out.print("</button>");
															out.print("<button type='button'><label for='divide'> </label> &divide;</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-4' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-4' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-4' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-4' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-4' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-4' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-4' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-4' class='digit1'>");out.print("</label>");
																out.print("4");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-5' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-5' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-5' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-5' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-5' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-5' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-5' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-5' class='digit1'>");out.print("</label>");
																out.print("5");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-6' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-6' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-6' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-6' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-6' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-6' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-6' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-6' class='digit1'>");out.print("</label>");
																out.print("6");
															out.print("</button>");
															out.print("<button type='button'><label for='multiply'> </label>&times;</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-1' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-1' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-1' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-1' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-1' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-1' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-1' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-1' class='digit1'>");out.print("</label>");
																out.print("1");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-2' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-2' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-2' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-2' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-2' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-2' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-2' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-2' class='digit1'>");out.print("</label>");
																out.print("2");
															out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-3' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-3' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-3' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-3' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-3' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-3' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-3' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-3' class='digit1'>");out.print("</label>");
																out.print("3");
															out.print("</button>");
															out.print("<button type='button'><label for='subtract'></label>-</button>");
															out.print("<button type='button'>");out.print("<input type='reset' value='AC'>");out.print("</button>");
															out.print("<button type='button'>");
																out.print("<label for='d8-0' class='digit8'>");out.print("</label>");
																out.print("<label for='d7-0' class='digit7'>");out.print("</label>");
																out.print("<label for='d6-0' class='digit6'>");out.print("</label>");
																out.print("<label for='d5-0' class='digit5'>");out.print("</label>");
																out.print("<label for='d4-0' class='digit4'>");out.print("</label>");
																out.print("<label for='d3-0' class='digit3'>");out.print("</label>");
																out.print("<label for='d2-0' class='digit2'>");out.print("</label>");
																out.print("<label for='d1-0' class='digit1'>");out.print("</label>");
																out.print("0");
															out.print("</button>");
															out.print("<button type='button' name ='euals'> <label for='equals'></label>'=</button>");
															out.print("<button type='button'><label for='add'> </label>+</button>");
														out.print("</div>");
													out.print("</main>");
												out.print("</div>");
											out.print("</div>");
										out.print("</div>");
									out.print("</div>");
								out.print("</div>");
							out.print("</div>");
						out.print("</div>");
					out.print("</div>");
				out.print("</div>");
			out.print("</form>");
			out.print("<button id='why'>");
				out.print("<svg viewBox='0 0 24 24'>");
					out.print("<path d='M11 18h2v-2h-2v2zm1-16C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8s3.59-8 8-8 8 3.59 8 8-3.59 8-8 8zm0-14c-2.21 0-4 1.79-4 4h2c0-1.1.9-2 2-2s2 .9 2 2c0 2-3 1.75-3 5h2c0-2.25 3-2.5 3-5 0-2.21-1.79-4-4-4z' style='fill:currentColor;'/>");
				out.print("</svg>");
			out.print("</button>");
			out.print("<a button type='submit' name='submit' class='un' align='center' href ='index.html'> LogIn </button>");

		                
		    out.print("</div>");
		     
		out.print("</body>");

		out.print("</html>");

		
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
