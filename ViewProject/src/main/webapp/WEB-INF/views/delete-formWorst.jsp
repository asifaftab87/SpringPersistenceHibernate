<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>

</head>


<body>

			<form:form method="POST" action="delete" name="regForm" id="regForm" modelAttribute="worst">
			
				<table>
	                    	<tr>
									<td><form:label path="worstId">WORST ID</form:label></td>
									<td><form:input id="worstId" path="worstId"/></td>
							</tr>
	
					
							<tr>
									<td><input type="button" onclick="myVal();"  value="Submit"/> </td>
							</tr>
	
	
				</table>				
                       
	
		</form:form>


</body>


<script>
	function myVal()
	{
		debugger
		
		var ids=document.getElementById('worstId').value;
		var id=ids.trim();
		
		if(!/^[1-9]+$/.test(id)){
		    alert("Please only enter numeric characters only")
		    return false;
		  }
		
		
		document.regForm.submit();
		
		
	}
	
	</script>
</html>