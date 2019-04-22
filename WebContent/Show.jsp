<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="Second" method="post">

	<table>
	<tr><td><%= (String)request.getAttribute("dataInsertionCheck") %><td></tr>
	<tr><td>SEARCH EMPLOYEE<td></tr>
	<tr><td>Enter employee email: </td><td><input type="text" name="searchEmail"/></td></tr>
	</table>

</form>

</body>
</html>