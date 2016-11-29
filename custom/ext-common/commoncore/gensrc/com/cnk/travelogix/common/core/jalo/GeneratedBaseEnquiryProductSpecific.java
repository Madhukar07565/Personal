/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.common.core.jalo;

import com.cnk.travelogix.common.core.constants.CommonCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem BaseEnquiryProductSpecific}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBaseEnquiryProductSpecific extends GenericItem
{
	/** Qualifier of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute **/
	public static final String NUMBEROFADULTS = "numberOfAdults";
	/** Qualifier of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute **/
	public static final String NUMBEROFCHILDREN = "numberOfChildren";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NUMBEROFADULTS, AttributeMode.INITIAL);
		tmp.put(NUMBEROFCHILDREN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute.
	 * @return the numberOfAdults
	 */
	public Integer getNumberOfAdults(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFADULTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute.
	 * @return the numberOfAdults
	 */
	public Integer getNumberOfAdults()
	{
		return getNumberOfAdults( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @return the numberOfAdults
	 */
	public int getNumberOfAdultsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfAdults( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @return the numberOfAdults
	 */
	public int getNumberOfAdultsAsPrimitive()
	{
		return getNumberOfAdultsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @param value the numberOfAdults
	 */
	public void setNumberOfAdults(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFADULTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @param value the numberOfAdults
	 */
	public void setNumberOfAdults(final Integer value)
	{
		setNumberOfAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @param value the numberOfAdults
	 */
	public void setNumberOfAdults(final SessionContext ctx, final int value)
	{
		setNumberOfAdults( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfAdults</code> attribute. 
	 * @param value the numberOfAdults
	 */
	public void setNumberOfAdults(final int value)
	{
		setNumberOfAdults( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute.
	 * @return the numberOfChildren
	 */
	public Integer getNumberOfChildren(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NUMBEROFCHILDREN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute.
	 * @return the numberOfChildren
	 */
	public Integer getNumberOfChildren()
	{
		return getNumberOfChildren( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @return the numberOfChildren
	 */
	public int getNumberOfChildrenAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNumberOfChildren( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @return the numberOfChildren
	 */
	public int getNumberOfChildrenAsPrimitive()
	{
		return getNumberOfChildrenAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @param value the numberOfChildren
	 */
	public void setNumberOfChildren(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NUMBEROFCHILDREN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @param value the numberOfChildren
	 */
	public void setNumberOfChildren(final Integer value)
	{
		setNumberOfChildren( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @param value the numberOfChildren
	 */
	public void setNumberOfChildren(final SessionContext ctx, final int value)
	{
		setNumberOfChildren( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BaseEnquiryProductSpecific.numberOfChildren</code> attribute. 
	 * @param value the numberOfChildren
	 */
	public void setNumberOfChildren(final int value)
	{
		setNumberOfChildren( getSession().getSessionContext(), value );
	}
	
}
