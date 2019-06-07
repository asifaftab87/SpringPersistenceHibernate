<html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Patient List</h1>
		</div>
	
		<div style="float: right;">
		<a href="http://localhost:8080/view/patient/addPatient"  class="btn btn-success">Create new patient record</a>
		
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
			                <th>Age</th>
			                <th>Phone</th>
			                <th>Doctor ID</th>
			                <th>Hospital ID</th>
			                <th>Date of Birth</th>
			                <th>Date of Entry</th>
			                <th>Date of Release</th>
			                <th>Cured</th>
			            </tr>
			        </thead>
			        <tbody>
			        
			        	<c:forEach var="patient" items="${patientList}">
			        		
				        	<tr>
				                <td><c:out value="${patient.id}"/></td>
				                <td><c:out value="${patient.fName}"/></td>
				                <td><c:out value="${patient.lName}"/></td>
				                <td><c:out value="${patient.email}"/></td>
				                <td><c:out value="${patient.age}"/></td>
				                <td><c:out value="${patient.phone}"/></td>
				                <td><c:out value="${patient.doctorId}"/></td>
				                <td><c:out value="${patient.hospitalId}"/></td>
				                <td><fmt:formatDate value="${patient.dob}" pattern="dd/MM/yyyy" /></td>
				                <td><fmt:formatDate value="${patient.doe}" pattern="dd/MM/yyyy" /></td>
				                <td><fmt:formatDate value="${patient.dor}" pattern="dd/MM/yyyy" /></td>
				                <td><c:out value="${patient.c}"/></td>
				                
				            </tr>
				         
				      </c:forEach>
			            
			    </table>
			</div>
		</div>
	</div>
<jsp:include page="../common/footer.jsp" /> 
</body>
</html>