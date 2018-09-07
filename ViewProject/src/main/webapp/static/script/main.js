$(document).ready(function(){
	 $( "#birthDate" ).datepicker();
	 
	 try{
		var x = document.querySelectorAll(".navTab");
			
		for(var i=0; i<x.length; i++){
			$(x[i]).attr("class", "navTab");
		}
	 }
	 catch(err){
		 
	 }
	 
	 var curRootPage = $('#curRootPage').val(); 
	 $('#'+curRootPage).attr('class', 'navTab active');
	 
});

function makeAtcive(obj){
	console.log("asif new changes");
	console.log("d: "+$('#birthDate').val());
/*	var x = document.querySelectorAll(".navTab");
	
	for(var i=0; i<x.length; i++){
		$(x[i]).attr("class", "navTab");
	}
    
	$(obj).attr("class", "navTab active");*/
}
