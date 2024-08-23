package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.funfit.bean.Student;
import com.funfit.service.StudentService;

/**
 * Servlet implementation class StudentUpdateController
 */
@WebServlet("/StudentUpdateController")
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		// receive the value from form and convert to respective data types. 
		
		int sid=Integer.parseInt(request.getParameter("sid"));
		String sname=request.getParameter("sname");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		
		// create Product java bean class object. 
		Student s=new Student();
		s.setSid(sid);
		s.setSname(sname);
		s.setAge(age);
		s.setPhone(phone);
		s.setEmail(email);
		
		
		// created service class object 
		StudentService ss=new StudentService();
		
		// pass the object and get the result 
		String result = ss.updateStudent(s);
		pw.print(result);
		
		// created request dispatcher object and include the page 
		RequestDispatcher rd = request.getRequestDispatcher("update_student.jsp");
		
		// set the content in html format. 
		response.setContentType("text/html");
		rd.include(request, response);
	}

}
