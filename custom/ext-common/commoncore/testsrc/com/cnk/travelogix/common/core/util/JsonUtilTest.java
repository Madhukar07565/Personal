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
/**
 *
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.ListUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author i323727
 *
 */
public class JsonUtilTest
{



	@Test
	public void testToObject()
	{
		final ClassA expected = new ClassA();
		expected.setFieldA("fa");
		final String jsonTarget = "{\"fieldA\":\"fa\"}";
		final ClassA actual = JsonUtil.toObject(jsonTarget, ClassA.class);
		Assert.assertEquals("to Object test passed", expected, actual);
	}

	@Test(expected = Exception.class)
	public void testToObjectThrow() throws IOException
	{
		final ClassA expected = new ClassA();
		expected.setFieldA("fa");
		final String jsonTarget = "{\"fieldA\":'aaa'}";
		JsonUtil.toObject(jsonTarget, ClassA.class);
	}



	@Test
	public void testToList1()
	{
		final ClassA ele = new ClassA();
		ele.setFieldA("fa");
		final List<ClassA> expected = new ArrayList<>();
		expected.add(ele);
		final List<ClassA> actual = JsonUtil.toList("[{\"fieldA\":\"fa\"}]", ClassA.class);
		Assert.assertTrue(ListUtils.isEqualList(expected, actual));
	}

	@Test
	public void testToList2()
	{
		final List<ClassB> expected = new ArrayList<>();
		final ClassB bInstance = new ClassB();
		final List<ClassA> list = new ArrayList<>();
		final ClassA aInstance = new ClassA();
		aInstance.setFieldA("fa");
		list.add(aInstance);
		bInstance.setaList(list);
		expected.add(bInstance);
		final String targetJson = "[{\"aList\":[{\"fieldA\":\"fa\"}]}]";
		final List<ClassB> actual = JsonUtil.toList(targetJson, ClassB.class);
		Assert.assertTrue(ListUtils.isEqualList(expected, actual));
	}

	@Test
	public void testToJson1()
	{
		final ClassA a = new ClassA();
		a.setFieldA("fa");
		final String expected = "{\"fieldA\":\"fa\"}";
		final String actual = JsonUtil.toJson(a);
		Assert.assertEquals("to Json test passed", expected, actual);
	}

	public void testToJson2()
	{
		final List<ClassA> list = new ArrayList<>();
		final ClassA a = new ClassA();
		a.setFieldA("fa");
		list.add(a);
		final String expected = "[{\"fieldA\":\"fa\"}]";
		final String actual = JsonUtil.toJson(list);
		Assert.assertEquals("to Json test passed", expected, actual);
	}

	public void testToJson3()
	{
		final ClassB b = new ClassB();
		final List<ClassA> list = new ArrayList<>();
		final ClassA a = new ClassA();
		a.setFieldA("fa");
		list.add(a);
		b.setaList(list);
		final String expected = "{\"aList\":[{\"fieldA\":\"fa\"}]}";
		final String actual = JsonUtil.toJson(b);
		Assert.assertEquals("to Json test passed", expected, actual);
	}

	public void testToJson4()
	{
		final List<ClassB> bList = new ArrayList<>();
		final ClassB b = new ClassB();
		final List<ClassA> list = new ArrayList<>();
		final ClassA a = new ClassA();
		a.setFieldA("fa");
		list.add(a);
		b.setaList(list);
		bList.add(b);
		final String expected = "[{\"aList\":[{\"fieldA\":\"fa\"}]}]";
		final String actual = JsonUtil.toJson(bList);
		Assert.assertEquals("to Json test passed", expected, actual);
	}

	@Test(expected = Exception.class)
	public void testToJsonThrow() throws IOException
	{
		final ClassC c = new ClassC();
		System.out.println(JsonUtil.toJson(c));
	}

	@Test
	public void testWrap()
	{
		final ClassA a = new ClassA();
		a.setFieldA("hello");
		Assert.assertEquals("type=com.cnk.travelogix.common.core.util.JsonUtilTest$ClassA&target={\"fieldA\":\"hello\"}",
				JsonUtil.wrap(a));
	}

	@Test
	public void testUnwrap()
	{
		final ClassA a = new ClassA();
		a.setFieldA("hello");

		final ClassA target = JsonUtil
				.unwrap("type=com.cnk.travelogix.common.core.util.JsonUtilTest$ClassA&target={\"fieldA\":\"hello\"}");
		Assert.assertEquals(a, target);
	}

	public static class ClassC
	{
		public ClassC()
		{
		}
	}

	public static class ClassB
	{
		List<ClassA> aList;

		@Override
		public boolean equals(final Object o)
		{
			if (o instanceof ClassB)
			{
				final ClassB b = (ClassB) o;
				return ListUtils.isEqualList(b.getaList(), getaList());
			}
			return false;
		}

		/**
		 * @return the aList
		 */
		public List<ClassA> getaList()
		{
			return aList;
		}

		/**
		 * @param aList
		 *           the aList to set
		 */
		public void setaList(final List<ClassA> aList)
		{
			this.aList = aList;
		}

	}

	public static class ClassA
	{
		private String fieldA;

		/**
		 * @return the fieldA
		 */
		public String getFieldA()
		{
			return fieldA;
		}

		/**
		 * @param fieldA
		 *           the fieldA to set
		 */
		public void setFieldA(final String fieldA)
		{
			this.fieldA = fieldA;
		}

		@Override
		public boolean equals(final Object o)
		{
			if (o instanceof ClassA)
			{
				final ClassA target = (ClassA) o;
				if (StringUtils.equals(target.getFieldA(), getFieldA()))
				{
					return true;
				}
			}
			return false;
		}

	}

}
