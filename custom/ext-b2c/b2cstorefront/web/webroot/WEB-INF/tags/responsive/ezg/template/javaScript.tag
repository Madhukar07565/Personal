<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="cms" tagdir="/WEB-INF/tags/desktop/template/cms" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/ezg/template"%>
<template:javaScriptVariables/>
<script type="text/javascript" src="${ezgJsPath}/gridder.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/slick.min.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/typed.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/placeholders.jquery.min.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/jquery.jcarousel.min.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/jquery.multiple.select.js"></script> 
<!-- add by ming Jun 30th Start-->
<script type="text/javascript" src="${ezgJsPath}/jquery.sudoSlider.min.js"></script> 
<!-- add by ming Jun 30th End-->
<script type="text/javascript" src="${ezgJsPath}/jquery.lazyload.js"></script>
<script type="text/javascript" src="${ezgJsPath}/script.js"></script>
<script type="text/javascript" src="${ezgJsPath}/custom.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/chosen.jquery.js"></script>
<script type="text/javascript" src="${ezgJsPath}/acc.hotel.js"></script>
<script type="text/javascript" src="${ezgJsPath}/jquery.ui.touch-punch.min.js"></script> 
<script type="text/javascript" src="${ezgJsPath}/jquery.calendario.js"></script>
<script type="text/javascript" src="${ezgJsPath}/data_oneway.js"></script>
<script type="text/javascript" src="${ezgJsPath}/acc.account.js"></script>

<%-- customize js part --%>
<script type="text/javascript" src="${ezgJsPath}/vendor/lodash.min.js"></script>
<script type="text/javascript" src="${ezgJsPath}/custom/wallet.js"></script>
<script type="text/javascript" src="${ezgJsPath}/custom/traveller.js"></script>
<script type="text/javascript" src="${ezgJsPath}/custom/orderConfirm.js"></script>

<c:choose>
	<c:when test="${wro4jEnabled}">
	  	<script type="text/javascript" src="${contextPath}/wro/all_responsive.js"></script>
	  	<script type="text/javascript" src="${contextPath}/wro/addons_responsive.js"></script>
	</c:when>
	<c:otherwise>
		<%-- jquery --%>
		<%-- <script type="text/javascript" src="${commonResourcePath}/js/jquery-2.1.1.min.js"></script> --%>
		
		<%-- bootstrap --%>
		<%-- <script type="text/javascript" src="${commonResourcePath}/bootstrap/dist/js/bootstrap.min.js"></script> --%>
		
		<%-- plugins --%>
		<script type="text/javascript" src="${commonResourcePath}/js/enquire.min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/Imager.min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.blockUI-2.66.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.colorbox-min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.form.min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.hoverIntent.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.pstrength.custom-1.2.0.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.syncheight.custom.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.tabs.custom.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery-ui-1.11.2.min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.zoom.custom.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/owl.carousel.custom.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.tmpl-1.0.0pre.min.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/jquery.currencies.min.js"></script>
		
		<%-- Custom ACC JS --%>
		
		<script type="text/javascript" src="${commonResourcePath}/js/acc.address.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.autocomplete.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.carousel.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.cart.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.cartitem.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.checkout.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.checkoutaddress.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.checkoutsteps.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.cms.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.colorbox.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.common.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.forgottenpassword.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.global.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.hopdebug.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.imagegallery.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.langcurrencyselector.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.navigation.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.order.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.paginationsort.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.paymentDetails.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.pickupinstore.js"></script>
		
		<script type="text/javascript" src="${commonResourcePath}/js/acc.productDetail.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.quickview.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.ratingstars.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.refinements.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.silentorderpost.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.tabs.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.termsandconditions.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.track.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.storefinder.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.futurelink.js"></script>
		<script type="text/javascript" src="${commonResourcePath}/js/acc.productorderform.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/jquery.serialize-object.js"></script> 
		
		<script type="text/javascript" src="${ezgJsPath}/jquery.jqpagination.min.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.util.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.bookhotel.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.flight.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.travelerdetails.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.cartreview.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.termsandguidelines.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.uploaddocs.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.payment.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.minicart.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.parallax.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.ancillary.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.wifi.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.carparking.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.latecheckout.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.earlycheckin.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.breakfast.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.restaurant.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.spa.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.transfer.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.activity.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.equipment.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.specialrequest.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ancillary/ancillary.petstay.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/ajaxfileupload.js"></script> 
		<script type="text/javascript" src="${ezgJsPath}/acc.ezgautocomplete.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.countdown.js"></script>
		<script type="text/javascript" src="${ezgJsPath}/acc.paging.js"></script> 
		
		<script type="text/javascript" src="${commonResourcePath}/js/_autoload.js"></script>
		
		<%-- Cms Action JavaScript files --%>
		<%-- <c:forEach items="${cmsActionsJsFiles}" var="actionJsFile">
		    <script type="text/javascript" src="${commonResourcePath}/js/cms/${actionJsFile}"></script>
		</c:forEach> --%>
		
		<%-- AddOn JavaScript files --%>
		<%-- <c:forEach items="${addOnJavaScriptPaths}" var="addOnJavaScript">
		    <script type="text/javascript" src="${addOnJavaScript}"></script>
		</c:forEach> --%>
		
	</c:otherwise>
