/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.kyc.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.kyc.jalo.KYCReqDocument KYCReqDocument}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedKYCReqDocument extends GenericItem
{
	/** Qualifier of the <code>KYCReqDocument.kycDocId</code> attribute **/
	public static final String KYCDOCID = "kycDocId";
	/** Qualifier of the <code>KYCReqDocument.Media</code> attribute **/
	public static final String MEDIA = "Media";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(KYCDOCID, AttributeMode.INITIAL);
		tmp.put(MEDIA, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCReqDocument.kycDocId</code> attribute.
	 * @return the kycDocId
	 */
	public String getKycDocId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, KYCDOCID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCReqDocument.kycDocId</code> attribute.
	 * @return the kycDocId
	 */
	public String getKycDocId()
	{
		return getKycDocId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCReqDocument.kycDocId</code> attribute. 
	 * @param value the kycDocId
	 */
	public void setKycDocId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, KYCDOCID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCReqDocument.kycDocId</code> attribute. 
	 * @param value the kycDocId
	 */
	public void setKycDocId(final String value)
	{
		setKycDocId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCReqDocument.Media</code> attribute.
	 * @return the Media
	 */
	public Media getMedia(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, MEDIA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>KYCReqDocument.Media</code> attribute.
	 * @return the Media
	 */
	public Media getMedia()
	{
		return getMedia( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCReqDocument.Media</code> attribute. 
	 * @param value the Media
	 */
	public void setMedia(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, MEDIA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>KYCReqDocument.Media</code> attribute. 
	 * @param value the Media
	 */
	public void setMedia(final Media value)
	{
		setMedia( getSession().getSessionContext(), value );
	}
	
}
