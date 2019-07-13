<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>

<head>
		
</head>

<body>


</body>

</html>

<html>
<head>
 
<title>GET ALL FROM WORST TABLE</title>
</head>
<body>

<h1>GET ALL FRO  WORST </h1>
<c:if test="${empty worstDtoList}">
    values not found;
</c:if>
<c:if test="${not empty worstDtoList}">
<form:form method="POST" action="" modelAttribute="worst">
<table>
	<thead>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Father Name</th>
		<th>Mother Name</th>
		<th>GENDER</th>
		<th>BIRTHDATE</th>
		<th>Email</th>
		<th>PASSWORD</th>
		</tr>
	</thead>

<tbody>
<c:forEach var="worst" items="${worstDtoList}">
		<tr>
		<td>${worst.worstId}</td>
		<td>${worst.name}</td>
		<td>${worst.fatherName}</td>
		<td>${worst.motherName}</td>
		<td>${worst.gender}</td>
		<td>${worst.birthDate}</td>
		<td>${worst.emailAddress}</td>
		<td>${worst.password}</td>
		</tr>
</c:forEach>
</tbody>
</table>
</form:form>
</c:if>

<form:form method="GET" action="options" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit"  value="HOME"/>
	</form:form>
</body>
</html>