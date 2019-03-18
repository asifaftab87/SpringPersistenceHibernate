<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

/inside user folder
<html>
    <head>
    </head>
    <body>
        <h3><spring:message code="header.add.user" /></h3>
        <form:form method="POST" action="/view/user/add" modelAttribute="userDto">
             <table>
             	<tr>
                    <td><form:label path="name"><spring:message code="user.name" /></form:label></td>
                    <td><form:input path="name" /></td>
                    <td class="error"><form:errors path="name" /></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="user.email" /></form:label></td>
                    <td><form:input path="email" /></td>
                    <td class="error"><form:errors path="email" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit" /></td>
                </tr>
            </table>
        </form:form>
    </body>
    
    <style>
    	.error{
    		color: red;
    	}
    </style>
</html>