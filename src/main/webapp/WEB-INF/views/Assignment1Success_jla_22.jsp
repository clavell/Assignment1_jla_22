<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Details</title>
</head>
<body>
<h1>Car Repair</h1>
	<table>
	
		<tr>
			<td><label>Date of last Maintenance</label></td>
			<td>${car.lastMaintenanceDate}</td>
		</tr>
		<tr>
			<td><label>In need of Repair: </label></td>
			<td>${car.problemToString() }</td>
		</tr>
		<tr>
			<td><label>Car due for maintenance: </label></td>
			<td>${car.timeForMaintenanceString()}</td>
		</tr>
		<tr>
			<td><label>amount of fuel left:</label></td>
			<td>${car.drive()} Gallons</td>
		</tr>
		<tr>
			<td><label>refill the tank?</label></td>
			<td>${car.refill}</td>
		</tr>
		<tr>
			<td><label>fuel cost:</label></td>
			<td>$${car.refuel(1)}</td>
		</tr>
		<tr>
			<td><label>cost of maintenance: </label></td>
			<td>$${car.calculateRepairCosts()}</td>
		</tr>
	</table>
</body>
</html>