<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   

<html>
    <head>
    
    <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Form Submission</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<!--   <link rel="stylesheet" href="/resources/demos/style.css">
 -->  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>

  <script>
	$( function() {
    $( "#datepicker" ).datepicker();
	} );
  </script>
    
    </head>
    <body>
        <h3>Welcome, Enter your Details</h3>
        <form:form method="POST" action="resultForm" name="myForm" modelAttribute="form">
             <table>
                <tr>
                    <td><form:label path="number">number</form:label></td>
                    <td><form:input id="number" path="number" /></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input placeholder="Name" path="name" /></td>
                    
                </tr>
                <tr>
                    <td><form:label path="fatherName">Father Name</form:label></td>
                    <td><form:input id="fatherName" path="fatherName" /></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input id="email" path="email" /></td>
                </tr>
                
                <tr>
                    <td>Confirm Email</td>
                    <td><input id = "email2" ></td>
                </tr>
                
                 <tr>
                    <td><form:label path="password">Password</form:label></td>
                    <td><form:input id="password" path="password" type="password"/></td>
                </tr>
                
                 <tr>
                    <td>Confirm Password</td>
                    <td><input id = "password2" type="password"></td>
                </tr>
                
                
                 <tr>
                    <td><form:label path="dob">date of birth</form:label></td>
                    <td><form:input id="datepicker" path="dob" /></td>
                </tr>
             
                 <tr>
                 <td>Country</td>
                 <td><select id="country" class="dpWidth" name="country" onchange="selectCountry(this);"><!-- this=document.getElementById("country") -->
					  	<option value="0">Select Country</option>
					    <option value="India">India</option>
					    <option value="lanka">Sri Lanka</option>
					    <option value="Malaysia">Malaysia</option>
	 			 </select>
  	  			 </td>
  	  			 </tr>
  	 			 <br>
  	  			 <tr>
  	  			 	<td>State</td>
  	 				<td> <select name="state" id="state" class="dpWidth" path="state" disabled onchange="selectState(this);"><!-- this=document.getElementById("state") -->
  	 	 			 <option value="0">Select State</option>
	 			 </select>
	 			 </td>
                 </tr>
                <tr>
                    <td> <input type="button" onclick="myFunction()" value="Submit form" /></td>
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
    		
    		var indiaStates = ["West Bengal", "Bihar", "Maharastra", "UP"];
    		var srilankaStates = ["Badulla", "Batocaloa"];
    		var malaysiaStates = ["Penang", "Selangor", "Johor", "Sabah", "Malacca"];
    		
    		var selectStates = '';
    		
    		if(valCountry=="India"){
    			selectStates = indiaStates;
    		}
    		else if(valCountry=="lanka"){
    			selectStates = srilankaStates;
    		}
    		else if(valCountry=="Malaysia"){
    			selectStates = malaysiaStates;
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
    	
    	function selectState(obj){
    		
    	}

        
        
        function myFunction()
        {        	  
        	//debugger;
        	
        	var number = document.forms["myForm"]["number"].value.trim();
            var name = document.forms["myForm"]["name"].value.trim();
            var fatherName = document.forms["myForm"]["fatherName"].value.trim();
            var email = document.forms["myForm"]["email"].value.trim();
            var email2 = document.forms["myForm"]["email2"].value.trim();
            var password = document.forms["myForm"]["password"].value.trim();
            var password2 = document.forms["myForm"]["password2"].value.trim();
            var dob = document.forms["myForm"]["datepicker"].value.trim();


        	
        	var alpha = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
    		var numbers = /^[0-9]+$/;
    		var mail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    		
    		//num = mobile.length;
        	
        	
        	
            if(number == "") {
                alert("number must be filled out");
                return false;
            } 
            if(!number.match(numbers)){
            	 alert("number must be number");
                 return false;
            }
            if(number.length!=10){
    			
            	alert("number must be 10 digits");
                return false;
    			
                
    		}    
            if (name == "") {
                alert("Name must be filled out");
                return false;
            }
    		if(!name.match(alpha)){
   			 	alert("Name must be alphabets only");
                return false;
   			}		
    		if(name.length>25){
    			
    			alert("Name must be less than 25 charater");
                return false;
    		}
    		
            
            
            if (fatherName == "") {
                alert("Father Name must be filled out");
                return false;
            }
	   		if(!fatherName.match(alpha)){
	  			 alert("Father Name must be alphabets only");
	             return false;
	  		}		
	   		if(fatherName.length>25){		
	   			alert("Father Name must be less than 25 charater");
	            return false;
	   		}
            
            
            
            if (email == "") {
                alert(" email id must be filled out");
                return false;
            }
            
            if(!email.match(mail)){
            	 alert(" please provide a valid email address");
                 return false;
            }
            
            
            if(email != email2) {
                alert('Email is Not Matching!');
            }
            
            
            if (password == "") {
                alert(" password must be filled out");
                return false;
            }
            
            if(password.length<8 || password.length>13){
            	 alert("Password must be between 8 to 13");
                 return false;	
    		}
            
            if(password != password2) {
                alert('password is Not Matching!');
            }
            
            
                        
            if (dob == "") {
                alert("date of birth must be filled out");
                return false;
            }
            
             
            var state = document.forms["myForm"]["state"].value.trim();
            if (state == 0) {
                alert(" state must be filled out");
                return false;
            }
            var country = document.forms["myForm"]["country"].value.trim();
            if (country ==0) {
                alert(" country must be filled out");
                return false;
            } 

            document.myForm.submit();
            
        }
        	
               
        </script>
        <style>

			.dpWidth{
	 		width:250px;   
			}
	
		</style>
    </body>
</html>