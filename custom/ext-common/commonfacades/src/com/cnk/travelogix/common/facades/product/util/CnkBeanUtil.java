/**
 *
 */
package com.cnk.travelogix.common.facades.product.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.log4j.Logger;

import com.cnk.travelogix.common.core.model.EnquiryChatModel;
import com.cnk.travelogix.common.core.model.UserJourneyPhoneModel;
import com.cnk.travelogix.common.facades.userjourney.data.EnquiryChatData;
import com.cnk.travelogix.common.facades.userjourney.data.UserJourneyPhoneData;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.common.base.Stopwatch;


/**
 * @author i313879
 *
 */
public class CnkBeanUtil
{
	public static final Logger LOG = Logger.getLogger(CnkBeanUtil.class);

	/**
	 * <ul>
	 * <li>List, Map cannot be mapped.
	 * <li>If A is part of B, specify A as an element of parameter partOfClasses so that it could be mapped recursively.
	 * <li>Key fields like PK should be avoided to map.
	 * </ul>
	 *
	 * <p>
	 * Note: Recursive partof expanding only work once. The PropertyDescriptor[] could be cached later for improvement.
	 *
	 * @param fromBean
	 * @param toBean
	 * @param partOfClasses
	 * @throws IntrospectionException
	 */
	public static void copyProperties(final Object fromBean, final Object toBean, final Class... partOfClasses)
			throws IntrospectionException
	{
		if (LOG.isDebugEnabled())
		{
			LOG.debug("copyProperties(Object, Object) - start");
		}

		final List<Class> partOfClassList;
		if (null != partOfClasses)
		{
			partOfClassList = Arrays.stream(partOfClasses).collect(Collectors.toList());
		}
		else
		{
			partOfClassList = new ArrayList<>();
		}
		Stopwatch sw = null;
		if (LOG.isDebugEnabled())
		{
			sw = Stopwatch.createStarted();
		}
		final PropertyDescriptor[] fromPropertyDescriptors = Introspector.getBeanInfo(fromBean.getClass()).getPropertyDescriptors();
		final PropertyDescriptor[] toPropertyDescriptors = Introspector.getBeanInfo(toBean.getClass()).getPropertyDescriptors();

		final Map<PropertyDescriptor, PropertyDescriptor> directMaps = new HashMap<>();
		final Map<PropertyDescriptor, PropertyDescriptor> indirectMaps = new HashMap<>();
		final List<PropertyDescriptor> ignoredPropertyDescriptors = new ArrayList<>(fromPropertyDescriptors.length);
		final List<PropertyDescriptor> badMappingList = new ArrayList<>(fromPropertyDescriptors.length);

		final Map<String, PropertyDescriptor> toPropertyDescriptorMap = Arrays.stream(toPropertyDescriptors).collect(
				Collectors.toMap(PropertyDescriptor::getName, p -> p));
		Arrays.stream(fromPropertyDescriptors).forEach(fromPD -> {
			final PropertyDescriptor toPD = toPropertyDescriptorMap.get(fromPD.getName());
			if (null == toPD || null == toPD.getWriteMethod())
			{
				ignoredPropertyDescriptors.add(fromPD);
			}
			else if (fromPD.getPropertyType().equals(toPD.getPropertyType()))
			{
				directMaps.put(fromPD, toPD);
			}
			else
			{
				indirectMaps.put(fromPD, toPD);
			}
		});
		directMaps.forEach((fromPD, toPD) -> {
			try
			{
				toPD.getWriteMethod().invoke(toBean, fromPD.getReadMethod().invoke(fromBean));
			}
			catch (final Exception e)
			{
				badMappingList.add(fromPD);
				LOG.error("copyProperties(Object, Object) - directMaps.forEach((fromPD, toPD)", e);
			}
		});
		indirectMaps.forEach((fromPD, toPD) -> {
			try
			{
				if (partOfClassList.contains(toPD.getPropertyType()))
				{
					final Object fromValue = fromPD.getReadMethod().invoke(fromBean);
					Object toValue = null;
					if (null != fromValue)
					{
						toValue = toPD.getReadMethod().invoke(toBean);
						toValue = (null == toValue ? toPD.getPropertyType().newInstance() : toValue);
						toPD.getWriteMethod().invoke(toBean, toValue);
						copyProperties(fromValue, toValue);
					}
					else
					{
						ignoredPropertyDescriptors.add(fromPD);
					}
				}
			}
			catch (final Exception e)
			{
				badMappingList.add(fromPD);
				LOG.error("copyProperties(Object, Object) - indirectMaps.forEach((fromPD, toPD)", e);
			}
		});

		if (LOG.isDebugEnabled())
		{
			final String fromClass = fromBean.getClass().getSimpleName();
			final String toClass = toBean.getClass().getSimpleName();
			final String logTemplate = "copyProperties(%s, %s) - %s properties are %s mapped.";
			LOG.debug(String.format(logTemplate, fromClass, toClass, Integer.valueOf(directMaps.size()), "directly"));
			LOG.debug(String.format(logTemplate, fromClass, toClass, Integer.valueOf(indirectMaps.size()), "indirectly"));
			LOG.debug(String.format(logTemplate, fromClass, toClass, Integer.valueOf(ignoredPropertyDescriptors.size()), "not"));
			if (ignoredPropertyDescriptors.size() > 0)
			{
				final String ignoredDetails = ignoredPropertyDescriptors.stream().map(pd -> {
					return pd.getPropertyType().getName().concat("::").concat(pd.getName());
				}).collect(Collectors.joining("\n"));
				LOG.debug("copyProperties(Object, Object) - ignored PropertyDescriptors" + ignoredDetails);
			}
			LOG.debug(String.format(logTemplate, fromClass, toClass, Integer.valueOf(badMappingList.size()), "unsuccessfully"));
			if (badMappingList.size() > 0)
			{
				final String badDetails = badMappingList.stream().map(pd -> {
					return pd.getPropertyType().getName().concat("::").concat(pd.getName());
				}).collect(Collectors.joining("\n"));
				LOG.debug("copyProperties(Object, Object) - ignored PropertyDescriptors" + badDetails);
			}
			LOG.debug("copyProperties(Object, Object) - end - time used for mapping: " + sw.toString()); //$NON-NLS-1$
		}
	}

