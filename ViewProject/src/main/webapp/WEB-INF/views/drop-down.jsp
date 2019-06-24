<html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="./common/navigation.jsp" /> 

	
	
    	<div class="page-header text-center">
			<h1>Dropdown</h1>
		</div>
	
		
	<div class='container'>
    	<div class='row'>
    		<div class="col-12">
				<table class="display" style="width:100%">
			        <thead>
			            <tr>
			                <th>Hospital ID</th>
			                <th>Doctor ID</th>
			                <th>Patient ID</th>
			            </tr>
			        </thead>
			        <tbody>
				        	<tr>
				                <td>
					                <select name="hospitalList" onchange="getDoctorlist(this);">
					                	<option value='-1'>Please Select Hospital</option>	
						                <c:forEach var="hospital" items="${hospitalList}">
											<option value='<c:out value="${hospital.id}"/>'>
												<c:out value="${hospital.name}"/>
											</option>
										</c:forEach>
									</select>
				                </td>
				                <td>
				                <select id="doctorList" onchange="getPatientlist(this);">
								</select>
				                </td>
				                <td>
				                <select id="patientList">
								</select>
				                </td>
				            </tr>
			        </tbody>
			    </table>
			</div>
		</div>
	</div>

</body>

<script>

function getDoctorlist(obj){
	
	$('#doctorList').empty();
	if(parseInt(obj.value)==-1){
		return false;
	}
	
	
	var urlVar = '/view/dropdown/getAllDoctor/'+obj.value;
	
	$.ajax({
        url : urlVar,
        success : function(items) {

       	$('#doctorList').append($('<option>',
    		{
    		    value: -1,
    		    text : 'Please Select'
		})); 
       	
        for(var k in items){
       	    $('#doctorList').append($('<option>',
      			 {
      			     value: items[k].id,
      			     text : items[k].fName +' '+items[k].lName
  			    })); 
          }
        }
    });
	
}

function getPatientlist(obj){
	$('#patientList').empty();
	if(parseInt(obj.value)==-1){
		return false;
	}
	
	
	var urlVar = '/view/dropdown/getAllPatient/'+obj.value;
	
	$.ajax({
        url : urlVar,
        success : function(items) {

       	$('#patientList').append($('<option>',
    		{
    		    value: -1,
    		    text : 'Please Select'
		})); 
       	
        for(var k in items){
       	    $('#patientList').append($('<option>',
      			 {
      			     value: items[k].id,
      			     text : items[k].fName +' '+items[k].lName
  			    })); 
          }
        }
    });
}


</script>
</html>