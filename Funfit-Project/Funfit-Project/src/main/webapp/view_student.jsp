<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>View Student</h2>

<h3>All Batch information using JSTL</h3>
<table border="2" class="table">
	<tr>
		<th>SID</th>
		<th>Student Name</th>
		<th>Age</th>
		<th>Phone</th>
		<th>Email</th>
		<th>BID</th>
	</tr>
	<c:forEach items="${sessionScope.listofstudent}" var="student">
		<tr>
			<td><c:out value="${student.sid}"></c:out> </td>
			<td><c:out value="${student.sname}"></c:out> </td>
			<td><c:out value="${student.age}"></c:out> </td>
			<td><c:out value="${student.phone}"></c:out> </td>
			<td><c:out value="${student.email}"></c:out> </td>
			<td><c:out value="${student.bid}"></c:out> </td>
		</tr>
	</c:forEach>
</table>

<a href="student.jsp">Back</a>
</body>
</html>