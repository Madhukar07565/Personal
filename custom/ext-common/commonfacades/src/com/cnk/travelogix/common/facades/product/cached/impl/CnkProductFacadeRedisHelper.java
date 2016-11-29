/**
 *
 */
package com.cnk.travelogix.common.facades.product.cached.impl;

import org.springframework.data.redis.core.RedisTemplate;

import com.cnk.travelogix.common.facades.product.cached.CnkCachedHelper;


/**
 * @author i313879
 *
 */
public class CnkProductFacadeRedisHelper implements CnkCachedHelper
{
	private RedisTemplate redisTemplate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.CnkCacheHelper#getObject(java.lang.Object)
	 */
	@Override
	public Object getObject(final Object Key)
	{
		// YTODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.cnk.travelogix.common.facades.product.cached.CnkCacheHelper#saveObject(java.lang.Object,
	 * java.lang.Object)
	 */
	@Override
	public boolean saveObject(final Object key, final Object value)
	{
		// YTODO Auto-generated method stub
		return false;
	}
}
