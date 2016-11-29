<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<div id="${viewType}sortedBy"></div>
<script id="template${viewType}SortedBy" type="text/ractive">
<section  class="mB20 clearfix">
			<h4 class="gridTitle fL pL40 fW600">Search results</h4>
			<span class="fR">
				<h4 class="fS16 fL mR5 fW600">Sort by:</h4> 
				        <select class="fR" on-change="sort('${viewType}')" value={{selectedCode}}> 
								{{#each sortConditionList[0].conditions}}
                                    <option value="{{code}}">{{name}}</option> 
                                {{/each}}
                        </select>
			</span>
		</section>
</script>
<script>
var ractiveTopHotel = ractiveTopHotel ? ractiveTopHotel : {};
$(function(){
      ractiveTopHotel.${viewType}sortBy= new Ractive({
            el:'#${viewType}sortedBy',
            template:'#template${viewType}SortedBy',
            data:{
              'sortConditionList':${sortContionList},
       		  'selectedCode':'Price'
            }
      });
});
</script>