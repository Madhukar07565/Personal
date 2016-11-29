/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.jalo;

import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.paymentinfo.jalo.AbstractPaymentDetail;
import com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.jalo.SupplierOtherFeeCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.otherfee.paymentadvice.jalo.PaymentAdviceForOtherFee PaymentAdviceForOtherFee}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaymentAdviceForOtherFee extends AbstractTravelogixItem
{
	/** Qualifier of the <code>PaymentAdviceForOtherFee.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/** Qualifier of the <code>PaymentAdviceForOtherFee.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>PaymentAdviceForOtherFee.paymentDetails</code> attribute **/
	public static final String PAYMENTDETAILS = "paymentDetails";
	/** Qualifier of the <code>PaymentAdviceForOtherFee.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/**
	* {@link OneToManyHandler} for handling 1:n PAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractPaymentDetail> PAYMENTDETAILSHANDLER = new OneToManyHandler<AbstractPaymentDetail>(
	MasterdatacoreConstants.TC.ABSTRACTPAYMENTDETAIL,
	true,
	"paymentAdvice",
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
	"paymentAdvice",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierOtherFeeCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierOtherFeeCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierOtherFeeCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierOtherFeeCommercialRecord value)
	{
		setProperty(ctx, COMMERCIAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierOtherFeeCommercialRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.copiedFrom</code> attribute.
	 * @return the copiedFrom - PaymentAdvice for otherfee Copied From Id
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.copiedFrom</code> attribute.
	 * @return the copiedFrom - PaymentAdvice for otherfee Copied From Id
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - PaymentAdvice for otherfee Copied From Id
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - PaymentAdvice for otherfee Copied From Id
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		return MEDIASHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		MEDIASHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.medias</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.paymentDetails</code> attribute.
	 * @return the paymentDetails
	 */
	public Collection<AbstractPaymentDetail> getPaymentDetails(final SessionContext ctx)
	{
		return PAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaymentAdviceForOtherFee.paymentDetails</code> attribute.
	 * @return the paymentDetails
	 */
	public Collection<AbstractPaymentDetail> getPaymentDetails()
	{
		return getPaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.paymentDetails</code> attribute. 
	 * @param value the paymentDetails
	 */
	public void setPaymentDetails(final SessionContext ctx, final Collection<AbstractPaymentDetail> value)
	{
		PAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaymentAdviceForOtherFee.paymentDetails</code> attribute. 
	 * @param value the paymentDetails
	 */
	public void setPaymentDetails(final Collection<AbstractPaymentDetail> value)
	{
		setPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentDetails. 
	 * @param value the item to add to paymentDetails
	 */
	public void addToPaymentDetails(final SessionContext ctx, final AbstractPaymentDetail value)
	{
		PAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paymentDetails. 
	 * @param value the item to add to paymentDetails
	 */
	public void addToPaymentDetails(final AbstractPaymentDetail value)
	{
		addToPaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentDetails. 
	 * @param value the item to remove from paymentDetails
	 */
	public void removeFromPaymentDetails(final SessionContext ctx, final AbstractPaymentDetail value)
	{
		PAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paymentDetails. 
	 * @param value the item to remove from paymentDetails
	 */
	public void removeFromPaymentDetails(final AbstractPaymentDetail value)
	{
		removeFromPaymentDetails( getSession().getSessionContext(), value );
	}
	
}
