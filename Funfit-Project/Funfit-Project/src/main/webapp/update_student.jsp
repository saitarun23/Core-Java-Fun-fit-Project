<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Update Student</h2>

<form action="StudentUpdateController" method="post">
		
	<label>SId</label>
	<input type="number" name="sid"/><br/>
	
	<label>Student Name</label>
	<input type="text" name="sname"/><br/>
	
	<label>Age</label>
	<input type="number" name="age"/><br/>
	
	<label>Phone</label>
	<input type="text" name="phone"/><br/>
	
	<label>Email</label>
	<input type="text" name="email"/><br/>
	
	<input type="submit" value="Update Student"/>
	<input type="reset" value="reset"/>
</form>	
<a href="student.jsp">Back</a>
</body>
</html>