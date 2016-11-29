/**
 *
 */
package com.cnk.travelogix.common.facades.product.facet.impl;

import java.util.HashMap;
import java.util.Map;

import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;


/**
 * @author i313879
 *
 */
public class AccesserFactory
{
	private static final Logger LOG = Logger.getLogger(AccesserFactory.class);

	/** Parameter types for call with no parameters. */
	private static final CtClass[] NO_ARGS = {};

	private final Map<String, IAccess> accessorMap = new HashMap();

	public IAccess getAccessor(final String targetClassName, final String getMethod)
	{
		final String key = targetClassName + getMethod + "Accessor";
		if (accessorMap.get(key) == null)
		{
			synchronized (accessorMap)
			{
				if (accessorMap.get(key) == null)
				{
					final IAccess accessor = this.createAccessor(targetClassName, getMethod);
					accessorMap.put(key, accessor);
					return accessor;
				}
			}
		}
		return accessorMap.get(key);
	}

	private IAccess createAccessor(final String targetClassName, String propertyName)
	{
		// build generator for the new class

		final ClassPool pool = ClassPool.getDefault();
		pool.appendClassPath(new ClassClassPath(this.getClass()));

		propertyName = StringUtils.capitalise(propertyName);

		final CtClass clas = pool.makeClass(targetClassName + propertyName + "Accessor");
		try
		{
			clas.addInterface(pool.get("com.cnk.travelogix.common.facades.product.facet.impl.IAccess"));
			final CtClass target = pool.get("java.lang.Object");

			// add public default constructor method to class
			final CtConstructor cons = new CtConstructor(NO_ARGS, clas);
			cons.setBody(";");
			clas.addConstructor(cons);


			// add public getValue method

			final CtClass[] target_class =
			{ target };

			final CtMethod meth = new CtMethod(pool.get("java.lang.Object"), "getValue", target_class, clas);
			meth.setBody("return ((" + targetClassName + ")$1).get" + propertyName + "();");
			clas.addMethod(meth);


			// new instance with the bytes
			final Class clazz = clas.toClass();
			IAccess access = null;

			access = (IAccess) clazz.newInstance();
			return access;
		}
		catch (final Exception ex)
		{
			LOG.error(ex);
			return null;
		}

	}
}
