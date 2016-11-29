/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.transportinventory.core.jalo;

import com.cnk.travelogix.transport.inventory.core.constants.TransportinventorycoreConstants;
import com.cnk.travelogix.transportinventory.core.jalo.AirCoupon;
import com.cnk.travelogix.transportinventory.core.jalo.Booklet;
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
 * Generated class for type {@link com.cnk.travelogix.transportinventory.core.jalo.PaperCoupon PaperCoupon}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPaperCoupon extends AirCoupon
{
	/** Qualifier of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute **/
	public static final String TOTALNUMBEROFBOOKLETS = "totalNumberOfBooklets";
	/** Qualifier of the <code>PaperCoupon.couponNumber</code> attribute **/
	public static final String COUPONNUMBER = "couponNumber";
	/** Qualifier of the <code>PaperCoupon.booklet</code> attribute **/
	public static final String BOOKLET = "booklet";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n BOOKLET's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPaperCoupon> BOOKLETHANDLER = new BidirectionalOneToManyHandler<GeneratedPaperCoupon>(
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AirCoupon.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TOTALNUMBEROFBOOKLETS, AttributeMode.INITIAL);
		tmp.put(COUPONNUMBER, AttributeMode.INITIAL);
		tmp.put(BOOKLET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.booklet</code> attribute.
	 * @return the booklet
	 */
	public Booklet getBooklet(final SessionContext ctx)
	{
		return (Booklet)getProperty( ctx, BOOKLET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.booklet</code> attribute.
	 * @return the booklet
	 */
	public Booklet getBooklet()
	{
		return getBooklet( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.booklet</code> attribute. 
	 * @param value the booklet
	 */
	public void setBooklet(final SessionContext ctx, final Booklet value)
	{
		BOOKLETHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.booklet</code> attribute. 
	 * @param value the booklet
	 */
	public void setBooklet(final Booklet value)
	{
		setBooklet( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.couponNumber</code> attribute.
	 * @return the couponNumber
	 */
	public String getCouponNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COUPONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.couponNumber</code> attribute.
	 * @return the couponNumber
	 */
	public String getCouponNumber()
	{
		return getCouponNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.couponNumber</code> attribute. 
	 * @param value the couponNumber
	 */
	public void setCouponNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COUPONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.couponNumber</code> attribute. 
	 * @param value the couponNumber
	 */
	public void setCouponNumber(final String value)
	{
		setCouponNumber( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		BOOKLETHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute.
	 * @return the totalNumberOfBooklets
	 */
	public Integer getTotalNumberOfBooklets(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOTALNUMBEROFBOOKLETS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute.
	 * @return the totalNumberOfBooklets
	 */
	public Integer getTotalNumberOfBooklets()
	{
		return getTotalNumberOfBooklets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @return the totalNumberOfBooklets
	 */
	public int getTotalNumberOfBookletsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getTotalNumberOfBooklets( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @return the totalNumberOfBooklets
	 */
	public int getTotalNumberOfBookletsAsPrimitive()
	{
		return getTotalNumberOfBookletsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @param value the totalNumberOfBooklets
	 */
	public void setTotalNumberOfBooklets(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOTALNUMBEROFBOOKLETS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @param value the totalNumberOfBooklets
	 */
	public void setTotalNumberOfBooklets(final Integer value)
	{
		setTotalNumberOfBooklets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @param value the totalNumberOfBooklets
	 */
	public void setTotalNumberOfBooklets(final SessionContext ctx, final int value)
	{
		setTotalNumberOfBooklets( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PaperCoupon.totalNumberOfBooklets</code> attribute. 
	 * @param value the totalNumberOfBooklets
	 */
	public void setTotalNumberOfBooklets(final int value)
	{
		setTotalNumberOfBooklets( getSession().getSessionContext(), value );
	}
	
}
