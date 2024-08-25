package com.funfit.service;

import java.util.List;

import com.funfit.bean.Student;
import com.funfit.dao.StudentDao;

public class StudentService {
	
	StudentDao sd=new StudentDao();
	
	public String storeStuent(Student student) {
		
		if(student.getSid()<=0) {
			return "Invalid Student ID";
		}
		else if(sd.storeStudent(student)>0) {
			return "Student Details saved";
		}
		else {
			return "Student details didn't store";
		}
	}
	
	public String deletestudent(int sid) {
		
		if(sd.deletestudent(sid)>0) {
			return "Student deleted Successfully";
		}
		else {
			return "Student not present";
		}
	}
	
	public String updateStudent(Student student) {
		
		if(sd.updateStudent(student)>0) {
			return "Student Details updated successfully";
		}else {
			return "Student not present";
		}
	}
	
	public List<Student> findAllStudent(){
		return sd.findAllStudents();
	}
}
       