<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<div class="container tabContent clearfix NavNewTab3" style="display:none;">
		 <div class="globalSearchBG clearfix">
        <div class="clearfix" id="mainSearchWizard">
          <form method="post" action="/">
		  
            <ul class="searchFlightWay mT10 clearfix fL">
              <li>
              <input type="radio" onclick="searchEurail('ticket')" checked="checked" id="ticket" name="radio1"/>
              <label for="ticket">Tickets</label>
            </li>
            <li>
              <input type="radio" onclick="searchEurail('pass')" id="pass" name="radio1"/>
              <label for="pass">Pass</label>
            </li>
            <li>
              <input type="radio" onclick="searchEurail('reservation')" id="reservation" name="radio1"/>
              <label for="reservation">Reservation (I have a pass and want to reserve a seat/check trains)</label>
            </li>
            </ul>
			<p class="fR mT10"> <a href="javascript:void(0);" onclick="popupwin('Learn', 'learninner', 'fade')">Learn more</a></p>
            <div class="eurailSrcLft col_sm_12">
            <!-- Eurail ticket container--> 
            <div id="eurailTicketContainer">
            <ul class="searchFlight clearfix">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail1"  class=" w100pcnt" placeholder="London"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail2" class=" w100pcnt" placeholder="Paris"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail1"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li>
                  <label>&nbsp;</label>
                  <select class="w70pcnt">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                </li>
              
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailTicketCity3">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail3"  class=" w100pcnt" placeholder="London"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail4" class=" w100pcnt" placeholder="Paris"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail2"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li class=" w145">
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideTicketEurailCity(3)" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailTicketCity4">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail5"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail6" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail3"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li class=" w145">
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideTicketEurailCity(4)" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailTicketCity5">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail7"  class=" w100pcnt" placeholder="London"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail8" class=" w100pcnt" placeholder="Paris"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li class=" w145">
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideTicketEurailCity(5)" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
			
             <div class="clearfix mB15 mT10 fR mR50" onClick="addCityTicketEurail()"> 
			 <span class="addIcon fL"></span> 
			 <span class="fL mT10 cursor">Add city</span> </div>
			 <ul class="searchFlight clearfix mT40" id="eurailTicketCity6">
            	
              <li class="number">
                <label>Adult</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('ChildNumber1')">-</span> <span class="control innerTxtControl" id="ChildNumber1">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('ChildNumber1')">+</span> </div><span class="fS11 fL w100pcnt">26 - 59 yrs</span>
              </li>
			  <li class="number"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('Child_1')">-</span> <span class="control innerTxtControl" id="Child_1">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('Child_1')">+</span> </div><span class="fS11 fL w100pcnt"> 0 - 12 yrs</span></li>
              <li class="number">
                <label>Youth</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="infantCountDec('InfantNumber_1')">-</span> <span class="control innerTxtControl" id="InfantNumber_1">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="infantCountInc('InfantNumber_1')">+</span> </div><span class="fS11 fL w100pcnt">12 - 26 yrs</span>
              </li>
			  <li class="number">
                <label>Senior</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('AdultNumber_1')">-</span> <span class="control innerTxtControl" id="AdultNumber_1">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('AdultNumber_1')">+</span> </div><span class="fS11 fL w100pcnt">59 + yrs</span>
              </li>
              </ul>
		  <div class="flightOption w100pcnt">
                <p class="multipleOption mB10"><a href="javascript:void(0)" id="moreRailOpton1" onclick="showMoreInfoRail('moreRailOpton1','railOptionsSearchPanel','plusMinusRail1'), showToggler()"><span id="plusMinusRail1">+</span> Rail options</a> (class, stops, refunds) </p>
                <div class="dN" id="railOptionsSearchPanel">
                  <ul class="col_12 pL0 pR0 clearfix mT10">
                    <li class="col_2_half pL0">
                      <label>Class</label>
                  <select class="w100pcnt">
                    <option value="">Select</option>
                    <option value="Economy">Economy</option>
                    <option value="Business">Business</option>
                  </select>
                    </li>
                   
					<li class="col_3_half mT35"> <input id="directFlight" type="checkbox">
                    <label for="directFlight">Show me direct trains only</label></li>
					<li class="col_3_half mT35"><input id="refundFlight" type="checkbox">
                    <label for="refundFlight">Show me refundable tickets only</label></li>
                  </ul>
                </div>
              </div>
		  
             </div>
             
             <!-- Eurail pass container-->
             <div id="eurailPassContainer" style="display:none">
            <ul class="searchFlight clearfix">
              <li class="hotelDestination">
                <label>Country</label>
                <input type="text" id="autosuggest_eurail9"  class=" w100pcnt" placeholder="London"/>
              </li>
              
              <li>
                  <label>No of days </label>
                  <select class="w50pcnt">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                  </select>
                </li>
              
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailPassCity3">
            	<li class="hotelDestination">
                <label>Country</label>
                <input type="text" id="autosuggest_eurail10"  class=" w100pcnt" placeholder="London"/>
              </li>
              
              <li>
                  <span class="fL">
                  <label>No of days</label>
                  <select class="w74">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                  </select>
                  </span>
                  <span onclick="hidePassEurailCity(3)" class="close_multicity_panel fR"></span>
                </li>
              
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailPassCity4">
            	<li class="hotelDestination">
                <label>Country</label>
                <input type="text" id="autosuggest_eurail11"  class=" w100pcnt" placeholder="London"/>
              </li>
              
              <li>
                  <span class="fL">
                  <label>No of days</label>
                  <select class="w74">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                  </select>
                  </span>
                  <span onclick="hidePassEurailCity(4)" class="close_multicity_panel fR"></span>
                </li>
              
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailPassCity5">
            	<li class="hotelDestination">
                <label>Country</label>
                <input type="text" id="autosuggest_eurail12"  class=" w100pcnt" placeholder="London"/>
              </li>
              
              <li>
                  <span class="fL">
                  <label>No of days</label>
                  <select class="w74">
                    <option>1</option>
                    <option>2</option>
                    <option>3</option>
                    <option>4</option>
                    <option>5</option>
                    <option>6</option>
                    <option>7</option>
                    <option>8</option>
                    <option>9</option>
                    <option>10</option>
                  </select>
                  </span>
                  <span onclick="hidePassEurailCity(5)" class="close_multicity_panel fR"></span>
                </li>
              
                
            </ul>
             <div class="clearfix mB15 mT10 fR mR44pcnt" onClick="addCityPassEurail();"> <span class="addIcon fL"></span> <span class="fL mT10 cursor">Add country</span> </div>
			 <ul class="searchFlight clearfix mT10_pcnt" id="eurailPassCity6">
            	
              <li class="number">
                <label>Adult</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('ChildNumber2')">-</span> <span class="control innerTxtControl" id="ChildNumber2">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('ChildNumber2')">+</span> </div><span class="fS11 fL w100pcnt">26 - 59 yrs</span>
              </li>
			  <li class="number"> <label>Child</label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('Child_2')">-</span> <span class="control innerTxtControl" id="Child_2">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('Child_2')">+</span> </div><span class="fS11 fL w100pcnt"> 0 - 12 yrs</span></li>
              <li class="number">
                <label>Youth </label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="infantCountDec('InfantNumber_2')">-</span> <span class="control innerTxtControl" id="InfantNumber_2">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="infantCountInc('InfantNumber_2')">+</span> </div><span class="fS11 fL w100pcnt">12 - 26 yrs</span>
              </li>
			  <li class="number">
                <label>Senior</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('AdultNumber_2')">-</span> <span class="control innerTxtControl" id="AdultNumber_2">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('AdultNumber_2')">+</span> </div><span class="fS11 fL w100pcnt">59+ yrs</span>
              </li>
              </ul>
             </div>
             
             <!-- eurail reservation container -->
             <div id="eurailReserveContainer" style="display:none">
             <ul class="searchFlight clearfix">
              <li  class="hotelDestination">
                <label>Select pass</label>
                <input type="text" id="autosuggest_eurail13"  class=" w100pcnt" placeholder="Algeria"/>
              </li>
              <li class="w50pcnt mT30">
              <span class="fL mR20">
                <input type="radio" checked="checked" id="economy" name="radio2"/>
              <label for="economy">Economy</label>
              </span>
              <span class="fL mR20">
                <input type="radio" checked="checked" id="comfort" name="radio2"/>
              <label for="comfort">Comfort</label>
              </span>
              <span class="fL">
                <input type="radio" checked="checked" id="premiere" name="radio2"/>
              <label for="premiere">Premiere</label>
              </span>
              </li>
              
              
            </ul>
            <ul class="searchFlight clearfix">
              <li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail14"  class=" w100pcnt" placeholder="London"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail15" class=" w100pcnt" placeholder="Paris"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail5"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li>
                  <label>&nbsp;</label>
                  <select class="w70pcnt">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                </li>
              
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailReserveCity3">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail16"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail17" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail6"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li>
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideReserveEurailCity(3), showToggler()" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailReserveCity4">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail18"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail19" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail7"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li>
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideReserveEurailCity(4), showToggler()" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
            <ul class="searchFlight clearfix dN" id="eurailReserveCity5">
            	<li>
                <label>Starting From</label>
                <input type="text" id="autosuggest_eurail20"  class=" w100pcnt" placeholder="Mumbai"/>
              </li>
              <li class="next">
                <label>Going to</label>
                <input type="text" id="autosuggest_eurail21" class=" w100pcnt" placeholder="Delhi"/>
              </li>
              <li>
                <label>Departure</label>
                <input type="text" id="departureDate_eurail8"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
              </li>
              <li>
                 <span class="fL">
                  <label>&nbsp;</label>
                  <select class="w102">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                  </span>
                  <span onclick="hideReserveEurailCity(5), showToggler()" class="close_multicity_panel fR"></span>
                </li>
                
            </ul>
             <div class="clearfix mB15 mT10"><span class="fR mR15pcnt" onClick="addCityReserveEurail(), showToggler();"> <span class="addIcon fL"></span> <span class="fL mT10 cursor">Add city</span> </div>
			  <ul class="searchFlight clearfix" id="eurailReserveCity6">
            	
              <li class="number">
                <label>Adult</label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('ChildNumber')">-</span> <span class="control innerTxtControl" id="ChildNumber">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('ChildNumber')">+</span> </div><span class="fS11 fL w100pcnt">26 - 59 yrs</span>
              </li>
			  <li class="number"> <label>Child </label> <div class="passengerNum1 fL"> <span class="control addMinControl minusControl" onclick="cCountDec('Child')">-</span> <span class="control innerTxtControl" id="Child">0</span> <span class="control addMinControl plusControl" onclick="cCountInc('Child')">+</span> </div><span class="fS11 fL w100pcnt">0 - 12 yrs</span></li>
              <li class="number">
                <label>Youth </label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="infantCountDec('InfantNumber')">-</span> <span class="control innerTxtControl" id="InfantNumber">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="infantCountInc('InfantNumber')">+</span> </div><span class="fS11 fL w100pcnt">12 - 26 yrs</span>
              </li>
			  <li class="number">
                <label>Senior </label>
                <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('AdultNumber')">-</span> <span class="control innerTxtControl" id="AdultNumber">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('AdultNumber')">+</span> </div><span class="fS11 fL w100pcnt">59 + yrs</span>
              </li>
              </ul>
            </span></div>
			
            </div>
            
            
            
            
            <!-- Hidden multiway panels -->
            
            <div id="globalSrcToggle">
              <ul class="searchFlight clearfix  dN pT10" id="multiwaySearchParameters3">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest7"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next">
                  <label>Going to</label>
                  <input type="text" id="autosuggest8" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate3"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
                </li>
                <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptions(3)" class="close_multicity_panel fR"></div>
                </li>
              </ul>
             
              <ul class="searchFlight clearfix dN pT10" id="multiwaySearchParameters4">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest9"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next">
                  <label>Going to</label>
                  <input type="text" id="autosuggest10" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate4"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
                </li>
                <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptions(4)" class="close_multicity_panel fR"></div>
                </li>
              </ul>
              <ul class="searchFlight clearfix dN pT10" id="multiwaySearchParameters5">
                <li>
                  <label>Starting From</label>
                  <input type="text" id="autosuggest11"  class=" w100pcnt" placeholder="Mumbai"/>
                </li>
                <li class="next">
                  <label>Going to</label>
                  <input type="text" id="autosuggest12" class=" w100pcnt" placeholder="Delhi"/>
                </li>
                <li>
                  <label>Departure</label>
                  <input type="text" id="departureDate5"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
                </li>
                <li class="closeMultipleWay">
                  <div onclick="hideMultiwayOptions(5)" class="close_multicity_panel fR"></div>
                </li>
              </ul>
              <div class="clearfix  dN mB15 mT10" id="multiwayAdd" onClick="showMultiwayOptions();"> <span class="addIcon fL"></span> <span class="fL mT10 cursor">Add city</span> </div>
              
              <!-- need to hide -->
              <ul class="searchFlight clearfix dN pT10" id="flightSearchPanel">
                <!--searchFlight-->
                <li class="title">Hotels</li>
                <li class="next hotelDestination" id="hotelDestination">
                  <label>Where do you want to go?</label>
                  <input type="text" id="destinationHotelSearch"  class="w100pcnt" placeholder="City, area, landmark or hotel name"/>
                </li>
                <li>
                  <label>Check in</label>
                  <input type="text" id="checkinDate"  class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
                </li>
                <li class="next">
                  <label>Check out</label>
                  <input type="text" id="checkoutDate"  class=" w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="readonly"/>
                </li>
                <li class="number">
                  <label>Rooms</label>
                  <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="roomCountDec('roomCount')">-</span> <span class="control innerTxtControl" id="roomCount">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="roomCountInc('roomCount')">+</span> </div>
                </li>
                <li class="number">
                  <label>Adult</label>
                  <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="adultCountDec('hotelAdultsCount')">-</span> <span class="control innerTxtControl" id="hotelAdultsCount">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="adultCountInc('hotelAdultsCount')">+</span> </div>
                </li>
                <li class="number">
                  <label>Child (2 - 12 yrs)</label>
                  <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="childCountDec('hotelChildCount')">-</span> <span class="control innerTxtControl" id="hotelChildCount">0</span> <span class="control addMinControl plusControl cursor fW600" onclick="childCountInc('hotelChildCount')">+</span> </div>
                </li>
              </ul>
              <div class="cB"></div>
              
              <!-- need to hide -->
              <ul class="searchFlight clearfix  pT10 dN" id="carSearchPanel">
                <li class="title">Car</li>
                <li>
                  <label>Pick up point</label>
                  <select class="w100pcnt">
                    <option value="">Select</option>
                    <option value="Location">Location</option>
                    <option value="Hotel">Hotel</option>
                  </select>
                </li>
                <li class="next">
                  <label>Drop off point</label>
                  <select class="w100pcnt">
                    <option value="">Select</option>
                    <option value="Location">Location</option>
                    <option value="Hotel">Hotel</option>
                  </select>
                </li>
                <li id="pickUpDateHolder">
                  <label>Pick up date</label>
                  <input type="text" placeholder="dd/mm/yyyy" id="pickUpDate" class="dateField w100pcnt" readonly="readonly" />
                </li>
                <li id="dropOffDateHolder" class="next">
                  <label>Drop off date</label>
                  <input type="text" placeholder="dd/mm/yyyy" id="dropOffDate" class="dateField w100pcnt" readonly="readonly" />
                </li>
                <li>
                  <label>Pick up time</label>
                  <select class="w100pcnt">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                </li>
                <li class="next">
                  <label>Drop off time</label>
                  <select class="w100pcnt">
                    <option>12:00 a.m.</option>
                    <option>12:15 a.m.</option>
                    <option>12:30 a.m.</option>
                    <option>12:45 a.m.</option>
                    <option>1:00 a.m.</option>
                    <option>1:15 a.m.</option>
                    <option>1:30 a.m.</option>
                    <option>1:45 a.m.</option>
                    <option>2:00 a.m.</option>
                    <option>2:15 a.m.</option>
                    <option>2:30 a.m.</option>
                    <option>2:45 a.m.</option>
                    <option>3:00 a.m.</option>
                    <option>3:15 a.m.</option>
                    <option>3:30 a.m.</option>
                    <option>3:45 a.m.</option>
                    <option>4:00 a.m.</option>
                    <option>4:15 a.m.</option>
                    <option>4:30 a.m.</option>
                    <option>4:45 a.m.</option>
                    <option>5:00 a.m.</option>
                    <option>5:15 a.m.</option>
                    <option>5:30 a.m.</option>
                    <option>5:45 a.m.</option>
                    <option>6:00 a.m.</option>
                    <option>6:15 a.m.</option>
                    <option>6:30 a.m.</option>
                    <option>6:45 a.m.</option>
                    <option>7:00 a.m.</option>
                    <option>7:15 a.m.</option>
                    <option>7:30 a.m.</option>
                    <option>7:45 a.m.</option>
                    <option>8:00 a.m.</option>
                    <option>8:15 a.m.</option>
                    <option>8:30 a.m.</option>
                    <option>8:45 a.m.</option>
                    <option>9:00 a.m.</option>
                    <option>9:15 a.m.</option>
                    <option>9:30 a.m.</option>
                    <option>9:45 a.m.</option>
                    <option>10:00 a.m.</option>
                    <option>10:15 a.m.</option>
                    <option>10:30 a.m.</option>
                    <option>10:45 a.m.</option>
                    <option>11:00 a.m.</option>
                    <option>11:15 a.m.</option>
                    <option>11:30 a.m.</option>
                    <option>11:45 a.m.</option>
                    <option>12:00 p.m.</option>
                    <option>12:15 p.m.</option>
                    <option>12:30 p.m.</option>
                    <option>12:45 p.m.</option>
                    <option>1:00 p.m.</option>
                    <option>1:15 p.m.</option>
                    <option>1:30 p.m.</option>
                    <option>1:45 p.m.</option>
                    <option>2:00 p.m.</option>
                    <option>2:15 p.m.</option>
                    <option>2:30 p.m.</option>
                    <option>2:45 p.m.</option>
                    <option>3:00 p.m.</option>
                    <option>3:15 p.m.</option>
                    <option>3:30 p.m.</option>
                    <option>3:45 p.m.</option>
                    <option>4:00 p.m.</option>
                    <option>4:15 p.m.</option>
                    <option>4:30 p.m.</option>
                    <option>4:45 p.m.</option>
                    <option>5:00 p.m.</option>
                    <option>5:15 p.m.</option>
                    <option>5:30 p.m.</option>
                    <option>5:45 p.m.</option>
                    <option>6:00 p.m.</option>
                    <option>6:15 p.m.</option>
                    <option>6:30 p.m.</option>
                    <option>6:45 p.m.</option>
                    <option>7:00 p.m.</option>
                    <option>7:15 p.m.</option>
                    <option>7:30 p.m.</option>
                    <option>7:45 p.m.</option>
                    <option>8:00 p.m.</option>
                    <option>8:15 p.m.</option>
                    <option>8:30 p.m.</option>
                    <option>8:45 p.m.</option>
                    <option>9:00 p.m.</option>
                    <option>9:15 p.m.</option>
                    <option>9:30 p.m.</option>
                    <option>9:45 p.m.</option>
                    <option>10:00 p.m.</option>
                    <option>10:15 p.m.</option>
                    <option>10:30 p.m.</option>
                    <option>10:45 p.m.</option>
                    <option>11:00 p.m.</option>
                    <option>11:15 p.m.</option>
                    <option>11:30 p.m.</option>
                    <option>11:45 p.m.</option>
                  </select>
                </li>
                <li id="carType">
                  <label>Car type</label>
                  <select class="w100pcnt">
                    <option value="">Select</option>
                    <option value="suv">SUV</option>
                    <option value="van">Van</option>
                  </select>
                </li>
                <li class="number" id="noOfCars">
                  <label>No of cars</label>
                  <div class="adderOuter"> <span class="control addMinControl minusControl cursor fW600" onclick="carCountDec('carCount')">-</span> <span class="control innerTxtControl" id="carCount">1</span> <span class="control addMinControl plusControl cursor fW600" onclick="carCountInc('carCount')">+</span> </div>
                </li>
              </ul>
              <div class="cB"></div>
              
              <!-- need to hide -->
           
              <br class="cB" />
              <a href="flight_srp_oneway.html" class=" button button-primary fR">Search</a> </div>
          </form>
        </div>
        <div class="globalSrcExpContr dN"> <a href="javascript:void(0);"><span class="globalSrcShow sel">Hide</span></a> </div>
      </div>
	</div>
	