<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>

<head>
  <title>COLLEGE WEBPAGE</title>
</head>

<body>
		<div>
				<jsp:include page="./common/navigation.jsp" />  
			</div>

		<h1>Enter Detail of COLLEGE</h1>
		
		
		<form:form method="POST" action="update"  modelAttribute="collegeDto">
				
					<table>
			
							<tr>
									<td><form:label path="name">Full Name </form:label></td>
									<td><form:input id="name" path="name" maxlength="10"/></td>
									<td class="error"><form:errors path="name" /></td>
							</tr>
						
							<tr>
									<td><form:label path="fatherName"> Father Name </form:label></td>
									<td><form:input id="fatherName" path="fatherName" maxlength="10"/></td>
									<td class="error"><form:errors path="fatherName" /></td>
							</tr>
							<tr>
									<td><form:label path="gender">Select Gender </form:label></td>
									<td>	<input type="radio" name="gender" value="male"> Male<br>
									  		<input type="radio" name="gender" value="female"> Female<br>
									  		<input type="radio" name="gender" value="transgender"> Transgender<br>
									  		<input type="radio" name="gender" value="dontdisclose" > Dont want to disclose<br>
									  		<td class="error"><form:errors path="gender" /></td>
									</td>
							</tr>
							
							<tr>
										<td><form:label path="mobNo">Mobile No </form:label></td>
										<td><form:input id="mobNo" path="mobNo" /></td>
										<td class="error"><form:errors path="mobNo" /></td>
							</tr>
							
							
							<tr>
									
									
									<td><form:label path="country"> Select Country </form:label></td>
						           
						          <td>
						             
						             <select name="country" id = "country" onchange="selectCountry(this)">
						                <option value = "0">Please select a country</option>
						               <option value = "India">India</option>
						               <option value = "Malaysia">Malaysia</option>
						               <option value = "US">US</option>
						               <option value = "UK">UK</option>
						             </select>
						             <td class="error"><form:errors path="country" /></td>
          						</td>
      
							</tr>
							
							<tr>
									<td><form:label path="country"> Select State </form:label></td>
						           
						          	<td>
						             
						             <select name="state" id = "state" path="state" disabled>
						               <option value ="0" selected="">select state</option>
						              
						             </select>
						             <td class="error"><form:errors path="state" /></td>
          							</td>
      
							</tr>
							
							
							<tr>
									<td><form:label path="email"> Email Id </form:label></td>
									<td><form:input id="email" path="email" maxlength="50"/></td>
									<td class="error"><form:errors path="email" /></td>
							</tr>
							
							
							<tr>	
									<td><form:label path="password"> Password </form:label></td>
									<td><form:input type="password" id="password" path="password" maxlength="25"/></td>
									<td class="error"><form:errors path="password" /></td>
							</tr>
							
							<tr>
									<td>	<input type="submit"  value="submit"></td>
							</tr>
		
							
							
					</table>
					<input type="hidden" value="${curRootPage}" id="curRootPage" /> 
										
		
		</form:form>
		
		<style>
		
		.error{
		color:red;}
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
		
		var India = ["West Bengal", "Bihar", "Maharastra", "UP"];
		var Malaysia = ["Penang", "Selangor", "Johor", "Sabah", "Malacca"];
		var USA=["Las vegas", "Texas", "Missisipi", "illinious"];
		var UK=["Shile", "St. Kon", "Salt City", "Kannas Street"];
		
		
		var selectStates = '';
		
		if(valCountry=="India"){
			selectStates = India;
		}
		else if(valCountry=="Malaysia"){
			selectStates = Malaysia;
		}
		else if(valCountry=="US"){
			selectStates = US;
		}
		else if(valCountry=="UK"){
			selectStates = UK;
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