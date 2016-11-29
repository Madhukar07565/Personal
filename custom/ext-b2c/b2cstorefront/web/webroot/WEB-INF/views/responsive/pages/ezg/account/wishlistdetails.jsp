
  <div class="bkgLitBlu pB40">
    <div class="container pT40">
      <div class="row clearfix" id="wishListTilesContainer">
        <article class="col_4 posR mB40 boxTile" id="wishListCont1"> <img src="${ezgImagesPath}/wishlist/hotel3.jpg" alt="Hotel" class="brdrWht" /> <a href="javascript:void(0)">
          <div class="wl_innerContr"> <span class="hotelGrn_lrg"></span>
            <h2 class="tC fcGrn tileHeader" id="tileHeader1">Hotels</h2>
            <span class="fS30 tC dB defaultTxtColor mTN5">15</span> </div>
          </a> <span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName(1);"></span> <span class="recycle_icon_wishlist"></span> </span> </article>
        <article class="col_4 posR mB40 boxTile" id="wishListCont2"> <img src="${ezgImagesPath}/wishlist/wishlist_holidays.jpg" alt="Holiday" class="brdrWht" /> <a href="javascript:void(0)">
          <div class="wl_innerContr"> <span class="holiday_lrg dB"></span>
            <h2 class="tC fcGrn tileHeader" id="tileHeader2">Holiday</h2>
            <span class="fS30 tC dB defaultTxtColor">8</span> </div>
          </a> <span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName(2);"></span> <span class="recycle_icon_wishlist"></span> </span> </article>
        <article class="col_4 posR mB40 boxTile" id="wishListCont3"> <img src="${ezgImagesPath}/wishlist/wishlist_activities.jpg" alt="Activities" class="brdrWht" /> <a href="javascript:void(0)">
          <div class="wl_innerContr"> <span class="activity_icon_wishlist dB"></span>
            <h2 class="tC fcGrn tileHeader" id="tileHeader3">Activities</h2>
            <span class="fS30 tC dB defaultTxtColor">258</span> </div>
          </a> <span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName(3);"></span> <span class="recycle_icon_wishlist"></span> </span> </article>
        <article class="col_4 posR mB40 boxTile" id="wishListCont4"> <img src="${ezgImagesPath}/wishlist/wishlist_southafrica.jpg" alt="South Africa" class="brdrWht" /> <a href="javascript:void(0)">
          <div class="wl_innerContr">
            <h2 class="tC fcGrn tileHeader" id="tileHeader4">Africa</h2>
            <span class="fS30 tC dB defaultTxtColor">8</span> </div>
          </a> <span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName(4);"></span> <span class="recycle_icon_wishlist"></span> </span> </article>
        <article class="col_4 posR mB40 boxTile" id="wishListCont5"> <img src="${ezgImagesPath}/wishlist/wishlist_australia.jpg" alt="Hotel" class="brdrWht" /> <a href="javascript:void(0)">
          <div class="wl_innerContr">
            <h2 class="tC fcGrn tileHeader" id="tileHeader5">Australia</h2>
            <span class="fS30 tC dB defaultTxtColor">21</span> </div>
          </a> <span class="tC dB wishlistIcons"> <span class="share_icon mR10"></span> <span class="edit_icon_wishlist mR10" onClick="editWishListName(5);"></span> <span class="recycle_icon_wishlist"></span> </span> </article>
      </div>
    </div>
  </div>
  
  <!--Add to wishlist -->
	<div class="overlay_content posF" id="addtoWishlistContainer" style="display: none;">
	  <div class="white_content_inner popupSml"> <span class="closeBtn_popup fR dB" onclick="popupclose('addtoWishlistContainer', 'black_overlay')"></span>
	    <div class="mB20">
	      <h3>Create new</h3>
	      <input type="text" class="w50pcnt" id="wishlistCategory" placeholder="Enter category" />
	      <select id="wishListCategorySelect">
	        <option value="">Select</option>
	        <option value="Everyone">Everyone</option>
	        <option value="Only me">Only me</option>
	      </select>
	    </div>
	    <a href="javascript:void(0)" class="button button-primary dB" onClick="createWishlistCategory()">Create new</a> </div>
	</div>
	
	<!-- Edit wishlist name -->
	<div class="overlay_content posF" id="editWishlist" style="display: none;">
	  <div class="white_content_inner popupSml"> <span class="closeBtn_popup fR dB" onclick="popupclose('editWishlist', 'black_overlay')"></span>
	    <div class="mB20">
	      <h3>Edit list</h3>
	      <input type="text" class="w50pcnt" id="editName" value="" />
	    </div>
	    <a href="javascript:void(0)" class="button button-primary dB" onClick="saveWishListName();">Save</a> </div>
	</div>
	
	<!--Delete confirmation -->
	<div class="overlay_content posF" id="deleteItemConfirmation" style="display: none;">
	  <div class="white_content_inner popupSml">
	    <div class="closeBtn_popup fR dB" onclick="popupclose('deleteItemConfirmation', 'black_overlay')"></div>
	    <h2 class="mB20 fS18">Are you sure you want to delete this ?</h2>
	    <a href="javascript:void(0)" class="button button-primary mR20 confirmYes" id="btnConfirm" onClick="removeFromWishlist(this)">Yes</a> <a href="javascript:void(0)" class="button button-secondary" onClick="popupclose('deleteItemConfirmation', 'black_overlay')">No</a> </div>
	</div>