package com.funfit.service;

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

}
       