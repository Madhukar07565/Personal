/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.clientsettlementterms.jalo;

import com.cnk.travelogix.client.settlementterms.constants.ClientsettlementtermscoreConstants;
import com.cnk.travelogix.clientsettlementterms.jalo.AbstractClientCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.clientsettlementterms.jalo.CommercialReceivable CommercialReceivable}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCommercialReceivable extends AbstractClientCommercial
{
	/** Qualifier of the <code>CommercialReceivable.statusValidFrom</code> attribute **/
	public static final String STATUSVALIDFROM = "statusValidFrom";
	/** Qualifier of the <code>CommercialReceivable.statusValidTo</code> attribute **/
	public static final String STATUSVALIDTO = "statusValidTo";
	/** Qualifier of the <code>CommercialReceivable.InvoiceGeneration</code> attribute **/
	public static final String INVOICEGENERATION = "InvoiceGeneration";
	/** Qualifier of the <code>CommercialReceivable.status</code> attribute **/
	public static final String STATUS = "status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractClientCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(STATUSVALIDFROM, AttributeMode.INITIAL);
		tmp.put(STATUSVALIDTO, AttributeMode.INITIAL);
		tmp.put(INVOICEGENERATION, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.InvoiceGeneration</code> attribute.
	 * @return the InvoiceGeneration - Invoice Generation
	 */
	public EnumerationValue getInvoiceGeneration(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, INVOICEGENERATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.InvoiceGeneration</code> attribute.
	 * @return the InvoiceGeneration - Invoice Generation
	 */
	public EnumerationValue getInvoiceGeneration()
	{
		return getInvoiceGeneration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.InvoiceGeneration</code> attribute. 
	 * @param value the InvoiceGeneration - Invoice Generation
	 */
	public void setInvoiceGeneration(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, INVOICEGENERATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.InvoiceGeneration</code> attribute. 
	 * @param value the InvoiceGeneration - Invoice Generation
	 */
	public void setInvoiceGeneration(final EnumerationValue value)
	{
		setInvoiceGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.status</code> attribute.
	 * @return the status - Status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.status</code> attribute. 
	 * @param value the status - Status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.statusValidFrom</code> attribute.
	 * @return the statusValidFrom - Status Valid From
	 */
	public Date getStatusValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STATUSVALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.statusValidFrom</code> attribute.
	 * @return the statusValidFrom - Status Valid From
	 */
	public Date getStatusValidFrom()
	{
		return getStatusValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.statusValidFrom</code> attribute. 
	 * @param value the statusValidFrom - Status Valid From
	 */
	public void setStatusValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STATUSVALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.statusValidFrom</code> attribute. 
	 * @param value the statusValidFrom - Status Valid From
	 */
	public void setStatusValidFrom(final Date value)
	{
		setStatusValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.statusValidTo</code> attribute.
	 * @return the statusValidTo - Status Valid To
	 */
	public Date getStatusValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STATUSVALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CommercialReceivable.statusValidTo</code> attribute.
	 * @return the statusValidTo - Status Valid To
	 */
	public Date getStatusValidTo()
	{
		return getStatusValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.statusValidTo</code> attribute. 
	 * @param value the statusValidTo - Status Valid To
	 */
	public void setStatusValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STATUSVALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CommercialReceivable.statusValidTo</code> attribute. 
	 * @param value the statusValidTo - Status Valid To
	 */
	public void setStatusValidTo(final Date value)
	{
		setStatusValidTo( getSession().getSessionContext(), value );
	}
	
}
