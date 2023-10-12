package flyAway;

import java.sql.*;

public class Databook {

	// JDBC URL, username and password of MySQL server
    private  String url = "jdbc:mysql://localhost:3306/my_db";
    private   String user = "root";
    private  String password = "root";
    private String driver="com.mysql.jdbc.Driver";
    
    public void loadDriver(String dbDriver)
    
    {
    	try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public Connection getConnection()
    {
    	
    	Connection con=null;
    	
    	try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return con;
          
    }
	
     public String insert(Bookbean bookbean)
     {
    	 loadDriver(driver);
    	 Connection con =getConnection();
    	 String result="Registered";
    	 String sql="insert into my_db.book values(?,?,?,?,?,?)";
    	 
    	 PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
		
		
    	 ps.setString(1,bookbean.getFull_name());
    	 ps.setString(2,bookbean.getAddress());
    	 ps.setString(3,bookbean.getAge());
    	 ps.setString(4,bookbean.getMobile_no());
    	 ps.setString(5, bookbean.getEmail_id());
    	 ps.setString(6,bookbean.getCountry());
		
    	 
		
     } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    
		  result="Registration done";
     }
		return result;
     }
}