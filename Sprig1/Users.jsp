<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
  	  margin: auto;
  
}
		.center {
	  		text-align: center;
	  		align-items:center;
	  	}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="center">
		<h2>Users</h2>
		
		<table style="float:inherit">
		   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		   <c:forEach items="${users}" var="user" varStatus="count">
		    <tr id="${count.index}">
		    	<td>${user.id}</td>
		        <td>${user.name}</td>
		        <td>${user.email}</td>
		        <td>${user.password}</td>
		    </tr>
		  </c:forEach>
		</table>
	
	</div>

</body>
</html>