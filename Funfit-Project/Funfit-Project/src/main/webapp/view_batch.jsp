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
<h2>View Batch</h2>

<h3>All Batch information using JSTL</h3>
<table border="2" class="table">
	<tr>
		<th>BId</th>
		<th>Typeofbatch</th>
		<th>Time</th>
	</tr>
	<c:forEach items="${sessionScope.listofbatch}" var="batch">
		<tr>
			<td><c:out value="${batch.bid}"></c:out> </td>
			<td><c:out value="${batch.typeofbatch}"></c:out> </td>
			<td><c:out value="${batch.time}"></c:out> </td>
		</tr>
	</c:forEach>
</table>
<a href="batch.jsp">Back</a>
</body>
</html>