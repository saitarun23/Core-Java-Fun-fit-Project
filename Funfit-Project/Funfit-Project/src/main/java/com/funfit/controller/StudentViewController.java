package com.funfit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.funfit.bean.Student;
import com.funfit.service.StudentService;

/**
 * Servlet implementation class StudentViewController
 */
@WebServlet("/StudentViewController")
public class StudentViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		StudentService ss=new StudentService();
		List<Student> listofstudent = ss.findAllStudent();
		HttpSession hs=request.getSession();
		//request.setAttribute("listofbatch",listofbatch);		// request scope 
		hs.setAttribute("listofstudent",listofstudent);				//// session scope 
		//RequestDispatcher rd = request.getRequestDispatcher("view_batch.jsp");
		//rd.forward(request, response);
		response.sendRedirect("view_student.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
