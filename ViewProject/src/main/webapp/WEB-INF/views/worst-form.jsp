<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script> 


</head>
<body>
            <form:form  method="POST"  action="addInfo" name="regForm" id="regForm" modelAttribute="worst">
            	
                <table align="left">
                    
                   	<tr>
	                    <td><form:label path="name">NAME</form:label></td>
	                    <td><form:input id="name" path="name"/></td>
                	</tr>
                     
                     <tr>
	                    <td><form:label path="fatherName">FATHER NAME</form:label></td>
	                    <td><form:input id="fatherName" path="fatherName"/></td>
                	</tr>
                	
                	<tr>
	                    <td><form:label path="motherName">MOTHER NAME</form:label></td>
	                    <td><form:input id="motherName" path="motherName"/></td>
                	</tr>
                	
                	<tr>
		               <td><form:label id = "gender" path = "gender">Gender</form:label></td>
		               <td>
		                  <form:radiobutton path = "gender" value = "MALE" label = "Male" />
		                  <form:radiobutton path = "gender" value = "FEMALE" label = "Female" />
		                  <form:radiobutton path = "gender" value = "TRANSGENDER" label = "Transgender" />
		                  <form:radiobutton path = "gender" value = "OTHERS" label = "Other" />
		               </td>
		            </tr> 	  


                	
                	<tr>
	                    <td><form:label path="birthDate">BIRTH DATE</form:label></td>
	                    <td><form:input type="text" path="birthDate" id="birthDate"  placeholder="mm/dd/yyyy"/></td>
                	</tr>
                	
                	<tr>
	                    <td><form:label type="password" path="emailAddress">EMAIL ADDRESS</form:label></td>
	                    <td><form:input id="emailAddress" path="emailAddress"/></td>
                	</tr>
                	
                	<tr>
	                    <td><form:label type="password" path="password">PASSWORD</form:label></td>
	                    <td><form:password id="password" path="password"/></td>
                	</tr>
                	
                	<tr>
	                    <td><form:label path="confirmPassword">CONFIRM PASSWORD</form:label></td>
	                    <td><form:password id="confirmPassword" path="confirmPassword"/></td>
                	</tr>
                    
                    <tr>
                        
                        <td>
                            <input type="button" onclick="validateForm();" value="Submit"/>
                        </td>
                    </tr>
                    <tr></tr>
                    <!-- <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr> -->
                </table>
            </form:form>
        </body>


<script>

function validateForm() {
	
	
	var fullName=document.getElementById('name').value;
	var ans=alpha(fullName);
	if(ans==false)
	{
		alert("Full Name :Please use alphabet only max-25 characters");
		return false;
	}
	
	
	var fullName2=document.getElementById('fatherName').value;
	var ans2=alpha(fullName2);
	if(ans2==false)
	{
		alert("Father Name :Please use alphabet only max-25 characters");
		return false;
	}
	
	var fullName3=document.getElementById('motherName').value;
	var ans3=alpha(fullName3);
	if(ans3==false)
	{
		alert("Mother Name :Please use alphabet only max-25 characters");
		return false;
	}
	
	 if(!validateRadio (document.forms["regForm"]["gender"]))
    {
		 alert('Please select gender');
	        return false;
		 
		
    }
  
	var chkdate = document.getElementById("birthDate").value;
	var a=checkDate(chkdate);
	if(a==1)
		{
			alert("Please enter the Date..!!");
			return false;
		}
	else if(a==2)
		{
			alert('date format is wrong');
			return false;
		}
	else if(a==3)
		{
		
		 alert("Current or future date is not allowed.");
		 return false;
		}
	
	
	var emailAdd=document.getElementById('emailAddress').value;
	var a=ValidateEmail(emailAdd);
	if(a==false)
		{
			alert("You have entered an invalid email address!")
		    return false;
		}
	
	var password1=document.getElementById('password').value;
	
	var password=password1.trim();
	
	if(password.length <= 5) 
	{ 
		alert('Please feed a valid password...! 6 to 20 characters ')
		return false;
		
	}
	
	var cpassword=document.getElementById('confirmPassword').value.trim();
	if(cpassword!= password) 
	{ 
		alert('password mis match ')
		return false;
		
	}
	
	document.regForm.submit();
	
}

$(function() {
	  $("#datepicker").datepicker();
	});


function validateRadio (radios)
{
    for (i = 0; i < radios.length; ++ i)
    {
        if (radios [i].checked) return true;
    }
    return false;
}

function ValidateEmail(mail) 
{
 if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(mail))
  {
    return (true)
  }
    
    return (false)
}

	


function checkDate(date) {
	 var today = new Date();
    if (date == "") {
        
        return 1;
    }
    else if (!date.match(/^(0[1-9]|[12][0-9]|3[01])[\- \/.](?:(0[1-9]|1[012])[\- \/.](19|20)[0-9]{2})$/)) {
        
        return 2;
    }
    else if (today <= date) {
       
        return 3;
    }
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




</script>

</html>

