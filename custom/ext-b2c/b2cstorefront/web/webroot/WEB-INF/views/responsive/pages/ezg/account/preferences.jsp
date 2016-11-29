		<!-- Day 2 -->
        <div class="clearfix">
         <header class="diy_headerContr clearfix active diy_header"> <samp class="brdrN">Preferences</samp>
            <span class="heading sel"><img src="${ezgImagesPath}/common/expand.png" alt="Arrow" class="fR mT5"></span> </header>
         
        </div>
        <ul class="diy_results dN">
          <li class="brdrLitGry pD15 clearfix">
			
        	<div class="pB20 mB20 clearfix">
            	<div class=" col_12 mB20">
                	
					<p class="clearfix mT10">Rank products according to your preference. The selected products will appear in your search results on a priority.</p>
				   
					<h4 class="mT20 mB10 fL">Product category: Hotel </h4>
						<div class="tertiaryBtn fR mT20 mB10"><a href="javascript:void(0);">Restore defaults</a></div>
					
					<table  class="dataTablebtm col_12 mT20 mB20">
					
						<tr>
						  <th class="first">Rank</th>
						  <th>Product</th>
						  <th>Action</th>
						</tr>
						
						<tr>
						  <td>1</td>
						  <td >Hyatt Regency, K.G.Marg, Delhi</td>
						  <td><a href="#">Remove</a></td>
						</tr>
						<tr>
						  <td class="vMid"><span>2</span> <span class="mL10">Active from 2 Oct’14</span></td>
						  <td >JW Marriot</td>
						  <td><a href="#">Remove</a></td>
						</tr>
						<tr>
						  <td>3</td>
						  <td>Leela Ambience, Gurgaon</td>
						  <td><a href="#">Remove</a></td>
						</tr>
					
					</table>
					
					<h4 class="mT20 mB10 fL">Product category: Flight </h4>
						<div class="tertiaryBtn fR mL15 mT20 mB10"><a href="javascript:void(0);">Restore defaults</a>
						</div>
					
					<table  class="dataTablebtm col_12 mT20">
					
						<tr>
						  <th class="first">Rank</th>
						  <th>Product</th>
						  <th>Action</th>
						</tr>
						
						<tr>
						  <td>1</td>
						  <td >Jet Airways, All routes</td>
						  <td><a href="#">Remove</a></td>
						</tr>
						<tr>
						  <td>2</td>
						  <td >Etihaad Airways, Dubai-Milan</td>
						  <td><a href="#">Remove</a></td>
						</tr>
				
					</table>
					
					<div class="col_12 clearfix mT20">
						<div class="fL mT10"> <a href="javascript:void(0);" class="addMore">
						<span class="addIcon mR5 fL"></span> 
						<span class="posR fL">Add product</span> </a> 
						</div>
					</div>
				  <div class="row clearfix mB20 mT20 addMoreDetail" style="display:none">
					<div class="col_3 col_sm_6">
					  <div class="form">
						<label for="productcategory">Product category</label>
						<select class="mB20 w100pcnt" name="productcategory" id="productcategory">
						<option>Transportation</option>
						<option>Accommodation</option>
						<option>Others</option>
						<option>Holidays</option>
						<option>Activities</option>
						</select>
					  </div>
					</div>
					<div class="col_3 col_sm_6">
					  <div class="form">
						<label>Product Sub-Category</label>
						<select class="mB20 w100pcnt" id="subctg">
						<option value="flight">Flight</option>
						<option value="all">All</option>
						<option value="cruise">Cruise</option>
						<option value="eurorail">Rail Europe</option>
						<option value="bus">Bus</option>
						<option value="holiday">Holidays</option>
						<option value="activities">Activities</option>
						</select>
					  </div>
					</div>
					<div class="cB"></div>
					<div id="flight" class="col_12">
						<h4 class="fS16">Country:</h4>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>From</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>To</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<h4 class="fS16">City:</h4>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>From</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>To</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Airline Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective From</label>
						<input type="text" id="effectivefrom" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul>
					</div>
					<div id="all" class=" col_12 dN">
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Continent</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Country</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>City</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Chain </label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Brand</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						
						<li class="col_6 pL0">
						<label>Product Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective from</label>
						<input type="text" id="effectivefrom1" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul><span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="cruise" class="col_12 dN">
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Destination</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Cruise Brand Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Ship Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective from</label>
						<input type="text" id="effectivefrom2" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul><span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="eurorail" class="col_12 dN">
						<h4 class="fS16">Sector</h4>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>From</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>To</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Train Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective From</label>
						<input type="text" id="effectivefrom4" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul><span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="bus" class="col_12 dN">
						<h4 class="fS16">Sector</h4>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>From</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>To</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Bus Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Features Category</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective From</label>
						<input type="text" id="effectivefrom5" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul><span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="holiday" class="col_12 dN">
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Flavour Type</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Brand</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Destination</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Country</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Product Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Product Flavour Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective From</label>
						<input type="text" id="effectivefrom6" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul><span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					<div id="activities" class="col_12 dN">
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Continent</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Country</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<div class="cB"></div>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>City</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Product Name</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Product Name Sub Type</label>
						<select class="w100pcnt">
						<option>&nbsp;</option>
						</select>
						</li>
						</ul>
						<ul class="clearfix mB10">
						<li class="col_6 pL0">
						<label>Rank</label>
						<select class="w100pcnt">
						<option>#1</option>
						</select>
						</li>
						<li class="col_6 pL0">
						<label>Effective From</label>
						<input type="text" id="effectivefrom7" class="w100pcnt dateField" placeholder="dd/mm/yyyy" readonly="">
						</li>
						</ul>
						<span class="primaryBtn mT10"><a href="javascript:void(0);">Add</a></span>
					</div>
					
				</div>


			  
			  </div>
				</div>
				</li>
        </ul>