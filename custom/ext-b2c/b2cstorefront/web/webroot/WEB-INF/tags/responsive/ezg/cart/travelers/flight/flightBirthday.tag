<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<ul class="fieldRow clearfix mB20">
				           <li class="fL">
				             <label>Date of birth*</label>
				           </li>
	<input disabled="disabled" type="text" name="childBirthday" data-format="DD-MM-YYYY" data-template="D MMM YYYY"  value="09-01-2016">
	<script type="text/javascript" src="${ezgJsPath}/moment.js"></script>
	<script type="text/javascript" src="${ezgJsPath}/jquery.combodate.js"></script>
 
</ul>