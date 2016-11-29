<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab6" style="display:none;">
		<div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
            
            <!-- Row 1 -->
            <ul class="clearfix">
              <li class="col_2 pL0">
               
                <input type="radio" name="radio1" id="buying" onclick="buyForex();" class="w100pcnt" /> <label>Buying</label>
              </li>
              <li class="col_2 fL">
               
                <input type="radio" name="radio1" id="selling" class="w100pcnt" onclick="selForex();" checked="checked" /> <label>Selling</label>
              </li>
			  </ul>
			    <ul class="col_12 clearfix pL0 mT20">
			  <li class="col_4">
                  <label>Purpose of Travel</label>
                  <select class="w100pcnt">
                    <option value="">Select</option>
                    <option value="suv">Select</option>
                    <option value="van">Select</option>
                  </select>
                </li>
			  <li class="col_2 pL0">
                  <label>Product</label>
                  <select class="w100pcnt">
                    <option value="">Cash</option>
                    <option value="suv">Cash</option>
                    <option value="van">Cash</option>
                  </select>
                </li>
				<li class="col_2 pL0">
                  <label>Currency</label>
                  <select class="w100pcnt">
                    <option value="">U S Dollar</option>
                    <option value="suv">Rupee</option>
                    <option value="van">Dinar</option>
                  </select>
                </li>
				 <li class="col_2 pL0">
				  <label>Amount</label>
                    <input type="text" placeholder="$"  class="w100pcnt" id="forexinpt1" />
                   
                  </li>
				  <li id="multiwayAdd" onClick="showMultiwayOptionsForex(), showToggler();"><span class="addIcon fL mT20"></span> <span class="fL mT30 valign cursor clearfix ">Add more</span></li>
				</ul>
				<ul class="col_12 clearfix pL0 mT5"> 
				<li class="pL0 col_4"> &nbsp; </li> 
				<li class="pL0 col_2"> &nbsp; </li> 
				<li class="pL0 col_2"> <div class="detailContr1"></div> 
				<div class="detailContr_inner tC clearfix"> Rate: Rs. 64.56  </div> </li> 
				<li class="pL0 forexview1_amt dN col_2"> <div class="detailContr1"></div> 
				<div class="detailContr_inner tC clearfix"> Amount: <span id="amtshow">1, 04,000</span>  </div> </li> 
				</ul> 
				
				 <div id="globalSrcToggle">
				<ul class="col_12 clearfix pL0 mT20 dN" id="multiwaySearchParametersForex1">
				 <li class="col_4 pL0"></li>
			   <li class="col_2 pL0">
                  <label>Product</label>
                  <select class="w100pcnt">
                    <option value="">Cash</option>
                    <option value="suv">Cash</option>
                    <option value="van">Cash</option>
                  </select>
                </li>
				<li class="col_2 pL0">
                  <label>Currency</label>
                  <select class="w100pcnt">
                    <option value="">U S Dollar</option>
                    <option value="suv">Rupee</option>
                    <option value="van">Dinar</option>
                  </select>
                </li>
				 <li class="col_2 pL0">
				  <label>Amount</label>
                    <input type="text" placeholder="$"  class="w100pcnt" />
                   
                  </li>
				  <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsForex(1), showToggler()" class="close_multicity_panel fL mL20 mT5"></div>
                </li>
				</ul>
				<ul class="col_12 clearfix pL0 mT20 dN" id="multiwaySearchParametersForex2">
				<li class="pL0 col_4"></li>
			   <li class="col_2 pL0">
                  <label>Product</label>
                  <select class="w100pcnt">
                    <option value="">Cash</option>
                    <option value="suv">Cash</option>
                    <option value="van">Cash</option>
                  </select>
                </li>
				<li class="col_2 pL0">
                  <label>Currency</label>
                  <select class="w100pcnt">
                    <option value="">U S Dollar</option>
                    <option value="suv">Rupee</option>
                    <option value="van">Dinar</option>
                  </select>
                </li>
				 <li class="col_2 pL0">
				  <label>Amount</label>
                    <input type="text" placeholder="$"  class="w100pcnt" />
                   
                  </li>
				  <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsForex(2), showToggler()" class="close_multicity_panel fL mL20 mT5"></div>
                </li>
				</ul>
				<ul class="col_12 clearfix pL0 mT20 dN" id="multiwaySearchParametersForex3">
				<li class="pL0 col_4"></li>
			   <li class="col_2 pL0">
                  <label>Product</label>
                  <select class="w100pcnt">
                    <option value="">Cash</option>
                    <option value="suv">Cash</option>
                    <option value="van">Cash</option>
                  </select>
                </li>
				<li class="col_2 pL0">
                  <label>Currency</label>
                  <select class="w100pcnt">
                    <option value="">U S Dollar</option>
                    <option value="suv">Rupee</option>
                    <option value="van">Dinar</option>
                  </select>
                </li>
				 <li class="col_2 pL0">
				  <label>Amount</label>
                    <input type="text" placeholder="$"  class="w100pcnt"/>
                  </li>
				  <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptionsForex(3), showToggler()" class="close_multicity_panel fL mL20 mT5"></div>
                </li>
				</ul>
				
				 <ul class="col_12 clearfix mT20">
			  <li class="col_3 pL0 clearfix">
                  <label>Pickup location</label>
                  <select class="w100pcnt">
                    <option value="">Mumbai</option>
                    <option value="del">Delhi</option>
                    <option value="goa">Goa</option>
                  </select>
                </li>
				<li class="col_3 pL0">
				  <label>Mobile Number</label>
                    <input type="text" placeholder="Mobile Number" class="w100pcnt" />
                  </li>
				  <li class="col_4 pL0">
				  <label>Email Address</label>
                    <input type="text" placeholder="Email Address" class="w100pcnt" />
                  </li>
				</ul>
             <a href="javascript:void(0);" class="button button-primary fR mT20" id="changetext">Sell Forex</a></div>
          </form>
        </div>
          <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>
	