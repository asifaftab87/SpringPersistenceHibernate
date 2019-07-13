<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
    
   
   
    
        <h3>Welcome, Enter The company number</h3>
        <form:form method="GET" action="companyDisplay" modelAttribute="company">
             <table>
                <tr>
                    <td><form:label path="num">Number</form:label></td>
                    <td><form:input id="num" path="num"/></td>
                </tr>
                <tr>
                    <td><button onclick = "validation();">sumbit</button></td>
                </tr>
            </table>
        </form:form>
        <script>
		     function validation(){
		 	    var num = document.getElementById("num").value.trim();
		 	    //var integer = parseInt(num, 10);
		 	    if(num == null || num<= 0){
		 	    	alert("match not found");
   	    }
        }
        </script>
    </body>
</html>