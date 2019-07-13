<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


  
<jsp:include page="../common/navigation.jsp" />
	
	
    	<div class="page-header text-center">
			<h1>Doctor List</h1>
		</div>
        <h3>Welcome, Enter The Doctor Details</h3>
        <form:form method="POST" action="/view/doctor/addDoctor" modelAttribute="doctorDto">
             <table>
             	<tr>
                    <td><form:label path="fName"><spring:message code="doctor.fName" /></form:label></td>
                    <td><form:input path="fName" /></td>
                    <td class="error"><form:errors path="fName" /></td>
                </tr>
                <tr>
                    <td><form:label path="lName"><spring:message code="doctor.lName" /></form:label></td>
                    <td><form:input path="lName" /></td>
                    <td class="error"><form:errors path="lName" /></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="doctor.email" /></form:label></td>
                    <td><form:input path="email" /></td>
                    <td class="error"><form:errors path="email" /></td>
                </tr>
                <tr>
                    <td><form:label path="phone"><spring:message code="doctor.phone" /></form:label></td>
                    <td><form:input path="phone" /></td>
                    <td class="error"><form:errors path="phone" /></td>
                </tr>
                <tr>
                    <td><form:label path="hospitalId"><spring:message code="doctor.hospitalId" /></form:label></td>
                    <td><form:input path="hospitalId" /></td>
                    <td class="error"><form:errors path="hospitalId" /></td>
                </tr>
                <tr>
                    <td><form:label path="specialization"><spring:message code="doctor.specialization" /></form:label></td>
                    <td><form:input path="specialization" /></td>
                    <td class="error"><form:errors path="specialization" /></td>
                </tr>
                <tr>
                     <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    
  <jsp:include page="../common/footer.jsp" /> 