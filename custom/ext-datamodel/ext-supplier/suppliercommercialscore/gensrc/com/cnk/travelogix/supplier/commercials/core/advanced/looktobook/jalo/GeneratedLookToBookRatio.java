/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.SupplierLookToBookCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.LookToBookRatio LookToBookRatio}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLookToBookRatio extends GenericItem
{
	/** Qualifier of the <code>LookToBookRatio.lookFrom</code> attribute **/
	public static final String LOOKFROM = "lookFrom";
	/** Qualifier of the <code>LookToBookRatio.lookTo</code> attribute **/
	public static final String LOOKTO = "lookTo";
	/** Qualifier of the <code>LookToBookRatio.bookRatio</code> attribute **/
	public static final String BOOKRATIO = "bookRatio";
	/** Qualifier of the <code>LookToBookRatio.amountPerExcessLook</code> attribute **/
	public static final String AMOUNTPEREXCESSLOOK = "amountPerExcessLook";
	/** Qualifier of the <code>LookToBookRatio.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>LookToBookRatio.commercial</code> attribute **/
	public static final String COMMERCIAL = "commercial";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedLookToBookRatio> COMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedLookToBookRatio>(
	SuppliercommercialscoreConstants.TC.LOOKTOBOOKRATIO,
	false,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(LOOKFROM, AttributeMode.INITIAL);
		tmp.put(LOOKTO, AttributeMode.INITIAL);
		tmp.put(BOOKRATIO, AttributeMode.INITIAL);
		tmp.put(AMOUNTPEREXCESSLOOK, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(COMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute.
	 * @return the amountPerExcessLook
	 */
	public Double getAmountPerExcessLook(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, AMOUNTPEREXCESSLOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute.
	 * @return the amountPerExcessLook
	 */
	public Double getAmountPerExcessLook()
	{
		return getAmountPerExcessLook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @return the amountPerExcessLook
	 */
	public double getAmountPerExcessLookAsPrimitive(final SessionContext ctx)
	{
		Double value = getAmountPerExcessLook( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @return the amountPerExcessLook
	 */
	public double getAmountPerExcessLookAsPrimitive()
	{
		return getAmountPerExcessLookAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @param value the amountPerExcessLook
	 */
	public void setAmountPerExcessLook(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, AMOUNTPEREXCESSLOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @param value the amountPerExcessLook
	 */
	public void setAmountPerExcessLook(final Double value)
	{
		setAmountPerExcessLook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @param value the amountPerExcessLook
	 */
	public void setAmountPerExcessLook(final SessionContext ctx, final double value)
	{
		setAmountPerExcessLook( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.amountPerExcessLook</code> attribute. 
	 * @param value the amountPerExcessLook
	 */
	public void setAmountPerExcessLook(final double value)
	{
		setAmountPerExcessLook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.bookRatio</code> attribute.
	 * @return the bookRatio
	 */
	public Integer getBookRatio(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, BOOKRATIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.bookRatio</code> attribute.
	 * @return the bookRatio
	 */
	public Integer getBookRatio()
	{
		return getBookRatio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @return the bookRatio
	 */
	public int getBookRatioAsPrimitive(final SessionContext ctx)
	{
		Integer value = getBookRatio( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @return the bookRatio
	 */
	public int getBookRatioAsPrimitive()
	{
		return getBookRatioAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, BOOKRATIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final Integer value)
	{
		setBookRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final SessionContext ctx, final int value)
	{
		setBookRatio( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final int value)
	{
		setBookRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierLookToBookCommercialRecord getCommercial(final SessionContext ctx)
	{
		return (SupplierLookToBookCommercialRecord)getProperty( ctx, COMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.commercial</code> attribute.
	 * @return the commercial
	 */
	public SupplierLookToBookCommercialRecord getCommercial()
	{
		return getCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SessionContext ctx, final SupplierLookToBookCommercialRecord value)
	{
		COMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.commercial</code> attribute. 
	 * @param value the commercial
	 */
	public void setCommercial(final SupplierLookToBookCommercialRecord value)
	{
		setCommercial( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookFrom</code> attribute.
	 * @return the lookFrom
	 */
	public Integer getLookFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LOOKFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookFrom</code> attribute.
	 * @return the lookFrom
	 */
	public Integer getLookFrom()
	{
		return getLookFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @return the lookFrom
	 */
	public int getLookFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLookFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @return the lookFrom
	 */
	public int getLookFromAsPrimitive()
	{
		return getLookFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @param value the lookFrom
	 */
	public void setLookFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LOOKFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @param value the lookFrom
	 */
	public void setLookFrom(final Integer value)
	{
		setLookFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @param value the lookFrom
	 */
	public void setLookFrom(final SessionContext ctx, final int value)
	{
		setLookFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookFrom</code> attribute. 
	 * @param value the lookFrom
	 */
	public void setLookFrom(final int value)
	{
		setLookFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookTo</code> attribute.
	 * @return the lookTo
	 */
	public Integer getLookTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, LOOKTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookTo</code> attribute.
	 * @return the lookTo
	 */
	public Integer getLookTo()
	{
		return getLookTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @return the lookTo
	 */
	public int getLookToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getLookTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @return the lookTo
	 */
	public int getLookToAsPrimitive()
	{
		return getLookToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @param value the lookTo
	 */
	public void setLookTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, LOOKTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @param value the lookTo
	 */
	public void setLookTo(final Integer value)
	{
		setLookTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @param value the lookTo
	 */
	public void setLookTo(final SessionContext ctx, final int value)
	{
		setLookTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatio.lookTo</code> attribute. 
	 * @param value the lookTo
	 */
	public void setLookTo(final int value)
	{
		setLookTo( getSession().getSessionContext(), value );
	}
	
}
