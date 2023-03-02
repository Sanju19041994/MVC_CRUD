<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<thead>
			<tr>
				<td>Employee Id :</td>
				<td>Employee Name :</td>
				<td>Employee UName :</td>
				<td>Employee Password :</td>
				<td>Employee Department :</td>
				<td>Employee Package :</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${DataToShow}" var="employee">
			<tr>
				<td>${employee.eid }</td>
				<td>${employee.ename }</td>
				<td>${employee.eusername}</td>
				<td>${employee.euserpass}</td>
				<td>${employee.edept}</td>
				<td>${employee.epackage}</td>
			</tr>
			</c:forEach>

		</tbody>

	</table>

</body>
</html>