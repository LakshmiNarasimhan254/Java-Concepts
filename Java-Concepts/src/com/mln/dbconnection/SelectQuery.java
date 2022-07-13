/*********************
 **Date:{date}*******
 *********************
 *********************/
package com.mln.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 ********************
 * @author laksh
 ********************
 **/
public class SelectQuery {

	//This Method is created to 

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/employees");
		Statement statement = connection.createStatement();
		statement.execute("SELECT * FROM `employees` WHERE `emp_no` IN (10000,10002,10004)");
		ResultSet rs = statement.getResultSet();
		
		while(rs.next()){
			System.out.println(rs.toString());
		//	System.out.println(rs.getString("first_name"));
			
		}
		rs.close();
		statement.close();
		connection.close();
	}

}
