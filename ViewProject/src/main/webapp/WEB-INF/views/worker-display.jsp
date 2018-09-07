<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div id="resultDiv">${result}</div>

<script src="https://code.jquery.com/jquery-3.3.1.js" integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60=" crossorigin="anonymous"></script>

<script>
	$(document).ready(function(){
		var result = $('#resultDiv').html();
		alert(result);
	});
</script>