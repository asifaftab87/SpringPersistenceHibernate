<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<html>
<head>

<title>Result of School Search</title>
</head>
<body>
<h1>Result of school search based on fees</h1>

<form:form method="POST"  action="school" modelAttribute="school">

<table>
	<thead>
		<tr>
			<th>Id</th>
			<th>School Name</th>
			<th>No Of Student</th>
			<th>Location</th>
			<th>Fees</th>		
		</tr>
	</thead>

<tbody>
	 <c:forEach var="school" items="${schoolDtoList}">
	<tr>
	<td>${school.id }</td>
	<td>${school.schoolName }</td>
	<td>${school.noStudent }</td>
	<td>${school.location }</td>
	<td>${school.fees }</td>
	</tr>

	
</c:forEach>
</tbody>
</table>
</form:form>
</body>
</html>