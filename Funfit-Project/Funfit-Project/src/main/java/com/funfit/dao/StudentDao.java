package com.funfit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	
	public int updateStudent(Student student) {
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("update student set sname=?,age=?,phone=?,email=? where sid=?");
			pstmt.setString(1, student.getSname());
			pstmt.setInt(2, student.getAge());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getEmail());
			pstmt.setInt(5, student.getSid());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Student> findAllStudents(){
		List<Student> listofstudent=new ArrayList<Student>();
		try {
			Connection con=DbResource.getDbConnection();
			PreparedStatement pstmt=con.prepareStatement("select * from student");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				Student s=new Student();
				s.setSid(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setAge(rs.getInt(3));
				s.setPhone(rs.getString(4));
				s.setEmail(rs.getString(5));
				s.setBid(rs.getInt(6));
				listofstudent.add(s);							
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return listofstudent;
	}

}
