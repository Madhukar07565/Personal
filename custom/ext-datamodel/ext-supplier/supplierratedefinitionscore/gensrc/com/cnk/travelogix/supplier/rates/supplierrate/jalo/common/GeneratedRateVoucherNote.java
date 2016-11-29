/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateVoucherNote RateVoucherNote}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedRateVoucherNote extends GenericItem
{
	/** Qualifier of the <code>RateVoucherNote.offerName</code> attribute **/
	public static final String OFFERNAME = "offerName";
	/** Qualifier of the <code>RateVoucherNote.voucherNotes</code> attribute **/
	public static final String VOUCHERNOTES = "voucherNotes";
	/** Qualifier of the <code>RateVoucherNote.rateAdvDefinitions</code> attribute **/
	public static final String RATEADVDEFINITIONS = "rateAdvDefinitions";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RATEADVDEFINITIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedRateVoucherNote> RATEADVDEFINITIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedRateVoucherNote>(
	SupplierratedefinitionscoreConstants.TC.RATEVOUCHERNOTE,
	false,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OFFERNAME, AttributeMode.INITIAL);
		tmp.put(VOUCHERNOTES, AttributeMode.INITIAL);
		tmp.put(RATEADVDEFINITIONS, AttributeMode.INITIAL);
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
		RATEADVDEFINITIONSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.offerName</code> attribute.
	 * @return the offerName
	 */
	public AbstractTravelogixSupplierOffer getOfferName(final SessionContext ctx)
	{
		return (AbstractTravelogixSupplierOffer)getProperty( ctx, OFFERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.offerName</code> attribute.
	 * @return the offerName
	 */
	public AbstractTravelogixSupplierOffer getOfferName()
	{
		return getOfferName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		setProperty(ctx, OFFERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final AbstractTravelogixSupplierOffer value)
	{
		setOfferName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, RATEADVDEFINITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions()
	{
		return getRateAdvDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		RATEADVDEFINITIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final AbstractRateAdvDefinition value)
	{
		setRateAdvDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.voucherNotes</code> attribute.
	 * @return the voucherNotes
	 */
	public String getVoucherNotes(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRateVoucherNote.getVoucherNotes requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, VOUCHERNOTES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.voucherNotes</code> attribute.
	 * @return the voucherNotes
	 */
	public String getVoucherNotes()
	{
		return getVoucherNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @return the localized voucherNotes
	 */
	public Map<Language,String> getAllVoucherNotes(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,VOUCHERNOTES,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @return the localized voucherNotes
	 */
	public Map<Language,String> getAllVoucherNotes()
	{
		return getAllVoucherNotes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @param value the voucherNotes
	 */
	public void setVoucherNotes(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedRateVoucherNote.setVoucherNotes requires a session language", 0 );
		}
		setLocalizedProperty(ctx, VOUCHERNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @param value the voucherNotes
	 */
	public void setVoucherNotes(final String value)
	{
		setVoucherNotes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @param value the voucherNotes
	 */
	public void setAllVoucherNotes(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,VOUCHERNOTES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>RateVoucherNote.voucherNotes</code> attribute. 
	 * @param value the voucherNotes
	 */
	public void setAllVoucherNotes(final Map<Language,String> value)
	{
		setAllVoucherNotes( getSession().getSessionContext(), value );
	}
	
}
