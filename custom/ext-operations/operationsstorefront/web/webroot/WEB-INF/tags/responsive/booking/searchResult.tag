<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="travel-list active">
	<section class="panel-body">
		<div class="table-responsive">
			<table class="table-main table-fixed" width="2650">
				<thead>
					<tr>
						<th rowspan="2"><input type="checkbox" class="pull-left"
							value="">Select All</th>
						<th rowspan="2" class="relDiv">Booking Date &amp; Time
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th rowspan="2">Booking Ref No</th>
						<th colspan="5" class="main-spec-info"><label>Client
								Details</label>
							<div class="float-right exp-collapse" data-item="spec-info">
								<i class="glyphicon glyphicon-menu-left"></i>
							</div></th>
						<th colspan="9" class="main-price-dtl">Product Details
							<div class="float-right exp-collapse" data-item="price-dtl">
								<i class="glyphicon glyphicon-menu-left"></i>
							</div>
						</th>
						<th rowspan="2">Company Details</th>
						<th rowspan="2">Assign</th>
					</tr>

					<tr>
						<th class="spec-info">Client Name
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>

						</th>
						<th class="spec-info">Client Type</th>
						<th class="spec-info">Client Category
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>

						</th>
						<th class="spec-info">Client Sub-Category
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="spec-info">Point of Sales
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">Passenger Name</th>
						<th class="price-dtl">Product Category Sub-type
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">Product Name
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">Travel Date
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">Details Summary</th>
						<th class="price-dtl">Supplier Name</th>
						<th class="price-dtl" class="price-dtl">Product Status
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">Payment Status
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
						<th class="price-dtl">File Handler Name
							<div class="pull-right inline">
								<a href="#" class=""><span
									class="glyphicon glyphicon-sort-by-alphabet"></span></a> <a
									href="#" class=""><span class="glyphicon glyphicon-filter"></span></a>
							</div>
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="orderData" items="${orderDataList}">
					<tr>
						<td><input type="checkbox" value=""></td>
						<td class="centered">${orderData.created}<br>
						</td>
						<td class="yellowBox"><span class="yellow-icon"></span> <a
							href="#">${orderData.code}</a></td>
						<td class="spec-info">-</td>
						<td class="spec-info">B2C</td>
						<td class="spec-info">-</td>
						<td class="spec-info">-</td>
						<td class="spec-info">${orderData.pointOfSale}</td>
						<td class="price-dtl">
							<c:forEach var="entry" items="${orderData.entries}">
								 <c:forEach var="traveller" items="${entry.travellerList}">
								 	${traveller.title} ${traveller.firstName}
								 </c:forEach> 
							</c:forEach>
						</td>
						<td class="price-dtl">Flights</td>
						<td class="price-dtl">
							<c:forEach var="entry" items="${orderData.entries}">
								${entry.product.name}
							</c:forEach>
						</td>
						<td class="price-dtl">20-06-2014</td>
						<td class="price-dtl">BLR to CCU : 9W 214: 11am/1pm</td>
						<td class="price-dtl">
							<c:forEach var="entry" items="${orderData.entries}">
								${entry.orderProductInfo.supplier.name}
							</c:forEach>
						</td>
						<td class="price-dtl">Ticketed</td>
						<td class="price-dtl">${orderData.paymentStatus}</td>
						<td class="price-dtl">Unassigned</td>
						<td>${orderData.groupCompany.name} Market - India SBU/BU</td>
						<td>&nbsp;</td>
					</tr>
					</c:forEach>
					</tbody>
			</table>
		</div>
	</section>
</div>