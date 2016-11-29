/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo;

import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.air.inclusionexclusion.TravelDestinationConfig;
import com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.validity.CommercialsValidity;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.credentials.core.jalo.SupplierCredentials;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advancedefinition.jalo.SupplierCommercialAdvanceDefinition SupplierCommercialAdvanceDefinition}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierCommercialAdvanceDefinition extends GenericItem
{
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.bookingType</code> attribute **/
	public static final String BOOKINGTYPE = "bookingType";
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.commercialsRecord</code> attribute **/
	public static final String COMMERCIALSRECORD = "commercialsRecord";
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.validityConfigs</code> attribute **/
	public static final String VALIDITYCONFIGS = "validityConfigs";
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.travelDestinations</code> attribute **/
	public static final String TRAVELDESTINATIONS = "travelDestinations";
	/** Qualifier of the <code>SupplierCommercialAdvanceDefinition.credentials</code> attribute **/
	public static final String CREDENTIALS = "credentials";
	/** Relation ordering override parameter constants for Credential2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String CREDENTIAL2ADVCENCEDEFINITION_SRC_ORDERED = "relation.Credential2AdvcenceDefinition.source.ordered";
	protected static String CREDENTIAL2ADVCENCEDEFINITION_TGT_ORDERED = "relation.Credential2AdvcenceDefinition.target.ordered";
	/** Relation disable markmodifed parameter constants for Credential2AdvcenceDefinition from ((suppliercommercialscore))*/
	protected static String CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED = "relation.Credential2AdvcenceDefinition.markmodified";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n COMMERCIALSRECORD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierCommercialAdvanceDefinition> COMMERCIALSRECORDHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierCommercialAdvanceDefinition>(
	SuppliercommercialscoreConstants.TC.SUPPLIERCOMMERCIALADVANCEDEFINITION,
	false,
	"commercialsRecord",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n VALIDITYCONFIGS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommercialsValidity> VALIDITYCONFIGSHANDLER = new OneToManyHandler<CommercialsValidity>(
	SuppliercommercialscoreConstants.TC.COMMERCIALSVALIDITYCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRAVELDESTINATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TravelDestinationConfig> TRAVELDESTINATIONSHANDLER = new OneToManyHandler<TravelDestinationConfig>(
	SuppliercommercialscoreConstants.TC.TRAVELDESTINATIONCONFIG,
	false,
	"advanceDefinition",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(BOOKINGTYPE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALSRECORD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.bookingType</code> attribute.
	 * @return the bookingType - Defines booking type
	 */
	public EnumerationValue getBookingType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, BOOKINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.bookingType</code> attribute.
	 * @return the bookingType - Defines booking type
	 */
	public EnumerationValue getBookingType()
	{
		return getBookingType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.bookingType</code> attribute. 
	 * @param value the bookingType - Defines booking type
	 */
	public void setBookingType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, BOOKINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.bookingType</code> attribute. 
	 * @param value the bookingType - Defines booking type
	 */
	public void setBookingType(final EnumerationValue value)
	{
		setBookingType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.commercialsRecord</code> attribute.
	 * @return the commercialsRecord
	 */
	public AbstractCommercialRecord getCommercialsRecord(final SessionContext ctx)
	{
		return (AbstractCommercialRecord)getProperty( ctx, COMMERCIALSRECORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.commercialsRecord</code> attribute.
	 * @return the commercialsRecord
	 */
	public AbstractCommercialRecord getCommercialsRecord()
	{
		return getCommercialsRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.commercialsRecord</code> attribute. 
	 * @param value the commercialsRecord
	 */
	public void setCommercialsRecord(final SessionContext ctx, final AbstractCommercialRecord value)
	{
		COMMERCIALSRECORDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.commercialsRecord</code> attribute. 
	 * @param value the commercialsRecord
	 */
	public void setCommercialsRecord(final AbstractCommercialRecord value)
	{
		setCommercialsRecord( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		COMMERCIALSRECORDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials(final SessionContext ctx)
	{
		final List<SupplierCredentials> items = getLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			"SupplierCredentials",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.credentials</code> attribute.
	 * @return the credentials
	 */
	public Collection<SupplierCredentials> getCredentials()
	{
		return getCredentials( getSession().getSessionContext() );
	}
	
	public long getCredentialsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			"SupplierCredentials",
			null
		);
	}
	
	public long getCredentialsCount()
	{
		return getCredentialsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final SessionContext ctx, final Collection<SupplierCredentials> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.credentials</code> attribute. 
	 * @param value the credentials
	 */
	public void setCredentials(final Collection<SupplierCredentials> value)
	{
		setCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SessionContext ctx, final SupplierCredentials value)
	{
		addLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to credentials. 
	 * @param value the item to add to credentials
	 */
	public void addToCredentials(final SupplierCredentials value)
	{
		addToCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SessionContext ctx, final SupplierCredentials value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SuppliercommercialscoreConstants.Relations.CREDENTIAL2ADVCENCEDEFINITION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CREDENTIAL2ADVCENCEDEFINITION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from credentials. 
	 * @param value the item to remove from credentials
	 */
	public void removeFromCredentials(final SupplierCredentials value)
	{
		removeFromCredentials( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.supplier</code> attribute.
	 * @return the supplier - Defines the supplier details . To Be Updated to Supplier Master
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.supplier</code> attribute.
	 * @return the supplier - Defines the supplier details . To Be Updated to Supplier Master
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.supplier</code> attribute. 
	 * @param value the supplier - Defines the supplier details . To Be Updated to Supplier Master
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.supplier</code> attribute. 
	 * @param value the supplier - Defines the supplier details . To Be Updated to Supplier Master
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.travelDestinations</code> attribute.
	 * @return the travelDestinations
	 */
	public Collection<TravelDestinationConfig> getTravelDestinations(final SessionContext ctx)
	{
		return TRAVELDESTINATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.travelDestinations</code> attribute.
	 * @return the travelDestinations
	 */
	public Collection<TravelDestinationConfig> getTravelDestinations()
	{
		return getTravelDestinations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.travelDestinations</code> attribute. 
	 * @param value the travelDestinations
	 */
	public void setTravelDestinations(final SessionContext ctx, final Collection<TravelDestinationConfig> value)
	{
		TRAVELDESTINATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.travelDestinations</code> attribute. 
	 * @param value the travelDestinations
	 */
	public void setTravelDestinations(final Collection<TravelDestinationConfig> value)
	{
		setTravelDestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDestinations. 
	 * @param value the item to add to travelDestinations
	 */
	public void addToTravelDestinations(final SessionContext ctx, final TravelDestinationConfig value)
	{
		TRAVELDESTINATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to travelDestinations. 
	 * @param value the item to add to travelDestinations
	 */
	public void addToTravelDestinations(final TravelDestinationConfig value)
	{
		addToTravelDestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDestinations. 
	 * @param value the item to remove from travelDestinations
	 */
	public void removeFromTravelDestinations(final SessionContext ctx, final TravelDestinationConfig value)
	{
		TRAVELDESTINATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from travelDestinations. 
	 * @param value the item to remove from travelDestinations
	 */
	public void removeFromTravelDestinations(final TravelDestinationConfig value)
	{
		removeFromTravelDestinations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.validityConfigs</code> attribute.
	 * @return the validityConfigs
	 */
	public Collection<CommercialsValidity> getValidityConfigs(final SessionContext ctx)
	{
		return VALIDITYCONFIGSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierCommercialAdvanceDefinition.validityConfigs</code> attribute.
	 * @return the validityConfigs
	 */
	public Collection<CommercialsValidity> getValidityConfigs()
	{
		return getValidityConfigs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.validityConfigs</code> attribute. 
	 * @param value the validityConfigs
	 */
	public void setValidityConfigs(final SessionContext ctx, final Collection<CommercialsValidity> value)
	{
		VALIDITYCONFIGSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierCommercialAdvanceDefinition.validityConfigs</code> attribute. 
	 * @param value the validityConfigs
	 */
	public void setValidityConfigs(final Collection<CommercialsValidity> value)
	{
		setValidityConfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to validityConfigs. 
	 * @param value the item to add to validityConfigs
	 */
	public void addToValidityConfigs(final SessionContext ctx, final CommercialsValidity value)
	{
		VALIDITYCONFIGSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to validityConfigs. 
	 * @param value the item to add to validityConfigs
	 */
	public void addToValidityConfigs(final CommercialsValidity value)
	{
		addToValidityConfigs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from validityConfigs. 
	 * @param value the item to remove from validityConfigs
	 */
	public void removeFromValidityConfigs(final SessionContext ctx, final CommercialsValidity value)
	{
		VALIDITYCONFIGSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from validityConfigs. 
	 * @param value the item to remove from validityConfigs
	 */
	public void removeFromValidityConfigs(final CommercialsValidity value)
	{
		removeFromValidityConfigs( getSession().getSessionContext(), value );
	}
	
}
