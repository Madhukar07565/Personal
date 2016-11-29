<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="hotel" tagdir="/WEB-INF/tags/responsive/ezg/hotel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="${viewType}Result"></div>
<script id="template${viewType}Result" type="text/ractive">
{{#each hotelList:num}}
	<c:if test="${viewType=='grid'}"><hotel:singlegridhotel/></c:if>
	<c:if test="${viewType=='list'}"><hotel:singlelisthotel/></c:if>
{{/each}}
</script>
<script>
var ractiveTopHotel = ractiveTopHotel ? ractiveTopHotel : {};
$(function(){
      ractiveTopHotel.${viewType}result= new Ractive({
            el:'#${viewType}Result',
            template:'#template${viewType}Result',
            'refresh':function(data){
                  var hotelList=data.result;
                  this.set("hotelList",hotelList);
                  this.updateModel(); 
            },
            data:{
                  'hotelList':${hotelList},
            }
      });
});
</script>


