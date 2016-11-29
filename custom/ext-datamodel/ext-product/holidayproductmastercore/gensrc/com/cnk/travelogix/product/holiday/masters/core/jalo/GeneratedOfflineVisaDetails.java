/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.holiday.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.AbstractVisaDetails;
import com.cnk.travelogix.product.holiday.master.core.constants.HolidayproductmastercoreConstants;
import com.cnk.travelogix.product.holiday.masters.core.jalo.Prices;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.holiday.masters.core.jalo.OfflineVisaDetails OfflineVisaDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOfflineVisaDetails extends AbstractVisaDetails
{
	/** Qualifier of the <code>OfflineVisaDetails.basicDocuments</code> attribute **/
	public static final String BASICDOCUMENTS = "basicDocuments";
	/** Qualifier of the <code>OfflineVisaDetails.documentsRequired</code> attribute **/
	public static final String DOCUMENTSREQUIRED = "documentsRequired";
	/** Qualifier of the <code>OfflineVisaDetails.notes</code> attribute **/
	public static final String NOTES = "notes";
	/** Qualifier of the <code>OfflineVisaDetails.processingTime</code> attribute **/
	public static final String PROCESSINGTIME = "processingTime";
	/** Qualifier of the <code>OfflineVisaDetails.paymentMode</code> attribute **/
	public static final String PAYMENTMODE = "paymentMode";
	/** Qualifier of the <code>OfflineVisaDetails.prices</code> attribute **/
	public static final String PRICES = "prices";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractVisaDetails.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BASICDOCUMENTS, AttributeMode.INITIAL);
		tmp.put(DOCUMENTSREQUIRED, AttributeMode.INITIAL);
		tmp.put(NOTES, AttributeMode.INITIAL);
		tmp.put(PROCESSINGTIME, AttributeMode.INITIAL);
		tmp.put(PAYMENTMODE, AttributeMode.INITIAL);
		tmp.put(PRICES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.basicDocuments</code> attribute.
	 * @return the basicDocuments - Basic documents
	 */
	public String getBasicDocuments(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BASICDOCUMENTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.basicDocuments</code> attribute.
	 * @return the basicDocuments - Basic documents
	 */
	public String getBasicDocuments()
	{
		return getBasicDocuments( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.basicDocuments</code> attribute. 
	 * @param value the basicDocuments - Basic documents
	 */
	public void setBasicDocuments(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BASICDOCUMENTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.basicDocuments</code> attribute. 
	 * @param value the basicDocuments - Basic documents
	 */
	public void setBasicDocuments(final String value)
	{
		setBasicDocuments( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.documentsRequired</code> attribute.
	 * @return the documentsRequired - Documents required
	 */
	public String getDocumentsRequired(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTSREQUIRED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.documentsRequired</code> attribute.
	 * @return the documentsRequired - Documents required
	 */
	public String getDocumentsRequired()
	{
		return getDocumentsRequired( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.documentsRequired</code> attribute. 
	 * @param value the documentsRequired - Documents required
	 */
	public void setDocumentsRequired(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTSREQUIRED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.documentsRequired</code> attribute. 
	 * @param value the documentsRequired - Documents required
	 */
	public void setDocumentsRequired(final String value)
	{
		setDocumentsRequired( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.notes</code> attribute.
	 * @return the notes - Notes
	 */
	public String getNotes()
	{
		return getNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.notes</code> attribute. 
	 * @param value the notes - Notes
	 */
	public void setNotes(final String value)
	{
		setNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.paymentMode</code> attribute.
	 * @return the paymentMode - Payment mode
	 */
	public String getPaymentMode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTMODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.paymentMode</code> attribute.
	 * @return the paymentMode - Payment mode
	 */
	public String getPaymentMode()
	{
		return getPaymentMode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.paymentMode</code> attribute. 
	 * @param value the paymentMode - Payment mode
	 */
	public void setPaymentMode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTMODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.paymentMode</code> attribute. 
	 * @param value the paymentMode - Payment mode
	 */
	public void setPaymentMode(final String value)
	{
		setPaymentMode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.prices</code> attribute.
	 * @return the prices - Prices
	 */
	public Prices getPrices(final SessionContext ctx)
	{
		return (Prices)getProperty( ctx, PRICES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.prices</code> attribute.
	 * @return the prices - Prices
	 */
	public Prices getPrices()
	{
		return getPrices( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.prices</code> attribute. 
	 * @param value the prices - Prices
	 */
	public void setPrices(final SessionContext ctx, final Prices value)
	{
		setProperty(ctx, PRICES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.prices</code> attribute. 
	 * @param value the prices - Prices
	 */
	public void setPrices(final Prices value)
	{
		setPrices( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.processingTime</code> attribute.
	 * @return the processingTime - Processing time
	 */
	public String getProcessingTime(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PROCESSINGTIME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>OfflineVisaDetails.processingTime</code> attribute.
	 * @return the processingTime - Processing time
	 */
	public String getProcessingTime()
	{
		return getProcessingTime( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.processingTime</code> attribute. 
	 * @param value the processingTime - Processing time
	 */
	public void setProcessingTime(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PROCESSINGTIME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>OfflineVisaDetails.processingTime</code> attribute. 
	 * @param value the processingTime - Processing time
	 */
	public void setProcessingTime(final String value)
	{
		setProcessingTime( getSession().getSessionContext(), value );
	}
	
}
