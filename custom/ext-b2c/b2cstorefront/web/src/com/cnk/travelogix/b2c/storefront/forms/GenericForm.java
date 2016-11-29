/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.forms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author i054410
 *
 */
public class GenericForm<T>
{
	private Object meta;
	private List<T> data = new ArrayList<T>();
	/**
	 * @return the meta
	 */
	public Object getMeta()
	{
		return meta;
	}
	/**
	 * @param meta the meta to set
	 */
	public void setMeta(MetaDataGenerator generator)
	{	
		this.meta = generator.generate();
	}
	/**
	 * @return the data
	 */
	public List<?> getData()
	{
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data)
	{
		this.data = data;
	}
	
	public void addData(T oo){
		this.data.add(oo);
	}

}
