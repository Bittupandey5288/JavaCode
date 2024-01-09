package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_demo 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException 
    {
    	// 1 Load the driver
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");	
    	
     	// 2 create connection
     	String url="jdbc:mysql://localhost:3306/practice";//Practice is database name
     	String username="root";
     	String password="demo";
       Connection con=	DriverManager.getConnection(url, username,password);
       PreparedStatement ps=con.prepareStatement("insert into employee values('Ravi','Delhi','50000')");
       int i=ps.executeUpdate();
       
       if(i>0)
       {
    	  System.out.println("Sucess");
    	  
       }
       else {
    	   System.out.println("fail");
       }
      
	}
    
}
