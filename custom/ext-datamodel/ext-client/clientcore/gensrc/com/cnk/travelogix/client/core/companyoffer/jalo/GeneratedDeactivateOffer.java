/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.ClientDetails;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyDetails;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.DeactivateOffer DeactivateOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDeactivateOffer extends GenericItem
{
	/** Qualifier of the <code>DeactivateOffer.companyDetails</code> attribute **/
	public static final String COMPANYDETAILS = "companyDetails";
	/** Qualifier of the <code>DeactivateOffer.clientDetails</code> attribute **/
	public static final String CLIENTDETAILS = "clientDetails";
	/** Qualifier of the <code>DeactivateOffer.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>DeactivateOffer.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>DeactivateOffer.approvalStatus</code> attribute **/
	public static final String APPROVALSTATUS = "approvalStatus";
	/** Qualifier of the <code>DeactivateOffer.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(COMPANYDETAILS, AttributeMode.INITIAL);
		tmp.put(CLIENTDETAILS, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(APPROVALSTATUS, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus()
	{
		return getApprovalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.clientDetails</code> attribute.
	 * @return the clientDetails
	 */
	public ClientDetails getClientDetails(final SessionContext ctx)
	{
		return (ClientDetails)getProperty( ctx, CLIENTDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.clientDetails</code> attribute.
	 * @return the clientDetails
	 */
	public ClientDetails getClientDetails()
	{
		return getClientDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.clientDetails</code> attribute. 
	 * @param value the clientDetails
	 */
	public void setClientDetails(final SessionContext ctx, final ClientDetails value)
	{
		setProperty(ctx, CLIENTDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.clientDetails</code> attribute. 
	 * @param value the clientDetails
	 */
	public void setClientDetails(final ClientDetails value)
	{
		setClientDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.companyDetails</code> attribute.
	 * @return the companyDetails
	 */
	public CompanyDetails getCompanyDetails(final SessionContext ctx)
	{
		return (CompanyDetails)getProperty( ctx, COMPANYDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.companyDetails</code> attribute.
	 * @return the companyDetails
	 */
	public CompanyDetails getCompanyDetails()
	{
		return getCompanyDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.companyDetails</code> attribute. 
	 * @param value the companyDetails
	 */
	public void setCompanyDetails(final SessionContext ctx, final CompanyDetails value)
	{
		setProperty(ctx, COMPANYDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.companyDetails</code> attribute. 
	 * @param value the companyDetails
	 */
	public void setCompanyDetails(final CompanyDetails value)
	{
		setCompanyDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DeactivateOffer.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DeactivateOffer.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
}
