<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Details</title>
</head>
<body>
	<h1>Car Repair</h1>
	<form:form method="POST" modelAttribute="car">
		<table>
			
			<tr>
				<td><label>Date of Last Maintenance</label></td>
				<td><form:input type="date" path="lastMaintenanceDate" id="lastMaintenanceDate" value = "2020-01-09"/> 
				<form:errors path="lastMaintenanceDate" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>What's in need of repair?</label></td>
				<td><form:select path="problem" id="problem" > 
				<form:option value="brokenEngine">Engine</form:option>
				<form:option value="flatTire">Flat Tire</form:option>
				<form:option value="scratchedPaint">Scratched Paint</form:option>
						
					</form:select>
				<form:errors path="problem" style="color:red" /></td>
			</tr>
			
			<tr>
				<td><label>How far travelled since last fill? (in miles)</label></td>
				<td><form:input type="text" path="tripDistance" id="tripDistance" value="20" /> 
				<form:errors path="tripDistance" style="color:red" /></td>
			</tr>
			<tr>
				<td><label>Would you like to refill your tank? ($1 per gallon)</label></td>
				<td><form:radiobutton path="refill" checked="checked" value="yes" />Yes 
				<form:radiobutton path="refill" value="no" />No
				<form:errors path="refill"	style="color:red" /></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
