/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.credentials.core.indents.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.BankPaymentDetail;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.constants.SuppliercredentialscoreConstants;
import com.cnk.travelogix.supplier.credentials.core.indents.jalo.BankGuarenteeInfo;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.credentials.core.indents.jalo.AbstractIndent AbstractIndent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractIndent extends AbstractTravelogixItem
{
	/** Qualifier of the <code>AbstractIndent.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractIndent.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>AbstractIndent.creditType</code> attribute **/
	public static final String CREDITTYPE = "creditType";
	/** Qualifier of the <code>AbstractIndent.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AbstractIndent.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>AbstractIndent.bankGuarenteeInfos</code> attribute **/
	public static final String BANKGUARENTEEINFOS = "bankGuarenteeInfos";
	/** Qualifier of the <code>AbstractIndent.bankPaymentDetails</code> attribute **/
	public static final String BANKPAYMENTDETAILS = "bankPaymentDetails";
	/** Qualifier of the <code>AbstractIndent.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n BANKGUARENTEEINFOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankGuarenteeInfo> BANKGUARENTEEINFOSHANDLER = new OneToManyHandler<BankGuarenteeInfo>(
	SuppliercredentialscoreConstants.TC.BANKGUARENTEEINFO,
	true,
	"indent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BANKPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BankPaymentDetail> BANKPAYMENTDETAILSHANDLER = new OneToManyHandler<BankPaymentDetail>(
	MasterdatacoreConstants.TC.BANKPAYMENTDETAIL,
	true,
	"indent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n MEDIAS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> MEDIASHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	true,
	"indent",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(CREDITTYPE, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.bankGuarenteeInfos</code> attribute.
	 * @return the bankGuarenteeInfos
	 */
	public Collection<BankGuarenteeInfo> getBankGuarenteeInfos(final SessionContext ctx)
	{
		return BANKGUARENTEEINFOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.bankGuarenteeInfos</code> attribute.
	 * @return the bankGuarenteeInfos
	 */
	public Collection<BankGuarenteeInfo> getBankGuarenteeInfos()
	{
		return getBankGuarenteeInfos( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.bankGuarenteeInfos</code> attribute. 
	 * @param value the bankGuarenteeInfos
	 */
	public void setBankGuarenteeInfos(final SessionContext ctx, final Collection<BankGuarenteeInfo> value)
	{
		BANKGUARENTEEINFOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.bankGuarenteeInfos</code> attribute. 
	 * @param value the bankGuarenteeInfos
	 */
	public void setBankGuarenteeInfos(final Collection<BankGuarenteeInfo> value)
	{
		setBankGuarenteeInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankGuarenteeInfos. 
	 * @param value the item to add to bankGuarenteeInfos
	 */
	public void addToBankGuarenteeInfos(final SessionContext ctx, final BankGuarenteeInfo value)
	{
		BANKGUARENTEEINFOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankGuarenteeInfos. 
	 * @param value the item to add to bankGuarenteeInfos
	 */
	public void addToBankGuarenteeInfos(final BankGuarenteeInfo value)
	{
		addToBankGuarenteeInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankGuarenteeInfos. 
	 * @param value the item to remove from bankGuarenteeInfos
	 */
	public void removeFromBankGuarenteeInfos(final SessionContext ctx, final BankGuarenteeInfo value)
	{
		BANKGUARENTEEINFOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankGuarenteeInfos. 
	 * @param value the item to remove from bankGuarenteeInfos
	 */
	public void removeFromBankGuarenteeInfos(final BankGuarenteeInfo value)
	{
		removeFromBankGuarenteeInfos( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.bankPaymentDetails</code> attribute.
	 * @return the bankPaymentDetails
	 */
	public Collection<BankPaymentDetail> getBankPaymentDetails(final SessionContext ctx)
	{
		return BANKPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.bankPaymentDetails</code> attribute.
	 * @return the bankPaymentDetails
	 */
	public Collection<BankPaymentDetail> getBankPaymentDetails()
	{
		return getBankPaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.bankPaymentDetails</code> attribute. 
	 * @param value the bankPaymentDetails
	 */
	public void setBankPaymentDetails(final SessionContext ctx, final Collection<BankPaymentDetail> value)
	{
		BANKPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.bankPaymentDetails</code> attribute. 
	 * @param value the bankPaymentDetails
	 */
	public void setBankPaymentDetails(final Collection<BankPaymentDetail> value)
	{
		setBankPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankPaymentDetails. 
	 * @param value the item to add to bankPaymentDetails
	 */
	public void addToBankPaymentDetails(final SessionContext ctx, final BankPaymentDetail value)
	{
		BANKPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bankPaymentDetails. 
	 * @param value the item to add to bankPaymentDetails
	 */
	public void addToBankPaymentDetails(final BankPaymentDetail value)
	{
		addToBankPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankPaymentDetails. 
	 * @param value the item to remove from bankPaymentDetails
	 */
	public void removeFromBankPaymentDetails(final SessionContext ctx, final BankPaymentDetail value)
	{
		BANKPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bankPaymentDetails. 
	 * @param value the item to remove from bankPaymentDetails
	 */
	public void removeFromBankPaymentDetails(final BankPaymentDetail value)
	{
		removeFromBankPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.copiedFrom</code> attribute.
	 * @return the copiedFrom - Indent Copied From Id
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.copiedFrom</code> attribute.
	 * @return the copiedFrom - Indent Copied From Id
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Indent Copied From Id
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Indent Copied From Id
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.creditType</code> attribute.
	 * @return the creditType
	 */
	public EnumerationValue getCreditType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CREDITTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.creditType</code> attribute.
	 * @return the creditType
	 */
	public EnumerationValue getCreditType()
	{
		return getCreditType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.creditType</code> attribute. 
	 * @param value the creditType
	 */
	public void setCreditType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CREDITTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.creditType</code> attribute. 
	 * @param value the creditType
	 */
	public void setCreditType(final EnumerationValue value)
	{
		setCreditType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final Collection<Media> value)
	{
		setMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to medias. 
	 * @param value the item to add to medias
	 */
	public void addToMedias(final Media value)
	{
		addToMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final SessionContext ctx, final Media value)
	{
		MEDIASHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from medias. 
	 * @param value the item to remove from medias
	 */
	public void removeFromMedias(final Media value)
	{
		removeFromMedias( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractIndent.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractIndent.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
