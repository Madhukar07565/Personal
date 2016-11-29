/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.LookToBookRatio;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierLookToBookCommercial;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.looktobook.jalo.SupplierLookToBookCommercialRecord SupplierLookToBookCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierLookToBookCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute **/
	public static final String BYRATIO = "byRatio";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute **/
	public static final String RATEPERLOOK = "ratePerLook";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute **/
	public static final String RATEPERBOOK = "ratePerBook";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.lookCurrency</code> attribute **/
	public static final String LOOKCURRENCY = "lookCurrency";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.waiverFrom</code> attribute **/
	public static final String WAIVERFROM = "waiverFrom";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.waiverTo</code> attribute **/
	public static final String WAIVERTO = "waiverTo";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.bookCurrency</code> attribute **/
	public static final String BOOKCURRENCY = "bookCurrency";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.lookToBookRatios</code> attribute **/
	public static final String LOOKTOBOOKRATIOS = "lookToBookRatios";
	/** Qualifier of the <code>SupplierLookToBookCommercialRecord.lookToBookCommercial</code> attribute **/
	public static final String LOOKTOBOOKCOMMERCIAL = "lookToBookCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n LOOKTOBOOKRATIOS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<LookToBookRatio> LOOKTOBOOKRATIOSHANDLER = new OneToManyHandler<LookToBookRatio>(
	SuppliercommercialscoreConstants.TC.LOOKTOBOOKRATIO,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n LOOKTOBOOKCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierLookToBookCommercialRecord> LOOKTOBOOKCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierLookToBookCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERLOOKTOBOOKCOMMERCIALRECORD,
	false,
	"lookToBookCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(BYRATIO, AttributeMode.INITIAL);
		tmp.put(RATEPERLOOK, AttributeMode.INITIAL);
		tmp.put(RATEPERBOOK, AttributeMode.INITIAL);
		tmp.put(LOOKCURRENCY, AttributeMode.INITIAL);
		tmp.put(WAIVERFROM, AttributeMode.INITIAL);
		tmp.put(WAIVERTO, AttributeMode.INITIAL);
		tmp.put(BOOKCURRENCY, AttributeMode.INITIAL);
		tmp.put(LOOKTOBOOKCOMMERCIAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.bookCurrency</code> attribute.
	 * @return the bookCurrency
	 */
	public Currency getBookCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, BOOKCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.bookCurrency</code> attribute.
	 * @return the bookCurrency
	 */
	public Currency getBookCurrency()
	{
		return getBookCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.bookCurrency</code> attribute. 
	 * @param value the bookCurrency
	 */
	public void setBookCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, BOOKCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.bookCurrency</code> attribute. 
	 * @param value the bookCurrency
	 */
	public void setBookCurrency(final Currency value)
	{
		setBookCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute.
	 * @return the byRatio
	 */
	public Boolean isByRatio(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BYRATIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute.
	 * @return the byRatio
	 */
	public Boolean isByRatio()
	{
		return isByRatio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @return the byRatio
	 */
	public boolean isByRatioAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isByRatio( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @return the byRatio
	 */
	public boolean isByRatioAsPrimitive()
	{
		return isByRatioAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @param value the byRatio
	 */
	public void setByRatio(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BYRATIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @param value the byRatio
	 */
	public void setByRatio(final Boolean value)
	{
		setByRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @param value the byRatio
	 */
	public void setByRatio(final SessionContext ctx, final boolean value)
	{
		setByRatio( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.byRatio</code> attribute. 
	 * @param value the byRatio
	 */
	public void setByRatio(final boolean value)
	{
		setByRatio( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		LOOKTOBOOKCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookCurrency</code> attribute.
	 * @return the lookCurrency
	 */
	public Currency getLookCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, LOOKCURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookCurrency</code> attribute.
	 * @return the lookCurrency
	 */
	public Currency getLookCurrency()
	{
		return getLookCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookCurrency</code> attribute. 
	 * @param value the lookCurrency
	 */
	public void setLookCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, LOOKCURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookCurrency</code> attribute. 
	 * @param value the lookCurrency
	 */
	public void setLookCurrency(final Currency value)
	{
		setLookCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookToBookCommercial</code> attribute.
	 * @return the lookToBookCommercial
	 */
	public SupplierLookToBookCommercial getLookToBookCommercial(final SessionContext ctx)
	{
		return (SupplierLookToBookCommercial)getProperty( ctx, LOOKTOBOOKCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookToBookCommercial</code> attribute.
	 * @return the lookToBookCommercial
	 */
	public SupplierLookToBookCommercial getLookToBookCommercial()
	{
		return getLookToBookCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookToBookCommercial</code> attribute. 
	 * @param value the lookToBookCommercial
	 */
	public void setLookToBookCommercial(final SessionContext ctx, final SupplierLookToBookCommercial value)
	{
		LOOKTOBOOKCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookToBookCommercial</code> attribute. 
	 * @param value the lookToBookCommercial
	 */
	public void setLookToBookCommercial(final SupplierLookToBookCommercial value)
	{
		setLookToBookCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookToBookRatios</code> attribute.
	 * @return the lookToBookRatios
	 */
	public Collection<LookToBookRatio> getLookToBookRatios(final SessionContext ctx)
	{
		return LOOKTOBOOKRATIOSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.lookToBookRatios</code> attribute.
	 * @return the lookToBookRatios
	 */
	public Collection<LookToBookRatio> getLookToBookRatios()
	{
		return getLookToBookRatios( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookToBookRatios</code> attribute. 
	 * @param value the lookToBookRatios
	 */
	public void setLookToBookRatios(final SessionContext ctx, final Collection<LookToBookRatio> value)
	{
		LOOKTOBOOKRATIOSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.lookToBookRatios</code> attribute. 
	 * @param value the lookToBookRatios
	 */
	public void setLookToBookRatios(final Collection<LookToBookRatio> value)
	{
		setLookToBookRatios( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lookToBookRatios. 
	 * @param value the item to add to lookToBookRatios
	 */
	public void addToLookToBookRatios(final SessionContext ctx, final LookToBookRatio value)
	{
		LOOKTOBOOKRATIOSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to lookToBookRatios. 
	 * @param value the item to add to lookToBookRatios
	 */
	public void addToLookToBookRatios(final LookToBookRatio value)
	{
		addToLookToBookRatios( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lookToBookRatios. 
	 * @param value the item to remove from lookToBookRatios
	 */
	public void removeFromLookToBookRatios(final SessionContext ctx, final LookToBookRatio value)
	{
		LOOKTOBOOKRATIOSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from lookToBookRatios. 
	 * @param value the item to remove from lookToBookRatios
	 */
	public void removeFromLookToBookRatios(final LookToBookRatio value)
	{
		removeFromLookToBookRatios( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute.
	 * @return the ratePerBook
	 */
	public Double getRatePerBook(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATEPERBOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute.
	 * @return the ratePerBook
	 */
	public Double getRatePerBook()
	{
		return getRatePerBook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @return the ratePerBook
	 */
	public double getRatePerBookAsPrimitive(final SessionContext ctx)
	{
		Double value = getRatePerBook( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @return the ratePerBook
	 */
	public double getRatePerBookAsPrimitive()
	{
		return getRatePerBookAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @param value the ratePerBook
	 */
	public void setRatePerBook(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATEPERBOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @param value the ratePerBook
	 */
	public void setRatePerBook(final Double value)
	{
		setRatePerBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @param value the ratePerBook
	 */
	public void setRatePerBook(final SessionContext ctx, final double value)
	{
		setRatePerBook( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerBook</code> attribute. 
	 * @param value the ratePerBook
	 */
	public void setRatePerBook(final double value)
	{
		setRatePerBook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute.
	 * @return the ratePerLook
	 */
	public Double getRatePerLook(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, RATEPERLOOK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute.
	 * @return the ratePerLook
	 */
	public Double getRatePerLook()
	{
		return getRatePerLook( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @return the ratePerLook
	 */
	public double getRatePerLookAsPrimitive(final SessionContext ctx)
	{
		Double value = getRatePerLook( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @return the ratePerLook
	 */
	public double getRatePerLookAsPrimitive()
	{
		return getRatePerLookAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @param value the ratePerLook
	 */
	public void setRatePerLook(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, RATEPERLOOK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @param value the ratePerLook
	 */
	public void setRatePerLook(final Double value)
	{
		setRatePerLook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @param value the ratePerLook
	 */
	public void setRatePerLook(final SessionContext ctx, final double value)
	{
		setRatePerLook( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.ratePerLook</code> attribute. 
	 * @param value the ratePerLook
	 */
	public void setRatePerLook(final double value)
	{
		setRatePerLook( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.waiverFrom</code> attribute.
	 * @return the waiverFrom
	 */
	public Date getWaiverFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, WAIVERFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.waiverFrom</code> attribute.
	 * @return the waiverFrom
	 */
	public Date getWaiverFrom()
	{
		return getWaiverFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.waiverFrom</code> attribute. 
	 * @param value the waiverFrom
	 */
	public void setWaiverFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, WAIVERFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.waiverFrom</code> attribute. 
	 * @param value the waiverFrom
	 */
	public void setWaiverFrom(final Date value)
	{
		setWaiverFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.waiverTo</code> attribute.
	 * @return the waiverTo
	 */
	public Date getWaiverTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, WAIVERTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierLookToBookCommercialRecord.waiverTo</code> attribute.
	 * @return the waiverTo
	 */
	public Date getWaiverTo()
	{
		return getWaiverTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.waiverTo</code> attribute. 
	 * @param value the waiverTo
	 */
	public void setWaiverTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, WAIVERTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierLookToBookCommercialRecord.waiverTo</code> attribute. 
	 * @param value the waiverTo
	 */
	public void setWaiverTo(final Date value)
	{
		setWaiverTo( getSession().getSessionContext(), value );
	}
	
}
