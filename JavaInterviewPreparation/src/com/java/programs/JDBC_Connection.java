package com.java.programs;
import java.sql.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JDBC_Connection {

	public static void main(String[] args) throws Exception {
		List<Integer> li=new ArrayList<Integer>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/paanai","root","asdf");
		Statement createStatement = connection.createStatement();
		String query="select * from employee;";
		ResultSet executeQuery = createStatement.executeQuery(query);
		while (executeQuery.next()) {
			li.add(executeQuery.getInt(3));
			
		}
		Integer max = Collections.max(li);
		ResultSet executeQuery1 = createStatement.executeQuery(query);
		while (executeQuery1.next()) {
			if (executeQuery1.getInt(3)==max) {
				System.out.println("The max salary of employee is"+executeQuery1.getInt(3)+
						" and his name "+executeQuery1.getNString(2)+
						" and city = "+executeQuery1.getNString(4));
			}
		}
		connection.close();

	}

}
