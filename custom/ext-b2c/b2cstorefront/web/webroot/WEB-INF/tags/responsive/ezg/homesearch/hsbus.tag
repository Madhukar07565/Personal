<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab1" style="display:none;">
		<div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
             <ul class="searchFlightWay clearfix">
              <li>
                <input type="radio" onclick="searchFlight2('oneway2'), showToggler()" id="oneway2" name="radio1"/>
                <label for="oneway">One way</label>
              </li>
              <li>
                <input type="radio" onclick="searchFlight2('return2'), showToggler()" checked="checked" id="return2" name="radio1"/>
                <label for="return">Return</label>
              </li>
            </ul>
		     <ul class="searchFlight clearfix">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest1"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest2" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
			  
              <li class="next" id="returnFlightContainer2">
                <label>Return</label>
                <input type="text" id="returnDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly" />
              </li>
              <li class="next">
                <label>Bus type</label>
               
				 <select class="w100pcnt" multiple id="multipleBusType">
                        <option value="AC">AC</option>
                        <option value="Non AC">Non AC</option>
                        <option value="Sleeper">Sleeper</option>
                 </select>
                
              </li>
              <li class="w200imp">
			   <label>&nbsp;</label> 
				<input type="checkbox" />
                <label>Volvo/ Mercedes only</label>  
              </li>
            </ul>
           
              <div id="globalSrcToggle"></div>
              <br class="cB" />
              <a href="#" class=" button button-primary fR" id="searchbus">Search</a>
          </form>
        </div>
        <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>