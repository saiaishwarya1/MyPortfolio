package flyAway;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/srch")
public class search extends HttpServlet {

	// JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/my_db";
    private static final String user = "root";
    private static final String password = "root";
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			
			PreparedStatement ps=con.prepareStatement("select * from flight_details ");
			ResultSet rs=ps.executeQuery();
			PrintWriter out=response.getWriter();
			out.println("<html><body><table><tr><td>flight_no.</td><td>airline_name</td><td>date of travel</td><td>source city</td><td>Departure Time</td><td>Destination</td><td>Arrival Time</td><td>Seat Availability</td><td>Total Seats</td><td>Booked Seats</td><td>class</td></tr>");
		     
			while(rs.next())
			{
		    out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td></tr>");
			}
			
			out.println("<a href=http://localhost:8081/phase2Project/book.jsp>Bookflight</a>");
			out.println("</table></body></html>"); 
			  
			
		}
		
		catch(Exception e)
		{e.printStackTrace();}
		
	}

}
