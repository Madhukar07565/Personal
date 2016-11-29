<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<li class="col_6 col_sm_12 pD20">
	<div id="hotelSlideshow" class="mB10">
	<c:forEach items="${hotelData.hotelPictureUrl}" var="hotelPictureUrl">
		<div>
			<img  style="width:100%;" data-lazy="${ezgImagesPath}${hotelPictureUrl}"/>
		</div>
	</c:forEach>
	</div>
</li>