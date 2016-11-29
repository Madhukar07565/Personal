<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<c:url value="https://localhost:9002/b2cstorefront/ezginb2c/en/cart/add" var="addToCartUrl"/>
<section class="discoverHoliday">
      <div class="container">
        <h1 class="headingFont_portrait">Discover and customise holiday ideas by 63435 people like <a href="javascript:void(0);" onclick="popupwin('traveller_type', 'black_overlay')">#you</a></h1>
        <ul id="second-carousel" class="first-and-second-carousel jcarousel-skin-ie7">
          <li class="cursor"> <img src="${ezgImagesPath }/home/holiday_desination2.jpg" alt="Holiday Destination2"/>
            <h2><a href="javascript:void(0);">Manali</a></h2>
            <h3><span class="discover_tag fL"></span><a href="javascript:void(0);">mountaineer</a>, <a href="javascript:void(0);">paraglider</a>, <a href="javascript:void(0);">solo woman</a></h3>
            <div class="details clearfix">
              <div class="followerAroTop fL"></div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Heaven on earth</h4>
                <p class="mT5"> <span class="like fL"></span> <span class="mT13 mR5 fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath }/common/user4.jpg" alt="User 3" /></span> </p>
              </div>
              <div class="col_3 col_sm_3 pR0"> <img src="${ezgImagesPath }/home/holiday_destination_user2.png" alt="User 2" class="fL mR5" /> <a href="dashboard.html" class="head">Amita Chitale</a>
                <p>Followed by: 178<br>
                  Holiday shared: 76</p>
              </div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Mountaineer's Manali</h4>
                <p>7N / 8D<br>
                  Bandhavgarh Resort</p>
              </div>
              <div class="col_3 col_sm_3 pL0">
                <p class="fS18 mB10"> <span class="rupee">Rs. </span> 42,200* onwards </p>
                <span class=" dB fS12"> 
                
                
                
                
                <form:form method="post" id="ezgAddToCartForm"   action="${addToCartUrl}">
					<input type="hidden" maxlength="3" size="1" id="qty" name="qty" class="qty js-qty-selector-input" value="1">
					<input type="hidden" name="productCodePost" value="1303"/><!-- ${product.code} -->
					
					<c:if test="${empty showAddToCart ? true : showAddToCart}">
						<c:set var="buttonType">submit</c:set>
						<ycommerce:testId code="addToCartButton">
							<button id="addToCartButton" type="${buttonType}" 
							class="button button-primary fL mR10 tC mB10 addToCart" 
							 >
								<spring:theme code="basket.add.to.basket"/>
							</button>
						</ycommerce:testId>
					</c:if>
					</form:form>
                
                
                
                
                
                
                
                
                
               <!--  <a href="javascript:void(0);" class="button button-primary fL mR10 tC mB10 addToCart">Add to cart</a>  -->
                <a href="diy.html" class="tC button button-secondary fL">Customise</a> </span> </div>
            </div>
          </li>
          <li class="cursor"> <img src="${ezgImagesPath }/home/holiday_desination1.jpg" alt="Holiday Destination2"/>
            <h2><a href="javascript:void(0);">Bandhavgarh</a></h2>
            <h3><span class="discover_tag fL"></span><a href="javascript:void(0);">mountaineer</a>, <a href="javascript:void(0);">paraglider</a>, <a href="javascript:void(0);">solo woman</a></h3>
            <div class="details clearfix">
              <div class="followerAroTop fL"></div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Wild Bandhavgarh</h4>
                <p class="mT5"> <span class="like fL"></span> <span class="mT13 mR5 fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath }/common/user4.jpg" alt="User 3" /></span> </p>
              </div>
              <div class="col_3 col_sm_3 pR0"> <img src="${ezgImagesPath }/home/holiday_destination_user2.png" alt="User 2" class="fL mR5" /> <a href="dashboard.html" class="head">Amita Chitale</a>
                <p>Followed by: 178<br>
                  Holiday shared: 76</p>
              </div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Bandhavgarh Tiger Trails</h4>
                <p>7N / 8D<br>
                  Bandhavgarh Resort</p>
              </div>
              <div class="col_3 col_sm_3 pL0">
                <p class="fS18 mB10"> <span class="rupee">Rs. </span> 42,200* onwards </p>
                <span class=" dB fS12"> <a href="javascript:void(0);" class="button button-primary fL mR10 tC mB10 addToCart">Add to cart</a> <a href="diy.html" class="tC button button-secondary fL">Customise</a> </span> </div>
            </div>
          </li>
          <li class="cursor"> <img src="${ezgImagesPath }/home/holiday_desination3.jpg" alt="Holiday Destination2"/>
            <h2><a href="javascript:void(0);">Maldives</a></h2>
            <h3><span class="discover_tag fL"></span><a href="javascript:void(0);">mountaineer</a>, <a href="javascript:void(0);">paraglider</a>, <a href="javascript:void(0);">solo woman</a></h3>
            <div class="details clearfix">
              <div class="followerAroTop fL"></div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Romantic Getaway</h4>
                <p class="mT5"> <span class="like fL"></span> <span class="mT13 mR5 fL">230</span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user1.png" alt="User 1" /></span> <span class="fL mR2"><img src="${ezgImagesPath }/common/user3.jpg" alt="User 2" /></span> <span class="fL"><img src="${ezgImagesPath }/common/user4.jpg" alt="User 3" /></span> </p>
              </div>
              <div class="col_3 col_sm_3 pR0"> <img src="${ezgImagesPath }/home/holiday_destination_user2.png" alt="User 2" class="fL mR5" /> <a href="dashboard.html" class="head">Amita Chitale</a>
                <p>Followed by: 178<br>
                  Holiday shared: 76</p>
              </div>
              <div class="col_3 col_sm_3 pR0">
                <h4 class="fS18">Mountaineer's Manali</h4>
                <p>7N / 8D<br>
                  Bandhavgarh Resort</p>
              </div>
              <div class="col_3 col_sm_3 pL0">
                <p class="fS18 mB10"> <span class="rupee">Rs. </span> 42,200* onwards </p>
                <span class=" dB fS12"> <a href="javascript:void(0);" class="button button-primary fL mR10 tC mB10 addToCart">Add to cart</a> <a href="diy.html" class="tC button button-secondary fL">Customise</a> </span> </div>
            </div>
          </li>
        </ul>
        <a class="fR mR10" href="javascript:void(0)">345 more holidays starting at Rs 4747 </a> <br class="cB"/>
      </div>
    </section>