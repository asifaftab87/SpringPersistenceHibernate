<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<h1>list all</h1>
	<body>
		
		<c:if test="${not empty ngoDtoList}">
		
			<table  >
					
					<thead style="display:block">
							<tr>
							
								<th width="300">Ngo Id</th>
								<th width="300"> Name </th>
								<th width="300"> Father Name </th>
								<!-- <th width="300"> Mother Name </th>
								<th width="300"> Gender </th>
								<th width="300"> Date Of Birth </th> -->
								<th width="300"> Address </th>
								<!-- <th width="300"> Country </th>
								<th width="300"> State </th>
								<th width="300"> City </th>
								<th width="300"> pin Code </th> -->
								<th width="300"> Mobile No </th>
								<th width="300"> Email Address </th>
								<!-- th width="300"> Password </th>
								<th width="300"> Confirm Password </th>
								<th width="300"> Yearly Income </th>
								<th width="300"> Yearly Expense </th> -->
							
							</tr>
					
					</thead>
			
		</table>
			<ul>
				<c:forEach var="listValue" items="${ngoDtoList}">
				
			<table border="1" >
					
					
					<tr>
							<td width="300"> ${listValue.id}</td>
							<td width="300"> ${listValue.fullName}</td>
							<td width="300">${listValue.fatherName} </td>
							<td width="300"> ${listValue.address}</td>
							<td width="300"> ${listValue.mobileNo} </td>
							<td width="300"> ${listValue.emailAddress} </td>
							
	
					</tr>
				
				
				</table>
					
				</c:forEach>
			</ul>
	
		</c:if>
		
	</body>
</html>


<html>
		
</body>


		
		<form:form method="GET" action="addNgo" name="myForm" modelAttribute="ngo">
		<tr>
		<td><input type="submit"  value="Home"/> </td>
		</tr>
		</form:form>
</body>
</html>
