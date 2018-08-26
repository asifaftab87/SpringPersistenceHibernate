<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>

<title>input id of Person</title>
</head>
<body>
<h1>Please input the correct Id to search the details</h1>
<form:form method="GET" action="person/getPerson" modelAttribute="person">
<table>
  <tr>
       <td><form:label path="id">Id</form:label></td>
       <td><form:input path="id"/></td>
 </tr>

<tr>
		<td><input type="submit" value="Submit"/></td>
</tr>
</table>
</form:form>

</body>
</html>