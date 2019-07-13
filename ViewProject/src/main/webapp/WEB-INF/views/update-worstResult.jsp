<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1>${message}</h1>

<form:form method="GET" action="options" name="myForm" modelAttribute="worst">
	<input type="submit" name="submit"  value="HOME"/>
	</form:form>