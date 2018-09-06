<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 

     
 
<html>
<head>
 
<title>Company search</title>
</head>
<body>

<h1>School Search Result based on Fees</h1>
<c:if test="${empty companyDtoList}">
    values not found;
</c:if>
<c:if test="${not empty companyDtoList}">
<form:form method="POST" action="company" modelAttribute="company">
<table>
	<thead>
		<tr>
		<th>Id</th>
		<th>Number</th>
		<th>Name</th>
		<th>Email</th>
		</tr>
	</thead>

<tbody>
<c:forEach var="company" items="${companyDtoList}">
		<tr>
		<td>${company.id}</td>
		<td>${company.num}</td>
		<td>${company.name}</td>
		<td>${company.email}</td>
		</tr>
</c:forEach>
</tbody>
</table>
</form:form>
</c:if>
</body>
</html>