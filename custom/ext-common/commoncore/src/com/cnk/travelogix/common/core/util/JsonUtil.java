/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 *
 *
 */

package com.cnk.travelogix.common.core.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.type.JavaType;


/**
 * {@literal utility class for converting JSON string to/from class}
 *
 * @author i323727
 *
 */
public class JsonUtil
{

	/**
	 * {@literal Convert JSON string to class<T1>}
	 *
	 * @param jsonString
	 * @param clazz
	 * @return T1
	 * @throws IOException
	 *            when JSON format is not right
	 */
	public static <T1> T1 toObject(final String jsonString, final Class<T1> clazz)
	{
		final ObjectMapper mapper = newObjectMapper();
		try
		{
			return mapper.readValue(jsonString, clazz);
		}
		catch (final Exception e)
		{
			final StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("exception occurs when convert jsonString to Object, ");
			stringBuilder.append("jsonString:").append(jsonString).append(", ");
			stringBuilder.append("class:").append(clazz);
			throw new RuntimeException(stringBuilder.toString(), e);
		}
	}


	/**
	 * {@literal convert JSON string to List of class<T1>}
	 *
	 * @param jsonString
	 * @param clazz
	 * @return List&lt;T1>
	 * @throws IOException
	 */
	public static <T1> List<T1> toList(final String jsonString, final Class<T1> clazz)
	{
		final ObjectMapper mapper = newObjectMapper();
		final JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, clazz);
		try
		{
			return (List<T1>) mapper.readValue(jsonString, javaType);
		}
		catch (final Exception e)
		{
			final StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("exception occurs when conver jsonString to list, ");
			stringBuilder.append("jsonString:").append(jsonString).append(", ");
			stringBuilder.append("class:").append(clazz);
			throw new RuntimeException(stringBuilder.toString(), e);
		}
	}

	/**
	 * {@literal convert object to JSON string}
	 *
	 * @param object
	 * @return JSON String
	 * @throws IOException
	 */
	public static String toJson(final Object object)
	{
		final ObjectMapper objectMapper = newObjectMapper();
		final JsonFactory jsonFactory = new JsonFactory();
		final StringWriter stringWriter = new StringWriter();
		JsonGenerator jsonGenerator;
		try
		{
			jsonGenerator = jsonFactory.createJsonGenerator(stringWriter);
			objectMapper.writeValue(jsonGenerator, object);
		}
		catch (final Exception e)
		{
			final StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("exception occurs when conver object to jsonString, ");
			stringBuilder.append("object:").append(object);
			throw new RuntimeException(stringBuilder.toString(), e);
		}
		return stringWriter.toString();
	}

	/**
	 *
	 * @return new ObjectMapper with built-in configuration
	 */
	private static ObjectMapper newObjectMapper()
	{
		final ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationConfig.Feature.WRITE_NULL_MAP_VALUES, false);
		objectMapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_NULL);
		return objectMapper;
	}

	/**
	 * convert object to self-explanatory url encoded String
	 *
	 * @param bean
	 * @return parameter string with url-form-encoded format
	 */
	public static String wrap(final Object bean)
	{
		final String className = bean.getClass().getName();
		final String target = toJson(bean);
		final StringBuilder stringBuilder = new StringBuilder("type=");
		stringBuilder.append(className);
		stringBuilder.append("&target=");
		stringBuilder.append(target);
		return stringBuilder.toString();
	}

	/**
	 * convert the url encoded string to object
	 *
	 * @param wrappedString
	 * @return the wrapped object
	 */
	public static <T1> T1 unwrap(final String wrappedString)
	{
		final int classNameStartIndex = "type=".length();
		final int classNameEndIndex = wrappedString.indexOf("&target=");
		final String className = wrappedString.substring(classNameStartIndex, classNameEndIndex);
		final String targetJson = wrappedString.substring(classNameEndIndex + "&target=".length());
		try
		{
			return (T1) JsonUtil.toObject(targetJson, Class.forName(className));
		}
		catch (final ClassNotFoundException e)
		{
			throw new RuntimeException("JsonMapper unwrap error occurs", e);
		}
	}
}
