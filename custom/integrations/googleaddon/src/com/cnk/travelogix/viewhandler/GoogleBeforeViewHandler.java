package com.cnk.travelogix.viewhandler;

import de.hybris.platform.acceleratorservices.storefront.data.MetaElementData;
import de.hybris.platform.addonsupport.config.javascript.BeforeViewJsPropsHandlerAdaptee;
import de.hybris.platform.util.Config;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;

/**
 * GoogleBeforeViewHandler to get the details for google 
 */
public class GoogleBeforeViewHandler extends BeforeViewJsPropsHandlerAdaptee
{
	@Override
	public String beforeViewJsProps(final HttpServletRequest request, final HttpServletResponse response, final ModelMap model,
			final String viewName)
	{
		final List<MetaElementData> metaelements = (List<MetaElementData>) model.get("metatags");
		if (metaelements != null)
		{
			metaelements.add(createMetaElement("google-signin-scope", "profile"));
			metaelements.add(createMetaElement("google-signin-client_id", Config.getParameter("google.auth.tracking.id")));
		}
		return viewName;
	}

	protected MetaElementData createMetaElement(final String name, final String content)
	{
		final MetaElementData element = new MetaElementData();
		element.setName(name);
		element.setContent(content);
		return element;
	}
}
