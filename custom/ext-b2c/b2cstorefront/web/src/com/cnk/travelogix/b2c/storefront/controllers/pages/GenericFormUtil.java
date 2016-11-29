/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.controllers.pages;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.log4j.Logger;
import org.springframework.ui.context.Theme;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author i054410
 *
 */
public interface GenericFormUtil
{
	 static final ObjectMapper mapper = new ObjectMapper();
	 static final Logger LOGGER = Logger.getLogger(GenericFormUtil.class);
	/**
	 * use to transform Java Obejct to Json
	 *
	 */
	default String writeToJson(final Object obj)
	{
		try
		{
			return mapper.writeValueAsString(obj);
		}
		catch (final JsonProcessingException e)
		{
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	default<T> T copyValue(final Object from, final Class<T> to)
	{
		try
		{
			T newInstance = to.getConstructor().newInstance();
			BeanUtils.copyProperties(newInstance, from);
			return newInstance;
		}
		catch (IllegalAccessException | InvocationTargetException | InstantiationException | IllegalArgumentException
				| NoSuchMethodException | SecurityException e)
		{
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	default <T> List<T> MultiCopyValue(List<?> creditCardList, Class<T> to)
	{
		List<T> list = new ArrayList<T>();
		if (CollectionUtils.isNotEmpty(creditCardList))
		{
			creditCardList.forEach(from -> {
				final T copyValue = copyValue(from, to);
				if (copyValue != null)
				{
					list.add(copyValue);
				}
			});
		}
		return list;
	}
	
	default String initMonthList(HttpServletRequest request){
		Map mm = new HashMap();
		Theme theme = RequestContextUtils.getTheme(request);
		Arrays.asList(
				"general.month.january:0", 
				"general.month.february:1", 
				"general.month.march:2", 
				"general.month.april:3", 
				"general.month.may:4", 
				"general.month.june:5", 
				"general.month.july:6", 
            "general.month.august:7",
            "general.month.september:8",
            "general.month.october:9",
            "general.month.november:10", 
            "general.month.december:11").forEach(month->{
			String[] split = month.split(":");
			String message = theme.getMessageSource().getMessage(split[0], null, RequestContextUtils.getLocale(request));
			mm.put(message, split[1]);
		});
		return this.writeToJson(mm);

	}
}
