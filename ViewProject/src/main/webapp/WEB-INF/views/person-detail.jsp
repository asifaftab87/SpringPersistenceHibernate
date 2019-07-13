<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
 
<title>Display Person Kin Id</title>
</head>
<body>
<h1>The result of Person Detail</h1>
<form:form method="POST" action="person" modelAttribute="person">
<table>
	<tr>
	<td><form:label path="id">Id</form:label></td>
	<td><form:input path="id"/></td>
	</tr>

	<tr>
	<td><form:label path="personKinId">Person Kin Id</form:label></td>
	<td><form:input path="personKinId"/></td>
	</tr>
	
	<tr>
	<td><form:label path="name">Name</form:label></td>
	<td><form:input path="name"/></td>
	</tr>
	
	<tr>
	<td><form:label path="dob">DOB</form:label></td>
	<td><form:input path="dob"/></td>
	</tr>
	
	<tr>
	<td><form:label path="fatherName">Father Name</form:label></td>
	<td><form:input path="fatherName"/></td>
	</tr>	

	<tr>
	<td><form:label path="birthPlace">Birth Place</form:label></td>
	<td><form:input path="birthPlace"/></td>
	</tr>
	
	
</table>


</form:form>

</body>
</html>