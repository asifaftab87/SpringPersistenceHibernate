<html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


	
	
    	<div class="page-header text-center">
			<h1>Dropdown</h1>
		</div>
	
		
	<div class='container'>
    	<div class='row'>
    		<div class="col-12">
				<table id="example" class="display" style="width:100%">
			        <thead>
			            <tr>
			                <th>Patient ID</th>
			                <th>Doctor ID</th>
			                <th>Hospital ID</th>
			            </tr>
			        </thead>
			        <tbody>
				        	<tr>
				                <td>
				                <select name="patientId">
				                <c:forEach var="patient" items="${patientList}">
								  <option><c:out value="${patient}"/> </option>
								  </c:forEach>
								</select>
				                </td>
				                <td>
				                <select name="doctorId">
				                <c:forEach var="doctor" items="${doctorList}">
								  <option><c:out value="${doctor}"/></option>
								  </c:forEach>
								</select>
				                </td>
				                <td>
				                <select name="hospitalId">
				                <c:forEach var="hospital" items="${hospitalList}">
								  <option><c:out value="${hospital}"/></option>
								  </c:forEach>
								</select>
				                </td>
				            </tr>
			    </table>
			</div>
		</div>
	</div>

</body>

<script>

function getDoctorList(){
	
}

(function(){
	console.log("hello");
	
})();
</script>
</html>