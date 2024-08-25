<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Batch</title>

</head>
<body>
<h2>Add Batch</h2>

<form action="BatchStoreController" method="post">

	<label>BId</label>
	<input type="number" name="bid"/><br/>
	
	<label>Type of batch</label>
	<select id="typeofbatch" name="typeofbatch" >
			<option value="">Select</option>
            <option value="morning">Morning</option>
            <option value="evening">Evening</option>
	</select><br/>
	
	
	<label>Time</label>
	<input type="text" name="time"/><br/>
	
	<input type="submit" value="Store batch"/>
	<input type="reset" value="reset"/>
</form>

<a href="batch.jsp">Back</a>
</body>
</html>