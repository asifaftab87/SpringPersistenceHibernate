<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
 
<html>
<head>
 
<title>Wipro Search Result based on Salary</title>
</head>
<body>

<h1>Wipro Search Result based on Salary</h1>

<form:form method="POST"  modelAttribute="wipro">
<table>
	<thead>
	
		<tr>
		<th>Department</th>
		<th>No Of Employee</th>
		<th>Avg Salary</th>
		<th>Location</th>
		</tr>
	
	</thead>

<tbody>
<c:forEach var="wipro" items="${wiproDtoList}">
		<tr>
		<td>${wipro.department}</td>
		<td>${wipro.noOfEmployee}</td>
		<td>${wipro.avgSalary}</td>
		<td>${wipro.location}</td>
		</tr>


</c:forEach>
</tbody>





</table>



</form:form>

</body>
</html>