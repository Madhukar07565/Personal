/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.core.supplier.jalo;

import com.cnk.travelogix.supplier.core.constants.SuppliercoreConstants;
import com.cnk.travelogix.supplier.core.supplier.jalo.ROEDetails;
import com.cnk.travelogix.supplier.core.supplier.jalo.TravelogixROE;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.core.supplier.jalo.ROE ROE}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedROE extends GenericItem
{
	/** Qualifier of the <code>ROE.modeofUpload</code> attribute **/
	public static final String MODEOFUPLOAD = "modeofUpload";
	/** Qualifier of the <code>ROE.excelUpload</code> attribute **/
	public static final String EXCELUPLOAD = "excelUpload";
	/** Qualifier of the <code>ROE.roundOffDigits</code> attribute **/
	public static final String ROUNDOFFDIGITS = "roundOffDigits";
	/** Qualifier of the <code>ROE.roedetail</code> attribute **/
	public static final String ROEDETAIL = "roedetail";
	/** Qualifier of the <code>ROE.travelogixroe</code> attribute **/
	public static final String TRAVELOGIXROE = "travelogixroe";
	/**
	* {@link OneToManyHandler} for handling 1:n ROEDETAIL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<ROEDetails> ROEDETAILHANDLER = new OneToManyHandler<ROEDetails>(
	SuppliercoreConstants.TC.ROEDETAILS,
	false,
	"roeies",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TRAVELOGIXROE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedROE> TRAVELOGIXROEHANDLER = new BidirectionalOneToManyHandler<GeneratedROE>(
	SuppliercoreConstants.TC.ROE,
	false,
	"travelogixroe",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MODEOFUPLOAD, AttributeMode.INITIAL);
		tmp.put(EXCELUPLOAD, AttributeMode.INITIAL);
		tmp.put(ROUNDOFFDIGITS, AttributeMode.INITIAL);
		tmp.put(TRAVELOGIXROE, AttributeMode.INITIAL);
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
		TRAVELOGIXROEHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.excelUpload</code> attribute.
	 * @return the excelUpload
	 */
	public Media getExcelUpload(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, EXCELUPLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.excelUpload</code> attribute.
	 * @return the excelUpload
	 */
	public Media getExcelUpload()
	{
		return getExcelUpload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.excelUpload</code> attribute. 
	 * @param value the excelUpload
	 */
	public void setExcelUpload(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, EXCELUPLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.excelUpload</code> attribute. 
	 * @param value the excelUpload
	 */
	public void setExcelUpload(final Media value)
	{
		setExcelUpload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.modeofUpload</code> attribute.
	 * @return the modeofUpload
	 */
	public EnumerationValue getModeofUpload(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MODEOFUPLOAD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.modeofUpload</code> attribute.
	 * @return the modeofUpload
	 */
	public EnumerationValue getModeofUpload()
	{
		return getModeofUpload( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.modeofUpload</code> attribute. 
	 * @param value the modeofUpload
	 */
	public void setModeofUpload(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MODEOFUPLOAD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.modeofUpload</code> attribute. 
	 * @param value the modeofUpload
	 */
	public void setModeofUpload(final EnumerationValue value)
	{
		setModeofUpload( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roedetail</code> attribute.
	 * @return the roedetail
	 */
	public Collection<ROEDetails> getRoedetail(final SessionContext ctx)
	{
		return ROEDETAILHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roedetail</code> attribute.
	 * @return the roedetail
	 */
	public Collection<ROEDetails> getRoedetail()
	{
		return getRoedetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roedetail</code> attribute. 
	 * @param value the roedetail
	 */
	public void setRoedetail(final SessionContext ctx, final Collection<ROEDetails> value)
	{
		ROEDETAILHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roedetail</code> attribute. 
	 * @param value the roedetail
	 */
	public void setRoedetail(final Collection<ROEDetails> value)
	{
		setRoedetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roedetail. 
	 * @param value the item to add to roedetail
	 */
	public void addToRoedetail(final SessionContext ctx, final ROEDetails value)
	{
		ROEDETAILHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to roedetail. 
	 * @param value the item to add to roedetail
	 */
	public void addToRoedetail(final ROEDetails value)
	{
		addToRoedetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roedetail. 
	 * @param value the item to remove from roedetail
	 */
	public void removeFromRoedetail(final SessionContext ctx, final ROEDetails value)
	{
		ROEDETAILHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from roedetail. 
	 * @param value the item to remove from roedetail
	 */
	public void removeFromRoedetail(final ROEDetails value)
	{
		removeFromRoedetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roundOffDigits</code> attribute.
	 * @return the roundOffDigits
	 */
	public Integer getRoundOffDigits(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ROUNDOFFDIGITS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roundOffDigits</code> attribute.
	 * @return the roundOffDigits
	 */
	public Integer getRoundOffDigits()
	{
		return getRoundOffDigits( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @return the roundOffDigits
	 */
	public int getRoundOffDigitsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getRoundOffDigits( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @return the roundOffDigits
	 */
	public int getRoundOffDigitsAsPrimitive()
	{
		return getRoundOffDigitsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @param value the roundOffDigits
	 */
	public void setRoundOffDigits(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ROUNDOFFDIGITS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @param value the roundOffDigits
	 */
	public void setRoundOffDigits(final Integer value)
	{
		setRoundOffDigits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @param value the roundOffDigits
	 */
	public void setRoundOffDigits(final SessionContext ctx, final int value)
	{
		setRoundOffDigits( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.roundOffDigits</code> attribute. 
	 * @param value the roundOffDigits
	 */
	public void setRoundOffDigits(final int value)
	{
		setRoundOffDigits( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.travelogixroe</code> attribute.
	 * @return the travelogixroe
	 */
	public TravelogixROE getTravelogixroe(final SessionContext ctx)
	{
		return (TravelogixROE)getProperty( ctx, TRAVELOGIXROE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ROE.travelogixroe</code> attribute.
	 * @return the travelogixroe
	 */
	public TravelogixROE getTravelogixroe()
	{
		return getTravelogixroe( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.travelogixroe</code> attribute. 
	 * @param value the travelogixroe
	 */
	public void setTravelogixroe(final SessionContext ctx, final TravelogixROE value)
	{
		TRAVELOGIXROEHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ROE.travelogixroe</code> attribute. 
	 * @param value the travelogixroe
	 */
	public void setTravelogixroe(final TravelogixROE value)
	{
		setTravelogixroe( getSession().getSessionContext(), value );
	}
	
}
