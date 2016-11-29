<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="recommend${viewType}Section">
<h1>Page Loading ...   Please Waiting ...</h1>
</div>
<script id="templateRecommend${viewType}Section" type="text/ractive">
{{#each hotelRecommendList:num}}
	<div class="clearfix mB10">
		<h4 class="gridTitle fL pL40 fW600">Best price recommendation</h4>
		<span class="fR"> Show price: 
			  <a class="showPriceSel avg" href="javascript:void(0)" on-click="switchShowPrice('avg','${viewType}')">Average / Night </a> 
			| <a class="tol"href="javascript:void(0)" on-click="switchShowPrice('tol','${viewType}')">Total price</a>
		</span>
	</div>
	<c:if test="${viewType=='grid'}"><hotel:singlegridhotel/></c:if>
	<c:if test="${viewType=='list'}"><hotel:singlelisthotel/></c:if>
{{/each}}
</script>
<script>
var ractiveTopHotel = ractiveTopHotel ? ractiveTopHotel : {};
$(function(){
      ractiveTopHotel.recommend${viewType}Result= new Ractive({
            el:'#recommend${viewType}Section',
            template:'#templateRecommend${viewType}Section',
            'refresh':function(data){
                  var bestrecommands=data.bestPriceRecommend;
                  this.set("hotelRecommendList",bestrecommands);
                  this.updateModel(); 
            },
            data:{
                  'hotelRecommendList':${bestRecommends},
            }
      });
});
</script>
