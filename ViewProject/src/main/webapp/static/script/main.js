$(document).ready(function(){
	
	$('#example').DataTable();
	
	console.log("main.js");
	$( "#birthDate" ).datepicker();

	try{
		var x = document.querySelectorAll(".navTab");
	
		for(var i=0; i<x.length; i++){
			$(x[i]).attr("class", "navTab");
		}
	}
	catch(err){}
		
	 var curRootPage = $('#curRootPage').val(); 
	 $('#'+curRootPage).attr('class', 'navTab active');
		
});
		

