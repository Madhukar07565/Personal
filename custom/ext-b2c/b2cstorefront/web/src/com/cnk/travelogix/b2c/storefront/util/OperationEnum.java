/**
 * 
 */
package com.cnk.travelogix.b2c.storefront.util;

/**
 * @author i054410
 *
 */
public enum OperationEnum
{
  CREATE("C"), READ("R"), UPDATE("U"),DELETE("D");
	
	private String id;
	private OperationEnum(String op){
		this.id = op;
	}
	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}
	
	
}
