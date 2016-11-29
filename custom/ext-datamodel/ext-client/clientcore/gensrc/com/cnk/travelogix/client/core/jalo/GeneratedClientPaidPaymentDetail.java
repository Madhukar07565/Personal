/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.jalo.PaidProductRanking;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.jalo.ClientPaidPaymentDetail ClientPaidPaymentDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientPaidPaymentDetail extends GenericItem
{
	/** Qualifier of the <code>ClientPaidPaymentDetail.paymentDetailId</code> attribute **/
	public static final String PAYMENTDETAILID = "paymentDetailId";
	/** Qualifier of the <code>ClientPaidPaymentDetail.documentType</code> attribute **/
	public static final String DOCUMENTTYPE = "documentType";
	/** Qualifier of the <code>ClientPaidPaymentDetail.documentId</code> attribute **/
	public static final String DOCUMENTID = "documentId";
	/** Qualifier of the <code>ClientPaidPaymentDetail.documentDate</code> attribute **/
	public static final String DOCUMENTDATE = "documentDate";
	/** Qualifier of the <code>ClientPaidPaymentDetail.paidProductRanking</code> attribute **/
	public static final String PAIDPRODUCTRANKING = "paidProductRanking";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PAIDPRODUCTRANKING's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedClientPaidPaymentDetail> PAIDPRODUCTRANKINGHANDLER = new BidirectionalOneToManyHandler<GeneratedClientPaidPaymentDetail>(
	ClientcoreConstants.TC.CLIENTPAIDPAYMENTDETAIL,
	false,
	"paidProductRanking",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PAYMENTDETAILID, AttributeMode.INITIAL);
		tmp.put(DOCUMENTTYPE, AttributeMode.INITIAL);
		tmp.put(DOCUMENTID, AttributeMode.INITIAL);
		tmp.put(DOCUMENTDATE, AttributeMode.INITIAL);
		tmp.put(PAIDPRODUCTRANKING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PAIDPRODUCTRANKINGHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentDate</code> attribute.
	 * @return the documentDate
	 */
	public Date getDocumentDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, DOCUMENTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentDate</code> attribute.
	 * @return the documentDate
	 */
	public Date getDocumentDate()
	{
		return getDocumentDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentDate</code> attribute. 
	 * @param value the documentDate
	 */
	public void setDocumentDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, DOCUMENTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentDate</code> attribute. 
	 * @param value the documentDate
	 */
	public void setDocumentDate(final Date value)
	{
		setDocumentDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DOCUMENTID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentId</code> attribute.
	 * @return the documentId
	 */
	public String getDocumentId()
	{
		return getDocumentId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DOCUMENTID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentId</code> attribute. 
	 * @param value the documentId
	 */
	public void setDocumentId(final String value)
	{
		setDocumentId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DOCUMENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.documentType</code> attribute.
	 * @return the documentType
	 */
	public EnumerationValue getDocumentType()
	{
		return getDocumentType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DOCUMENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.documentType</code> attribute. 
	 * @param value the documentType
	 */
	public void setDocumentType(final EnumerationValue value)
	{
		setDocumentType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.paidProductRanking</code> attribute.
	 * @return the paidProductRanking
	 */
	public PaidProductRanking getPaidProductRanking(final SessionContext ctx)
	{
		return (PaidProductRanking)getProperty( ctx, PAIDPRODUCTRANKING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.paidProductRanking</code> attribute.
	 * @return the paidProductRanking
	 */
	public PaidProductRanking getPaidProductRanking()
	{
		return getPaidProductRanking( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.paidProductRanking</code> attribute. 
	 * @param value the paidProductRanking
	 */
	public void setPaidProductRanking(final SessionContext ctx, final PaidProductRanking value)
	{
		PAIDPRODUCTRANKINGHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.paidProductRanking</code> attribute. 
	 * @param value the paidProductRanking
	 */
	public void setPaidProductRanking(final PaidProductRanking value)
	{
		setPaidProductRanking( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.paymentDetailId</code> attribute.
	 * @return the paymentDetailId
	 */
	public String getPaymentDetailId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PAYMENTDETAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ClientPaidPaymentDetail.paymentDetailId</code> attribute.
	 * @return the paymentDetailId
	 */
	public String getPaymentDetailId()
	{
		return getPaymentDetailId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.paymentDetailId</code> attribute. 
	 * @param value the paymentDetailId
	 */
	public void setPaymentDetailId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PAYMENTDETAILID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ClientPaidPaymentDetail.paymentDetailId</code> attribute. 
	 * @param value the paymentDetailId
	 */
	public void setPaymentDetailId(final String value)
	{
		setPaymentDetailId( getSession().getSessionContext(), value );
	}
	
}
