<html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Doctor List</h1>
		</div>
	
		<div style="float: right;">
		<a href="http://localhost:8080/view/doctor/addDoctor"  class="btn btn-success">Create new doctor record</a>
		
		</div>
	<div class='container'>
    	<div class='row'>
    		<div class="col-12">
				<table id="example" class="display" style="width:100%">
			        <thead>
			            <tr>
			                <th>Id</th>
			                <th>First Name</th>
			                <th>Last Name</th>
			                <th>Email</th>
			                <th>Phone</th>
			                <th>Hospital ID</th>
			                <th>Specialization</th>
			            </tr>
			        </thead>
			        <tbody>
			        
			        	<c:forEach var="doctor" items="${doctorList}">
			        		
				        	<tr>
				                <td><c:out value="${doctor.id}"/></td>
				                <td><c:out value="${doctor.fName}"/></td>
				                <td><c:out value="${doctor.lName}"/></td>
				                <td><c:out value="${doctor.email}"/></td>
				                <td><c:out value="${doctor.phone}"/></td>
				                <td><c:out value="${doctor.hospitalId}"/></td>
				                <td><c:out value="${doctor.specialization}"/></td>
				                
				            </tr>
				         
				      </c:forEach>
			            
			    </table>
			</div>
		</div>
	</div>
<jsp:include page="../common/footer.jsp" /> 
</body>
</html>