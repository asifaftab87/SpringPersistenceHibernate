<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
 
<html>
<head>
 
<title>School Page</title>
</head>
<body>
<h1>Enter school fees</h1>
<form:form method="GET" action="schoolDisplay" modelAttribute="school">
<table>
		<tr>
		<td><form:label path="fees">Fees</form:label></td>
		<td><form:input path="fees"/></td>
		</tr>
		
		<tr>
		<td><input type="submit" value="Submit"/></td>
		</tr>

</table>


</form:form>
</body>
</html>