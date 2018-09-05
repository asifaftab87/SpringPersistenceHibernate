<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
	<head>
	    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	    <title>Welcome page</title>
	</head>
	<body>
	    Dear <strong>${user}</strong>, Welcome to Home Page.
	    <a href="<c:url value="/logout" />">Logout</a>
	</body>
</html>