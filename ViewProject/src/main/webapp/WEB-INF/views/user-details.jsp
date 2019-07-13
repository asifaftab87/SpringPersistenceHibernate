<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
    /user-details.jsp
        <h3>Welcome, Enter The Employee Details</h3>
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
        </form:form>
    </body>
</html>