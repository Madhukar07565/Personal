<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col_3 col_md_5 col_sm_3  pL0 pR0">
	<a href="${url}"> <img class="logo" src="${media.url}"
		alt="Ezeego1" /> <span class="isoText">${isoText}</span>
	</a>
</div>
<div class="col_3 col_md_5 col_sm_3 mT5 pL0 pR0">
	<ul class="globalNav">
		<li>${callNumber }</li>
		<li class="devider">&nbsp;</li>
		<li>${tollFree}</li>
	</ul>
</div>
<!-- 	<span class="globalSrc"> 
	<input type="text" placeholder="Search" class="fL">
	</span> -->