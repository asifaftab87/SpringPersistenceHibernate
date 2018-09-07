<!DOCTYPE html>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
	<head>
		<script src="<c:url value='/static/script/jquery-3.3.1.min.js' />"></script>
		<script src="<c:url value='/static/script/main.js' />"></script>
		<link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
	</head>
	
	<body>
	
		<ul>
		  <li><a class="navTab" href="/view" onclick="makeAtcive(this);">Home</a></li>
		  <li><a class="navTab" href="/view/person/search" onclick="makeAtcive(this);">Person</a></li>
		  <li><a class="navTab" href="/view/company" onclick="makeAtcive(this);">Company</a></li>
		</ul>
	
	</body>
</html>
