<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    	<jsp:include page="./common/navigation.jsp" />  
    </head>
    <body>
        <h3>Welcome, Enter The company Id</h3>
        <form:form method="GET" action="company/search" modelAttribute="company">
             <table>
                <tr>
                    <td><form:label path="id">Id</form:label></td>
                    <td><form:input path="id"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
            <input type="hidden" value="${curRootPage}" id="curRootPage" /> 
        </form:form>
    </body>
</html>