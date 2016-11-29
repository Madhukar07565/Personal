/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.UploadCodeDetails;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.CodeDetailsRedemption CodeDetailsRedemption}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCodeDetailsRedemption extends GenericItem
{
	/** Qualifier of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute **/
	public static final String ISTHIRDPARTYUSER = "isThirdPartyUser";
	/** Qualifier of the <code>CodeDetailsRedemption.generateCodeDetails</code> attribute **/
	public static final String GENERATECODEDETAILS = "generateCodeDetails";
	/** Qualifier of the <code>CodeDetailsRedemption.prefix</code> attribute **/
	public static final String PREFIX = "prefix";
	/** Qualifier of the <code>CodeDetailsRedemption.codeGeneratedBy</code> attribute **/
	public static final String CODEGENERATEDBY = "codeGeneratedBy";
	/** Qualifier of the <code>CodeDetailsRedemption.applicableOn</code> attribute **/
	public static final String APPLICABLEON = "applicableOn";
	/** Qualifier of the <code>CodeDetailsRedemption.codeGeneration</code> attribute **/
	public static final String CODEGENERATION = "codeGeneration";
	/** Qualifier of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute **/
	public static final String NOOFCODETOBEGENERATED = "noOfCodeToBeGenerated";
	/** Qualifier of the <code>CodeDetailsRedemption.codes</code> attribute **/
	public static final String CODES = "codes";
	/** Qualifier of the <code>CodeDetailsRedemption.uploadCodeDetailsRedemption</code> attribute **/
	public static final String UPLOADCODEDETAILSREDEMPTION = "uploadCodeDetailsRedemption";
	/**
	* {@link OneToManyHandler} for handling 1:n UPLOADCODEDETAILSREDEMPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<UploadCodeDetails> UPLOADCODEDETAILSREDEMPTIONHANDLER = new OneToManyHandler<UploadCodeDetails>(
	ClientcoreConstants.TC.UPLOADCODEDETAILS,
	false,
	"codeRedempCodeDetails",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ISTHIRDPARTYUSER, AttributeMode.INITIAL);
		tmp.put(GENERATECODEDETAILS, AttributeMode.INITIAL);
		tmp.put(PREFIX, AttributeMode.INITIAL);
		tmp.put(CODEGENERATEDBY, AttributeMode.INITIAL);
		tmp.put(APPLICABLEON, AttributeMode.INITIAL);
		tmp.put(CODEGENERATION, AttributeMode.INITIAL);
		tmp.put(NOOFCODETOBEGENERATED, AttributeMode.INITIAL);
		tmp.put(CODES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.applicableOn</code> attribute.
	 * @return the applicableOn
	 */
	public EnumerationValue getApplicableOn(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPLICABLEON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.applicableOn</code> attribute.
	 * @return the applicableOn
	 */
	public EnumerationValue getApplicableOn()
	{
		return getApplicableOn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.applicableOn</code> attribute. 
	 * @param value the applicableOn
	 */
	public void setApplicableOn(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPLICABLEON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.applicableOn</code> attribute. 
	 * @param value the applicableOn
	 */
	public void setApplicableOn(final EnumerationValue value)
	{
		setApplicableOn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codeGeneratedBy</code> attribute.
	 * @return the codeGeneratedBy
	 */
	public EnumerationValue getCodeGeneratedBy(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CODEGENERATEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codeGeneratedBy</code> attribute.
	 * @return the codeGeneratedBy
	 */
	public EnumerationValue getCodeGeneratedBy()
	{
		return getCodeGeneratedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codeGeneratedBy</code> attribute. 
	 * @param value the codeGeneratedBy
	 */
	public void setCodeGeneratedBy(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CODEGENERATEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codeGeneratedBy</code> attribute. 
	 * @param value the codeGeneratedBy
	 */
	public void setCodeGeneratedBy(final EnumerationValue value)
	{
		setCodeGeneratedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codeGeneration</code> attribute.
	 * @return the codeGeneration
	 */
	public EnumerationValue getCodeGeneration(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CODEGENERATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codeGeneration</code> attribute.
	 * @return the codeGeneration
	 */
	public EnumerationValue getCodeGeneration()
	{
		return getCodeGeneration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codeGeneration</code> attribute. 
	 * @param value the codeGeneration
	 */
	public void setCodeGeneration(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CODEGENERATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codeGeneration</code> attribute. 
	 * @param value the codeGeneration
	 */
	public void setCodeGeneration(final EnumerationValue value)
	{
		setCodeGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codes</code> attribute.
	 * @return the codes
	 */
	public List<String> getCodes(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, CODES);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.codes</code> attribute.
	 * @return the codes
	 */
	public List<String> getCodes()
	{
		return getCodes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codes</code> attribute. 
	 * @param value the codes
	 */
	public void setCodes(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, CODES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.codes</code> attribute. 
	 * @param value the codes
	 */
	public void setCodes(final List<String> value)
	{
		setCodes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.generateCodeDetails</code> attribute.
	 * @return the generateCodeDetails
	 */
	public Collection<Media> getGenerateCodeDetails(final SessionContext ctx)
	{
		Collection<Media> coll = (Collection<Media>)getProperty( ctx, GENERATECODEDETAILS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.generateCodeDetails</code> attribute.
	 * @return the generateCodeDetails
	 */
	public Collection<Media> getGenerateCodeDetails()
	{
		return getGenerateCodeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.generateCodeDetails</code> attribute. 
	 * @param value the generateCodeDetails
	 */
	public void setGenerateCodeDetails(final SessionContext ctx, final Collection<Media> value)
	{
		setProperty(ctx, GENERATECODEDETAILS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.generateCodeDetails</code> attribute. 
	 * @param value the generateCodeDetails
	 */
	public void setGenerateCodeDetails(final Collection<Media> value)
	{
		setGenerateCodeDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute.
	 * @return the isThirdPartyUser
	 */
	public Boolean isIsThirdPartyUser(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISTHIRDPARTYUSER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute.
	 * @return the isThirdPartyUser
	 */
	public Boolean isIsThirdPartyUser()
	{
		return isIsThirdPartyUser( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @return the isThirdPartyUser
	 */
	public boolean isIsThirdPartyUserAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsThirdPartyUser( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @return the isThirdPartyUser
	 */
	public boolean isIsThirdPartyUserAsPrimitive()
	{
		return isIsThirdPartyUserAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @param value the isThirdPartyUser
	 */
	public void setIsThirdPartyUser(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISTHIRDPARTYUSER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @param value the isThirdPartyUser
	 */
	public void setIsThirdPartyUser(final Boolean value)
	{
		setIsThirdPartyUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @param value the isThirdPartyUser
	 */
	public void setIsThirdPartyUser(final SessionContext ctx, final boolean value)
	{
		setIsThirdPartyUser( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.isThirdPartyUser</code> attribute. 
	 * @param value the isThirdPartyUser
	 */
	public void setIsThirdPartyUser(final boolean value)
	{
		setIsThirdPartyUser( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute.
	 * @return the noOfCodeToBeGenerated
	 */
	public Integer getNoOfCodeToBeGenerated(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFCODETOBEGENERATED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute.
	 * @return the noOfCodeToBeGenerated
	 */
	public Integer getNoOfCodeToBeGenerated()
	{
		return getNoOfCodeToBeGenerated( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @return the noOfCodeToBeGenerated
	 */
	public int getNoOfCodeToBeGeneratedAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfCodeToBeGenerated( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @return the noOfCodeToBeGenerated
	 */
	public int getNoOfCodeToBeGeneratedAsPrimitive()
	{
		return getNoOfCodeToBeGeneratedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @param value the noOfCodeToBeGenerated
	 */
	public void setNoOfCodeToBeGenerated(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFCODETOBEGENERATED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @param value the noOfCodeToBeGenerated
	 */
	public void setNoOfCodeToBeGenerated(final Integer value)
	{
		setNoOfCodeToBeGenerated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @param value the noOfCodeToBeGenerated
	 */
	public void setNoOfCodeToBeGenerated(final SessionContext ctx, final int value)
	{
		setNoOfCodeToBeGenerated( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.noOfCodeToBeGenerated</code> attribute. 
	 * @param value the noOfCodeToBeGenerated
	 */
	public void setNoOfCodeToBeGenerated(final int value)
	{
		setNoOfCodeToBeGenerated( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.prefix</code> attribute.
	 * @return the prefix
	 */
	public String getPrefix(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PREFIX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.prefix</code> attribute.
	 * @return the prefix
	 */
	public String getPrefix()
	{
		return getPrefix( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.prefix</code> attribute. 
	 * @param value the prefix
	 */
	public void setPrefix(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PREFIX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.prefix</code> attribute. 
	 * @param value the prefix
	 */
	public void setPrefix(final String value)
	{
		setPrefix( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.uploadCodeDetailsRedemption</code> attribute.
	 * @return the uploadCodeDetailsRedemption
	 */
	public Collection<UploadCodeDetails> getUploadCodeDetailsRedemption(final SessionContext ctx)
	{
		return UPLOADCODEDETAILSREDEMPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CodeDetailsRedemption.uploadCodeDetailsRedemption</code> attribute.
	 * @return the uploadCodeDetailsRedemption
	 */
	public Collection<UploadCodeDetails> getUploadCodeDetailsRedemption()
	{
		return getUploadCodeDetailsRedemption( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.uploadCodeDetailsRedemption</code> attribute. 
	 * @param value the uploadCodeDetailsRedemption
	 */
	public void setUploadCodeDetailsRedemption(final SessionContext ctx, final Collection<UploadCodeDetails> value)
	{
		UPLOADCODEDETAILSREDEMPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CodeDetailsRedemption.uploadCodeDetailsRedemption</code> attribute. 
	 * @param value the uploadCodeDetailsRedemption
	 */
	public void setUploadCodeDetailsRedemption(final Collection<UploadCodeDetails> value)
	{
		setUploadCodeDetailsRedemption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploadCodeDetailsRedemption. 
	 * @param value the item to add to uploadCodeDetailsRedemption
	 */
	public void addToUploadCodeDetailsRedemption(final SessionContext ctx, final UploadCodeDetails value)
	{
		UPLOADCODEDETAILSREDEMPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploadCodeDetailsRedemption. 
	 * @param value the item to add to uploadCodeDetailsRedemption
	 */
	public void addToUploadCodeDetailsRedemption(final UploadCodeDetails value)
	{
		addToUploadCodeDetailsRedemption( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploadCodeDetailsRedemption. 
	 * @param value the item to remove from uploadCodeDetailsRedemption
	 */
	public void removeFromUploadCodeDetailsRedemption(final SessionContext ctx, final UploadCodeDetails value)
	{
		UPLOADCODEDETAILSREDEMPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploadCodeDetailsRedemption. 
	 * @param value the item to remove from uploadCodeDetailsRedemption
	 */
	public void removeFromUploadCodeDetailsRedemption(final UploadCodeDetails value)
	{
		removeFromUploadCodeDetailsRedemption( getSession().getSessionContext(), value );
	}
	
}
