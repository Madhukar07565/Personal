	function getPagingData(url,jsonParamObj,method,callBack){
		method = method || 'post';
		jsonParamObj = jsonParamObj || {};
		var hiddenInputs = [];
		for (var propName in jsonParamObj) {
			hiddenInputs.push('<input name="#" type="hidden" />'.replace('#', propName)); 
		}
		var formExpression = '<form action="' + url + '" method="' + method +  '"></form>';
		$form = $(formExpression).append(hiddenInputs.join(''));
		for (var propName in jsonParamObj) {
			$form.find('input[name=' + propName + ']').val(JSON.stringify(jsonParamObj[propName]));
		}
		if (method == 'post') {
			hiddenInputs.push('<input name="CSRFToken" type="hidden" value="'+ACC.config.CSRFToken+'"/>'); 
		}
		$.ajax({
	           type: method,
	           url: url,
	           data: $form.serialize(),
	           success: function(data)
	           {
	        	   callBack(data);
	           }
		});
	}	
