<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>





<body>

			<div>
				<jsp:include page="./common/navigation.jsp" />  
			</div>
			<h1>Please Input Mobile details</h1>
			
			<form:form method="POST" action="addObj"  modelAttribute="mobileDto">
			<table>
					<tr>
						<td><form:label path="model">Model </form:label></td>
						<td><form:input id="model" path="model"/></td>
						<td class="error"><form:errors path="model" /></td>
					</tr>
				
					
					<tr>
						<td><form:label path="year"> Year </form:label></td>
						<td><form:input id="year" path="year"/></td>
						<td class="error"><form:errors path="year" /></td>
					</tr>
				
				
					<tr>
						<td><form:label path="price"> Price </form:label></td>
						<td><form:input id="price" path="price"/></td>
						<td class="error"><form:errors path="price" /></td>
					</tr>
				
				
					<tr>
						<td><form:label path="spectrum"> Spectrum </form:label></td>
						<td><form:input id="spectrum" path="spectrum"/></td>
						<td class="error"><form:errors path="spectrum" /></td>
					</tr>
				
				
					<tr>
						<td><form:label path="weight"> Weight</form:label></td>
						<td><form:input id="weight" path="weight"/></td>
						<td class="error"><form:errors path="weight" /></td>
					</tr>
				
				
					<tr>
						<td><form:label path="expense"> Expense </form:label></td>
						<td><form:input id="expense" path="expense"/></td>
						<td class="error"><form:errors path="expense" /></td>
					</tr>
				
				
				<tr>
					<td>	<input type="submit"  value="submit"></td>
				</tr>
		
			
			</table>
			
			
			
			
			</form:form>	

<style>
	.error{
		color: blue;
	}
	</style>
	<script>
	

</body>


</html>