	public static void main(final String[] args) throws Exception
	{
		Arrays.stream(new int[]
		{ 1, 2, 3 }).forEach(p -> {
			try
			{
				final Stopwatch sw = Stopwatch.createStarted();
				final String jsonString = "{'title':'afasdf','firstName':'','middleName':'','lastName':'','mobileNo':{'countryCode':'1','areaCode':'2','number':'3'},'email':'rrrrrrrkjhgfdfghjklhg'}";
				final EnquiryChatData enquiryChatData = getObjectMapper().readValue(jsonString, EnquiryChatData.class);
				System.out.println("Time for json to bean:" + sw.stop().toString());
				sw.reset().start();
				final EnquiryChatModel enquiryChatModel = new EnquiryChatModel();
				copyProperties(enquiryChatData, enquiryChatModel, UserJourneyPhoneModel.class);
				System.out.println("Time for data bean to model bean:" + sw.stop().toString());
				sw.reset().start();
				final EnquiryChatData enquiryChatData2 = new EnquiryChatData();
				copyProperties(enquiryChatModel, enquiryChatData2, UserJourneyPhoneData.class);
				System.out.println("Time for model bean to data bean:" + sw.stop().toString());
			}
			catch (final Exception e)
			{
				e.printStackTrace();
			}
		});
	}

	public static String getString(final Object beanData)
	{
		try
		{
			// handle lazy load ItemModel
			final StringBuilder infoBuilder = new StringBuilder();
			infoBuilder.append("{ ");
			final BeanInfo beanInfo = Introspector.getBeanInfo(beanData.getClass());
			Arrays.stream(beanInfo.getPropertyDescriptors()).sorted((pd1, pd2) -> {
				return pd1.getName().compareTo(pd2.getName());
			}).forEach(pd -> {
				final String key = pd.getName();
				String value = null;
				if (null != pd.getReadMethod())
				{
					try
					{
						value = String.valueOf(pd.getReadMethod().invoke(beanData));
					}
					catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
					{
						LOG.error("getString(final Object)", e);
					}
				}
				infoBuilder.append(key + ": " + value + ", ");
			});
			infoBuilder.append(" }");
			return infoBuilder.toString().replaceFirst(", }$", "}");
		}
		catch (final Exception e)
		{
			LOG.error("getString(final Object)", e);
		}
		return ReflectionToStringBuilder.toString(beanData, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/**
	 * The below solution could be used to handle time zone issue
	 *
	 * http://stackoverflow.com/questions/5591967/how-to-deserialize-js-date-using-jackson
	 *
	 * @return ObjectMapper
	 */
	public static ObjectMapper getObjectMapper()
	{
		final ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
		objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
		objectMapper.configure(JsonParser.Feature.STRICT_DUPLICATE_DETECTION, false);
		objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		return objectMapper;
	}

	public static <T> T getBeanFromJson(final String json, final Class returnType)
	{
		if (StringUtils.isBlank(json))
		{
			return null;
		}
		try
		{
			return (T) getObjectMapper().readValue(json, returnType);
		}
		catch (final Exception e)
		{
			LOG.error("getBeanFromJson(String, Class)", e);
		}
		return null;
	}

	public static <T> List<T> getBeanListFromJson(final String json, final Class returnType)
	{
		if (StringUtils.isBlank(json))
		{
			return null;
		}
		final TypeFactory typeFactory = getObjectMapper().getTypeFactory();
		try
		{
			return (List<T>) getObjectMapper().readValue(json, typeFactory.constructCollectionType(List.class, returnType));
		}
		catch (final IOException e)
		{
			LOG.error("getBeanListFromJson(String, Class)", e);
			return null;
		}
	}

	public static String getJsonFromObject(final Object object)
	{
		if (null == object)
		{
			return "";
		}
		try
		{
			return getObjectMapper().writeValueAsString(object);
		}
		catch (final JsonProcessingException e)
		{
			LOG.error("getJsonFromObject(Object)", e);
			return "";
		}
	}

}
