/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.inventory.core.jalo;

import com.cnk.travelogix.common.inventory.core.constants.CommoninventorycoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.common.inventory.core.jalo.FreeOfCostSeatsOrTickets FreeOfCostSeatsOrTickets}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFreeOfCostSeatsOrTickets extends GenericItem
{
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.slabType</code> attribute **/
	public static final String SLABTYPE = "slabType";
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute **/
	public static final String FROMVALUE = "fromValue";
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute **/
	public static final String TOVALUE = "toValue";
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute **/
	public static final String NUMBEROFFREES = "numberOfFrees";
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute **/
	public static final String FREEOFCOSTPERCENTAGE = "freeOfCostPercentage";
	/** Qualifier of the <code>FreeOfCostSeatsOrTickets.every</code> attribute **/
	public static final String EVERY = "every";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(FROMVALUE, AttributeMode.INITIAL);
		tmp.put(TOVALUE, AttributeMode.INITIAL);
		tmp.put(NUMBEROFFREES, AttributeMode.INITIAL);
		tmp.put(FREEOFCOSTPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(EVERY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.every</code> attribute.
	 * @return the every - Every
	 */
	public String getEvery(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.every</code> attribute.
	 * @return the every - Every
	 */
	public String getEvery()
	{
		return getEvery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.every</code> attribute. 
	 * @param value the every - Every
	 */
	public void setEvery(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.every</code> attribute. 
	 * @param value the every - Every
	 */
	public void setEvery(final String value)
	{
		setEvery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute.
	 * @return the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public Integer getFreeOfCostPercentage(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FREEOFCOSTPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute.
	 * @return the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public Integer getFreeOfCostPercentage()
	{
		return getFreeOfCostPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @return the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public int getFreeOfCostPercentageAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFreeOfCostPercentage( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @return the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public int getFreeOfCostPercentageAsPrimitive()
	{
		return getFreeOfCostPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @param value the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public void setFreeOfCostPercentage(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FREEOFCOSTPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @param value the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public void setFreeOfCostPercentage(final Integer value)
	{
		setFreeOfCostPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @param value the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public void setFreeOfCostPercentage(final SessionContext ctx, final int value)
	{
		setFreeOfCostPercentage( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.freeOfCostPercentage</code> attribute. 
	 * @param value the freeOfCostPercentage - Free Of Cost Percentage.
	 */
	public void setFreeOfCostPercentage(final int value)
	{
		setFreeOfCostPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute.
	 * @return the fromValue - From Value.
	 */
	public Integer getFromValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute.
	 * @return the fromValue - From Value.
	 */
	public Integer getFromValue()
	{
		return getFromValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @return the fromValue - From Value.
	 */
	public int getFromValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @return the fromValue - From Value.
	 */
	public int getFromValueAsPrimitive()
	{
		return getFromValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @param value the fromValue - From Value.
	 */
	public void setFromValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @param value the fromValue - From Value.
	 */
	public void setFromValue(final Integer value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @param value the fromValue - From Value.
	 */
	public void setFromValue(final SessionContext ctx, final int value)
	{
		setFromValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.fromValue</code> attribute. 
	 * @param value the fromValue - From Value.
	 */
	public void setFromValue(final int value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute.
	 * @return the numberOfFrees - Number Of Frees.
	 */
	public Long getNumberOfFrees(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, NUMBEROFFREES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute.
	 * @return the numberOfFrees - Number Of Frees.
	 */
	public Long getNumberOfFrees()
	{
		return getNumberOfFrees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @return the numberOfFrees - Number Of Frees.
	 */
	public long getNumberOfFreesAsPrimitive(final SessionContext ctx)
	{
		Long value = getNumberOfFrees( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @return the numberOfFrees - Number Of Frees.
	 */
	public long getNumberOfFreesAsPrimitive()
	{
		return getNumberOfFreesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @param value the numberOfFrees - Number Of Frees.
	 */
	public void setNumberOfFrees(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, NUMBEROFFREES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @param value the numberOfFrees - Number Of Frees.
	 */
	public void setNumberOfFrees(final Long value)
	{
		setNumberOfFrees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @param value the numberOfFrees - Number Of Frees.
	 */
	public void setNumberOfFrees(final SessionContext ctx, final long value)
	{
		setNumberOfFrees( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.numberOfFrees</code> attribute. 
	 * @param value the numberOfFrees - Number Of Frees.
	 */
	public void setNumberOfFrees(final long value)
	{
		setNumberOfFrees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.slabType</code> attribute.
	 * @return the slabType - Slab Type
	 */
	public EnumerationValue getSlabType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.slabType</code> attribute.
	 * @return the slabType - Slab Type
	 */
	public EnumerationValue getSlabType()
	{
		return getSlabType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.slabType</code> attribute. 
	 * @param value the slabType - Slab Type
	 */
	public void setSlabType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.slabType</code> attribute. 
	 * @param value the slabType - Slab Type
	 */
	public void setSlabType(final EnumerationValue value)
	{
		setSlabType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute.
	 * @return the toValue - From Value.
	 */
	public Integer getToValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute.
	 * @return the toValue - From Value.
	 */
	public Integer getToValue()
	{
		return getToValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @return the toValue - From Value.
	 */
	public int getToValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @return the toValue - From Value.
	 */
	public int getToValueAsPrimitive()
	{
		return getToValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @param value the toValue - From Value.
	 */
	public void setToValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @param value the toValue - From Value.
	 */
	public void setToValue(final Integer value)
	{
		setToValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @param value the toValue - From Value.
	 */
	public void setToValue(final SessionContext ctx, final int value)
	{
		setToValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FreeOfCostSeatsOrTickets.toValue</code> attribute. 
	 * @param value the toValue - From Value.
	 */
	public void setToValue(final int value)
	{
		setToValue( getSession().getSessionContext(), value );
	}
	
}
