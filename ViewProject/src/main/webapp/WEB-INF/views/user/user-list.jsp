<%-- 
<jsp:include page="../common/header.jsp" />  
<jsp:include page="../common/footer.jsp" /> 
--%>

	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Users</h1>
		</div>
	
	<div class='container'>
    	<div class='row'>
    		<div class="col-12">
				<table id="example" class="display" style="width:100%">
			        <thead>
			            <tr>
			                <th>Id</th>
			                <th>Name</th>
			                <th>Email</th>
			                <th>Date of Birth</th>
			                <th>Contact Id</th>
			                <th>Roll Number</th>
			            </tr>
			        </thead>
			        <tbody>
			        
			        	<c:forEach var="user" items="${userList}">
			        		
				        	<tr>
				                <td><c:out value="${user.id}"/></td>
				                <td><c:out value="${user.name}"/></td>
				                <td><c:out value="${user.email}"/></td>
				                <td><c:out value="${user.dob}"/></td>
				                <td><c:out value="${user.contactId}"/></td>
				                <td><c:out value="${user.rollNum}"/></td>
				            </tr>
				         
				      </c:forEach>
			            
			    </table>
			</div>
		</div>
	</div>
<jsp:include page="../common/footer.jsp" /> 
</body>
</html>
