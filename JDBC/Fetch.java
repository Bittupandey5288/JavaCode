package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Fetch {

	public static void main(String[] args)throws Exception 
	{
		String query="Select*from employee";
		String E_salary="100000";//String for positional parameter
		String url="jdbc:mysql://localhost:3306/practice";
	   	String username="root";
	   	String password="demo";
	    Connection con=	DriverManager.getConnection(url, username,password);
        java.sql.Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        
        while(rs.next())
        {
        	String name=rs.getString("E_name");
        	String adress=rs.getString("E_adress");
        	String salary=rs.getString("E_salary");
        	
        	System.out.println(name+" "+adress+" "+salary);
        }	

	}

}
