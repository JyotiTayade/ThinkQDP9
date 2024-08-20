package com.India.onlinebanking.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	public static Connection  provideConnection()
	{
		Connection conn=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			
		}
		String url="jdbc:mysql://localhost:3306/bankingsystem";
		
		try 
		{
			conn=DriverManager.getConnection(url, "root", "root");
		} 
		catch (Exception e) 
		{
		  System.out.println("Exception occure in database..");
		}
		
		return conn;
		
	}

}