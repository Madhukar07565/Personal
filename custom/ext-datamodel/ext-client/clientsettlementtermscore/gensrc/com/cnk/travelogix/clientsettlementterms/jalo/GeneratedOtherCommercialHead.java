/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.OtherCommercialHead OtherCommercialHead}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOtherCommercialHead extends GenericItem
{
	/** Qualifier of the <code>OtherCommercialHead.otherCommercialPayableType</code> attribute **/
	public static final String OTHERCOMMERCIALPAYABLETYPE = "otherCommercialPayableType";
	/** Qualifier of the <code>OtherCommercialHead.otherCommercialReceivableType</code> attribute **/
	public static final String OTHERCOMMERCIALRECEIVABLETYPE = "otherCommercialReceivableType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OTHERCOMMERCIALPAYABLETYPE, AttributeMode.INITIAL);
		tmp.put(OTHERCOMMERCIALRECEIVABLETYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherCommercialHead.otherCommercialPayableType</code> attribute.
	 * @return the otherCommercialPayableType - Other Commercial Type
	 */
	public EnumerationValue getOtherCommercialPayableType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OTHERCOMMERCIALPAYABLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherCommercialHead.otherCommercialPayableType</code> attribute.
	 * @return the otherCommercialPayableType - Other Commercial Type
	 */
	public EnumerationValue getOtherCommercialPayableType()
	{
		return getOtherCommercialPayableType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherCommercialHead.otherCommercialPayableType</code> attribute. 
	 * @param value the otherCommercialPayableType - Other Commercial Type
	 */
	public void setOtherCommercialPayableType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OTHERCOMMERCIALPAYABLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherCommercialHead.otherCommercialPayableType</code> attribute. 
	 * @param value the otherCommercialPayableType - Other Commercial Type
	 */
	public void setOtherCommercialPayableType(final EnumerationValue value)
	{
		setOtherCommercialPayableType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherCommercialHead.otherCommercialReceivableType</code> attribute.
	 * @return the otherCommercialReceivableType - Other Commercial Type
	 */
	public EnumerationValue getOtherCommercialReceivableType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OTHERCOMMERCIALRECEIVABLETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OtherCommercialHead.otherCommercialReceivableType</code> attribute.
	 * @return the otherCommercialReceivableType - Other Commercial Type
	 */
	public EnumerationValue getOtherCommercialReceivableType()
	{
		return getOtherCommercialReceivableType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherCommercialHead.otherCommercialReceivableType</code> attribute. 
	 * @param value the otherCommercialReceivableType - Other Commercial Type
	 */
	public void setOtherCommercialReceivableType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OTHERCOMMERCIALRECEIVABLETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OtherCommercialHead.otherCommercialReceivableType</code> attribute. 
	 * @param value the otherCommercialReceivableType - Other Commercial Type
	 */
	public void setOtherCommercialReceivableType(final EnumerationValue value)
	{
		setOtherCommercialReceivableType( getSession().getSessionContext(), value );
	}
	
}
