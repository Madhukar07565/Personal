<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/hotel"%>
<div class="col_9 col_sm_12  mLN20 pL0 pR0 filterOpt"> <!--col_sm_6_69pc--> 
	<hotel:gridviewhotel/>
	<hotel:listviewhotel/>
	<hotel:googlemaphotel/>
</div>
<%-- <div class="gigantic pagination">
    		<a href="#" class="first" data-action="first">&laquo;</a>
    		<a href="#" class="previous" data-action="previous">&lsaquo;</a>
    		<input type="text" readonly="readonly" data-max-page="${result.totalPage}"/>
    		<a href="#" class="next" data-action="next">&rsaquo;</a>
    		<a href="#" class="last" data-action="last">&raquo;</a>
</div> --%>
<div id="show_hotel_panel_top" style="display:none;">
  <div class="show_holiday_inner clearfix">
    <div class="container">
      <div><a href="javascript:void(0);" onclick="closeComparePanel('show_hotel_panel_top')"><span class="close_thumbnail_grey m0"></span></a></div>
      <div class="row clearfix">
        <div class="col_12 col_sm_12 clearfix">
          <div class=" fS18 fcWht mB10">Select any three hotels to compare</div>
          <!--Compare 1-->
          <div id="search_results"> </div>
          <div class="fL mL20 mT25" id="compareButton" style="display:none;">
            <div class="primaryBtn"><a href="javascript:void(0);" onclick="ACC.hotel.compareViewList()">Compare</a></div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>