/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent;

import com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction;
import com.cnk.travelogix.datamodel.supplier.rates.offercombinationrule.jalo.OfferCombinationRule;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.RateVoucherNote;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition AbstractRateAdvDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractRateAdvDefinition extends GenericItem
{
	/** Qualifier of the <code>AbstractRateAdvDefinition.maxPax</code> attribute **/
	public static final String MAXPAX = "maxPax";
	/** Qualifier of the <code>AbstractRateAdvDefinition.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>AbstractRateAdvDefinition.minPax</code> attribute **/
	public static final String MINPAX = "minPax";
	/** Qualifier of the <code>AbstractRateAdvDefinition.maxNights</code> attribute **/
	public static final String MAXNIGHTS = "maxNights";
	/** Qualifier of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute **/
	public static final String PRICEEXCLUSION = "priceExclusion";
	/** Qualifier of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute **/
	public static final String TAXINFORMATION = "taxInformation";
	/** Qualifier of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute **/
	public static final String INTERNALDESCRIPTION = "internalDescription";
	/** Qualifier of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute **/
	public static final String PRICEINCLUSION = "priceInclusion";
	/** Qualifier of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute **/
	public static final String EXTERNALDESCRIPTION = "externalDescription";
	/** Qualifier of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute **/
	public static final String CHILDPOLICY = "childPolicy";
	/** Qualifier of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute **/
	public static final String OVERRIDERATE = "overrideRate";
	/** Qualifier of the <code>AbstractRateAdvDefinition.rateVoucherNote</code> attribute **/
	public static final String RATEVOUCHERNOTE = "rateVoucherNote";
	/** Qualifier of the <code>AbstractRateAdvDefinition.salesDuration</code> attribute **/
	public static final String SALESDURATION = "salesDuration";
	/** Qualifier of the <code>AbstractRateAdvDefinition.blockOutDuration</code> attribute **/
	public static final String BLOCKOUTDURATION = "blockOutDuration";
	/** Qualifier of the <code>AbstractRateAdvDefinition.offerCombinationRule</code> attribute **/
	public static final String OFFERCOMBINATIONRULE = "offerCombinationRule";
	/**
	* {@link OneToManyHandler} for handling 1:n RATEVOUCHERNOTE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<RateVoucherNote> RATEVOUCHERNOTEHANDLER = new OneToManyHandler<RateVoucherNote>(
	SupplierratedefinitionscoreConstants.TC.RATEVOUCHERNOTE,
	true,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SALESDURATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DateRangeRestriction> SALESDURATIONHANDLER = new OneToManyHandler<DateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	true,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BLOCKOUTDURATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DateRangeRestriction> BLOCKOUTDURATIONHANDLER = new OneToManyHandler<DateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	true,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n OFFERCOMBINATIONRULE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<OfferCombinationRule> OFFERCOMBINATIONRULEHANDLER = new OneToManyHandler<OfferCombinationRule>(
	SupplierratedefinitionscoreConstants.TC.OFFERCOMBINATIONRULE,
	true,
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
		tmp.put(MAXPAX, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(MINPAX, AttributeMode.INITIAL);
		tmp.put(MAXNIGHTS, AttributeMode.INITIAL);
		tmp.put(PRICEEXCLUSION, AttributeMode.INITIAL);
		tmp.put(TAXINFORMATION, AttributeMode.INITIAL);
		tmp.put(INTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(PRICEINCLUSION, AttributeMode.INITIAL);
		tmp.put(EXTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(CHILDPOLICY, AttributeMode.INITIAL);
		tmp.put(OVERRIDERATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.blockOutDuration</code> attribute.
	 * @return the blockOutDuration
	 */
	public Set<DateRangeRestriction> getBlockOutDuration(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)BLOCKOUTDURATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.blockOutDuration</code> attribute.
	 * @return the blockOutDuration
	 */
	public Set<DateRangeRestriction> getBlockOutDuration()
	{
		return getBlockOutDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.blockOutDuration</code> attribute. 
	 * @param value the blockOutDuration
	 */
	public void setBlockOutDuration(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		BLOCKOUTDURATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.blockOutDuration</code> attribute. 
	 * @param value the blockOutDuration
	 */
	public void setBlockOutDuration(final Set<DateRangeRestriction> value)
	{
		setBlockOutDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDuration. 
	 * @param value the item to add to blockOutDuration
	 */
	public void addToBlockOutDuration(final SessionContext ctx, final DateRangeRestriction value)
	{
		BLOCKOUTDURATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to blockOutDuration. 
	 * @param value the item to add to blockOutDuration
	 */
	public void addToBlockOutDuration(final DateRangeRestriction value)
	{
		addToBlockOutDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDuration. 
	 * @param value the item to remove from blockOutDuration
	 */
	public void removeFromBlockOutDuration(final SessionContext ctx, final DateRangeRestriction value)
	{
		BLOCKOUTDURATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from blockOutDuration. 
	 * @param value the item to remove from blockOutDuration
	 */
	public void removeFromBlockOutDuration(final DateRangeRestriction value)
	{
		removeFromBlockOutDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute.
	 * @return the childPolicy
	 */
	public String getChildPolicy(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getChildPolicy requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, CHILDPOLICY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute.
	 * @return the childPolicy
	 */
	public String getChildPolicy()
	{
		return getChildPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @return the localized childPolicy
	 */
	public Map<Language,String> getAllChildPolicy(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,CHILDPOLICY,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @return the localized childPolicy
	 */
	public Map<Language,String> getAllChildPolicy()
	{
		return getAllChildPolicy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @param value the childPolicy
	 */
	public void setChildPolicy(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setChildPolicy requires a session language", 0 );
		}
		setLocalizedProperty(ctx, CHILDPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @param value the childPolicy
	 */
	public void setChildPolicy(final String value)
	{
		setChildPolicy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @param value the childPolicy
	 */
	public void setAllChildPolicy(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,CHILDPOLICY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.childPolicy</code> attribute. 
	 * @param value the childPolicy
	 */
	public void setAllChildPolicy(final Map<Language,String> value)
	{
		setAllChildPolicy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getExternalDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, EXTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription()
	{
		return getExternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @return the localized externalDescription
	 */
	public Map<Language,String> getAllExternalDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,EXTERNALDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @return the localized externalDescription
	 */
	public Map<Language,String> getAllExternalDescription()
	{
		return getAllExternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setExternalDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, EXTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final String value)
	{
		setExternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setAllExternalDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,EXTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setAllExternalDescription(final Map<Language,String> value)
	{
		setAllExternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getInternalDescription requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, INTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription()
	{
		return getInternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @return the localized internalDescription
	 */
	public Map<Language,String> getAllInternalDescription(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,INTERNALDESCRIPTION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @return the localized internalDescription
	 */
	public Map<Language,String> getAllInternalDescription()
	{
		return getAllInternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setInternalDescription requires a session language", 0 );
		}
		setLocalizedProperty(ctx, INTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final String value)
	{
		setInternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setAllInternalDescription(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,INTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setAllInternalDescription(final Map<Language,String> value)
	{
		setAllInternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute.
	 * @return the maxNights
	 */
	public Integer getMaxNights(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXNIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute.
	 * @return the maxNights
	 */
	public Integer getMaxNights()
	{
		return getMaxNights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @return the maxNights
	 */
	public int getMaxNightsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxNights( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @return the maxNights
	 */
	public int getMaxNightsAsPrimitive()
	{
		return getMaxNightsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @param value the maxNights
	 */
	public void setMaxNights(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXNIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @param value the maxNights
	 */
	public void setMaxNights(final Integer value)
	{
		setMaxNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @param value the maxNights
	 */
	public void setMaxNights(final SessionContext ctx, final int value)
	{
		setMaxNights( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxNights</code> attribute. 
	 * @param value the maxNights
	 */
	public void setMaxNights(final int value)
	{
		setMaxNights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute.
	 * @return the maxPax
	 */
	public Integer getMaxPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute.
	 * @return the maxPax
	 */
	public Integer getMaxPax()
	{
		return getMaxPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @return the maxPax
	 */
	public int getMaxPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @return the maxPax
	 */
	public int getMaxPaxAsPrimitive()
	{
		return getMaxPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final Integer value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final SessionContext ctx, final int value)
	{
		setMaxPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.maxPax</code> attribute. 
	 * @param value the maxPax
	 */
	public void setMaxPax(final int value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.minPax</code> attribute.
	 * @return the minPax
	 */
	public Integer getMinPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MINPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.minPax</code> attribute.
	 * @return the minPax
	 */
	public Integer getMinPax()
	{
		return getMinPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @return the minPax
	 */
	public int getMinPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMinPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @return the minPax
	 */
	public int getMinPaxAsPrimitive()
	{
		return getMinPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MINPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final Integer value)
	{
		setMinPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final SessionContext ctx, final int value)
	{
		setMinPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.minPax</code> attribute. 
	 * @param value the minPax
	 */
	public void setMinPax(final int value)
	{
		setMinPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.nationality</code> attribute.
	 * @return the nationality
	 */
	public Collection<Country> getNationality(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, NATIONALITY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.nationality</code> attribute.
	 * @return the nationality
	 */
	public Collection<Country> getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, NATIONALITY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final Collection<Country> value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.offerCombinationRule</code> attribute.
	 * @return the offerCombinationRule
	 */
	public Set<OfferCombinationRule> getOfferCombinationRule(final SessionContext ctx)
	{
		return (Set<OfferCombinationRule>)OFFERCOMBINATIONRULEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.offerCombinationRule</code> attribute.
	 * @return the offerCombinationRule
	 */
	public Set<OfferCombinationRule> getOfferCombinationRule()
	{
		return getOfferCombinationRule( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.offerCombinationRule</code> attribute. 
	 * @param value the offerCombinationRule
	 */
	public void setOfferCombinationRule(final SessionContext ctx, final Set<OfferCombinationRule> value)
	{
		OFFERCOMBINATIONRULEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.offerCombinationRule</code> attribute. 
	 * @param value the offerCombinationRule
	 */
	public void setOfferCombinationRule(final Set<OfferCombinationRule> value)
	{
		setOfferCombinationRule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to offerCombinationRule. 
	 * @param value the item to add to offerCombinationRule
	 */
	public void addToOfferCombinationRule(final SessionContext ctx, final OfferCombinationRule value)
	{
		OFFERCOMBINATIONRULEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to offerCombinationRule. 
	 * @param value the item to add to offerCombinationRule
	 */
	public void addToOfferCombinationRule(final OfferCombinationRule value)
	{
		addToOfferCombinationRule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from offerCombinationRule. 
	 * @param value the item to remove from offerCombinationRule
	 */
	public void removeFromOfferCombinationRule(final SessionContext ctx, final OfferCombinationRule value)
	{
		OFFERCOMBINATIONRULEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from offerCombinationRule. 
	 * @param value the item to remove from offerCombinationRule
	 */
	public void removeFromOfferCombinationRule(final OfferCombinationRule value)
	{
		removeFromOfferCombinationRule( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute.
	 * @return the overrideRate
	 */
	public Boolean isOverrideRate(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OVERRIDERATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute.
	 * @return the overrideRate
	 */
	public Boolean isOverrideRate()
	{
		return isOverrideRate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @return the overrideRate
	 */
	public boolean isOverrideRateAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOverrideRate( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @return the overrideRate
	 */
	public boolean isOverrideRateAsPrimitive()
	{
		return isOverrideRateAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @param value the overrideRate
	 */
	public void setOverrideRate(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OVERRIDERATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @param value the overrideRate
	 */
	public void setOverrideRate(final Boolean value)
	{
		setOverrideRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @param value the overrideRate
	 */
	public void setOverrideRate(final SessionContext ctx, final boolean value)
	{
		setOverrideRate( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.overrideRate</code> attribute. 
	 * @param value the overrideRate
	 */
	public void setOverrideRate(final boolean value)
	{
		setOverrideRate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute.
	 * @return the priceExclusion
	 */
	public String getPriceExclusion(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getPriceExclusion requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRICEEXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute.
	 * @return the priceExclusion
	 */
	public String getPriceExclusion()
	{
		return getPriceExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @return the localized priceExclusion
	 */
	public Map<Language,String> getAllPriceExclusion(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRICEEXCLUSION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @return the localized priceExclusion
	 */
	public Map<Language,String> getAllPriceExclusion()
	{
		return getAllPriceExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setPriceExclusion(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setPriceExclusion requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRICEEXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setPriceExclusion(final String value)
	{
		setPriceExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setAllPriceExclusion(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRICEEXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceExclusion</code> attribute. 
	 * @param value the priceExclusion
	 */
	public void setAllPriceExclusion(final Map<Language,String> value)
	{
		setAllPriceExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute.
	 * @return the priceInclusion
	 */
	public String getPriceInclusion(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getPriceInclusion requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, PRICEINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute.
	 * @return the priceInclusion
	 */
	public String getPriceInclusion()
	{
		return getPriceInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @return the localized priceInclusion
	 */
	public Map<Language,String> getAllPriceInclusion(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,PRICEINCLUSION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @return the localized priceInclusion
	 */
	public Map<Language,String> getAllPriceInclusion()
	{
		return getAllPriceInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setPriceInclusion(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setPriceInclusion requires a session language", 0 );
		}
		setLocalizedProperty(ctx, PRICEINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setPriceInclusion(final String value)
	{
		setPriceInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setAllPriceInclusion(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,PRICEINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.priceInclusion</code> attribute. 
	 * @param value the priceInclusion
	 */
	public void setAllPriceInclusion(final Map<Language,String> value)
	{
		setAllPriceInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.rateVoucherNote</code> attribute.
	 * @return the rateVoucherNote
	 */
	public Set<RateVoucherNote> getRateVoucherNote(final SessionContext ctx)
	{
		return (Set<RateVoucherNote>)RATEVOUCHERNOTEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.rateVoucherNote</code> attribute.
	 * @return the rateVoucherNote
	 */
	public Set<RateVoucherNote> getRateVoucherNote()
	{
		return getRateVoucherNote( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.rateVoucherNote</code> attribute. 
	 * @param value the rateVoucherNote
	 */
	public void setRateVoucherNote(final SessionContext ctx, final Set<RateVoucherNote> value)
	{
		RATEVOUCHERNOTEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.rateVoucherNote</code> attribute. 
	 * @param value the rateVoucherNote
	 */
	public void setRateVoucherNote(final Set<RateVoucherNote> value)
	{
		setRateVoucherNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateVoucherNote. 
	 * @param value the item to add to rateVoucherNote
	 */
	public void addToRateVoucherNote(final SessionContext ctx, final RateVoucherNote value)
	{
		RATEVOUCHERNOTEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateVoucherNote. 
	 * @param value the item to add to rateVoucherNote
	 */
	public void addToRateVoucherNote(final RateVoucherNote value)
	{
		addToRateVoucherNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateVoucherNote. 
	 * @param value the item to remove from rateVoucherNote
	 */
	public void removeFromRateVoucherNote(final SessionContext ctx, final RateVoucherNote value)
	{
		RATEVOUCHERNOTEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateVoucherNote. 
	 * @param value the item to remove from rateVoucherNote
	 */
	public void removeFromRateVoucherNote(final RateVoucherNote value)
	{
		removeFromRateVoucherNote( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.salesDuration</code> attribute.
	 * @return the salesDuration
	 */
	public Set<DateRangeRestriction> getSalesDuration(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)SALESDURATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.salesDuration</code> attribute.
	 * @return the salesDuration
	 */
	public Set<DateRangeRestriction> getSalesDuration()
	{
		return getSalesDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.salesDuration</code> attribute. 
	 * @param value the salesDuration
	 */
	public void setSalesDuration(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		SALESDURATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.salesDuration</code> attribute. 
	 * @param value the salesDuration
	 */
	public void setSalesDuration(final Set<DateRangeRestriction> value)
	{
		setSalesDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesDuration. 
	 * @param value the item to add to salesDuration
	 */
	public void addToSalesDuration(final SessionContext ctx, final DateRangeRestriction value)
	{
		SALESDURATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to salesDuration. 
	 * @param value the item to add to salesDuration
	 */
	public void addToSalesDuration(final DateRangeRestriction value)
	{
		addToSalesDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesDuration. 
	 * @param value the item to remove from salesDuration
	 */
	public void removeFromSalesDuration(final SessionContext ctx, final DateRangeRestriction value)
	{
		SALESDURATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from salesDuration. 
	 * @param value the item to remove from salesDuration
	 */
	public void removeFromSalesDuration(final DateRangeRestriction value)
	{
		removeFromSalesDuration( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute.
	 * @return the taxInformation
	 */
	public String getTaxInformation(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.getTaxInformation requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, TAXINFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute.
	 * @return the taxInformation
	 */
	public String getTaxInformation()
	{
		return getTaxInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @return the localized taxInformation
	 */
	public Map<Language,String> getAllTaxInformation(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,TAXINFORMATION,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @return the localized taxInformation
	 */
	public Map<Language,String> getAllTaxInformation()
	{
		return getAllTaxInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @param value the taxInformation
	 */
	public void setTaxInformation(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractRateAdvDefinition.setTaxInformation requires a session language", 0 );
		}
		setLocalizedProperty(ctx, TAXINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @param value the taxInformation
	 */
	public void setTaxInformation(final String value)
	{
		setTaxInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @param value the taxInformation
	 */
	public void setAllTaxInformation(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,TAXINFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractRateAdvDefinition.taxInformation</code> attribute. 
	 * @param value the taxInformation
	 */
	public void setAllTaxInformation(final Map<Language,String> value)
	{
		setAllTaxInformation( getSession().getSessionContext(), value );
	}
	
}
