<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>BEST PAGE</title>
</head>
<body>
<h1>PLEASE ENTER DETAIL</h1>

	<form:form method="POST" action="updateDB" name="myForm" modelAttribute="bestDto">
		<table>
				<tr>
						<td><form:label path="name">Full Name </form:label></td>
						<td><form:input id="name" path="name" maxlength="10"/></td>
						
				</tr>
				
				<tr>
									<td><form:label path="gender" id="gender" value="gender">Gender</form:label></td>
									<td><input type="radio" name="gender" id="1" path="gender" value="1" />Male</>
										<input type="radio" name="gender" id="2" path="gender" value="2"/>Female</>
										<input type="radio" name="gender" id="3" path="gender" value="3" />Others</>
									</td>
							</tr>
							
							
						
							
				<tr>
						<td><form:label path="address">Address</form:label></td>
						<td><form:input id="address" path="address"/></td>
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
					</tr>
					
					
					<tr>
							<td><form:label path="state">State [Must select a State]</form:label></td>
							<td> <select name="state"  id="state" path="state" disabled >
										<option value="0" selected="" >(Please select a state)</option>
										
								 </select>
							</td>
					</tr>
							
					
					<tr>
							<td><form:label path="mobileNo">Mobile No</form:label></td>
							<td><form:input id="mobileNo" path="mobileNo" maxlength="10"  /></td>
					</tr>		
					
					
					<tr>
							<td><form:label path="email">Email Address</form:label></td>
							<td><form:input id="email" path="email" maxlength="25"/></td>
					</tr>
							
							

				<tr>
						<td>	<input type="button"  onclick="myVal();" value="Submit"></td>
				</tr>

		</table>
	</form:form>


<script>
function myVal()
{
	 var fullName=document.getElementById('name').value;
	 var ans=alpha(fullName);
	 if(ans==false)
	 {
	 alert("Full Name :Please use alphabet only max-25 characters");
	 return false;
	 }
	 
	 
	 var gender = document.getElementsByName("gender");
	 if ( ( gender[0].checked == false ) && ( gender[1].checked == false ) && ( gender[2].checked == false )) 
	 {
	 alert ( "Please choose your Gender: Male or Female or others" ); 
	 return false;
	 }

	 
	 var address=document.getElementById("address").value;
		if(address==""|| address==null)
		{
			alert("Address cannot be left blank");
			return false;
		}
		
		
		var state=document.getElementById('state').value;
		
		 var country=document.getElementById('country').value;
			
			if(country==""||country==""||country==0)
			{
				alert("please select country");
				return false;
			} 
			
		if(state==0)
		{
			alert("Please select  State");
			return false;
		}
		
		
		var Mobnum=document.getElementById('mobileNo').value;
		var mobAns=number(Mobnum);
		if(mobAns==false)
			{
				alert("Mobile Number invalid feed 10 character");
				return false;
			}
		
		
		var email=(document.getElementById('email').value).trim();
		 var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
		 if(reg.test(email) == false)
			{
				alert("please provide valid email id");
				return false;
			}
		
	 document.myForm.submit();
}

	
function alpha(fname)
{
	var fname=fname.trim();
	var reg=/^[A-Za-z\s]+$/.test(fname);
	if(fname==null || fname=="" || !reg)
	{
	return false;
	}
	else
	return true;
	
}

function number(num)
{
	var num	=num.trim();
	var numbers = /^[0-9]+$/;
	if(!num.match(numbers)|| num.length<10)
		{
			return false;
		}
	
	
	
}

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