</c:choose>
<!-- <input autocomplete="off" id="autosuggest1" class="w100pcnt ui-autocomplete-input" placeholder="United Arab Emirates" type="text">
 -->  <script>
  $.widget( "custom.catcomplete", $.ui.autocomplete, {
    _create: function() {
      this._super();
      this.widget().menu( "option", "items", "> :not(.ui-autocomplete-category)" );
    },
    _renderMenu: function( ul, items ) {
			ul.addClass('w570');
		 ul.append( "<li class='ui-autocomplete-category clearfix' style='color:#000;background:#fff;border-bottom:1px solid #ddd;'><span class='fL'><span class='col_3 pL0'><input type='checkbox'><label>Railways</label></span><span class='col_3 pL0'><input type='checkbox'><label>Airports</label></span><span class='col_3 pL0'><input type='checkbox'><label>Area</label></span><span class='col_3 pL0'><input type='checkbox'><label>Landmark</label></span><span class='col_3 pL0 pR0'><input type='checkbox'><label>Ports</label></span></span>" );
		 
      var that = this,
        currentCategory = "";
      $.each( items, function( index, item ) {
	  
        var li;
        if ( item.category != currentCategory ) {
          ul.append( "<li class='ui-autocomplete-category' style='background:#fff;border-bottom:1px solid #ddd;border-top:1px solid #ddd;'>" + item.category + "</li>" );
          currentCategory = item.category;
        }
        li = that._renderItemData( ul, item );
        if ( item.category ) {
          li.attr( "aria-label", item.category + " : " + item.label );
        }
      });
    }
	
  });
  </script>
  <script>
  $('#searchCar').on('autocompletechange change', function () {

	  if(this.value == "Paris" || this.value == "paris")
		$("#newsearch").show();
		else
		$("#newsearch").hide();
  });
  
  $(function() {
    var data = [
      { label: "Paris", category: "" },
      { label: "Charles de Gaulle Airport", category: "Airports" },
      { label: "Orly Airport", category: "Airports" },
      { label: "Beauvais Tille Airport", category: "Airports" },
      { label: "Paris – Le Bourget Airport ", category: "Airports" },
      { label: "Chalons Vatry Airport", category: "Airports" },
      { label: "Gare D’Austerlitz", category: "Railway stations" },
      { label: "Gare de Bercy", category: "Railway stations" },
      { label: "Gare de Lyon", category: "Railway stations" },
      { label: "Gare Montparnasse ", category: "Railway stations" },
      { label: "Gare Saint Lazare", category: "Railway stations" },
      { label: "Bastille", category: "Area" },
      { label: "Montparnasse", category: "Area" },
      { label: "Belleville ", category: "Area" }
    ];
 
    $( "#searchCar" ).catcomplete({
      delay: 0,
      source: data,
	  width: 350
				
    });
  });
  </script>
  
<script type="text/javascript">

$('input.qwer').on('change', function () {
      if ($(this).is(':checked')) {
          $('.output').val($('.output').val() + $(this).val());
      } else {
          currentVal = $('.output').val();
          currentVal = currentVal.replace($('.qwer').val(), '');
          $('.output').val(currentVal);
      }
  });

  $('input.numbers').on('change', function () {
      if ($(this).is(':checked')) {
          $('.output').val($('.output').val() + $(this).val());
      } else {
          currentVal = $('.output').val();
          currentVal = currentVal.replace($('.numbers').val(), '');
          $('.output').val(currentVal);
      }
  });
</script>
<script>
$("#addFlight1").click(function() {
    if($("#addFlight1").is(':checked')) {
        $("#searchbus").text("Search Bus + Hotel");
    } else {
        $("#searchbus").text("Search");
    }
	
});
</script>
<script>
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