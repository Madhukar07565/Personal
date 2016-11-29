/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.datamodel.supplier.rates.ancillaryratedefinition.jalo.AncillaryRateDefinition;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SeasonDetail;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SupplierAncillaryRate SupplierAncillaryRate}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierAncillaryRate extends AbstractTravelogixItem
{
	/** Qualifier of the <code>SupplierAncillaryRate.activeDateRange</code> attribute **/
	public static final String ACTIVEDATERANGE = "activeDateRange";
	/** Qualifier of the <code>SupplierAncillaryRate.seasonDetails</code> attribute **/
	public static final String SEASONDETAILS = "seasonDetails";
	/** Qualifier of the <code>SupplierAncillaryRate.medias</code> attribute **/
	public static final String MEDIAS = "medias";
	/** Relation ordering override parameter constants for SupplierAncRate2MediaRelation from ((supplierratedefinitionscore))*/
	protected static String SUPPLIERANCRATE2MEDIARELATION_SRC_ORDERED = "relation.SupplierAncRate2MediaRelation.source.ordered";
	protected static String SUPPLIERANCRATE2MEDIARELATION_TGT_ORDERED = "relation.SupplierAncRate2MediaRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for SupplierAncRate2MediaRelation from ((supplierratedefinitionscore))*/
	protected static String SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED = "relation.SupplierAncRate2MediaRelation.markmodified";
	/** Qualifier of the <code>SupplierAncillaryRate.ancillaryRateDefinitions</code> attribute **/
	public static final String ANCILLARYRATEDEFINITIONS = "ancillaryRateDefinitions";
	/**
	* {@link OneToManyHandler} for handling 1:n SEASONDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SeasonDetail> SEASONDETAILSHANDLER = new OneToManyHandler<SeasonDetail>(
	SupplierratedefinitionscoreConstants.TC.SEASONDETAIL,
	true,
	"supplierAncillaryRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n ANCILLARYRATEDEFINITIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AncillaryRateDefinition> ANCILLARYRATEDEFINITIONSHANDLER = new OneToManyHandler<AncillaryRateDefinition>(
	SupplierratedefinitionscoreConstants.TC.ANCILLARYRATEDEFINITION,
	false,
	"supplierAncillaryRate",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ACTIVEDATERANGE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public StandardDateRange getActiveDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, ACTIVEDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.activeDateRange</code> attribute.
	 * @return the activeDateRange
	 */
	public StandardDateRange getActiveDateRange()
	{
		return getActiveDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, ACTIVEDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.activeDateRange</code> attribute. 
	 * @param value the activeDateRange
	 */
	public void setActiveDateRange(final StandardDateRange value)
	{
		setActiveDateRange( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.ancillaryRateDefinitions</code> attribute.
	 * @return the ancillaryRateDefinitions
	 */
	public Collection<AncillaryRateDefinition> getAncillaryRateDefinitions(final SessionContext ctx)
	{
		return ANCILLARYRATEDEFINITIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.ancillaryRateDefinitions</code> attribute.
	 * @return the ancillaryRateDefinitions
	 */
	public Collection<AncillaryRateDefinition> getAncillaryRateDefinitions()
	{
		return getAncillaryRateDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.ancillaryRateDefinitions</code> attribute. 
	 * @param value the ancillaryRateDefinitions
	 */
	public void setAncillaryRateDefinitions(final SessionContext ctx, final Collection<AncillaryRateDefinition> value)
	{
		ANCILLARYRATEDEFINITIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.ancillaryRateDefinitions</code> attribute. 
	 * @param value the ancillaryRateDefinitions
	 */
	public void setAncillaryRateDefinitions(final Collection<AncillaryRateDefinition> value)
	{
		setAncillaryRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ancillaryRateDefinitions. 
	 * @param value the item to add to ancillaryRateDefinitions
	 */
	public void addToAncillaryRateDefinitions(final SessionContext ctx, final AncillaryRateDefinition value)
	{
		ANCILLARYRATEDEFINITIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to ancillaryRateDefinitions. 
	 * @param value the item to add to ancillaryRateDefinitions
	 */
	public void addToAncillaryRateDefinitions(final AncillaryRateDefinition value)
	{
		addToAncillaryRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ancillaryRateDefinitions. 
	 * @param value the item to remove from ancillaryRateDefinitions
	 */
	public void removeFromAncillaryRateDefinitions(final SessionContext ctx, final AncillaryRateDefinition value)
	{
		ANCILLARYRATEDEFINITIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from ancillaryRateDefinitions. 
	 * @param value the item to remove from ancillaryRateDefinitions
	 */
	public void removeFromAncillaryRateDefinitions(final AncillaryRateDefinition value)
	{
		removeFromAncillaryRateDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias(final SessionContext ctx)
	{
		final List<Media> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			"Media",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.medias</code> attribute.
	 * @return the medias
	 */
	public Collection<Media> getMedias()
	{
		return getMedias( getSession().getSessionContext() );
	}
	
	public long getMediasCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			"Media",
			null
		);
	}
	
	public long getMediasCount()
	{
		return getMediasCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.medias</code> attribute. 
	 * @param value the medias
	 */
	public void setMedias(final SessionContext ctx, final Collection<Media> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.medias</code> attribute. 
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
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
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
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.SUPPLIERANCRATE2MEDIARELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(SUPPLIERANCRATE2MEDIARELATION_MARKMODIFIED)
		);
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
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.seasonDetails</code> attribute.
	 * @return the seasonDetails
	 */
	public Collection<SeasonDetail> getSeasonDetails(final SessionContext ctx)
	{
		return SEASONDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierAncillaryRate.seasonDetails</code> attribute.
	 * @return the seasonDetails
	 */
	public Collection<SeasonDetail> getSeasonDetails()
	{
		return getSeasonDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.seasonDetails</code> attribute. 
	 * @param value the seasonDetails
	 */
	public void setSeasonDetails(final SessionContext ctx, final Collection<SeasonDetail> value)
	{
		SEASONDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierAncillaryRate.seasonDetails</code> attribute. 
	 * @param value the seasonDetails
	 */
	public void setSeasonDetails(final Collection<SeasonDetail> value)
	{
		setSeasonDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seasonDetails. 
	 * @param value the item to add to seasonDetails
	 */
	public void addToSeasonDetails(final SessionContext ctx, final SeasonDetail value)
	{
		SEASONDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to seasonDetails. 
	 * @param value the item to add to seasonDetails
	 */
	public void addToSeasonDetails(final SeasonDetail value)
	{
		addToSeasonDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seasonDetails. 
	 * @param value the item to remove from seasonDetails
	 */
	public void removeFromSeasonDetails(final SessionContext ctx, final SeasonDetail value)
	{
		SEASONDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from seasonDetails. 
	 * @param value the item to remove from seasonDetails
	 */
	public void removeFromSeasonDetails(final SeasonDetail value)
	{
		removeFromSeasonDetails( getSession().getSessionContext(), value );
	}
	
}
