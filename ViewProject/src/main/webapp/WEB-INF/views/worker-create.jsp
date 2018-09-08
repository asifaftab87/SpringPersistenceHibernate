<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

 


<html>
		
	<body>
	
			<h1> <spring:message code="add.worker" /> </h1>
			<form:form method="POST" action="worker/addObj"  modelAttribute="workerDto">
					<table>
			
							<tr>
									<td><form:label path="fullName"> <spring:message code="user.name" /></form:label></td>
									<td><form:input id="fullName" path="fullName" maxlength="25"/></td>
									 <td class="error"><form:errors path="fullName" /></td>
							</tr>
						
							<tr>
									<td><form:label path="fatherName"><spring:message code="worker.fname" /></form:label></td>
									<td><form:input id="fatherName" path="fatherName" maxlength="25"/></td>
									<td class="error"><form:errors path="fatherName" /></td>
							</tr>
	
							<tr>
									<td><form:label path="motherName"> <spring:message code="user.mname" /></form:label></td>
									<td><form:input id="motherName" path="motherName"/></td>
									<td class="error"><form:errors path="motherName" /></td>
							</tr>
								
							<tr>
									<td><form:label path="gender" id="gender" value="gender"><spring:message code="user.gen" /> </form:label></td>
									<td><input type="radio" name="gender" id="1" path="gender" value="1" /><spring:message code="user.g1" /></>
										<input type="radio" name="gender" id="2" path="gender" value="2"/><spring:message code="user.g2" /></>
										<input type="radio" name="gender" id="3" path="gender" value="3" /><spring:message code="user.g3" /></>
										<td class="error"><form:errors path="gender" /></td>
									</td>
							</tr>
								
							<tr>
							
									<td><form:label path="birthDate"><spring:message code="user.dob" /></form:label></td>
									<td><form:input id="birthDate" path="birthDate" /></td>
									<td class="error"><form:errors path="birthDate" /></td>
									
							</tr>
							
							<tr>
									<td><form:label path="address"><spring:message code="user.address" /></form:label></td>
									<td><form:input id="address" path="address"/></td>
									<td class="error"><form:errors path="address" /></td>
							</tr>
											
							<tr>
									<td><form:label path="country" ><spring:message code="user.country" /></form:label></td>
									<td> <select name="country" id="country" onchange="selectCountry(this)">
												<option value="0" selected="" >(Please select a country)</option>
												<option value="Australia"><spring:message code="user.s1" /></option>
												<option value="Canada"><spring:message code="user.s2" /></option>
												<option value="India"><spring:message code="user.s3" /></option>
												<option value="Russia"><spring:message code="user.s4" /></option>
												<option value="USA"><spring:message code="user.s5" /></option>
										</select>
										<td class="error"><form:errors path="country" /></td>
									</td>
							</tr>
							
							
							<tr>
									<td><form:label path="state"><spring:message code="user.state" /></form:label></td>
									<td> <select name="state"  id="state" path="state" disabled >
												<option value="0" selected="" >(Please select a state)</option>
												
										 </select>
										 <td class="error"><form:errors path="state" /></td>
									</td>
							</tr>
							
							
							<tr>
									<td><form:label path="city"><spring:message code="user.city" /></form:label></td>
									<td> <select name="city" id="city" path="city">
												<option value="0" selected="" >(Please select a state)</option>
												<option value="Kolkata"><spring:message code="user.c1" /></option>
												<option value="maldah"><spring:message code="user.c2" /></option>
												<option value="hoogly"><spring:message code="user.c3" /></option>
												<option value="gaya"><spring:message code="user.c4" /></option>
												<option value="vaishali"><spring:message code="user.c5" /></option>
										</select>
										<td class="error"><form:errors path="city" /></td>
									</td>
							</tr>
										
							<tr>
									<td><form:label path="pinCode"><spring:message code="user.pin" /></form:label></td>
									<td><form:input id="pinCode" path="pinCode" maxlength="6" data-minlength="6" /></td>
									<td class="error"><form:errors path="pinCode" /></td>
							</tr>
														
							<tr>
									<td><form:label path="mobileNo"><spring:message code="user.mob" /></form:label></td>
									<td><form:input id="mobileNo" path="mobileNo" maxlength="10"  /></td>
									<td class="error"><form:errors path="mobileNo" /></td>
							</tr>
												
							<tr>
									<td><form:label path="emailAddress"><spring:message code="user.email" /></form:label></td>
									<td><form:input id="emailAddress" path="emailAddress" maxlength="50"/></td>
									<td class="error"><form:errors path="emailAddress" /></td>
							</tr>
								
							<tr>
									<td><form:label path="password"><spring:message code="user.pw" /></form:label></td>
									<td><form:input type="password" id="password" path="password" /></td>
									<td class="error"><form:errors path="password" /></td>
							</tr>
								
							<tr>
									<td><form:label path="confirmPassword"><spring:message code="user.cpw" /></form:label></td>
									<td><form:input  type="password" id="confirmPassword" path="confirmPassword" maxlength="25"/></td>
									<td class="error"><form:errors path="confirmPassword" /></td>
							</tr>
											
							<tr>
									<td><form:label path="yearlyIncome"><spring:message code="user.income" /></form:label></td>
									<td><form:input id="yearlyIncome" path="yearlyIncome" maxlength="25" /></td>
									<td class="error"><form:errors path="yearlyIncome" /></td>
							</tr>
							
						
							
							<tr>
							
								<td><input type="submit" value="Submit" /></td>
							</tr>
							
					</table>
	
			</form:form>
	
	<style>
	.error{
		color: orange;
	}
	</style>
	<script>
	
function selectCountry(o){
		
		//debugger;
		document.getElementById('state').options.length = 1;
		
		var valCountry = o.value.toString();
		if(valCountry==0){
			document.getElementById("state").disabled = true;
			return;
		}
		
		document.getElementById("state").removeAttribute("disabled");
		
		var Australia = ["Penang", "Selangor", "Johor", "Sabah", "Malacca"];
		var Canada = ["Melourne", "Batocaloa","Chile","Bruce"];
		var India = ["West Bengal", "Bihar", "Maharastra", "UP"];
		var Russia=["Shile", "St. Kon", "Salt City", "Kannas Street"];
		var USA=["Las vegas", "Texas", "Missisipi", "illinious"];
		
		var selectStates = '';
		
		if(valCountry=="Australia"){
			selectStates = Australia;
		}
		else if(valCountry=="Canada"){
			selectStates = Canada;
		}
		else if(valCountry=="India"){
			selectStates = India;
		}
		else if(valCountry=="Russia"){
			selectStates = Russia;
		}
		else if(valCountry=="USA"){
			selectStates = USA;
		}
		
		var len = selectStates.length;
		
		var stateObject = document.getElementById("state");
		
		for (var i = 0 ; i<len; i++){
		    var opt = document.createElement('option');
		    opt.value = i+1;
		    opt.innerHTML = selectStates[i];
		    stateObject.appendChild(opt);
		}
}
	
	</script>
	
	</body>
</html>