<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<body>

			<div>
				<jsp:include page="navigation.jsp" />  
			</div>
			
			<h1>Please Feed detail of the minister</h1>

		<form:form method="POST" action="update"  modelAttribute="ministerDto">
		
		
		<table>
		
		
		
		<tr>
				<td><form:label path="name">Full Name </form:label></td>
				<td><form:input id="name" path="name"/></td>
				<td class="error"><form:errors path="name" /></td>
		</tr>
		
		<tr>
				<td><form:label path="spouse">Spouse Name </form:label></td>
				<td><form:input id="spouse" path="spouse" /></td>
				<td class="error"><form:errors path="spouse" /></td>
		</tr>

		<tr>
				<td><form:label path="noOfChildren">No. Of Childrens </form:label></td>
				<td><form:input id="noOfChildren" path="noOfChildren" /></td>
				<td class="error"><form:errors path="noOfChildren" /></td>
		</tr>
		
		<tr>
				<td><form:label path="annualSalary">Annual Salary </form:label></td>
				<td><form:input id="annualSalary" path="annualSalary" /></td>
				<td class="error"><form:errors path="annualSalary" /></td>
		</tr>
		
		<tr>
				<td><form:label path="address">Address </form:label></td>
				<td><form:input id="address" path="address" /></td>
				<td class="error"><form:errors path="address" /></td>
		</tr>
		
		<tr>
				<td><form:label path="partyName">Party Name </form:label></td>
				<td><form:input id="partyName" path="partyName" /></td>
				<td class="error"><form:errors path="partyName" /></td>
		</tr>
		
		<tr>
				<td><form:label path="noOfMember">No. of Members</form:label></td>
				<td><form:input id="noOfMember" path="noOfMember" /></td>
				<td class="error"><form:errors path="noOfMember" /></td>
		</tr>
		
		<tr>
				<td><form:label path="email">Email </form:label></td>
				<td><form:input id="email" path="email" maxlength="10"/></td>
				<td class="error"><form:errors path="email" /></td>
		</tr>
		
		<tr>
				<td><form:label path="contactNo">Contact No. </form:label></td>
				<td><form:input id="contactNo" path="contactNo" /></td>
				<td class="error"><form:errors path="contactNo" /></td>
		</tr>


			<tr>
					<td>	<input type="submit"  value="submit"></td>
			</tr>
		
		</table>
		

		</form:form>

</body>



</html>