<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"
  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
  crossorigin="anonymous"></script>    

<h1>Thank you your form has bee submitted</h1>
<div id="resultFinal">${result}</div>

<script>

$(document).ready(function(){
	
	var result=$('resultFinal').html();
	alert(result);
});

</script>