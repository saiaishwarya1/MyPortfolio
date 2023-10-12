package flyAway;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/book")
public class Servebook extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Full_name=request.getParameter("Full_name");
		String address=request.getParameter("address");
		String age=request.getParameter("age");
		String mobile_no=request.getParameter("mobile_no");
		String email_id=request.getParameter("email_id");
		String country=request.getParameter("country");
		Bookbean bookbean=new Bookbean(Full_name,address,age,mobile_no,email_id,country);
		Databook dbook=new Databook();
		String result=dbook.insert(bookbean);
		response.getWriter().print(result);
		
PrintWriter out =response.getWriter();
		
		out.println("<html><body>");
		out.println("<a href=http://localhost:8081/phase2Project/see.jsp>Confirm registeration</a>");
		out.println("</html></body>"); 
		
	}

}
