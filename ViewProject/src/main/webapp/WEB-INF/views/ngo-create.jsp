<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

 


<html>
			<head>
					<meta charset="utf-8">
					  <meta name="viewport" content="width=device-width, initial-scale=1">
					   <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
					  <!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
					  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
					  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
		
			  <script>
				$( function() {
			    $( "#birthDate" ).datepicker();
				} );
			  </script>
		 
						<title>NGO Page</title>
			</head>
	<body>
	
			<h1> Enter Detail of NGO </h1>
			<form:form method="POST" action="displayNgo" name="myForm" modelAttribute="ngo">
					<table>
			
							<tr>
									<td><form:label path="fullName"> Name </form:label></td>
									<td><form:input id="fullName" path="fullName" maxlength="10"/></td>
									
							</tr>
						
							<tr>
									<td><form:label path="fatherName">Father Name</form:label></td>
									<td><form:input id="fatherName" path="fatherName" maxlength="25"/></td>
							</tr>
	
							<tr>
									<td><form:label path="motherName">Mother Name</form:label></td>
									<td><form:input id="motherName" path="motherName"/></td>
							</tr>
								
							<tr>
									<td><form:label path="gender" id="gender" value="gender">Gender</form:label></td>
									<td><input type="radio" name="gender" id="1" path="gender" value="1" />Male</>
										<input type="radio" name="gender" id="2" path="gender" value="2"/>Female</>
										<input type="radio" name="gender" id="3" path="gender" value="3" />Others</>
									</td>
							</tr>
								
							<tr>
							
									<td><form:label path="birthDate">Date of Birth</form:label></td>
									<td><form:input id="birthDate" path="birthDate" /></td>
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
									<td><form:label path="city">City</form:label></td>
									<td> <select name="city" id="city" path="city">
												<option value="0" selected="" >(Please select a state)</option>
												<option value="Kolkata">Kolkata</option>
												<option value="maldah">maldah</option>
												<option value="hoogly">hoogly</option>
												<option value="gaya">gaya</option>
												<option value="vaishali">vaishali</option>
										</select>
									</td>
							</tr>
										
							<tr>
									<td><form:label path="pinCode">Pin Code</form:label></td>
									<td><form:input id="pinCode" path="pinCode" maxlength="6" data-minlength="6" /></td>
							</tr>
														
							<tr>
									<td><form:label path="mobileNo">Mobile No</form:label></td>
									<td><form:input id="mobileNo" path="mobileNo" maxlength="10"  /></td>
							</tr>
												
							<tr>
									<td><form:label path="emailAddress">Email Address</form:label></td>
									<td><form:input id="emailAddress" path="emailAddress" maxlength="25"/></td>
							</tr>
								
							<tr>
									<td><form:label path="password">Password</form:label></td>
									<td><form:input type="password" id="password" path="password" /></td>
							</tr>
								
							<tr>
									<td><form:label path="confirmPassword">Confirm Password</form:label></td>
									<td><form:input  type="password" id="confirmPassword" path="confirmPassword" maxlength="25"/></td>
							</tr>
											
							<tr>
									<td><form:label path="yearlyIncome">YearlyIncome</form:label></td>
									<td><form:input id="yearlyIncome" path="yearlyIncome" maxlength="25" /></td>
							</tr>
										
							<tr>
									<td><form:label path="yearlyExpense">Yearly Expense</form:label></td>
									<td><form:input id="yearlyExpense" path="yearlyExpense" maxlength="25"/></td>
							</tr>
							
							<tr>
							
								<td> <input type="button" onclick="myVal();" value="Submit"/> </td>
							</tr>
							
					</table>
	
			</form:form>
	
	 <style>
    	.error{
    		color: red;
    	}
    </style>
	
	<script>
	
	
		
	function myVal()
	{
		//debugger;
		
		
	  
		 	var fullName=document.getElementById('fullName').value;
			var ans=alpha(fullName);
			if(ans==false)
			{
				alert("Full Name :Please use alphabet only max-25 characters");
				return false;
			}
			
			var fatherName=document.getElementById('fatherName').value;
			var fans=alpha(fatherName);
			if(fans==false)
			{
				alert("Father Name : Please use alphabet only max-25 characters ");
				return false;
			}
			
			var motherName=document.getElementById('motherName').value;
			var mans=alpha(motherName);
			if(mans==false)
			{
				alert("Mother Name : Please use alphabet only max-25 characters");
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
			
			
			var city=document.getElementById('city').value;
			
			
			
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
			
			if(city==0)
			{
				alert("Please select city");
				return false;
			}
				
			var pin=(document.getElementById('pinCode').value).trim();
			var numbers = /^[0-9]+$/;
			if(!pin.match(numbers)|| pin.length<6)
				{
					alert("Invalid Pin Code cannot be more than 6 character	");
					return false;
				}
			
			var Mobnum=document.getElementById('mobileNo').value;
			var mobAns=number(Mobnum);
			if(mobAns==false)
				{
					alert("Mobile Number invalid feed 10 character");
					return false;
				}
			
			 var email=(document.getElementById('emailAddress').value).trim();
			 var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
			 if(reg.test(email) == false)
				{
					alert("please provide valid email id");
					return false;
				}
			
			
			var password=document.getElementById('password').value;
			var passw = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
			if(!password.match(passw))
				{
					alert("Password must be 6 to 20,atleast one number, one uppercase and one lowercase letter");
					return false;
				}
				
			
			var confirmPassword=document.getElementById('confirmPassword').value;
			
			if(!confirmPassword.match(password))
				{
					alert("Password mismatch");
					return false;
				}
					
			
			 var yIncome=(document.getElementById('yearlyIncome').value).trim();
			var decimal=/^[-+]?[0-9]+\.[0-9]+$/;
			if(!yIncome.match(decimal))
				{
					alert("only double value is allowed for income");
					return false;
				}
		 
			 var yExpense=(document.getElementById('yearlyExpense').value).trim();
			if(!yExpense.match(decimal))
				{
					alert("only double value is allowed for Expense");
					return false;
				}  
			
			
			//var dob=document.getElementById("birthDate").value;
			
			
					
			
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