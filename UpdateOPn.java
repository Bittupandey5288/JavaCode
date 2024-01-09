package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOPn 
{
	public static void main(String[] args)throws Exception
	{
		String updateQuery="update employee set E_name=? where E_salary=?";
	    //Load the driver 
		String E_name="Ravan";
		String E_salary="40000";
		String url="jdbc:mysql://localhost:3306/practice";
	   	String username="root";
	   	String password="demo";
	    //2 Build connection
		Connection con=DriverManager.getConnection(url,username,password);
		//3 create Statement
		PreparedStatement ps=con.prepareStatement(updateQuery);
		//Quer execute karne se pehle set positional parameter
		ps.setString(1, E_name);
		ps.setString(2, E_salary);
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Updated ");
		}
		else {
			System.out.println("Failed");
		}
	}
}
