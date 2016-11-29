<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!--=== Header ===-->
<header class="headerPort"> 
	<!--=== Global Navigation End ===-->
	<section id="globalNav" class="clearfix">
		<div class="container">
			<ul class="companyInfo fL col_8">
				<li>Welcome <strong>Piramal Travels TA15609</strong></li>
				<li class="last"><span class="mR10">BAL: DP<span class="rupee mL5">Rs </span>3,400 ,</span><span>$3,400</span><span class="mL20 mR10">CR <span class="rupee">Rs </span>0,00 ,</span><span>$3,400</span><span class="mL10"><a href="javascript:void(0);"><strong>Recharge</strong></a></span></li>
			</ul>
			<ul class="companyInfo fR col_4 tR">
				<li>24x7 Help Desk: 022 66904700</li>
				<li class="last posR">
					<span id="searchBox" class="searchBox sfield dN">
						<input type="text" class="w100pcnt" placeholder="Search">
					</span>
					<span class="help_icon" title="Help"></span> <span class="dotted_divider">&nbsp;</span> <span class="search_icon" title="Search"></span> <span class="dotted_divider">&nbsp;</span> <span class="logout_icon" title="Logout"></span></li>
			</ul>
		</div>
	</section>
	<!--=== Global Navigation End ===--> 
	<!--=== Primary Navigation ===-->
	<nav>
		<div class="container"> <span class="col_2 logo col_3_sm pL0 fS12"> <span class="headerHideControl" title="Hide header"></span> <span class="logoContr"> <a href="index.html"><img src="${ezgCommonImagesPath}/logo.png" alt="Ezeego1" width="136" height="28" title="Ezeego1" /></a><br />
			ISO 9001: 2008 certified </span> <span class="travelerName dN">Piramal Travels</span> </span>
			<div class="col_10 col_9_sm pR0">
				<ul class="primaryNav">
					<li><a href="javascript:void(0);">Enquiries<span class="counterBox mL5">10</span></a></li>
					<li><a href="booking_list.html">Bookings<span class="counterBox mL5">2</span></a></li>
					<!--  <li><a href="javascript:void(0)">Mail<span class="counterBox mL5">8</span></a></li> -->
					<!--<li class="hide_sm posR toggle_menu" id="productNav"><a href="javascript:void(0);" onclick="moreOption('productNav', 'productOpt', 'posR')">Products<span class="settingAro"></span></a>-->
					<li class="hide_sm posR toggle_menu" id="productNav"><a href="javascript:void(0);">Products<span class="settingAro"></span></a>
						<div class="moreContrOuter">
							<ul class="morePnl dN menu_items" id="productOpt">
								<li><a href="javascript:void(0);">Flights</a></li>
								<li><a href="hotels_product_landing.html">Hotels</a></li>
								<li><a href="javascript:void(0);">Flight + Hotels</a></li>
								<li><a href="javascript:void(0);">Flight + Hotels + Cars</a></li>
								<li><a href="javascript:void(0);">Holidays</a></li>
								<li><a href="javascript:void(0);">Activity</a></li>
								<!--<li><a href="javascript:void(0);">Deals</a></li>-->
								<li><a href="javascript:void(0);">Bus</a></li>
								<li><a href="javascript:void(0);">Car</a></li>
								<li><a href="javascript:void(0);">Rail</a></li>
								<li><a href="javascript:void(0);">Cruise</a></li>
								<!--<li><a href="javascript:void(0);">Forex</a></li>
								<li><a href="javascript:void(0);">Insurance</a></li>
								<li><a href="javascript:void(0);">Visa</a></li>-->
							</ul>
						</div>
					</li>
					<li class="hide_sm toggleMenu"><a href="javascript:void(0);">Marketing</a></li>
					<!--<li class="hide_sm posR toggle_menu" id="reportNav"><a href="javascript:void(0);" onclick="moreOption('reportNav', 'reportOpt', 'posR')">Finance<span class="settingAro"></span></a>-->
					<li class="hide_sm posR toggle_menu" id="reportNav"><a href="javascript:void(0);" >Finance<span class="settingAro"></span></a>
						<div class="moreContrOuter">
							<ul class="morePnl dN menu_items" id="reportOpt">
								<li><a href="finance_dashboard.html">Dashboard</a></li>
								<li><a href="javascript:void(0);">Earnings</a></li>
								<li><a href="javascript:void(0);">Invoice</a></li>
								<li><a href="javascript:void(0);">Refunds</a></li>
								<li><a href="javascript:void(0);">Fund limits</a></li>
								<li><a href="javascript:void(0);">Commission structure</a></li>
								<li><a href="javascript:void(0);">Recharge</a></li>
							</ul>
						</div>
					</li>
					<!--		<li class="posR hide_md_lg toggle_menu" id="dotproductNav"><a href="javascript:void(0);" onclick="moreOption('dotproductNav', 'dotprimaryNav', 'posR')">...</a>-->
					<li class="posR hide_md_lg" id="dotproductNav"><a href="javascript:void(0);" onclick="moreOption('dotproductNav', 'dotprimaryNav', 'posR', event)">...</a>
						<div class="moreContrOuter dotContr dN" id="dotprimaryNav">
							<ul class="morePnl dotPnl">
								<li><a href="javascript:void(0);">Marketing</a></li>
								<li><a href="javascript:void(0);" class="portViewTab">Finance<img src="images/collapse_blu.png" alt="Arrow" class="mL10 mRN25" /></a>
									<div class="portViewDD">
										<ul>
											<li><a href="finance_dashboard.html">Dashboard</a></li>
											<li><a href="javascript:void(0);">Earnings</a></li>
											<li><a href="javascript:void(0);">Invoice</a></li>
											<li><a href="javascript:void(0);">Refunds</a></li>
											<li><a href="javascript:void(0);">Fund limits</a></li>
											<li><a href="javascript:void(0);">Commission structure</a></li>
											<li><a href="javascript:void(0);">Recharge</a></li>
										</ul>
									</div>
								</li>
								<li><a href="javascript:void(0);" class="portViewTab">Settings<img src="images/collapse_blu.png" alt="Arrow" class="mL10 mRN25" /></a>
									<div class="portViewDD">
										<ul>
											<li><a href="agent_profile.html">My profile</a></li>
											<li><a href="javascript:void(0);">Agency management</a></li>
											<li><a href="javascript:void(0);">System settings</a></li>
											<li><a href="markup_settings.html">Markups</a></li>
										</ul>
									</div>
								</li>
							</ul>
						</div>
					</li>
					<li class="hide_sm posR toggle_menu" id="settingNav"><a href="javascript:void(0);">Settings<span class="settingAro"></span></a>
						<div class="moreContrOuter">
							<ul class="morePnl dN menu_items" id="settingOpt">
								<li><a href="javascript:void(0);">My profile</a></li>
								<li><a href="agent_management.html">Agency management</a></li>
								<li><a href="javascript:void(0);">System settings</a></li>
								<li><a href="markup_settings.html">Markups</a></li>
							</ul>
						</div>
					</li>
				</ul>
				<span class="setting_icon fR mT15" title="Tools"></span>
			</div>
		</div>
	</nav>
	<!--=== Primary Navigation End ===--> 
</header>
<!--=== End Header ===--> 