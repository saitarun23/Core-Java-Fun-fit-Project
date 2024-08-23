<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Delete Student</h2>

<form action="StudentDeleteController" method="post">
	<label>SID</label>
	<input type="number" name="sid"><br/>
	
	<input type="submit" value="Delete Student"/>
	<input type="reset" value="reset"/>
</form>

<a href="student.jsp">Back</a>
</body>
</html>