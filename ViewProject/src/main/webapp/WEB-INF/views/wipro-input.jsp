<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
 
		<title> Wipro Data required</title>
</head>
	 <body>
			<h1>Input Wipro salary to get detail</h1>

		<form:form method="GET" action="wiproResult" modelAttribute="wipro">

				<table>
						<tr>
							<td><form:label path="avgSalary">Avg Salary</form:label></td>
							<td><form:input path="avgSalary"/></td>
						</tr>
			
						<tr>
							<td><input type="submit" value="Submit" /></td>
						</tr>
		
				</table>
		</form:form>

	</body>
	
	
	
</html>