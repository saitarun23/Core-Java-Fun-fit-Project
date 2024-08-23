<%@page import="java.util.Iterator"%>
<%@page import="com.funfit.bean.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>View Batch</h2>

<table border="2" class="table">
	<tr>
		<th>BId</th>
		<th>TypeOfBatch</th>
		<th>TIME</th>
	</tr>
	<%
	Object obj=session.getAttribute("listofbatch");
	List<Batch> listOfBatch=(List<Batch>)obj;
	Iterator<Batch> li=listOfBatch.iterator();
			while(li.hasNext()){
				Batch b=li.next();
				%>
				<tr>
					<td><%=b.getBid() %></td>
					<td><%=b.getTypeofbatch() %></td>
					<td><%=b.getTime() %></td>
				</tr>
				<%
			}
	%>
</table>

<a href="batch.jsp">Back</a>
</body>
</html>