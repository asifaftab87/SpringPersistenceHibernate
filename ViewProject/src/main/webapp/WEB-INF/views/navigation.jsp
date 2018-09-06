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
		  <li><a class="navTab active" href="#home" onclick="makeAtcive(this);">Home</a></li>
		  <li><a class="navTab" href="#news" onclick="makeAtcive(this);">News</a></li>
		  <li><a class="navTab" href="#contact" onclick="makeAtcive(this);">Contact</a></li>
		  <li><a class="navTab" href="#about" onclick="makeAtcive(this);">About</a></li>
		</ul>
	
	</body>
</html>
