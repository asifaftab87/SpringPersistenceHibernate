<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
		<title>Options to select</title>
</head>
<body>
	<form:form method="GET" action="form" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit" value="Add Details"/>
	</form:form>
</body>
</html>

<html>
</head>
<body>
	<form:form method="GET" action="deleteform" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit"  value="Delete Details"/>
	</form:form>
</body>
</html>

<html>
</head>
<body>
	<form:form method="GET" action="updateInfo" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit" value="Update Details"/>
	</form:form>
</body>
</html>

<html>
</head>
<body>
	<form:form method="GET" action="getAll" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit" value="Get All Details"/>
	</form:form>
</body>
</html>
