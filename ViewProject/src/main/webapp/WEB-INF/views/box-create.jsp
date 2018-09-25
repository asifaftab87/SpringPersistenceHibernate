<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>


<body>

		<div>
				<jsp:include page="navigation.jsp" />  
			</div>
			
			<form:form method="POST" action="update" modelAttribute="boxDto">
			<table>
			<tr>
					<td><form:label path="company"> Company</form:label></td>
					<td><form:input id="company" path="company" /></td>
					<td class="error"><form:errors path="company" /></td>
			</tr>
			
			<tr>
					<td><form:label path="size"> Size</form:label></td>
					<td><form:input id="size" path="size" value=""/></td>
					<td class="error"><form:errors path="size" /></td>
			</tr>
			
			<tr>
					<td><form:label path="price"> Price</form:label></td>
					<td><form:input id="price" path="price" /></td>
					<td class="error"><form:errors path="price" /></td>
			</tr>
			
			<tr>
					<td><form:label path="weight"> Weight</form:label></td>
					<td><form:input id="weight" path="weight" /></td>
					<td class="error"><form:errors path="weight" /></td>
			</tr>
			
			<tr>
					<td><form:label path="manufacturer"> Manufacturer</form:label></td>
					<td><form:input id="manufacturer" path="manufacturer" /></td>
					<td class="error"><form:errors path="manufacturer" /></td>
			</tr>
			
			<tr>
					<td><form:label path="place"> Place</form:label></td>
					<td><form:input id="place" path="place" /></td>
					<td class="error"><form:errors path="place" /></td>
			</tr>
			
			<tr>
					<td><form:label path="price"> Price</form:label></td>
					<td><form:input id="price" path="price" /></td>
					<td class="error"><form:errors path="price" /></td>
			</tr>
			
			<tr>
					<td><form:label path="area"> Area</form:label></td>
					<td><form:input id="area" path="area" /></td>
					<td class="error"><form:errors path="area" /></td>
			</tr>
			
			<tr>
					<td><form:label path="pinCode"> PinCode</form:label></td>
					<td><form:input id="pinCode" path="pinCode" /></td>
					<td class="error"><form:errors path="pinCode" /></td>
			</tr>
			
			<tr>
					<td><form:label path="contactNo"> Contact No</form:label></td>
					<td><form:input id="contactNo" path="contactNo" /></td>
					<td class="error"><form:errors path="contactNo" /></td>
			</tr>
			
			
			<tr>
					<td> <input type="submit"  value="submit"/> </td>
			</tr>
			
			</table>
			
		
			</form:form>

</body>


</html>