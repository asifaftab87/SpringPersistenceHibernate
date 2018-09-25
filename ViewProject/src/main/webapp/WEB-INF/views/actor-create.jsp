<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<body>

		<h1>Please feed data for Actor	</h1>
		<form:form method="POST" action="addInfo"  modelAttribute="actorDto">
		
		<table>
			<tr>
				<td><form:label path="name">Full Name </form:label></td>
				<td><form:input id="name" path="name"/></td>
				<td class="error"><form:errors path="name" /></td>
			</tr>
			
			<tr>
				<td><form:label path="fathername">Father Name </form:label></td>
				<td><form:input id="fathername" path="fathername"/></td>
				<td class="error"><form:errors path="fathername" /></td>
			</tr>
			
			<tr>
				<td><form:label path="location">Location </form:label></td>
				<td><form:input id="location" path="location"/></td>
				<td class="error"><form:errors path="location" /></td>
			</tr>
			
			<tr>
				<td><form:label path="mobileNo"> Mobile No </form:label></td>
				<td><form:input id="mobileNo" path="mobileNo"/></td>
				<td class="error"><form:errors path="mobileNo" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="height">Height </form:label></td>
				<td><form:input id="height" path="height"/></td>
				<td class="error"><form:errors path="height" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="weight">Weight </form:label></td>
				<td><form:input id="weight" path="weight"/></td>
				<td class="error"><form:errors path="weight" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="bankBalance">Bank Balance </form:label></td>
				<td><form:input id="bankBalance" path="bankBalance"/></td>
				<td class="error"><form:errors path="bankBalance" /></td>
			</tr>
			
			
			<tr>
				<td><form:label path="maritalStatus">Marital Status </form:label></td>
				<td><form:input id="maritalStatus" path="maritalStatus"/></td>
				<td class="error"><form:errors path="maritalStatus" /></td>
			</tr>
			
			<tr>
				<td><form:label path="qualification"> Qualification </form:label></td>
				<td><form:input id="qualification" path="qualification"/></td>
				<td class="error"><form:errors path="qualification" /></td>
			</tr>
			
			<tr>
				
			    	<td>	<input type="submit"  value="submit"></td>
				
			</tr>
			
		
		</table>
		
		
		</form:form>
		
		<style>
	.error{
		color: green;
	}
	</style>
	<script>
	

</body>



</html>