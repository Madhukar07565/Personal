<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 

<c:set var="targetClass" value="primary_navigation_inner"></c:set>
<c:set var="targetId" value=""></c:set> 
<c:if test="${component.isForHomePage}">
 <c:set var="targetClass" value="primaryNavigation_fixed"></c:set>
 <c:set var="targetId" value="primary_navigation"></c:set> 
</c:if>

<c:set value="${component.showSize}" var="showSize"></c:set>
<c:if test="${component.showSize>5}">
	<c:set value="5" var="showSize"></c:set>
</c:if>
<c:if test="${fn:length(component.ezgNavigationNodeComponents)>5}">
	<c:set value="${component.showSize-1}" var="moreSize"></c:set>
</c:if>

<c:set var="selectedNode" value="${tabName}"></c:set>

<div class="${targetClass}" id="${targetId}">
    <nav>
      <div class="container">
        <ul class="lftPnl fL" id="mainNav">
        	<c:forEach begin="0" end="${showSize-1}" items="${component.ezgNavigationNodeComponents}" var="navNode" varStatus="status">
        	       <li id="priNav${navNode.orderNumber}" data-name="${navNode.name}" data-value="${navNode.value}" onClick="goToElement('bannerSlider');" class="t 
        	       		<c:if test='${navNode.value==selectedNode}'>sel</c:if>">
        	       	<a href="javascript:void(0);"><span class="lftPnl${status.index+1} fL"></span>${navNode.name}</a>
        	       </li>
        	</c:forEach>
        </ul>
        <c:if test="${component.showSize>5}"> 
 	        <div class="more fL posR" id="moreTab">
	        <a href="javascript:void(0);" onclick="showMoreOptions()">More<span class="moreAro"></span></a>
	          <div class="moreOptionsContainer">
	            <ul id="moreOptions" class="dropdown-menu" style="display:none;">
				  <c:set var="index" value="1"></c:set>
				<!--   <li class="sel dN" id="replaceSec">
				  	<a href="javascript:void(0);" onClick="addnewtab(1,'Activities')">
				  	<span class="morePnl1 fL"></span>Activities</a>
				  </li> -->
				  
				  <c:forEach begin="${showSize}" end="${moreSize}" items="${component.ezgNavigationNodeComponents}" var="navNode" >
	        	       <li class="showHideTab" data-index="${index}" data-name="${navNode.name}">
	        	             <a href="javascript:void(0);">
	        	             <span class="morePnl${index} fL"></span>${navNode.name}</a>
	        	       </li>
	        	 <c:set var="index" value="${index+1}"></c:set>
	        	</c:forEach>
	            </ul>
	          </div>
	        </div>
         </c:if> 
         <a href="javascript:void(0);" class="shareHolidayBtn">Share your holiday<span>Get followers. Make money.</span></a> </div>
    </nav>
  </div>
<script> 
 $(function(){
	 var sel = "${selectedNode}";
	 if(sel != 'flight'){
		 $('#mainNav').find('li').each(function(index){
			if($(this).hasClass("sel")){
				for (var i = 0; i < 5; i++) {
					$("#primary_navigation_containerpriNav" + (1 + i)).hide();
					if (index == i) {
						$("#primary_navigation_containerpriNav"+ (1 + i)).show();
					}
				}
			}
		 });
	 }
 })
</script>