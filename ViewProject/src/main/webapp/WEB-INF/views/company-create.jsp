<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Employee Details</h3>
        <form method="POST" action="adds" modelAttribute="company">
             <table>
             	<tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email" /></td>
                </tr>
                <tr>
                    <td><form:label path="num">number</form:label></td>
                    <td><form:input path="num" /></td>
                </tr>
                <tr>
                    <td><button onclick="validation();">click</button></td>
                </tr>
            </table>
        </form>
        <script>
            	function validation(){
            		
            		var name = document.getElementById("name").value.trim();
            		var email = document.getElementById("email").value.trim();
            		var num = document.getElementById("num").value.trim();
            		
            		var alpha = /^[a-zA-Z-,]+(\s{0,1}[a-zA-Z-, ])*$/;
            		var numbers = /^[0-9]+$/;
            		var mail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
            		
            		num = mobile.length;
            		
            		var errMsg = '';
            		var isError = false;
            		
            		
            		if(name.length<1){
            			alert("name is less than 1");
            			
            		}
            		if (name == "") {
                        alert("Name must be filled out");
                        return false;
                    }
            		if(!name.match(alpha)){
            			errMsg = errMsg + "\nname is invalid"
            			isError = true;	
            		}
            		
            		if(!num.match(numbers)){
            			
            	    	errMsg = errMsg + "\nnumis invalid"
            			isError = true;	
            			
                    }
            	    
            		if(num!=10){
            			
            			errMsg = errMsg + "\nnum is not 1 digit"
            			isError = true;	
            			
            		}           		
            		
            		if(!email.match(mail)){
            			
            	    	errMsg = errMsg + "\nmail id is invalid"
            			isError = true;	
            			
                    }
            		if(isError){
            			alert(errMsg)
            		}
            		else{
            			alert("successfully submitted");
            		}
            		
            	}            
            
            </script>
    </body>
</html>