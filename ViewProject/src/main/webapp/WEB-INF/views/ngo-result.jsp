<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script
  src="https://code.jquery.com/jquery-3.3.1.js"  integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="  crossorigin="anonymous"></script>
  
  <div id="resultNgo">${result}</div>

<title>NGO Data</title>

<script>
$(document).ready(function(){
	
	var result=$('#resultNgo').html();
	alert(result);
});
</script>