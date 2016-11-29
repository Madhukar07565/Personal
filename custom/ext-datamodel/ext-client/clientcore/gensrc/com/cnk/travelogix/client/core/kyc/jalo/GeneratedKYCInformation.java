/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.kyc.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.kyc.jalo.KYCReqDocument;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.kyc.jalo.KYCInformation KycInformation}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKYCInformation extends GenericItem
{
	/** Qualifier of the <code>KycInformation.reqDocument</code> attribute **/
	public static final String REQDOCUMENT = "reqDocument";
	/** Qualifier of the <code>KycInformation.kycDocumentType</code> attribute **/
	public static final String KYCDOCUMENTTYPE = "kycDocumentType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REQDOCUMENT, AttributeMode.INITIAL);
		tmp.put(KYCDOCUMENTTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycInformation.kycDocumentType</code> attribute.
	 * @return the kycDocumentType
	 */
	public EnumerationValue getKycDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, KYCDOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycInformation.kycDocumentType</code> attribute.
	 * @return the kycDocumentType
	 */
	public EnumerationValue getKycDocumentType()
	{
		return getKycDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycInformation.kycDocumentType</code> attribute. 
	 * @param value the kycDocumentType
	 */
	public void setKycDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, KYCDOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycInformation.kycDocumentType</code> attribute. 
	 * @param value the kycDocumentType
	 */
	public void setKycDocumentType(final EnumerationValue value)
	{
		setKycDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycInformation.reqDocument</code> attribute.
	 * @return the reqDocument
	 */
	public KYCReqDocument getReqDocument(final SessionContext ctx)
	{
		return (KYCReqDocument)getProperty( ctx, REQDOCUMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KycInformation.reqDocument</code> attribute.
	 * @return the reqDocument
	 */
	public KYCReqDocument getReqDocument()
	{
		return getReqDocument( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycInformation.reqDocument</code> attribute. 
	 * @param value the reqDocument
	 */
	public void setReqDocument(final SessionContext ctx, final KYCReqDocument value)
	{
		setProperty(ctx, REQDOCUMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KycInformation.reqDocument</code> attribute. 
	 * @param value the reqDocument
	 */
	public void setReqDocument(final KYCReqDocument value)
	{
		setReqDocument( getSession().getSessionContext(), value );
	}
	
}
