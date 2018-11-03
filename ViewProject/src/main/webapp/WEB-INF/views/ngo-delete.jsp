<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

	<head>
		<title>Delete by Email from NGO Page</title>
	</head>

	<body>
	
			<div>
				<jsp:include page="navigation.jsp" />  
			</div>
			<h1> Enter Detail of NGO </h1>
			<form:form method="POST" action="delByEmail" name="myForm" modelAttribute="ngo">
					<table>
										
							<tr>
									<td><form:label path="emailAddress">Email Address</form:label></td>
									<td><form:input id="emailAddress" path="emailAddress"/></td>
							</tr>
							
							
							<tr>
							
								<td> <input type="submit"  value="Submit"/> </td>
							</tr>
							
					</table>
					<input type="hidden" value="${curRootPage}" id="curRootPage" /> 
			</form:form>
	</body>
	</html>		