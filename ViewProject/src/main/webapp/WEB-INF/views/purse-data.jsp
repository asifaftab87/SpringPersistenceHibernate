<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   

<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Purse Details</h3>
        <form:form method="POST" action="resultPurse" name="myForm" modelAttribute="purse">
             <table>
                <tr>
                    <td><form:label path="color">Color</form:label></td>
                    <td><form:input id="color" path="color" /></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input placeholder="Full Name" id="fname" path="name" /></td>
                    
                </tr>
                <tr>
                    <td><form:label path="price">Price</form:label></td>
                    <td><form:input id="price" path="price" /></td>
                </tr>
                <tr>
                    <td><form:label path="purseBigId">Purse Big Id</form:label></td>
                    <td><form:input id="purseBigId" path="purseBigId" /></td>
                </tr>
                 <tr>
                    <td><form:label path="quantity">Quantity</form:label></td>
                    <td><form:input id="quantity" path="quantity" /></td>
                </tr>
                <tr>
                    <td> <input type="button" onclick="myFunction()" value="Submit form" /></td>
                </tr>
            </table>
        </form:form>
        
        <script>
        
        function myFunction()
        {        	  
        	//debugger;
        	
        	var x = document.forms["myForm"]["color"].value;
            if (x == "") {
                alert("Color must be filled out");
                return false;
            }
            var y = document.forms["myForm"]["name"].value;
            if (y == "") {
                alert("Name must be filled out");
                return false;
            }
            var z = document.forms["myForm"]["price"].value;
            if (z == "") {
                alert("Price must be filled out");
                return false;
            }
            var a = document.forms["myForm"]["purseBigId"].value;
            if (a == "") {
                alert(" Purse Big Id must be filled out");
                return false;
            }
            var b = document.forms["myForm"]["quantity"].value;
            if (b == "") {
                alert(" Quantity must be filled out");
                return false;
            }
             
            document.myForm.submit();
            
        }
        	
               
        </script>
    </body>
</html>