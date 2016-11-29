<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="contContainer pT20 mB10" id="step2">
   <p class="fW600 clearfix mL20">Mr. Deep Sharma</p>
   <p class="fS18 mB10 mL20 mT15">Upload documents</p>
   <p class="fL bkgGry pD5 mL20 w90pcnt clearfix">1. Passport-type photograph: must be uploaded to your applicant profile.</p>
   <ul class="mB20 clearfix mT10 mL20 cB">
      <li class="col_4 pR10 pL0 mT15 fS12_sm">
         <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
      </li>
      <li class="col_6 pR10 pL0">
         <label>&nbsp;</label>
         <span class="primaryBtn_sml">
	         <input type="file" id="uploadFilePassportFile" name="myfiles">
	         <input type="hidden" id="uploadfileType" value="passportPhotographFile"/>
	         <span id="btn-upload"><a href="javascript:void(0);">Browse</a></span>										
         </span>
         <span class="tertiaryBtn_sml"><a id="uploadBtn" href="javascript:void(0);">Upload</a></span>
      </li>
   </ul>
   <p class="fL bkgGry pD5 mL20 w90pcnt">2. Itinerary Copy of confirmed round trips tickets or itinerary.</p>
   <ul class="mB20 clearfix mT10 mL20">
      <li class="col_4 pR10 pL0 mT15 fS12_sm">
         <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
      </li>
      <li class="col_6 pR10 pL0">
         <label>&nbsp;</label>
         <span class="primaryBtn_sml">
         <input type="file" id="uploadRoundTtripFile" name="myfiles">
         <input type="hidden" id="uploadfileType" value="roundTripsFile"/>
         <span id="btn-upload1"><a href="javascript:void(0);">Browse</a></span>										
         </span>
         <span class="tertiaryBtn_sml"><a id="uploadBtn" href="javascript:void(0);">Upload</a></span>
      </li>
   </ul>
   <div id="addfieldsreserv1">
   </div>
   <div class="col_12 clearfix pR0">
      <div class="fL">
         <a href="javascript:void(0);" id="addfieldreservbtn1"><span
            class="addIcon mR5 fL "></span><span class="posR fL mT5 fW500">Add</span></a>
      </div>
   </div>
   <c:if test="${moreDocs }">
      <p class="fL mL20 clearfix bkgGry pD5 txtalignj w90pcnt mT20">3. Qualify as a repeat UAE traveler. Available to applicants that have traveled on a UAE e-visa at least once in the last 12 months.
         <span class="fL mL20 mT10">a. Entry and exit stamps. Copies of passport pages showing entry and exit stamps from the UAE.</span>
      </p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file2" name="file">
            <span id="btn-upload2"><a href="javascript:void(0);">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL mL20 clearfix mT10 bkgGry pD10 w90pcnt pL25">b. Previous e-visa. Copy of previously issued UAE e-visa.</p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file3" name="file">
            <span id="btn-upload3"><a href="javascript:void(0);" onclick="showbrowse(3)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL clearfix mT10 mL20 bkgGry pD10 pL25 w90pcnt">c. Passport information pages. If stamps or e-visa are linked to a previous passport, copy of that passport's information pages.</p>
      <ul class="mB20 clearfix cB mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file4" name="file">
            <span id="btn-upload4"><a href="javascript:void(0);" onclick="showbrowse(4)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <div id="addfieldsreserv2">
      </div>
      <div class="col_12 clearfix pR0">
         <div class="fL"><a href="javascript:void(0);" id="addfieldreservbtn2"><span class="addIcon mR5 fL"></span><span class="posR fL mT5 fW500">Add</span></a></div>
      </div>
      <p class="fL clearfix mT20 bkgGry pD10">4. Qualify based on travel record. Available to applicants that have traveled to the UAE at least once in the past 5 years and either posess a valid visa for or have traveled within the last 5 year to: Australia, Canada, Japan, Russia, Switzerland, the UK, the USA, or any of the member states of the European Union or Schengen Region.
         <span class="fL mL20 mT10">a. UAE entry and exit stamps. Copies of passport pages showing entry and exit stamps from the UAE.</span>
      </p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file20" name="file">
            <span id="btn-upload20"><a href="javascript:void(0);" onclick="showbrowse(20)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <div id="addfieldsreserv4">
      </div>
      <div class="col_12 clearfix pR0">
         <div class="fL"><a href="javascript:void(0);" id="addfieldreservbtn4"><span class="addIcon mR5 fL"></span><span class="posR fL mT5 fW500">Add</span></a></div>
      </div>
      <p class="fL clearfix mT20 mL20 bkgGry pD10 pL25 w90pcnt">b. Valid visa or travel record. Copy of valid visa or entry and exit stamps from one of the above mentioned countries.</p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file21" name="file">
            <span id="btn-upload21"><a href="javascript:void(0);" onclick="showbrowse(21)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <div id="addfieldsreserv5">
      </div>
      <div class="col_12 clearfix pR0">
         <div class="fL"><a href="javascript:void(0);" id="addfieldreservbtn5"><span class="addIcon mR5 fL"></span><span class="posR fL mT5 fW500">Add</span></a></div>
      </div>
      <p class="fL clearfix mT20 mL20 bkgGry pD10 pL25 w90pcnt">c. Passport information pages. If stamps or visa are linked to a previous passport, copy of that passport's information pages.</p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file31" name="file">
            <span id="btn-upload31"><a href="javascript:void(0);" onclick="showbrowse(31)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <div id="addfieldsreserv6">
      </div>
      <div class="col_12 clearfix pR0">
         <div class="fL"><a href="javascript:void(0);" id="addfieldreservbtn6"><span class="addIcon mR5 fL"></span><span class="posR fL mT5 fW500">Add</span></a></div>
      </div>
      <p class="fL clearfix mT20 mL20 bkgGry pD10 w90pcnt">5. Qualify based on economic status.<br>
         <span class="fL mL20 mT10 cl">a. Bank statements for the last 6 months with a balance of 2 lakhs stamped by the bank.</span>
      </p>
      <ul class="mB20 cB mT10 mL20 clearfix">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file32" name="file">
            <span id="btn-upload32"><a href="javascript:void(0);" onclick="showbrowse(32)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <div id="addfieldsreserv3">
      </div>
      <div class="col_12 clearfix pR0">
         <div class="fL"><a href="javascript:void(0);" id="addfieldreservbtn3"><span class="addIcon mR5 fL"></span><span class="posR fL mT5 fW500">Add</span></a></div>
      </div>
      <p class="fL clearfix mT10 mL20 bkgGry pD10 w90pcnt pL25">b. Annual gross salary of 4 lakh</p>
      <ul class="mB20 clearfix mT10 cB mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file33" name="file">
            <span id="btn-upload33"><a href="javascript:void(0);" onclick="showbrowse(33)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL clearfix mT10 mL10 bkgGry pD10 w90pcnt pL25">c. For working professionals, a copy of employee ID.</p>
      <ul class="mB20 clearfix cB mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file43" name="file">
            <span id="btn-upload43"><a href="javascript:void(0);" onclick="showbrowse(43)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL clearfix mT20 bkgGry pD10">6. Qualify based on family in UAE. Available to immediate family members (spouse, children under 21 years old, and parents over 60 years old) of a UAE resident
         <span class="fL mL20 mT10">a. Letter of invitation. A letter of invitation with the contact information of the host and visitor, purpose and duration of the visit, confirmation of accommodation including the address, signature and date.</span>
      </p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 fS12_sm">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file44" name="file">
            <span id="btn-upload44"><a href="javascript:void(0);" onclick="showbrowse(44)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL clearfix mT10 mL20 bkgGry pD10 w90pcnt pL25">b. Host's status in UAE. A copy of host's passport information pages and valid UAE residence visa.</p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 ">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file42" name="file">
            <span id="btn-upload42"><a href="javascript:void(0);" onclick="showbrowse(42)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
      <p class="fL clearfix mT10 mL20 bkgGry pD10 w90pcnt pL25">C. Proof of relationship. If relationship is not listed in the back of host or applicant's passport, a notarized copy of marriage certificate or birth certificate showing the relationship.</p>
      <ul class="mB20 clearfix mT10 mL20">
         <li class="col_4 pR10 pL0 mT15 ">
            <input type="text" class="w100pcnt" name="upload" value="Upload" style="color: rgb(170, 170, 170);">
         </li>
         <li class="col_6 pR10 pL0">
            <label>&nbsp;</label>
            <span class="primaryBtn_sml">
            <input type="file" id="file41" name="file">
            <span id="btn-upload41"><a href="javascript:void(0);" onclick="showbrowse(41)">Browse</a></span>										
            </span>
            <span class="tertiaryBtn_sml"><a href="javascript:void(0);">Upload</a></span>
         </li>
      </ul>
   </c:if>
   <br class="cB"/>
   <form:form method="post" id="uploadDocsForm"   action="${contextPath}/checkout/multi/upload-docs">
      <input type="hidden" maxlength="3" size="1" id="qty" name="qty" class="qty js-qty-selector-input" value="1">
      <input type="hidden" name="productCodePost" value="1303"/><!-- ${product.code} -->
      <!-- type="submit" -->
      <a href="javascript:void(0)" class=" button button-primary fR " style="width:147px" id="uploadDocsLink">Continue </a>
   </form:form>
   <!-- <a href="javascript:void(0)" class=" button button-primary fR " style="width:147px" onclick="step2('header2', 'header3', 'step2', 'step3')">Continue </a> --> 
   <br class="cB"/>
</div>