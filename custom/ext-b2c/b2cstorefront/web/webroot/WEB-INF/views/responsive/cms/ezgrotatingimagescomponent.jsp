<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="bannerSlider" class="clearfix">
	<c:forEach items="${banners}" var="banner" begin="0" end="${tabSize-1}" varStatus="status">
		 <div  class="posR"> 
		 	<c:if test="${status.index==0}">
		 		<img src="${banner.media.url}"   class="w100pcnt" />
		 	</c:if>
		 	<c:if test="${status.index!=0}">
		 		<img data-lazy="${banner.media.url}"   class="w100pcnt" />
		 	</c:if>
	        <div class="bannerTxt">
	          <p class="tagLine fontColorWht">${banner.title}</p>
	          <p class="bannerSecHeading"> ${banner.content} </p>
	        </div>
	      </div>
	</c:forEach>
</div>