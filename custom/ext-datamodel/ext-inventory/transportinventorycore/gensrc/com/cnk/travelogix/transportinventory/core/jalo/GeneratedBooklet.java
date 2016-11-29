/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.PaperCoupon;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.Booklet Booklet}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBooklet extends GenericItem
{
	/** Qualifier of the <code>Booklet.bookletNumber</code> attribute **/
	public static final String BOOKLETNUMBER = "bookletNumber";
	/** Qualifier of the <code>Booklet.issueDate</code> attribute **/
	public static final String ISSUEDATE = "issueDate";
	/** Qualifier of the <code>Booklet.notValidAfter</code> attribute **/
	public static final String NOTVALIDAFTER = "notValidAfter";
	/** Qualifier of the <code>Booklet.paperCoupons</code> attribute **/
	public static final String PAPERCOUPONS = "paperCoupons";
	/**
	* {@link OneToManyHandler} for handling 1:n PAPERCOUPONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PaperCoupon> PAPERCOUPONSHANDLER = new OneToManyHandler<PaperCoupon>(
	TransportinventorycoreConstants.TC.PAPERCOUPON,
	false,
	"booklet",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(BOOKLETNUMBER, AttributeMode.INITIAL);
		tmp.put(ISSUEDATE, AttributeMode.INITIAL);
		tmp.put(NOTVALIDAFTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.bookletNumber</code> attribute.
	 * @return the bookletNumber
	 */
	public BigDecimal getBookletNumber(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BOOKLETNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.bookletNumber</code> attribute.
	 * @return the bookletNumber
	 */
	public BigDecimal getBookletNumber()
	{
		return getBookletNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.bookletNumber</code> attribute. 
	 * @param value the bookletNumber
	 */
	public void setBookletNumber(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BOOKLETNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.bookletNumber</code> attribute. 
	 * @param value the bookletNumber
	 */
	public void setBookletNumber(final BigDecimal value)
	{
		setBookletNumber( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ISSUEDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.issueDate</code> attribute.
	 * @return the issueDate
	 */
	public Date getIssueDate()
	{
		return getIssueDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ISSUEDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.issueDate</code> attribute. 
	 * @param value the issueDate
	 */
	public void setIssueDate(final Date value)
	{
		setIssueDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.notValidAfter</code> attribute.
	 * @return the notValidAfter
	 */
	public Date getNotValidAfter(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, NOTVALIDAFTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.notValidAfter</code> attribute.
	 * @return the notValidAfter
	 */
	public Date getNotValidAfter()
	{
		return getNotValidAfter( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.notValidAfter</code> attribute. 
	 * @param value the notValidAfter
	 */
	public void setNotValidAfter(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, NOTVALIDAFTER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.notValidAfter</code> attribute. 
	 * @param value the notValidAfter
	 */
	public void setNotValidAfter(final Date value)
	{
		setNotValidAfter( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.paperCoupons</code> attribute.
	 * @return the paperCoupons
	 */
	public Collection<PaperCoupon> getPaperCoupons(final SessionContext ctx)
	{
		return PAPERCOUPONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Booklet.paperCoupons</code> attribute.
	 * @return the paperCoupons
	 */
	public Collection<PaperCoupon> getPaperCoupons()
	{
		return getPaperCoupons( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.paperCoupons</code> attribute. 
	 * @param value the paperCoupons
	 */
	public void setPaperCoupons(final SessionContext ctx, final Collection<PaperCoupon> value)
	{
		PAPERCOUPONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Booklet.paperCoupons</code> attribute. 
	 * @param value the paperCoupons
	 */
	public void setPaperCoupons(final Collection<PaperCoupon> value)
	{
		setPaperCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paperCoupons. 
	 * @param value the item to add to paperCoupons
	 */
	public void addToPaperCoupons(final SessionContext ctx, final PaperCoupon value)
	{
		PAPERCOUPONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to paperCoupons. 
	 * @param value the item to add to paperCoupons
	 */
	public void addToPaperCoupons(final PaperCoupon value)
	{
		addToPaperCoupons( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paperCoupons. 
	 * @param value the item to remove from paperCoupons
	 */
	public void removeFromPaperCoupons(final SessionContext ctx, final PaperCoupon value)
	{
		PAPERCOUPONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from paperCoupons. 
	 * @param value the item to remove from paperCoupons
	 */
	public void removeFromPaperCoupons(final PaperCoupon value)
	{
		removeFromPaperCoupons( getSession().getSessionContext(), value );
	}
	
}
