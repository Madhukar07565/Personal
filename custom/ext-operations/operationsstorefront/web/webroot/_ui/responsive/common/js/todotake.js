	$(document).ready(function() {
		 var editMode = ACC.config.editMode;
		 var viewMode =	ACC.config.viewMode;
		 
		 if ($('#clientType option:selected').text() == "B2B"){
			 if(editMode != 'true' && viewMode !='true'){
			    $('#clientCategory').removeAttr("disabled");
	            $('#clientSubCategory').removeAttr("disabled");
	        }
		 }
	         else { 
	        	 $("#clientCategory").val("Select");
				 $("#clientSubCategory").val("Select");
	        	 $('#clientCategory').attr("disabled", "disabled");
		         $('#clientSubCategory').attr("disabled", "disabled");
	         }
	
		 
		$("#myTask").click(function() {
			$("#assignedToMeInput").val(true);
			$("#assignedByMeInput").val(true);
			$("#WorkflowActionSearchForm").submit();
		});
		$("#assignedByMe").click(function() {
			$("#assignedToMeInput").val(false);
			$("#assignedByMeInput").val(true);
			$("#WorkflowActionSearchForm").submit();
		});
		$("#assignedToMe").click(function() {
			$("#assignedToMeInput").val(true);
			$("#assignedByMeInput").val(false);
			$("#WorkflowActionSearchForm").submit();
		});
		$(".snapShotFormRadio").click(function() {
			$("#snapShotFromID").submit();
		});
		$(".doToPaginationTag").click(function(e) {
			e.preventDefault();
			$('#WorkflowActionSearchForm').attr('action', $(this).attr("href")).submit();
		});
		$("#reAssignSubmit").click(function(e) {
			var tasks = "";			
			$('input[name="assignCheckbox"]:checked').each(function() {
				if(tasks=="")
					{
					tasks = this.value;
					}
				else{
					tasks = tasks +","+this.value;
					}
				});
			  $("#reAssignTasksHidden").val(tasks);
		});
		$("#toDoPaginationPazeSizeSelect").change(function(e) {
			$("#WorkflowActionSearchForm").submit();
		});
		$("#toDoCreateOrderInput").focusout(function(e) {
			var order = $("#toDoCreateOrderInput").val();
			$.ajax({url: ACC.config.contextPath + "/todo/toDoOrder/"+order, success: function(result){
		        console.log(result['products']);
		        var select = $('#toDoTaskProductSelectInput');
		        select.empty();
		        select.append("<option value=''>Select</option>");
		        $.each(result['products'], function(idx, obj) {
		        $('#toDoTaskProductSelectInput').append($('<option>', {
		            value: idx,
		            text: obj
		        }));
		        });
		    }});

		});
		
		 $("#clientType").change(function (e) {
			 if ($('#clientType option:selected').text() == "B2B"){
				 
		            $('#clientCategory').removeAttr("disabled");
		            $('#clientSubCategory').removeAttr("disabled");
		        }
		         else { 
		        	 
	        		$("#clientCategory").val($("#clientCategory option:first").val());
				 	$("#clientSubCategory").val($("#clientSubCategory option:first").val());

		        	 $('#clientCategory').attr("disabled", "disabled");
			         $('#clientSubCategory').attr("disabled", "disabled");
		         }
		 });
		 $(".taskChildRefrence").click(function(e) {
				var currentTD = this;
				$.ajax({url: ACC.config.contextPath +"/todo/viewSubtasks/"+this.id.split("_")[1], success: function(result){
			        $.each(result['tasks'], function(obj) {
					$(currentTD).closest( "tr" ).after(result['tasks'][obj]); 
			        });
			    }});
				$(currentTD).addClass('disabled');
			});
		 $("#approvalFormApprovalButton").click(function() {
			 $('#approvalFormId').attr('action', ACC.config.contextPath+"/todo/approval/approved").submit();
			});
		 $("#approvalFormRejectButton").click(function() {
			 $('#approvalFormId').attr('action', ACC.config.contextPath+"/todo/approval/reject").submit();
			});
		 
		 $("#cancelButton").click(function(e) {			 
			if(editMode=='true'){
			 		if (window.confirm("Any unsaved data will be lost. Click ok to continue.") == false) {
				 e.preventDefault();		   
			    }
		 	}
		});
		 
		 $( "#todoeditviewform" ).submit(function( event ) {		 
				$(this).find(':input').prop('disabled', false);			   
			});
		});