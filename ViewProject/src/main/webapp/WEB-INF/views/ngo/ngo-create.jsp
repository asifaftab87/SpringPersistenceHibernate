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
				/* $( function() {
			    $( "#birthDate" ).datepicker();
				} ); */
			  </script>
		 
						<title>NGO Page</title>
			</head>
	<body>
	
		<div>
			<jsp:include page="../navigation.jsp" />  
		</div>
			<h1> Enter Detail of NGO Inside</h1>
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
	
	</body>
</html>