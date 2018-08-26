<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
    </head>
    <body>
    
        <form:form method="POST" action="addUser" modelAttribute="user"><!-- as its last pg hence action can be empty -->
             <table>
             	<tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td><form:label path="email">Email</form:label></td>
                    <td><form:input path="email"/></td>
                </tr>
                
            </table>
            
            <c:if test="${not empty userAddressList}">
            
	            <table>
	            	<thead>
			        	<tr>
			        	   	<th>Id</th>
			            	<th>User Id</th>
			            	<th>Address</th>
			            	<th>Postcode</th>
			            	<th>Counntry</th>
			            	<th>City</th>
			            </tr>
	            	</thead>
	            	<tbody>
			            <c:forEach var="userAddress" items="${userAddressList}">
			             	<tr>
			                    <td>${userAddress.id}</td>
			                    <td>${userAddress.userId}</td>
			                    <td>${userAddress.address1}</td>
			                    <td>${userAddress.postcode}</td>
			                    <td>${userAddress.cntry}</td>
			                    <td>${userAddress.city}</td>
			               </tr>
		                </c:forEach>
		            </tbody>
	            </table>
	            
            </c:if>
            
        </form:form>
    </body>
</html>