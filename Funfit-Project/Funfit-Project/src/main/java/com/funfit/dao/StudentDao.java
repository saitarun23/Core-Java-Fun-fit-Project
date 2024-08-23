package com.funfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.funfit.bean.Student;
import com.funfit.resource.DbResource;

public class StudentDao {
	
	public int storeStudent(Student student) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?,?)");
			pstmt.setInt(1, student.getSid());
			pstmt.setString(2, student.getSname());
			pstmt.setInt(3, student.getAge());
			pstmt.setString(4, student.getPhone());
			pstmt.setString(5, student.getEmail());
			pstmt.setInt(6, student.getBid());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	public int deletestudent(int sid) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("delete from student where bid=?");
			pstmt.setInt(1, sid);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
	

}
