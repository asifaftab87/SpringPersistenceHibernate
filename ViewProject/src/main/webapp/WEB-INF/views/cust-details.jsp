<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
 
<html>
<head>
 
<title>Result of customer search</title>
</head>

<body>

<h1>The result of customer id Search:-</h1>

<form:form method="POST" action="getById" modelAttribute="customers" >
<table>
<tr>
	<td><form:label path="id">Id</form:label></td>
	<td><form:input path="id"/></td>
</tr>

<tr>
	<td><form:label path="firstName"  >First Name</form:label></td>
	<td><form:input path="firstName" /></td>
</tr>

<tr>
	<td><form:label path="last_name">Last Name</form:label></td>
	<td><form:input path="last_name"/></td>
</tr>


<tr>
	<td><form:label path="class1">Class1</form:label></td>
	<td><form:input path="class1"/></td>
</tr>


<tr>
	<td><form:label path="room">Room</form:label></td>
	<td><form:input path="room"/></td>
</tr>

<tr>
	<td><form:label path="building">Building</form:label></td>
	<td><form:input path="building"/></td>
</tr>


<tr>
	<td><form:label path="address1">Address1</form:label></td>
	<td><form:input path="address1"/></td>
</tr>

<tr>
	<td><form:label path="address2">Address1</form:label></td>
	<td><form:input path="address2"/></td>
</tr>
<tr>
	<td><form:label path="city">City</form:label></td>
	<td><form:input path="city"/></td>
</tr>

<tr>
	<td><form:label path="state">State</form:label></td>
	<td><form:input path="state"/></td>
</tr>
<tr>
	<td><form:label path="postalCode">Postal Code</form:label></td>
	<td><form:input path="postalCode"/></td>
</tr>
<tr>
	<td><form:label path="country">Country</form:label></td>
	<td><form:input path="country"/></td>
</tr>

<tr>
	<td><form:label path="phone">Phone</form:label></td>
	<td><form:input path="phone"/></td>
</tr>
<tr>
	<td><form:label path="email">Email</form:label></td>
	<td><form:input path="email"/></td>
</tr>
<tr>
	<td><form:label path="voicMail">Voice Mail</form:label></td>
	<td><form:input path="voicMail"/></td>
</tr>

<tr>
	<td><form:label path="password">Password</form:label></td>
	<td><form:input path="password"/></td>
</tr>
<tr>
	<td><form:label path="creditCard">Credit Card</form:label></td>
	<td><form:input path="creditCard"/></td>
</tr>
<tr>
	<td><form:label path="creditCardTypeId">Credit Card Type Id</form:label></td>
	<td><form:input path="creditCardTypeId"/></td>
</tr>

<tr>
	<td><form:label path="cardExpMo">Card Exp Month</form:label></td>
	<td><form:input path="cardExpMo"/></td>
</tr>
<tr>
	<td><form:label path="cardExpYr">Card Exp Year</form:label></td>
	<td><form:input path="cardExpYr"/></td>
</tr>
<tr>
	<td><form:label path="billingAddress">Billing Address</form:label></td>
	<td><form:input path="billingAddress"/></td>
</tr>

<tr>
	<td><form:label path="billingCity">Billing City</form:label></td>
	<td><form:input path="billingCity"/></td>
</tr>

<tr>
	<td><form:label path="billingRegion">Billing Region</form:label></td>
	<td><form:input path="billingRegion"/></td>
</tr>


<tr>
	<td><form:label path="billingPostalCode">Billing Postal Code</form:label></td>
	<td><form:input path="billingPostalCode"/></td>
</tr>


<tr>
	<td><form:label path="billingCountry">Billing Country</form:label></td>
	<td><form:input path="billingCountry"/></td>
</tr>

<tr>
	<td><form:label path="shipAddress">Ship Address</form:label></td>
	<td><form:input path="shipAddress"/></td>
</tr>

<tr>
	<td><form:label path="shipCity">Ship City</form:label></td>
	<td><form:input path="shipCity"/></td>
</tr>
<tr>
	<td><form:label path="shipRegion">Ship Region</form:label></td>
	<td><form:input path="shipRegion"/></td>
</tr>
<tr>
	<td><form:label path="shipPostalCode">Ship Postal Code</form:label></td>
	<td><form:input path="shipPostalCode"/></td>
</tr>
<tr>
	<td><form:label path="shipCountry">Ship Country</form:label></td>
	<td><form:input path="shipCountry"/></td>
</tr>
<tr>
	<td><form:label path="dateEntered">Date Entered</form:label></td>
	<td><form:input path="dateEntered"/></td>
</tr>

</table>

</form:form>
</body>
</html>