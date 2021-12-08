<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<center><h1>ALL INFORMAITION</h1></center>

<script type="text/javascript">
function addEmployee() {
	
	document.fn.action="registration";
	document.fn.submit();
}
function deleteEmployee() {
	
	document.fn.action="delete";
	document.fn.submit();
}
function editEmployee() {

	document.fn.action="edit";
	document.fn.submit();
}
</script>
</head>
<body>
	<form name="fn">


		<table border="1" align="center">
			<th>EmployeeId</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>User Name</th>
			<th>Password</th>
			<th>Local AddressNo</th>
			<th>Local Area Name</th>
			<th>Local CityName</th>
			<th>Permenent Address No</th>
			<th>Permenent Area Name</th>
			<th>Permenent City Name</th>
			<tr>
				<c:forEach items="${data}" var="employee">
					<br>
					<td><input type="radio" name="empid" value="${employee.empid}"></td>
					<td>${employee.empid}</td>
					<td>${employee.firstname}</td>
					<td>${employee.lastname}</td>
					<td>${employee.uname}</td>
					<td>${employee.pass}</td>
					<td>${employee.addressno}</td>
					<td>${employee.areaname}</td>
					<td>${employee.cityname}</td>
					<td>${employee.addressno1}</td>
					<td>${employee.areaname1}</td>
					<td>${employee.cityname1}</td>
			</tr>
			</c:forEach>

		</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>

</tr>
</table>
	</form>
</body>
</html>