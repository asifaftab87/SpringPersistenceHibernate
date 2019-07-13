<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


  
<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Registration List</h1>
		</div>
        <h3>Welcome, Enter The Registration Details</h3>
        <form:form method="POST" action="/view/registration/addRegistration" modelAttribute="registrationDto">
             <table>
             	<tr>
                    <td><form:label path="hospitalId"><spring:message code="registration.hospitalId" /></form:label></td>
                    <td><form:input path="hospitalId" /></td>
                    <td class="error"><form:errors path="hospitalId" /></td>
                </tr>
                <tr>
                    <td><form:label path="doctorId"><spring:message code="registration.doctorId" /></form:label></td>
                    <td><form:input path="doctorId" /></td>
                    <td class="error"><form:errors path="doctorId" /></td>
                </tr>
                <tr>
                    <td><form:label path="patientId"><spring:message code="registration.patientId" /></form:label></td>
                    <td><form:input path="patientId" /></td>
                    <td class="error"><form:errors path="patientId" /></td>
                </tr>
                <tr>
                    <td><form:label path="dor"><spring:message code="registration.dor" /></form:label></td>
                    <td><form:input path="dor" /></td>
                    <td class="error"><form:errors path="dor" /></td>
                </tr>
                <tr>
                    <td><form:label path="outpatient"><spring:message code="registration.outpatient" /></form:label></td>
                    <td><form:input path="outpatient" /></td>
                    <td class="error"><form:errors path="outpatient" /></td>
                </tr>
                <tr>
                     <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    
  <jsp:include page="../common/footer.jsp" /> 