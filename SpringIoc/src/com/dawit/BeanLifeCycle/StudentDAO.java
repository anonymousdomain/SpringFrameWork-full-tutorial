package com.dawit.BeanLifeCycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String Password;
     Connection con;
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		Password = password;
	}
     
	public void studentDBconnection() throws ClassNotFoundException, SQLException {
		// load a driver
				Class.forName(driver);

				// creat a connection
				 con = DriverManager.getConnection(url, userName, Password);
	}
	
	public void SelectRow() throws ClassNotFoundException, SQLException {
		System.out.println("retrving all data....");
        
		// excute query
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM `student` ");

		while (rs.next()) {
			int student_id = rs.getInt(1);
			String student_name = rs.getString(2);
			String department = rs.getString(3);
			String dropdown_course = rs.getString(4);

			System.out.println(student_id + " " + student_name + " " + department + " " + dropdown_course);

		}
	

	}

	public void deletedStudentRecored(int student_id) throws ClassNotFoundException, SQLException {

		

		// excute query
		Statement stmt = con.createStatement();
		stmt.executeUpdate("DELETE FROM `student` WHERE student_id=" + student_id);
		System.out.println("dleted student recored with id:" + student_id);
		
	}
public void close() throws SQLException {
	con.close();
}
}
