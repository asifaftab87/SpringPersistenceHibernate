<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


  
<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Patient List</h1>
		</div>
        <h3>Welcome, Enter The Patient Details</h3>
        <form:form method="POST" action="/view/patient/addPatient" modelAttribute="patientDto">
             <table>
             	<tr>
                    <td><form:label path="fName"><spring:message code="patient.fName" /></form:label></td>
                    <td><form:input path="fName" /></td>
                    <td class="error"><form:errors path="fName" /></td>
                </tr>
                <tr>
                    <td><form:label path="lName"><spring:message code="patient.lName" /></form:label></td>
                    <td><form:input path="lName" /></td>
                    <td class="error"><form:errors path="lName" /></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="patient.email" /></form:label></td>
                    <td><form:input path="email" /></td>
                    <td class="error"><form:errors path="email" /></td>
                </tr>
                <tr>
                    <td><form:label path="age"><spring:message code="patient.age" /></form:label></td>
                    <td><form:input path="age" /></td>
                    <td class="error"><form:errors path="age" /></td>
                </tr>
                <tr>
                    <td><form:label path="phone"><spring:message code="patient.phone" /></form:label></td>
                    <td><form:input path="phone" /></td>
                    <td class="error"><form:errors path="phone" /></td>
                </tr>
                <tr>
                    <td><form:label path="doctorId"><spring:message code="patient.doctorId" /></form:label></td>
                    <td><form:input path="doctorId" /></td>
                    <td class="error"><form:errors path="doctorId" /></td>
                </tr>
                <tr>
                    <td><form:label path="hospitalId"><spring:message code="patient.hospitalId" /></form:label></td>
                    <td><form:input path="hospitalId" /></td>
                    <td class="error"><form:errors path="hospitalId" /></td>
                </tr>
                <tr>
                    <td><form:label path="dob"><spring:message code="patient.dob" /></form:label></td>
                    <td><form:input path="dob" id="birthDate"/></td>
                    <td class="error"><form:errors path="dob" /></td>
                </tr>
               	<tr>
                    <td><form:label path="doe"><spring:message code="patient.doe" /></form:label></td>
                    <td><form:input path="doe" id="entryDate"/></td>
                    <td class="error"><form:errors path="doe" /></td>
                </tr>
                <tr>	
                    <td><form:label path="dor"><spring:message code="patient.dor" /></form:label></td>
                    <td><form:input path="dor" id="releaseDate"/></td>
                    <td class="error"><form:errors path="dor" /></td>
                </tr>
                <tr>
                    <td><form:label path="c"><spring:message code="patient.c" /></form:label></td>
                    <td><form:input path="c" /></td>
                    <td class="error"><form:errors path="c" /></td>
                </tr>
                <tr>
                     <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    
  <jsp:include page="../common/footer.jsp" /> 