<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>


<body>
			<div>
				<jsp:include page="./common/navigation.jsp" />  
			</div>
			
		<form:form method="POST" action="update"  modelAttribute="worldDto">
		
		
		<table>
				
			<tr>
					<td><form:label path="name"> Full Name</form:label></td>
					<td><form:input id="name" path="name" /></td>
					<td class="error"><form:errors path="name" /></td>
			</tr>
		
			<tr>
					<td><form:label path="fatherName"> Father Name </form:label></td>
					<td><form:input id="fatherName" path="fatherName"/></td>
					<td class="error"><form:errors path="fatherName" /></td>
			</tr>
			
				
			<tr>
			
					<td><form:label path="dob">Date of Birth</form:label></td>
					<td><form:input id="dob" path="dob" /></td>
					<td class="error"><form:errors path="dob" /></td>
			</tr>
			
			<tr>
					<td><form:label path="gender" id="gender" value="gender">Gender</form:label></td>
					<td><input type="radio" name="gender" id="1" path="gender" value="1" />Male</>
						<input type="radio" name="gender" id="2" path="gender" value="2"/>Female</>
						<input type="radio" name="gender" id="3" path="gender" value="3" />Others</>
					</td>
					<td class="error"><form:errors path="gender" /></td>
			</tr>
		
			<tr>
					<td><form:label path="mobNo">Mobile No</form:label></td>
					<td><form:input id="mobNo" path="mobNo"  value=""/></td>
					<td class="error"><form:errors path="mobNo" /></td>
			</tr>
		
			<tr>
					<td><form:label path="country" >Country [Must select a country]</form:label></td>
					<td> <select name="country" id="country" onchange="selectCountry(this)">
								<option value="0" selected="" >(Please select a country)</option>
								<option value="Australia">Australia</option>
								<option value="Canada">Canada</option>
								<option value="India">India</option>
								<option value="Russia">Russia</option>
								<option value="USA">USA</option>
						</select>
					</td>
					<td class="error"><form:errors path="country" /></td>
					
			</tr>
			
			<tr>
					<td><form:label path="state">State [Must select a State]</form:label></td>
					<td> <select name="state"  id="state" path="state" disabled >
								<option value="0" selected="" >(Please select a state)</option>
								
						 </select>
					</td>
					<td class="error"><form:errors path="state" /></td>
			</tr>
				
			<tr>
					<td><form:label path="email">Email Address</form:label></td>
					<td><form:input id="email" path="email" /></td>
					<td class="error"><form:errors path="email" /></td>		
			</tr>	
			
							
			<tr>
					<td><form:label path="password">Password</form:label></td>
					<td><form:input type="password" id="password" path="password" /></td>
					<td class="error"><form:errors path="password" /></td>
			</tr>
					
				
			<tr>
							
					<td> <input type="submit"  value="submit"/> </td>
			</tr>			
			
		</table>



	</form:form>
	
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