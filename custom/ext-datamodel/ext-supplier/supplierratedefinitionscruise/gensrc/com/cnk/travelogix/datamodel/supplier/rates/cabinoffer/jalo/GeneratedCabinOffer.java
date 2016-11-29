/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.cabinoffer.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cruiserateadvdefinition.jalo.CruiseRateAdvDefinition;
import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
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
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.cabinoffer.jalo.CabinOffer CabinOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCabinOffer extends GenericItem
{
	/** Qualifier of the <code>CabinOffer.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Qualifier of the <code>CabinOffer.maxNoOfCabins</code> attribute **/
	public static final String MAXNOOFCABINS = "maxNoOfCabins";
	/** Qualifier of the <code>CabinOffer.cruiserateadvdefinition</code> attribute **/
	public static final String CRUISERATEADVDEFINITION = "cruiserateadvdefinition";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n CRUISERATEADVDEFINITION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCabinOffer> CRUISERATEADVDEFINITIONHANDLER = new BidirectionalOneToManyHandler<GeneratedCabinOffer>(
	SupplierratedefinitionscruiseConstants.TC.CABINOFFER,
	false,
	"cruiserateadvdefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CABIN, AttributeMode.INITIAL);
		tmp.put(MAXNOOFCABINS, AttributeMode.INITIAL);
		tmp.put(CRUISERATEADVDEFINITION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.cabin</code> attribute.
	 * @return the cabin
	 */
	public Cabin getCabin(final SessionContext ctx)
	{
		return (Cabin)getProperty( ctx, CABIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.cabin</code> attribute.
	 * @return the cabin
	 */
	public Cabin getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final SessionContext ctx, final Cabin value)
	{
		setProperty(ctx, CABIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final Cabin value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		CRUISERATEADVDEFINITIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.cruiserateadvdefinition</code> attribute.
	 * @return the cruiserateadvdefinition
	 */
	public CruiseRateAdvDefinition getCruiserateadvdefinition(final SessionContext ctx)
	{
		return (CruiseRateAdvDefinition)getProperty( ctx, CRUISERATEADVDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.cruiserateadvdefinition</code> attribute.
	 * @return the cruiserateadvdefinition
	 */
	public CruiseRateAdvDefinition getCruiserateadvdefinition()
	{
		return getCruiserateadvdefinition( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.cruiserateadvdefinition</code> attribute. 
	 * @param value the cruiserateadvdefinition
	 */
	public void setCruiserateadvdefinition(final SessionContext ctx, final CruiseRateAdvDefinition value)
	{
		CRUISERATEADVDEFINITIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.cruiserateadvdefinition</code> attribute. 
	 * @param value the cruiserateadvdefinition
	 */
	public void setCruiserateadvdefinition(final CruiseRateAdvDefinition value)
	{
		setCruiserateadvdefinition( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute.
	 * @return the maxNoOfCabins
	 */
	public Integer getMaxNoOfCabins(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCabinOffer.getMaxNoOfCabins requires a session language", 0 );
		}
		return (Integer)getLocalizedProperty( ctx, MAXNOOFCABINS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute.
	 * @return the maxNoOfCabins
	 */
	public Integer getMaxNoOfCabins()
	{
		return getMaxNoOfCabins( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @return the maxNoOfCabins
	 */
	public int getMaxNoOfCabinsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxNoOfCabins( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @return the maxNoOfCabins
	 */
	public int getMaxNoOfCabinsAsPrimitive()
	{
		return getMaxNoOfCabinsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @return the localized maxNoOfCabins
	 */
	public Map<Language,Integer> getAllMaxNoOfCabins(final SessionContext ctx)
	{
		return (Map<Language,Integer>)getAllLocalizedProperties(ctx,MAXNOOFCABINS,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @return the localized maxNoOfCabins
	 */
	public Map<Language,Integer> getAllMaxNoOfCabins()
	{
		return getAllMaxNoOfCabins( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setMaxNoOfCabins(final SessionContext ctx, final Integer value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedCabinOffer.setMaxNoOfCabins requires a session language", 0 );
		}
		setLocalizedProperty(ctx, MAXNOOFCABINS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setMaxNoOfCabins(final Integer value)
	{
		setMaxNoOfCabins( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setMaxNoOfCabins(final SessionContext ctx, final int value)
	{
		setMaxNoOfCabins( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setMaxNoOfCabins(final int value)
	{
		setMaxNoOfCabins( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setAllMaxNoOfCabins(final SessionContext ctx, final Map<Language,Integer> value)
	{
		setAllLocalizedProperties(ctx,MAXNOOFCABINS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOffer.maxNoOfCabins</code> attribute. 
	 * @param value the maxNoOfCabins
	 */
	public void setAllMaxNoOfCabins(final Map<Language,Integer> value)
	{
		setAllMaxNoOfCabins( getSession().getSessionContext(), value );
	}
	
}
