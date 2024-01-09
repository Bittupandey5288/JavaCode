package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_udate_delete
{
   public static void main(String[] args) throws SQLException, ClassNotFoundException
   {
	   String E_name="Ram";
	   String E_salary="40000";
	   Class.forName("com.mysql.cj.jdbc.Driver");	
   	
    	// 2 create connection
    	String url="jdbc:mysql://localhost:3306/practice";
    	String username="root";
    	String password="demo";
      Connection con=	DriverManager.getConnection(url, username,password);
      PreparedStatement ps=con.prepareStatement("update employee set E_name=? where E_salary=?");
     
      ps.setString(1, E_name);
      ps.setString(2,E_salary);
      int i=ps.executeUpdate();
      if(i>0)
      {
    	  System.out.println("sucess");
    	  System.out.println(i);
    	  
      }
      else {
    	  System.out.println("fail");
      }
   }
}
