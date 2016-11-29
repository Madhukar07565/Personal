/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.ancillaryfOC.jalo.AncillaryFOC AncillaryFOC}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAncillaryFOC extends AbstractTravelogixSupplierOffer
{
	/** Qualifier of the <code>AncillaryFOC.noOfChildren</code> attribute **/
	public static final String NOOFCHILDREN = "noOfChildren";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixSupplierOffer.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(NOOFCHILDREN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryFOC.noOfChildren</code> attribute.
	 * @return the noOfChildren
	 */
	public Integer getNoOfChildren(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFCHILDREN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryFOC.noOfChildren</code> attribute.
	 * @return the noOfChildren
	 */
	public Integer getNoOfChildren()
	{
		return getNoOfChildren( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @return the noOfChildren
	 */
	public int getNoOfChildrenAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfChildren( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @return the noOfChildren
	 */
	public int getNoOfChildrenAsPrimitive()
	{
		return getNoOfChildrenAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFCHILDREN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final Integer value)
	{
		setNoOfChildren( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final SessionContext ctx, final int value)
	{
		setNoOfChildren( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AncillaryFOC.noOfChildren</code> attribute. 
	 * @param value the noOfChildren
	 */
	public void setNoOfChildren(final int value)
	{
		setNoOfChildren( getSession().getSessionContext(), value );
	}
	
}
