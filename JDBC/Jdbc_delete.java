package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc_delete 
{
   public static void main(String[] args)throws Exception
   {
	String E_salary="100000";//String for positional parameter
	String url="jdbc:mysql://localhost:3306/practice";
   	String username="root";
   	String password="demo";
    Connection con=	DriverManager.getConnection(url, username,password);
    //--------------connection -----------------//
       PreparedStatement ps=con.prepareStatement("delete from employee where E_salary=?");
       ps.setString(1, E_salary);
       
       int i=ps.executeUpdate();//
       if(i>0)
       {
    	   System.out.println("Record deleted sucessfully");
       }
       else {
    	   System.out.println("Fail");
       }
   }
}
