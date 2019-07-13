<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="  crossorigin="anonymous"></script>
  
  <div id="resultNgo">${result}</div>

<title>NGO Data</title>

<script>
$(document).ready(function(){
	
	var result=$('#resultNgo').html();
	console.log(result);
});
</script>

<html>
		<h1>Please select one</h1>
</body>


		
		<form:form method="GET" action="displayAll" name="myFormD" modelAttribute="ngo">
		<tr>
		<td><input type="submit"  value="Display All"/> </td>
		</tr>
		</form:form>
</body>
</html>

<html>
<body>
		
		
		<form:form method="GET" action="addNgo" name="myFormA" modelAttribute="ngo">
		<tr>
		<td><input type="submit"  value="Add"/> </td>
		</tr>
		</form:form>
</body>
</html>

<html>
<body>
		<form:form method="GET" action="deleteNgo" name="myFormD" modelAttribute="ngo">
		<tr>
		<td><input type="submit"  value="Delete"/> </td>
		</tr>
		</form:form>
</body>
</html>

<html>
<body>
		<form:form method="GET" action="updateNgo" name="myFormU" modelAttribute="ngo">
		<tr>
		<td><input type="submit"  value="Update"/> </td>
		</tr>
		</form:form>
</body>
</html>
