<!DOCTYPE html>
<%@page import="org.liferayasif.front.dto.NavigationDto"%>
<%@page import="java.util.List"%>
<%@ page import="org.liferayasif.front.util.ViewWebUtil" %>
<html lang="en">
<head>
	<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
	<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">

	
	<script>
		$(document).ready(function() {
			console.log("navigation.js");
		    $('#example').DataTable();
		    $( "#birthDate" ).datepicker();
		    $( "#entryDate" ).datepicker();
		    $( "#releaseDate" ).datepicker();
		    $( "#registrationDate" ).datepicker();
		});
	</script>
</head>
<body>


<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul >
		<% 
			List<NavigationDto> navigationList = ViewWebUtil.getPageCodeByParent("ROOT");		
			for(NavigationDto dto : navigationList){
				%>
					<li>
						<a href="<%= dto.getUrl() %>"><%= dto.getPageName() %></a>
						<%
							List<NavigationDto> childNavigationList = ViewWebUtil.getPageCodeByParent(dto.getPageCode());
							if(childNavigationList!=null && childNavigationList.size()>0){
								%>
									<ul >
										<%
											for(NavigationDto dtoc : childNavigationList){
											%>
												<li>
													<a href="<%= dtoc.getUrl() %>"><%= dtoc.getPageName() %></a>
												</li>
											<%
											}
										%>
									</ul>
								<%
							}
						%>
					</li>
				<%	
			}
		%> 
    </ul>
  </div>
</nav>
  
 
