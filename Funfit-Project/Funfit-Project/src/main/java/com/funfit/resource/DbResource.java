package com.funfit.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	
	static Connection con;
	public static Connection getDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/funfit", "root", "saivarun");
			return con;
			
		}catch(Exception e) {
			System.err.println(e);
		}
		return null;
	}
	
	public static void close() {
		try {
			
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
