/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.companyoffer.jalo;

import com.cnk.travelogix.client.core.companyoffer.jalo.CodeDetailsRedemption;
import com.cnk.travelogix.client.core.companyoffer.jalo.CompanyBankDetails;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.companyoffer.jalo.UploadCodeDetails UploadCodeDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedUploadCodeDetails extends GenericItem
{
	/** Qualifier of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute **/
	public static final String REQUIRECODEGENERATION = "requireCodeGeneration";
	/** Qualifier of the <code>UploadCodeDetails.bankDetails</code> attribute **/
	public static final String BANKDETAILS = "bankDetails";
	/** Qualifier of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute **/
	public static final String ISCREDITCARDNOUSEDASCODE = "isCreditCardNoUsedAsCode";
	/** Qualifier of the <code>UploadCodeDetails.codeRedempCodeDetails</code> attribute **/
	public static final String CODEREDEMPCODEDETAILS = "codeRedempCodeDetails";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CODEREDEMPCODEDETAILS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedUploadCodeDetails> CODEREDEMPCODEDETAILSHANDLER = new BidirectionalOneToManyHandler<GeneratedUploadCodeDetails>(
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
		tmp.put(REQUIRECODEGENERATION, AttributeMode.INITIAL);
		tmp.put(BANKDETAILS, AttributeMode.INITIAL);
		tmp.put(ISCREDITCARDNOUSEDASCODE, AttributeMode.INITIAL);
		tmp.put(CODEREDEMPCODEDETAILS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.bankDetails</code> attribute.
	 * @return the bankDetails
	 */
	public CompanyBankDetails getBankDetails(final SessionContext ctx)
	{
		return (CompanyBankDetails)getProperty( ctx, BANKDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.bankDetails</code> attribute.
	 * @return the bankDetails
	 */
	public CompanyBankDetails getBankDetails()
	{
		return getBankDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.bankDetails</code> attribute. 
	 * @param value the bankDetails
	 */
	public void setBankDetails(final SessionContext ctx, final CompanyBankDetails value)
	{
		setProperty(ctx, BANKDETAILS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.bankDetails</code> attribute. 
	 * @param value the bankDetails
	 */
	public void setBankDetails(final CompanyBankDetails value)
	{
		setBankDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.codeRedempCodeDetails</code> attribute.
	 * @return the codeRedempCodeDetails
	 */
	public CodeDetailsRedemption getCodeRedempCodeDetails(final SessionContext ctx)
	{
		return (CodeDetailsRedemption)getProperty( ctx, CODEREDEMPCODEDETAILS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.codeRedempCodeDetails</code> attribute.
	 * @return the codeRedempCodeDetails
	 */
	public CodeDetailsRedemption getCodeRedempCodeDetails()
	{
		return getCodeRedempCodeDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.codeRedempCodeDetails</code> attribute. 
	 * @param value the codeRedempCodeDetails
	 */
	public void setCodeRedempCodeDetails(final SessionContext ctx, final CodeDetailsRedemption value)
	{
		CODEREDEMPCODEDETAILSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.codeRedempCodeDetails</code> attribute. 
	 * @param value the codeRedempCodeDetails
	 */
	public void setCodeRedempCodeDetails(final CodeDetailsRedemption value)
	{
		setCodeRedempCodeDetails( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CODEREDEMPCODEDETAILSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute.
	 * @return the isCreditCardNoUsedAsCode
	 */
	public Boolean isIsCreditCardNoUsedAsCode(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISCREDITCARDNOUSEDASCODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute.
	 * @return the isCreditCardNoUsedAsCode
	 */
	public Boolean isIsCreditCardNoUsedAsCode()
	{
		return isIsCreditCardNoUsedAsCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @return the isCreditCardNoUsedAsCode
	 */
	public boolean isIsCreditCardNoUsedAsCodeAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsCreditCardNoUsedAsCode( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @return the isCreditCardNoUsedAsCode
	 */
	public boolean isIsCreditCardNoUsedAsCodeAsPrimitive()
	{
		return isIsCreditCardNoUsedAsCodeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @param value the isCreditCardNoUsedAsCode
	 */
	public void setIsCreditCardNoUsedAsCode(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISCREDITCARDNOUSEDASCODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @param value the isCreditCardNoUsedAsCode
	 */
	public void setIsCreditCardNoUsedAsCode(final Boolean value)
	{
		setIsCreditCardNoUsedAsCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @param value the isCreditCardNoUsedAsCode
	 */
	public void setIsCreditCardNoUsedAsCode(final SessionContext ctx, final boolean value)
	{
		setIsCreditCardNoUsedAsCode( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.isCreditCardNoUsedAsCode</code> attribute. 
	 * @param value the isCreditCardNoUsedAsCode
	 */
	public void setIsCreditCardNoUsedAsCode(final boolean value)
	{
		setIsCreditCardNoUsedAsCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute.
	 * @return the requireCodeGeneration
	 */
	public Boolean isRequireCodeGeneration(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, REQUIRECODEGENERATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute.
	 * @return the requireCodeGeneration
	 */
	public Boolean isRequireCodeGeneration()
	{
		return isRequireCodeGeneration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @return the requireCodeGeneration
	 */
	public boolean isRequireCodeGenerationAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isRequireCodeGeneration( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @return the requireCodeGeneration
	 */
	public boolean isRequireCodeGenerationAsPrimitive()
	{
		return isRequireCodeGenerationAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @param value the requireCodeGeneration
	 */
	public void setRequireCodeGeneration(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, REQUIRECODEGENERATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @param value the requireCodeGeneration
	 */
	public void setRequireCodeGeneration(final Boolean value)
	{
		setRequireCodeGeneration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @param value the requireCodeGeneration
	 */
	public void setRequireCodeGeneration(final SessionContext ctx, final boolean value)
	{
		setRequireCodeGeneration( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>UploadCodeDetails.requireCodeGeneration</code> attribute. 
	 * @param value the requireCodeGeneration
	 */
	public void setRequireCodeGeneration(final boolean value)
	{
		setRequireCodeGeneration( getSession().getSessionContext(), value );
	}
	
}
