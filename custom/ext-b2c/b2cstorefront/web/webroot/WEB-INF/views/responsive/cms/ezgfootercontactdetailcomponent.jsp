<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<section class="footerContactDetail clearfix">
		<div class="container">
			<ul class="bottomList">
				<c:if test="${component.shopping}">
					<li id="shoppingCartTab">
						<a href="javascript:void(0)">
							<span class="shopping_cart fL"></span>Shopping cart
							<span class="circle_text <c:if test="${minicartProdCount gt 0 }">sel</c:if>" id="miniCartProdCount">${empty minicartProdCount?0:minicartProdCount }</span>
						</a>
					</li>
				</c:if>
				<c:if test="${component.view}">
					<li>
						<a href="javascript:void(0)">
							<span class="viewed_item fL"></span>Viewed
							<span class="circle_text">0</span>
						</a>
					</li>
				</c:if>
				<c:if test="${component.select}">
					<li id="selectedTab">
						<a href="javascript:void(0)">Selected
							<span id="cartCount" class="circle_text">0</span>
						</a>
					</li>
				</c:if>
				<c:if test="${component.compare}">
					<li id="compareTab">
						<a href="javascript:void(0)">Compare
							<span id="compareCount" class="circle_text">0</span>
						</a>
					</li>
				</c:if>
				<c:if test="${component.wishlist}">
					<li id="wishListTab" class="last">
						<a href="javascript:void(0)">
							<span class="heart_add fL"></span>Wish list
							<span class="circle_text fL">0</span>
						</a>
					</li>
				</c:if>
			</ul>
			<div class="bottomContact">
				<div class="email"><a href="javascript:void(0)" id="emailview"><span class="email_icon fL" ></span>Email</a></div>
				<div class="call"><a href="javascript:void(0)" id="callview"><span class="call_icon fL"></span>Call</a></div>
				<div class="chat"><a href="javascript:void(0)" id="chatview"><span class="chat_icon fL"></span>Chat</a></div>
			</div>
		</div>
	</section> 