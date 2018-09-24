<!DOCTYPE html>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
	<head>
		<%-- <script src="<c:url value='/static/script/jquery-3.3.1.min.js' />"></script> --%>
		
		<script src="<c:url value='/static/script/jquery-1.12.4.js' />"></script>
		<script src="<c:url value='/static/script/jquery-ui.js' />"></script>
		<script src="<c:url value='/static/script/main.js' />"></script>
		
		<link  href="<c:url value='/static/css/jquery-ui.css' />" rel="stylesheet"></link>
		<link  href="<c:url value='/static/css/main.css' />" rel="stylesheet"></link>
		
		
		<%-- 
			<script src="<c:url value='/static/script/bootstrap-3.3.7.min.js' />"></script>
			<script src="<c:url value='/static/script/moment.js' />"></script>
			<script src="<c:url value='/static/script/bootstrap-datetimepicker-4.17.43.min.js' />"></script>
			<script src="<c:url value='/static/script/main.js' />"></script>
			<link  href="<c:url value='/static/css/bootstrap-3.3.7.min.css' />" rel="stylesheet"></link>
			<link  href="<c:url value='/static/css/bootstrap-datetimepicker-4.17.43.min.css' />" rel="stylesheet"></link> 
		--%>
		
		
	</head>
	
	<body>
	
		<ul>
		  <li><a class="navTab active" href="/view" id="home"><spring:message code="link.home" /></a></li>
		  <li><a class="navTab" href="/view/person/search" id="person"><spring:message code="link.person" /></a></li>
		  <li><a class="navTab" href="/view/company" id="company"><spring:message code="link.company" /></a></li>
		  <li><a class="navTab" href="/view/ngo/addNgo" id="ngo"><spring:message code="link.ngo" /></a></li>
		  <li><a class="navTab" href="/view/worker" id="worker"><spring:message code="link.worker" /></a></li>
		</ul>
	
	</body>
</html>
