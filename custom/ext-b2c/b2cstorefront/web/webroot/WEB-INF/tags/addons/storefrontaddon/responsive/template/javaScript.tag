<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<script type="text/javascript" src="${cnkJsPath}/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/custom.js"></script>
<script type="text/javascript" src="${cnkJsPath}/jquery.custom-scrollbar.js" ></script> 
<script type="text/javascript" src="${cnkJsPath}/jquery-ui.js"></script> 
<script type="text/javascript" src="${cnkJsPath}/placeholders.jquery.min.js"></script> 
<script type="text/javascript" src="${cnkJsPath}/gridder.js"></script>
<script type="text/javascript" src="${cnkJsPath}/jquery.sudoSlider.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/respond.js"></script>
<script type="text/javascript" src="${cnkJsPath}/modernizr.js"></script>
<script type="text/javascript" src="${cnkJsPath}/slick.min.js"></script>

<script type="text/javascript" src="${cnkJsPath}/b2c-js/parallax.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/chosen.jquery.js"></script> 
<script type="text/javascript" src="${cnkJsPath}/b2c-js/placeholders.jquery.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/jquery.jcarousel.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/jquery-ui.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/jquery.ui.touch-punch.min.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/jquery.multiple.select.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/jquery.calendario.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/data.js"></script>
<script type="text/javascript" src="${cnkJsPath}/b2c-js/script.js"></script>


<script type="text/javascript">
//handle multiway flights
flights = flightForm({
	container: 'flightsContainer'
});
flights.init();

var disableCoField = function(ele, items) {
    if (!ele) {
       return;
    }
    var fieldId = ele.attr('data-co-field');
    if (!fieldId) {
        return;
    }
    var fieldToDisable = $('#' + fieldId);
    if (fieldToDisable.length) {
        fieldToDisable.val('');
        if (ele.val().length < 1) {
            fieldToDisable.prop('disabled', true);
            return;
        }
        if (!items.length) {
            fieldToDisable.prop('disabled', true);
        } else {
            fieldToDisable.prop('disabled', false);
        }
    }
};
</script>
<script type="text/javascript">
    var config = {
      '.chosen-select'           : {},
      '.chosen-select-deselect'  : {allow_single_deselect:true},
      '.chosen-select-no-single' : {disable_search_threshold:10},
      '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
      '.chosen-select-width'     : {width:"95%"}
    }
    for (var selector in config) {
      $(selector).chosen(config[selector]);
    }
  </script>
  
<script type="text/javascript">
    function Show_Div(Div_id) {
        if (false == $(Div_id).is(':visible')) {
            $(Div_id).show(250);
        }
        else {
            $(Div_id).hide(250);
        }
    }
</script>