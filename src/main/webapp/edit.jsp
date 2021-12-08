<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1 align="center">EDIT DATA</h1>
</head>
<body>
<form action="update">
<table border="1">

<input type="hidden" name="empid" value="${data.empid}">

<tr>
<td> User Name:-</td>
<td><input type="text" name="uname" value="${data.uname}"></td>
</tr>
<tr>
<td>PassWord:-</td>
<td><input type="text" name="pass" value="${data.pass}"></td>
</tr>
<tr>
<td>First Name:-</td>
<td><input type="text" name="firstname" value="${data.firstname}"></td>
</tr>
<tr>
<td>Last Name:-</td>
<td><input type="text" name="lastname" value="${data.lastname}"></td>
</tr>
<tr>
<td>Lacal Address No:-</td>
<td><input type="text" name="addressno" value="${data.addressno}"></td>
</tr><tr>
<td>Local Area Name:-</td>
<td><input type="text" name="areaname" value="${data.areaname}"></td>
</tr><tr>
<td>Lacal City Name:-</td>
<td><input type="text" name="cityname" value="${data.cityname}"></td>
</tr><tr>
<td>Permenent Address No:-</td>
<td><input type="text" name="addressno1" value="${data.addressno1}"></td>
</tr><tr>
<td>Permenent Area Name:-</td>
<td><input type="text" name="areaname1" value="${data.areaname1}"></td>
</tr><tr>
<td>Permenent City Name:-</td>
<td><input type="text" name="cityname1" value="${data.cityname1}"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>