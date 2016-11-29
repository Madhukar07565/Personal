/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.TopupDetail;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialRateTypeDetail;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierIncentiveOnTopupCommercial;
import de.hybris.platform.cronjob.jalo.Trigger;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.processing.constants.ProcessingConstants;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.incentiveontopup.jalo.SupplierIncentiveOnTopupRecord SupplierIncentiveOnTopupRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierIncentiveOnTopupRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute **/
	public static final String MULTIPLETOPUPS = "multipleTopups";
	/** Qualifier of the <code>SupplierIncentiveOnTopupRecord.topupDetails</code> attribute **/
	public static final String TOPUPDETAILS = "topupDetails";
	/** Qualifier of the <code>SupplierIncentiveOnTopupRecord.triggers</code> attribute **/
	public static final String TRIGGERS = "triggers";
	/** Qualifier of the <code>SupplierIncentiveOnTopupRecord.rateTypes</code> attribute **/
	public static final String RATETYPES = "rateTypes";
	/** Qualifier of the <code>SupplierIncentiveOnTopupRecord.incentivetopupCommercial</code> attribute **/
	public static final String INCENTIVETOPUPCOMMERCIAL = "incentivetopupCommercial";
	/**
	* {@link OneToManyHandler} for handling 1:n TOPUPDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TopupDetail> TOPUPDETAILSHANDLER = new OneToManyHandler<TopupDetail>(
	SuppliercommercialscoreConstants.TC.TOPUPDETAIL,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TRIGGERS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Trigger> TRIGGERSHANDLER = new OneToManyHandler<Trigger>(
	ProcessingConstants.TC.TRIGGER,
	true,
	"commercial",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n RATETYPES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CommercialRateTypeDetail> RATETYPESHANDLER = new OneToManyHandler<CommercialRateTypeDetail>(
	SuppliercommercialscoreConstants.TC.COMMERCIALRATETYPEDETAIL,
	true,
	"commercialrcd",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n INCENTIVETOPUPCOMMERCIAL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedSupplierIncentiveOnTopupRecord> INCENTIVETOPUPCOMMERCIALHANDLER = new BidirectionalOneToManyHandler<GeneratedSupplierIncentiveOnTopupRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERINCENTIVEONTOPUPRECORD,
	false,
	"incentivetopupCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(MULTIPLETOPUPS, AttributeMode.INITIAL);
		tmp.put(INCENTIVETOPUPCOMMERCIAL, AttributeMode.INITIAL);
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
		INCENTIVETOPUPCOMMERCIALHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.incentivetopupCommercial</code> attribute.
	 * @return the incentivetopupCommercial
	 */
	public SupplierIncentiveOnTopupCommercial getIncentivetopupCommercial(final SessionContext ctx)
	{
		return (SupplierIncentiveOnTopupCommercial)getProperty( ctx, INCENTIVETOPUPCOMMERCIAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.incentivetopupCommercial</code> attribute.
	 * @return the incentivetopupCommercial
	 */
	public SupplierIncentiveOnTopupCommercial getIncentivetopupCommercial()
	{
		return getIncentivetopupCommercial( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.incentivetopupCommercial</code> attribute. 
	 * @param value the incentivetopupCommercial
	 */
	public void setIncentivetopupCommercial(final SessionContext ctx, final SupplierIncentiveOnTopupCommercial value)
	{
		INCENTIVETOPUPCOMMERCIALHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.incentivetopupCommercial</code> attribute. 
	 * @param value the incentivetopupCommercial
	 */
	public void setIncentivetopupCommercial(final SupplierIncentiveOnTopupCommercial value)
	{
		setIncentivetopupCommercial( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute.
	 * @return the multipleTopups
	 */
	public Boolean isMultipleTopups(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MULTIPLETOPUPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute.
	 * @return the multipleTopups
	 */
	public Boolean isMultipleTopups()
	{
		return isMultipleTopups( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @return the multipleTopups
	 */
	public boolean isMultipleTopupsAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMultipleTopups( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @return the multipleTopups
	 */
	public boolean isMultipleTopupsAsPrimitive()
	{
		return isMultipleTopupsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @param value the multipleTopups
	 */
	public void setMultipleTopups(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MULTIPLETOPUPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @param value the multipleTopups
	 */
	public void setMultipleTopups(final Boolean value)
	{
		setMultipleTopups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @param value the multipleTopups
	 */
	public void setMultipleTopups(final SessionContext ctx, final boolean value)
	{
		setMultipleTopups( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.multipleTopups</code> attribute. 
	 * @param value the multipleTopups
	 */
	public void setMultipleTopups(final boolean value)
	{
		setMultipleTopups( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.rateTypes</code> attribute.
	 * @return the rateTypes
	 */
	public Set<CommercialRateTypeDetail> getRateTypes(final SessionContext ctx)
	{
		return (Set<CommercialRateTypeDetail>)RATETYPESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.rateTypes</code> attribute.
	 * @return the rateTypes
	 */
	public Set<CommercialRateTypeDetail> getRateTypes()
	{
		return getRateTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.rateTypes</code> attribute. 
	 * @param value the rateTypes
	 */
	public void setRateTypes(final SessionContext ctx, final Set<CommercialRateTypeDetail> value)
	{
		RATETYPESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.rateTypes</code> attribute. 
	 * @param value the rateTypes
	 */
	public void setRateTypes(final Set<CommercialRateTypeDetail> value)
	{
		setRateTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateTypes. 
	 * @param value the item to add to rateTypes
	 */
	public void addToRateTypes(final SessionContext ctx, final CommercialRateTypeDetail value)
	{
		RATETYPESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to rateTypes. 
	 * @param value the item to add to rateTypes
	 */
	public void addToRateTypes(final CommercialRateTypeDetail value)
	{
		addToRateTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateTypes. 
	 * @param value the item to remove from rateTypes
	 */
	public void removeFromRateTypes(final SessionContext ctx, final CommercialRateTypeDetail value)
	{
		RATETYPESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from rateTypes. 
	 * @param value the item to remove from rateTypes
	 */
	public void removeFromRateTypes(final CommercialRateTypeDetail value)
	{
		removeFromRateTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.topupDetails</code> attribute.
	 * @return the topupDetails
	 */
	public Collection<TopupDetail> getTopupDetails(final SessionContext ctx)
	{
		return TOPUPDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.topupDetails</code> attribute.
	 * @return the topupDetails
	 */
	public Collection<TopupDetail> getTopupDetails()
	{
		return getTopupDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.topupDetails</code> attribute. 
	 * @param value the topupDetails
	 */
	public void setTopupDetails(final SessionContext ctx, final Collection<TopupDetail> value)
	{
		TOPUPDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.topupDetails</code> attribute. 
	 * @param value the topupDetails
	 */
	public void setTopupDetails(final Collection<TopupDetail> value)
	{
		setTopupDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to topupDetails. 
	 * @param value the item to add to topupDetails
	 */
	public void addToTopupDetails(final SessionContext ctx, final TopupDetail value)
	{
		TOPUPDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to topupDetails. 
	 * @param value the item to add to topupDetails
	 */
	public void addToTopupDetails(final TopupDetail value)
	{
		addToTopupDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from topupDetails. 
	 * @param value the item to remove from topupDetails
	 */
	public void removeFromTopupDetails(final SessionContext ctx, final TopupDetail value)
	{
		TOPUPDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from topupDetails. 
	 * @param value the item to remove from topupDetails
	 */
	public void removeFromTopupDetails(final TopupDetail value)
	{
		removeFromTopupDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.triggers</code> attribute.
	 * @return the triggers
	 */
	public Collection<Trigger> getTriggers(final SessionContext ctx)
	{
		return TRIGGERSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierIncentiveOnTopupRecord.triggers</code> attribute.
	 * @return the triggers
	 */
	public Collection<Trigger> getTriggers()
	{
		return getTriggers( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.triggers</code> attribute. 
	 * @param value the triggers
	 */
	public void setTriggers(final SessionContext ctx, final Collection<Trigger> value)
	{
		TRIGGERSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierIncentiveOnTopupRecord.triggers</code> attribute. 
	 * @param value the triggers
	 */
	public void setTriggers(final Collection<Trigger> value)
	{
		setTriggers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to triggers. 
	 * @param value the item to add to triggers
	 */
	public void addToTriggers(final SessionContext ctx, final Trigger value)
	{
		TRIGGERSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to triggers. 
	 * @param value the item to add to triggers
	 */
	public void addToTriggers(final Trigger value)
	{
		addToTriggers( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from triggers. 
	 * @param value the item to remove from triggers
	 */
	public void removeFromTriggers(final SessionContext ctx, final Trigger value)
	{
		TRIGGERSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from triggers. 
	 * @param value the item to remove from triggers
	 */
	public void removeFromTriggers(final Trigger value)
	{
		removeFromTriggers( getSession().getSessionContext(), value );
	}
	
}
