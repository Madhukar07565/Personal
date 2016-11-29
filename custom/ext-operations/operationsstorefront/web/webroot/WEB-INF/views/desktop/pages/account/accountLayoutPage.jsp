<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/desktop/template" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>
<%@ taglib prefix="common" tagdir="/WEB-INF/tags/desktop/common" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<template:page pageTitle="${pageTitle}">
	<div id="globalMessages">
		<common:globalMessages/>
	</div>
	
	<table border="1">
		<c:forEach items="${compWithUserGroupMemberFlag}" var="entry">
					<tr><td>
					<input type="checkbox"  id="${entry.key.uid}" name="compname" value="${entry.key.uid}" checked="${entry.value}"/>
					${entry.key.name}
					</td></tr>			
		</c:forEach>
	</table>
	
	
		<div class="span-24">
			<div class="span-4 accountLeftNavigation">
				<cms:pageSlot position="SideContent" var="feature">
					<cms:component component="${feature}"/>
				</cms:pageSlot>
			</div>
		<div class="span-20 last accountContentPane">
			<cms:pageSlot position="TopContent" var="feature" element="div" class="accountTopContentSlot">
				<cms:component component="${feature}" element="div" class="clearfix" />
			</cms:pageSlot>
			<cms:pageSlot position="BodyContent" var="feature" element="div" class="accountBodyContentSlot">
				<cms:component component="${feature}" element="div" class="clearfix" />
			</cms:pageSlot>
			<cms:pageSlot position="BottomContent" var="feature" element="div" class="accountBottomContentSlot">
				<cms:component component="${feature}" element="div" class="clearfix" />
			</cms:pageSlot>
		</div>
	</div>
</template:page>