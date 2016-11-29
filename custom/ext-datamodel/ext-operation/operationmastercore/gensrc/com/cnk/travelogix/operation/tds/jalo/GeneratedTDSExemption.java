/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.tds.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.tds.jalo.TDSMaster;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.tds.jalo.TDSExemption TDSExemption}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTDSExemption extends GenericItem
{
	/** Qualifier of the <code>TDSExemption.customerId</code> attribute **/
	public static final String CUSTOMERID = "customerId";
	/** Qualifier of the <code>TDSExemption.customerName</code> attribute **/
	public static final String CUSTOMERNAME = "customerName";
	/** Qualifier of the <code>TDSExemption.percentage</code> attribute **/
	public static final String PERCENTAGE = "percentage";
	/** Qualifier of the <code>TDSExemption.threshold</code> attribute **/
	public static final String THRESHOLD = "threshold";
	/** Qualifier of the <code>TDSExemption.cappingAmount</code> attribute **/
	public static final String CAPPINGAMOUNT = "cappingAmount";
	/** Qualifier of the <code>TDSExemption.exemptionCertificateHash</code> attribute **/
	public static final String EXEMPTIONCERTIFICATEHASH = "exemptionCertificateHash";
	/** Qualifier of the <code>TDSExemption.exemptionCertificate</code> attribute **/
	public static final String EXEMPTIONCERTIFICATE = "exemptionCertificate";
	/** Qualifier of the <code>TDSExemption.certificateValidFrom</code> attribute **/
	public static final String CERTIFICATEVALIDFROM = "certificateValidFrom";
	/** Qualifier of the <code>TDSExemption.certificateValidTo</code> attribute **/
	public static final String CERTIFICATEVALIDTO = "certificateValidTo";
	/** Qualifier of the <code>TDSExemption.certificateDescription</code> attribute **/
	public static final String CERTIFICATEDESCRIPTION = "certificateDescription";
	/** Qualifier of the <code>TDSExemption.tdsMaster</code> attribute **/
	public static final String TDSMASTER = "tdsMaster";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TDSMASTER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedTDSExemption> TDSMASTERHANDLER = new BidirectionalOneToManyHandler<GeneratedTDSExemption>(
	OperationmastercoreConstants.TC.TDSEXEMPTION,
	false,
	"tdsMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CUSTOMERID, AttributeMode.INITIAL);
		tmp.put(CUSTOMERNAME, AttributeMode.INITIAL);
		tmp.put(PERCENTAGE, AttributeMode.INITIAL);
		tmp.put(THRESHOLD, AttributeMode.INITIAL);
		tmp.put(CAPPINGAMOUNT, AttributeMode.INITIAL);
		tmp.put(EXEMPTIONCERTIFICATEHASH, AttributeMode.INITIAL);
		tmp.put(EXEMPTIONCERTIFICATE, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEVALIDFROM, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEVALIDTO, AttributeMode.INITIAL);
		tmp.put(CERTIFICATEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(TDSMASTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.cappingAmount</code> attribute.
	 * @return the cappingAmount
	 */
	public Double getCappingAmount(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, CAPPINGAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.cappingAmount</code> attribute.
	 * @return the cappingAmount
	 */
	public Double getCappingAmount()
	{
		return getCappingAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @return the cappingAmount
	 */
	public double getCappingAmountAsPrimitive(final SessionContext ctx)
	{
		Double value = getCappingAmount( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @return the cappingAmount
	 */
	public double getCappingAmountAsPrimitive()
	{
		return getCappingAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, CAPPINGAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final Double value)
	{
		setCappingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final SessionContext ctx, final double value)
	{
		setCappingAmount( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.cappingAmount</code> attribute. 
	 * @param value the cappingAmount
	 */
	public void setCappingAmount(final double value)
	{
		setCappingAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateDescription</code> attribute.
	 * @return the certificateDescription
	 */
	public String getCertificateDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CERTIFICATEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateDescription</code> attribute.
	 * @return the certificateDescription
	 */
	public String getCertificateDescription()
	{
		return getCertificateDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateDescription</code> attribute. 
	 * @param value the certificateDescription
	 */
	public void setCertificateDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CERTIFICATEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateDescription</code> attribute. 
	 * @param value the certificateDescription
	 */
	public void setCertificateDescription(final String value)
	{
		setCertificateDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateValidFrom</code> attribute.
	 * @return the certificateValidFrom
	 */
	public Date getCertificateValidFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATEVALIDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateValidFrom</code> attribute.
	 * @return the certificateValidFrom
	 */
	public Date getCertificateValidFrom()
	{
		return getCertificateValidFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateValidFrom</code> attribute. 
	 * @param value the certificateValidFrom
	 */
	public void setCertificateValidFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATEVALIDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateValidFrom</code> attribute. 
	 * @param value the certificateValidFrom
	 */
	public void setCertificateValidFrom(final Date value)
	{
		setCertificateValidFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateValidTo</code> attribute.
	 * @return the certificateValidTo
	 */
	public Date getCertificateValidTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, CERTIFICATEVALIDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.certificateValidTo</code> attribute.
	 * @return the certificateValidTo
	 */
	public Date getCertificateValidTo()
	{
		return getCertificateValidTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateValidTo</code> attribute. 
	 * @param value the certificateValidTo
	 */
	public void setCertificateValidTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, CERTIFICATEVALIDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.certificateValidTo</code> attribute. 
	 * @param value the certificateValidTo
	 */
	public void setCertificateValidTo(final Date value)
	{
		setCertificateValidTo( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TDSMASTERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.customerId</code> attribute.
	 * @return the customerId
	 */
	public String getCustomerId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.customerId</code> attribute.
	 * @return the customerId
	 */
	public String getCustomerId()
	{
		return getCustomerId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.customerId</code> attribute. 
	 * @param value the customerId
	 */
	public void setCustomerId(final String value)
	{
		setCustomerId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CUSTOMERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.customerName</code> attribute.
	 * @return the customerName
	 */
	public String getCustomerName()
	{
		return getCustomerName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CUSTOMERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.customerName</code> attribute. 
	 * @param value the customerName
	 */
	public void setCustomerName(final String value)
	{
		setCustomerName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.exemptionCertificate</code> attribute.
	 * @return the exemptionCertificate
	 */
	public Media getExemptionCertificate(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, EXEMPTIONCERTIFICATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.exemptionCertificate</code> attribute.
	 * @return the exemptionCertificate
	 */
	public Media getExemptionCertificate()
	{
		return getExemptionCertificate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.exemptionCertificate</code> attribute. 
	 * @param value the exemptionCertificate
	 */
	public void setExemptionCertificate(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, EXEMPTIONCERTIFICATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.exemptionCertificate</code> attribute. 
	 * @param value the exemptionCertificate
	 */
	public void setExemptionCertificate(final Media value)
	{
		setExemptionCertificate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.exemptionCertificateHash</code> attribute.
	 * @return the exemptionCertificateHash
	 */
	public String getExemptionCertificateHash(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXEMPTIONCERTIFICATEHASH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.exemptionCertificateHash</code> attribute.
	 * @return the exemptionCertificateHash
	 */
	public String getExemptionCertificateHash()
	{
		return getExemptionCertificateHash( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.exemptionCertificateHash</code> attribute. 
	 * @param value the exemptionCertificateHash
	 */
	public void setExemptionCertificateHash(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXEMPTIONCERTIFICATEHASH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.exemptionCertificateHash</code> attribute. 
	 * @param value the exemptionCertificateHash
	 */
	public void setExemptionCertificateHash(final String value)
	{
		setExemptionCertificateHash( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, PERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.percentage</code> attribute.
	 * @return the percentage
	 */
	public Double getPercentage()
	{
		return getPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.percentage</code> attribute. 
	 * @return the percentage
	 */
	public double getPercentageAsPrimitive()
	{
		return getPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, PERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final Double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final SessionContext ctx, final double value)
	{
		setPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.percentage</code> attribute. 
	 * @param value the percentage
	 */
	public void setPercentage(final double value)
	{
		setPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster(final SessionContext ctx)
	{
		return (TDSMaster)getProperty( ctx, TDSMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster()
	{
		return getTdsMaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final SessionContext ctx, final TDSMaster value)
	{
		TDSMASTERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final TDSMaster value)
	{
		setTdsMaster( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.threshold</code> attribute.
	 * @return the threshold
	 */
	public Double getThreshold(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, THRESHOLD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.threshold</code> attribute.
	 * @return the threshold
	 */
	public Double getThreshold()
	{
		return getThreshold( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.threshold</code> attribute. 
	 * @return the threshold
	 */
	public double getThresholdAsPrimitive(final SessionContext ctx)
	{
		Double value = getThreshold( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSExemption.threshold</code> attribute. 
	 * @return the threshold
	 */
	public double getThresholdAsPrimitive()
	{
		return getThresholdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.threshold</code> attribute. 
	 * @param value the threshold
	 */
	public void setThreshold(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, THRESHOLD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.threshold</code> attribute. 
	 * @param value the threshold
	 */
	public void setThreshold(final Double value)
	{
		setThreshold( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.threshold</code> attribute. 
	 * @param value the threshold
	 */
	public void setThreshold(final SessionContext ctx, final double value)
	{
		setThreshold( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSExemption.threshold</code> attribute. 
	 * @param value the threshold
	 */
	public void setThreshold(final double value)
	{
		setThreshold( getSession().getSessionContext(), value );
	}
	
}
