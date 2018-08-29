<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The company Id</h3>
        <form:form method="GET" action="companyDisplay" modelAttribute="company">
             <table>
                <tr>
                    <td><form:label path="num">Number</form:label></td>
                    <td><form:input path="num"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>