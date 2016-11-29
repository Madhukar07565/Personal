<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="action" required="true" type="java.lang.String"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<div id="rightPane" class="col-md-10 rightPane">
	<div class="panel-group" id="accordion">

		<form:form method="POST" modelAttribute="searchFilterForm"
			action="${searchResultUrl}" class="form">
			<div class="panel panel-default panePadding">
				<div class="panel-heading titleBold">
					<a data-toggle="collapse" data-parent="#accordion" href="#pane1">Booking
						Details </a>
				</div>
				<div id="pane1" class="panel-collapse collapse">
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="suppName" 
							labelKey="searchPage.bookingDetails.suppName" labelCSS="col-md-2" path="suppName" inputCSS="col-md-2"/>
					</div>

					<div class="form-group">
						<formElement:formInputBox idKey="serviceOT" 
							labelKey="searchPage.bookingDetails.serviceOT" inputCSS="col-md-2" labelCSS="control-label col-md-2" path="serviceOT" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="billPassStatus"
							labelKey="searchPage.bookingDetails.suppBillPassingStatus" labelCSS="control-label col-md-2"
							path="suppBillPassingStatus"  inputCSS="col-md-2"/>
					</div>
				</div>

				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="bookRefNo" 
							labelKey="searchPage.bookingDetails.bookingRefNumber" path="bookingRefNumber" inputCSS="col-md-2" labelCSS="control-label col-md-2"/>
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="serorderdateFrom"
							labelKey="searchPage.bookingDetails.serviceOrderCreationDateFrom"
							path="serviceOrderCreationDateFrom" inputCSS="col-md-2" labelCSS="control-label col-md-2"/>
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="serorderdateTo"
							labelKey="searchPage.bookingDetails.serviceOrderCreationDateTo"
							path="serviceOrderCreationDateTo" inputCSS="col-md-2" labelCSS="control-label col-md-2"/>
					</div>
				</div>
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.bookingDetails.paymentAdviceCreationDateFrom"
							labelKey="searchPage.bookingDetails.paymentAdviceCreationDateFrom"
							path="paymentAdviceCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.bookingDetails.paymentAdviceCreationDateTo"
							labelKey="searchPage.bookingDetails.paymentAdviceCreationDateTo"
							path="paymentAdviceCreationDateTo" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.bookingDetails.paymentAdviceId"
							labelKey="searchPage.bookingDetails.paymentAdviceId" path="paymentAdviceId" />
					</div>
				</div> 

				</div>
			</div>
			<!--pane1 ends  -->
			
			<!--pane2 starts  -->
			
			<div class="panel panel-default">
				<div class="panel-heading titleBold">
               		<a data-toggle="collapse" data-parent="#accordion" href="#pane2">Product Details </a>
               </div>
				<div id="pane2" class="panel-collapse collapse">
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.productDetails.suppName"
							labelKey="searchPage.productDetails.suppName" path="suppName" />
					</div>

					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.productDetails.serviceOT"
							labelKey="searchPage.productDetails.serviceOT" path="serviceOT" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.productDetails.suppBillPassingStatus"
							labelKey="searchPage.productDetails.suppBillPassingStatus"
							path="suppBillPassingStatus" />
					</div>
				</div>

				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.productDetails.bookingRefNumber"
							labelKey="searchPage.productDetails.bookingRefNumber" path="bookingRefNumber" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.productDetails.serviceOrderCreationDateFrom"
							labelKey="searchPage.productDetails.serviceOrderCreationDateFrom"
							path="serviceOrderCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.productDetails.serviceOrderCreationDateTo"
							labelKey="searchPage.productDetails.serviceOrderCreationDateTo"
							path="serviceOrderCreationDateTo" />
					</div>
				</div>
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.productDetails.paymentAdviceCreationDateFrom"
							labelKey="searchPage.productDetails.paymentAdviceCreationDateFrom"
							path="paymentAdviceCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.productDetails.paymentAdviceCreationDateTo"
							labelKey="searchPage.productDetails.paymentAdviceCreationDateTo"
							path="paymentAdviceCreationDateTo" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.productDetails.paymentAdviceId"
							labelKey="searchPage.productDetails.paymentAdviceId" path="paymentAdviceId" />
					</div>
				</div>

				</div>
			</div><!--pane2 ends  -->
			
			<!--pane3 starts  -->
			
		<div class="panel panel-default">
           <div class="panel-heading titleBold">
               <a data-toggle="collapse" data-parent="#accordion" href="#pane3">Company Details </a></div>
         <div id="pane3" class="panel-collapse collapse">
				
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.suppName"
							labelKey="searchPage.companyDetails.suppName" path="suppName" />
					</div>

					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.serviceOT"
							labelKey="searchPage.companyDetails.serviceOT" path="serviceOT" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.suppBillPassingStatus"
							labelKey="searchPage.companyDetails.suppBillPassingStatus"
							path="suppBillPassingStatus" />
					</div>
				</div>

				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.bookingRefNumber"
							labelKey="searchPage.companyDetails.bookingRefNumber" path="bookingRefNumber" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.companyDetails.serviceOrderCreationDateFrom"
							labelKey="searchPage.companyDetails.serviceOrderCreationDateFrom"
							path="serviceOrderCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.companyDetails.serviceOrderCreationDateTo"
							labelKey="searchPage.companyDetails.serviceOrderCreationDateTo"
							path="serviceOrderCreationDateTo" />
					</div>
				</div>
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.companyDetails.paymentAdviceCreationDateFrom"
							labelKey="searchPage.companyDetails.paymentAdviceCreationDateFrom"
							path="paymentAdviceCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.companyDetails.paymentAdviceCreationDateTo"
							labelKey="searchPage.companyDetails.paymentAdviceCreationDateTo"
							path="paymentAdviceCreationDateTo" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.companyDetails.paymentAdviceId"
							labelKey="searchPage.companyDetails.paymentAdviceId" path="paymentAdviceId" />
					</div>
				</div>
                 </div>
            </div><!--pane3 ends  -->
			
			<!--pane4 starts here-->
           <div class="panel panel-default">
           		<div class="panel-heading titleBold">
               		<a data-toggle="collapse" data-parent="#accordion" href="#pane4">Client & Passenger Details </a>
               	</div>
         		<div id="pane4" class="panel-collapse collapse">
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.clientDetails.suppName"
							labelKey="searchPage.clientDetails.suppName" path="suppName" />
					</div>

					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.clientDetails.serviceOT"
							labelKey="searchPage.clientDetails.serviceOT" path="serviceOT" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.clientDetails.suppBillPassingStatus"
							labelKey="searchPage.clientDetails.suppBillPassingStatus"
							path="suppBillPassingStatus" />
					</div>
				</div>

				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.clientDetails.bookingRefNumber"
							labelKey="searchPage.clientDetails.bookingRefNumber" path="bookingRefNumber" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.clientDetails.serviceOrderCreationDateFrom"
							labelKey="searchPage.clientDetails.serviceOrderCreationDateFrom"
							path="serviceOrderCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.clientDetails.serviceOrderCreationDateTo"
							labelKey="searchPage.clientDetails.serviceOrderCreationDateTo"
							path="serviceOrderCreationDateTo" />
					</div>
				</div>
				<div class="row marginSpacing">
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.clientDetails.paymentAdviceCreationDateFrom"
							labelKey="searchPage.clientDetails.paymentAdviceCreationDateFrom"
							path="paymentAdviceCreationDateFrom" />
					</div>
					<div class="form-group">
						<formElement:formInputBox
							idKey="searchPage.clientDetails.paymentAdviceCreationDateTo"
							labelKey="searchPage.clientDetails.paymentAdviceCreationDateTo"
							path="paymentAdviceCreationDateTo" />
					</div>
					<div class="form-group">
						<formElement:formInputBox idKey="searchPage.clientDetails.paymentAdviceId"
							labelKey="searchPage.clientDetails.paymentAdviceId" path="paymentAdviceId" />
					</div>
				</div>
                 </div>
            </div>
		</form:form>
	</div>
	<p class="alignRight"><button type="button" class="btn btn-success">Search</button>
                    &nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-primary">Reset</button>
                    &nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-danger">Cancel</button>
    </p>
</div>



