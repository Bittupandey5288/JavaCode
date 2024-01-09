package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertOperation1
{
	// main method
    public static void main(String[] args) throws Exception 
    {
    	String query="insert into employee values('Raju','Ranchi','70000')";
    	String query2="insert into employee values('Rama','Rajasthan','8000')";
    	String url="jdbc:mysql://localhost:3306/practice";//Practice is database name
     	String username="root";
     	String password="demo";
       Connection con=	DriverManager.getConnection(url, username,password);
       PreparedStatement ps=con.prepareStatement(query);
       PreparedStatement ps1=con.prepareStatement(query2);
       int i= ps.executeUpdate();//
       int j=ps1.executeUpdate();
       if(i>0)
       {
    	   if(j>0)
    	   {
    		  System.out.println("inserted successfully two times");
    	   }
    	   
    	  //System.out.println("inserted successfully");
       }
       else {
    	   System.out.println("Data not inserted");
       }
	}
}
