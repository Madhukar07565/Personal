/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction;
import com.cnk.travelogix.masterdata.core.category.jalo.ProductCategorySubType;
import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateCode;
import com.cnk.travelogix.masterdata.core.proucts.jalo.RateType;
import com.cnk.travelogix.supplier.core.supplier.jalo.Supplier;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AbstractAncillaryRateDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.C2LManager;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Language;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.user.Employee;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer AbstractTravelogixSupplierOffer}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractTravelogixSupplierOffer extends GenericItem
{
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.offerType</code> attribute **/
	public static final String OFFERTYPE = "offerType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.offerSubType</code> attribute **/
	public static final String OFFERSUBTYPE = "offerSubType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.discountType</code> attribute **/
	public static final String DISCOUNTTYPE = "discountType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.approvalStatus</code> attribute **/
	public static final String APPROVALSTATUS = "approvalStatus";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.reason</code> attribute **/
	public static final String REASON = "reason";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.remarks</code> attribute **/
	public static final String REMARKS = "remarks";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.lockedBy</code> attribute **/
	public static final String LOCKEDBY = "lockedBy";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute **/
	public static final String ADVANCEBOOKINGFROMDAYS = "advanceBookingFromDays";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute **/
	public static final String ADVANCEBOOKINGTODAYS = "advanceBookingToDays";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.thresholdType</code> attribute **/
	public static final String THRESHOLDTYPE = "thresholdType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute **/
	public static final String DISCOUNTVALUE = "discountValue";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.supplier</code> attribute **/
	public static final String SUPPLIER = "supplier";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.supplierRateType</code> attribute **/
	public static final String SUPPLIERRATETYPE = "supplierRateType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.supplierRateCode</code> attribute **/
	public static final String SUPPLIERRATECODE = "supplierRateCode";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.rateApplicabilityType</code> attribute **/
	public static final String RATEAPPLICABILITYTYPE = "rateApplicabilityType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.workFlowStatus</code> attribute **/
	public static final String WORKFLOWSTATUS = "workFlowStatus";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.nationality</code> attribute **/
	public static final String NATIONALITY = "nationality";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.offerInclusion</code> attribute **/
	public static final String OFFERINCLUSION = "offerInclusion";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.offerExclusion</code> attribute **/
	public static final String OFFEREXCLUSION = "offerExclusion";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.internalDescription</code> attribute **/
	public static final String INTERNALDESCRIPTION = "internalDescription";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.externalDescription</code> attribute **/
	public static final String EXTERNALDESCRIPTION = "externalDescription";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.copiedFrom</code> attribute **/
	public static final String COPIEDFROM = "copiedFrom";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.productCategorySubType</code> attribute **/
	public static final String PRODUCTCATEGORYSUBTYPE = "productCategorySubType";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute **/
	public static final String OFFERNAME = "offerName";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.abstractAncillaryRateDetail</code> attribute **/
	public static final String ABSTRACTANCILLARYRATEDETAIL = "abstractAncillaryRateDetail";
	/** Relation ordering override parameter constants for AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_SRC_ORDERED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.source.ordered";
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_TGT_ORDERED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED = "relation.AbstractAncillaryRateDetail2AbsTravelogixSupplierOfferRelation.markmodified";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.priceComponent</code> attribute **/
	public static final String PRICECOMPONENT = "priceComponent";
	/** Relation ordering override parameter constants for AbstractTravelogixSupplier2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_SRC_ORDERED = "relation.AbstractTravelogixSupplier2FareComponentRelation.source.ordered";
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_TGT_ORDERED = "relation.AbstractTravelogixSupplier2FareComponentRelation.target.ordered";
	/** Relation disable markmodifed parameter constants for AbstractTravelogixSupplier2FareComponentRelation from ((supplierratedefinitionscore))*/
	protected static String ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED = "relation.AbstractTravelogixSupplier2FareComponentRelation.markmodified";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.blockOutDuration</code> attribute **/
	public static final String BLOCKOUTDURATION = "blockOutDuration";
	/** Qualifier of the <code>AbstractTravelogixSupplierOffer.salesDuration</code> attribute **/
	public static final String SALESDURATION = "salesDuration";
	/**
	* {@link OneToManyHandler} for handling 1:n BLOCKOUTDURATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DateRangeRestriction> BLOCKOUTDURATIONHANDLER = new OneToManyHandler<DateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	true,
	"abstractTravelogixSupplierOffer",
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
	"abstractTravelogixSupplierOffer",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(OFFERTYPE, AttributeMode.INITIAL);
		tmp.put(OFFERSUBTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTTYPE, AttributeMode.INITIAL);
		tmp.put(APPROVALSTATUS, AttributeMode.INITIAL);
		tmp.put(REASON, AttributeMode.INITIAL);
		tmp.put(REMARKS, AttributeMode.INITIAL);
		tmp.put(LOCKEDBY, AttributeMode.INITIAL);
		tmp.put(ADVANCEBOOKINGFROMDAYS, AttributeMode.INITIAL);
		tmp.put(ADVANCEBOOKINGTODAYS, AttributeMode.INITIAL);
		tmp.put(THRESHOLDTYPE, AttributeMode.INITIAL);
		tmp.put(DISCOUNTVALUE, AttributeMode.INITIAL);
		tmp.put(SUPPLIER, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATETYPE, AttributeMode.INITIAL);
		tmp.put(SUPPLIERRATECODE, AttributeMode.INITIAL);
		tmp.put(RATEAPPLICABILITYTYPE, AttributeMode.INITIAL);
		tmp.put(WORKFLOWSTATUS, AttributeMode.INITIAL);
		tmp.put(NATIONALITY, AttributeMode.INITIAL);
		tmp.put(OFFERINCLUSION, AttributeMode.INITIAL);
		tmp.put(OFFEREXCLUSION, AttributeMode.INITIAL);
		tmp.put(INTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(EXTERNALDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(COPIEDFROM, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORYSUBTYPE, AttributeMode.INITIAL);
		tmp.put(OFFERNAME, AttributeMode.INITIAL);
		tmp.put(CODE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.abstractAncillaryRateDetail</code> attribute.
	 * @return the abstractAncillaryRateDetail
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetail(final SessionContext ctx)
	{
		final List<AbstractAncillaryRateDetail> items = getLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			"AbstractAncillaryRateDetail",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.abstractAncillaryRateDetail</code> attribute.
	 * @return the abstractAncillaryRateDetail
	 */
	public Collection<AbstractAncillaryRateDetail> getAbstractAncillaryRateDetail()
	{
		return getAbstractAncillaryRateDetail( getSession().getSessionContext() );
	}
	
	public long getAbstractAncillaryRateDetailCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			"AbstractAncillaryRateDetail",
			null
		);
	}
	
	public long getAbstractAncillaryRateDetailCount()
	{
		return getAbstractAncillaryRateDetailCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.abstractAncillaryRateDetail</code> attribute. 
	 * @param value the abstractAncillaryRateDetail
	 */
	public void setAbstractAncillaryRateDetail(final SessionContext ctx, final Collection<AbstractAncillaryRateDetail> value)
	{
		setLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.abstractAncillaryRateDetail</code> attribute. 
	 * @param value the abstractAncillaryRateDetail
	 */
	public void setAbstractAncillaryRateDetail(final Collection<AbstractAncillaryRateDetail> value)
	{
		setAbstractAncillaryRateDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetail. 
	 * @param value the item to add to abstractAncillaryRateDetail
	 */
	public void addToAbstractAncillaryRateDetail(final SessionContext ctx, final AbstractAncillaryRateDetail value)
	{
		addLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to abstractAncillaryRateDetail. 
	 * @param value the item to add to abstractAncillaryRateDetail
	 */
	public void addToAbstractAncillaryRateDetail(final AbstractAncillaryRateDetail value)
	{
		addToAbstractAncillaryRateDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetail. 
	 * @param value the item to remove from abstractAncillaryRateDetail
	 */
	public void removeFromAbstractAncillaryRateDetail(final SessionContext ctx, final AbstractAncillaryRateDetail value)
	{
		removeLinkedItems( 
			ctx,
			false,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTANCILLARYRATEDETAIL2ABSTRAVELOGIXSUPPLIEROFFERRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from abstractAncillaryRateDetail. 
	 * @param value the item to remove from abstractAncillaryRateDetail
	 */
	public void removeFromAbstractAncillaryRateDetail(final AbstractAncillaryRateDetail value)
	{
		removeFromAbstractAncillaryRateDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute.
	 * @return the advanceBookingFromDays
	 */
	public Integer getAdvanceBookingFromDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ADVANCEBOOKINGFROMDAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute.
	 * @return the advanceBookingFromDays
	 */
	public Integer getAdvanceBookingFromDays()
	{
		return getAdvanceBookingFromDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @return the advanceBookingFromDays
	 */
	public int getAdvanceBookingFromDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAdvanceBookingFromDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @return the advanceBookingFromDays
	 */
	public int getAdvanceBookingFromDaysAsPrimitive()
	{
		return getAdvanceBookingFromDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @param value the advanceBookingFromDays
	 */
	public void setAdvanceBookingFromDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ADVANCEBOOKINGFROMDAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @param value the advanceBookingFromDays
	 */
	public void setAdvanceBookingFromDays(final Integer value)
	{
		setAdvanceBookingFromDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @param value the advanceBookingFromDays
	 */
	public void setAdvanceBookingFromDays(final SessionContext ctx, final int value)
	{
		setAdvanceBookingFromDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingFromDays</code> attribute. 
	 * @param value the advanceBookingFromDays
	 */
	public void setAdvanceBookingFromDays(final int value)
	{
		setAdvanceBookingFromDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute.
	 * @return the advanceBookingToDays
	 */
	public Integer getAdvanceBookingToDays(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, ADVANCEBOOKINGTODAYS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute.
	 * @return the advanceBookingToDays
	 */
	public Integer getAdvanceBookingToDays()
	{
		return getAdvanceBookingToDays( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @return the advanceBookingToDays
	 */
	public int getAdvanceBookingToDaysAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAdvanceBookingToDays( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @return the advanceBookingToDays
	 */
	public int getAdvanceBookingToDaysAsPrimitive()
	{
		return getAdvanceBookingToDaysAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @param value the advanceBookingToDays
	 */
	public void setAdvanceBookingToDays(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, ADVANCEBOOKINGTODAYS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @param value the advanceBookingToDays
	 */
	public void setAdvanceBookingToDays(final Integer value)
	{
		setAdvanceBookingToDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @param value the advanceBookingToDays
	 */
	public void setAdvanceBookingToDays(final SessionContext ctx, final int value)
	{
		setAdvanceBookingToDays( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.advanceBookingToDays</code> attribute. 
	 * @param value the advanceBookingToDays
	 */
	public void setAdvanceBookingToDays(final int value)
	{
		setAdvanceBookingToDays( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, APPROVALSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.approvalStatus</code> attribute.
	 * @return the approvalStatus
	 */
	public EnumerationValue getApprovalStatus()
	{
		return getApprovalStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, APPROVALSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.approvalStatus</code> attribute. 
	 * @param value the approvalStatus
	 */
	public void setApprovalStatus(final EnumerationValue value)
	{
		setApprovalStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.blockOutDuration</code> attribute.
	 * @return the blockOutDuration
	 */
	public Set<DateRangeRestriction> getBlockOutDuration(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)BLOCKOUTDURATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.blockOutDuration</code> attribute.
	 * @return the blockOutDuration
	 */
	public Set<DateRangeRestriction> getBlockOutDuration()
	{
		return getBlockOutDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.blockOutDuration</code> attribute. 
	 * @param value the blockOutDuration
	 */
	public void setBlockOutDuration(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		BLOCKOUTDURATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.blockOutDuration</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.code</code> attribute.
	 * @return the code - Identifier for this offer
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.code</code> attribute.
	 * @return the code - Identifier for this offer
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.code</code> attribute. 
	 * @param value the code - Identifier for this offer
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.code</code> attribute. 
	 * @param value the code - Identifier for this offer
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom(final SessionContext ctx)
	{
		return (String)getProperty( ctx, COPIEDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.copiedFrom</code> attribute.
	 * @return the copiedFrom - Copied From
	 */
	public String getCopiedFrom()
	{
		return getCopiedFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final SessionContext ctx, final String value)
	{
		setProperty(ctx, COPIEDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.copiedFrom</code> attribute. 
	 * @param value the copiedFrom - Copied From
	 */
	public void setCopiedFrom(final String value)
	{
		setCopiedFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountType</code> attribute.
	 * @return the discountType
	 */
	public EnumerationValue getDiscountType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, DISCOUNTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountType</code> attribute.
	 * @return the discountType
	 */
	public EnumerationValue getDiscountType()
	{
		return getDiscountType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountType</code> attribute. 
	 * @param value the discountType
	 */
	public void setDiscountType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, DISCOUNTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountType</code> attribute. 
	 * @param value the discountType
	 */
	public void setDiscountType(final EnumerationValue value)
	{
		setDiscountType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute.
	 * @return the discountValue
	 */
	public Double getDiscountValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, DISCOUNTVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute.
	 * @return the discountValue
	 */
	public Double getDiscountValue()
	{
		return getDiscountValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @return the discountValue
	 */
	public double getDiscountValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getDiscountValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @return the discountValue
	 */
	public double getDiscountValueAsPrimitive()
	{
		return getDiscountValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, DISCOUNTVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final Double value)
	{
		setDiscountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final SessionContext ctx, final double value)
	{
		setDiscountValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.discountValue</code> attribute. 
	 * @param value the discountValue
	 */
	public void setDiscountValue(final double value)
	{
		setDiscountValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.externalDescription</code> attribute.
	 * @return the externalDescription
	 */
	public String getExternalDescription()
	{
		return getExternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.externalDescription</code> attribute. 
	 * @param value the externalDescription
	 */
	public void setExternalDescription(final String value)
	{
		setExternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERNALDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.internalDescription</code> attribute.
	 * @return the internalDescription
	 */
	public String getInternalDescription()
	{
		return getInternalDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERNALDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.internalDescription</code> attribute. 
	 * @param value the internalDescription
	 */
	public void setInternalDescription(final String value)
	{
		setInternalDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, LOCKEDBY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.lockedBy</code> attribute.
	 * @return the lockedBy
	 */
	public Employee getLockedBy()
	{
		return getLockedBy( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, LOCKEDBY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.lockedBy</code> attribute. 
	 * @param value the lockedBy
	 */
	public void setLockedBy(final Employee value)
	{
		setLockedBy( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.nationality</code> attribute.
	 * @return the nationality
	 */
	public Collection<Country> getNationality(final SessionContext ctx)
	{
		Collection<Country> coll = (Collection<Country>)getProperty( ctx, NATIONALITY);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.nationality</code> attribute.
	 * @return the nationality
	 */
	public Collection<Country> getNationality()
	{
		return getNationality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final SessionContext ctx, final Collection<Country> value)
	{
		setProperty(ctx, NATIONALITY,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.nationality</code> attribute. 
	 * @param value the nationality
	 */
	public void setNationality(final Collection<Country> value)
	{
		setNationality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerExclusion</code> attribute.
	 * @return the offerExclusion
	 */
	public String getOfferExclusion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFEREXCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerExclusion</code> attribute.
	 * @return the offerExclusion
	 */
	public String getOfferExclusion()
	{
		return getOfferExclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerExclusion</code> attribute. 
	 * @param value the offerExclusion
	 */
	public void setOfferExclusion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFEREXCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerExclusion</code> attribute. 
	 * @param value the offerExclusion
	 */
	public void setOfferExclusion(final String value)
	{
		setOfferExclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerInclusion</code> attribute.
	 * @return the offerInclusion
	 */
	public String getOfferInclusion(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OFFERINCLUSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerInclusion</code> attribute.
	 * @return the offerInclusion
	 */
	public String getOfferInclusion()
	{
		return getOfferInclusion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerInclusion</code> attribute. 
	 * @param value the offerInclusion
	 */
	public void setOfferInclusion(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OFFERINCLUSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerInclusion</code> attribute. 
	 * @param value the offerInclusion
	 */
	public void setOfferInclusion(final String value)
	{
		setOfferInclusion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute.
	 * @return the offerName
	 */
	public String getOfferName(final SessionContext ctx)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractTravelogixSupplierOffer.getOfferName requires a session language", 0 );
		}
		return (String)getLocalizedProperty( ctx, OFFERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute.
	 * @return the offerName
	 */
	public String getOfferName()
	{
		return getOfferName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @return the localized offerName
	 */
	public Map<Language,String> getAllOfferName(final SessionContext ctx)
	{
		return (Map<Language,String>)getAllLocalizedProperties(ctx,OFFERNAME,C2LManager.getInstance().getAllLanguages());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @return the localized offerName
	 */
	public Map<Language,String> getAllOfferName()
	{
		return getAllOfferName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final SessionContext ctx, final String value)
	{
		if( ctx == null || ctx.getLanguage() == null )
		{
			throw new JaloInvalidParameterException("GeneratedAbstractTravelogixSupplierOffer.setOfferName requires a session language", 0 );
		}
		setLocalizedProperty(ctx, OFFERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setOfferName(final String value)
	{
		setOfferName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setAllOfferName(final SessionContext ctx, final Map<Language,String> value)
	{
		setAllLocalizedProperties(ctx,OFFERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerName</code> attribute. 
	 * @param value the offerName
	 */
	public void setAllOfferName(final Map<Language,String> value)
	{
		setAllOfferName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerSubType</code> attribute.
	 * @return the offerSubType
	 */
	public EnumerationValue getOfferSubType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerSubType</code> attribute.
	 * @return the offerSubType
	 */
	public EnumerationValue getOfferSubType()
	{
		return getOfferSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerSubType</code> attribute. 
	 * @param value the offerSubType
	 */
	public void setOfferSubType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerSubType</code> attribute. 
	 * @param value the offerSubType
	 */
	public void setOfferSubType(final EnumerationValue value)
	{
		setOfferSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerType</code> attribute.
	 * @return the offerType
	 */
	public EnumerationValue getOfferType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OFFERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.offerType</code> attribute.
	 * @return the offerType
	 */
	public EnumerationValue getOfferType()
	{
		return getOfferType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerType</code> attribute. 
	 * @param value the offerType
	 */
	public void setOfferType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OFFERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.offerType</code> attribute. 
	 * @param value the offerType
	 */
	public void setOfferType(final EnumerationValue value)
	{
		setOfferType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent(final SessionContext ctx)
	{
		final List<FareComponent> items = getLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			"FareComponent",
			null,
			false,
			false
		);
		return new LinkedHashSet<FareComponent>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.priceComponent</code> attribute.
	 * @return the priceComponent
	 */
	public Set<FareComponent> getPriceComponent()
	{
		return getPriceComponent( getSession().getSessionContext() );
	}
	
	public long getPriceComponentCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			"FareComponent",
			null
		);
	}
	
	public long getPriceComponentCount()
	{
		return getPriceComponentCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final SessionContext ctx, final Set<FareComponent> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.priceComponent</code> attribute. 
	 * @param value the priceComponent
	 */
	public void setPriceComponent(final Set<FareComponent> value)
	{
		setPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final SessionContext ctx, final FareComponent value)
	{
		addLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to priceComponent. 
	 * @param value the item to add to priceComponent
	 */
	public void addToPriceComponent(final FareComponent value)
	{
		addToPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final SessionContext ctx, final FareComponent value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SupplierratedefinitionscoreConstants.Relations.ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(ABSTRACTTRAVELOGIXSUPPLIER2FARECOMPONENTRELATION_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from priceComponent. 
	 * @param value the item to remove from priceComponent
	 */
	public void removeFromPriceComponent(final FareComponent value)
	{
		removeFromPriceComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType(final SessionContext ctx)
	{
		return (ProductCategorySubType)getProperty( ctx, PRODUCTCATEGORYSUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.productCategorySubType</code> attribute.
	 * @return the productCategorySubType
	 */
	public ProductCategorySubType getProductCategorySubType()
	{
		return getProductCategorySubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final SessionContext ctx, final ProductCategorySubType value)
	{
		setProperty(ctx, PRODUCTCATEGORYSUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.productCategorySubType</code> attribute. 
	 * @param value the productCategorySubType
	 */
	public void setProductCategorySubType(final ProductCategorySubType value)
	{
		setProductCategorySubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.rateApplicabilityType</code> attribute.
	 * @return the rateApplicabilityType
	 */
	public Set<EnumerationValue> getRateApplicabilityType(final SessionContext ctx)
	{
		Set<EnumerationValue> coll = (Set<EnumerationValue>)getProperty( ctx, RATEAPPLICABILITYTYPE);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.rateApplicabilityType</code> attribute.
	 * @return the rateApplicabilityType
	 */
	public Set<EnumerationValue> getRateApplicabilityType()
	{
		return getRateApplicabilityType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.rateApplicabilityType</code> attribute. 
	 * @param value the rateApplicabilityType
	 */
	public void setRateApplicabilityType(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		setProperty(ctx, RATEAPPLICABILITYTYPE,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.rateApplicabilityType</code> attribute. 
	 * @param value the rateApplicabilityType
	 */
	public void setRateApplicabilityType(final Set<EnumerationValue> value)
	{
		setRateApplicabilityType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REASON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.reason</code> attribute.
	 * @return the reason
	 */
	public String getReason()
	{
		return getReason( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REASON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.reason</code> attribute. 
	 * @param value the reason
	 */
	public void setReason(final String value)
	{
		setReason( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.remarks</code> attribute.
	 * @return the remarks
	 */
	public String getRemarks()
	{
		return getRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.remarks</code> attribute. 
	 * @param value the remarks
	 */
	public void setRemarks(final String value)
	{
		setRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.salesDuration</code> attribute.
	 * @return the salesDuration
	 */
	public Set<DateRangeRestriction> getSalesDuration(final SessionContext ctx)
	{
		return (Set<DateRangeRestriction>)SALESDURATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.salesDuration</code> attribute.
	 * @return the salesDuration
	 */
	public Set<DateRangeRestriction> getSalesDuration()
	{
		return getSalesDuration( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.salesDuration</code> attribute. 
	 * @param value the salesDuration
	 */
	public void setSalesDuration(final SessionContext ctx, final Set<DateRangeRestriction> value)
	{
		SALESDURATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.salesDuration</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier(final SessionContext ctx)
	{
		return (Supplier)getProperty( ctx, SUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplier</code> attribute.
	 * @return the supplier
	 */
	public Supplier getSupplier()
	{
		return getSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final SessionContext ctx, final Supplier value)
	{
		setProperty(ctx, SUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplier</code> attribute. 
	 * @param value the supplier
	 */
	public void setSupplier(final Supplier value)
	{
		setSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode(final SessionContext ctx)
	{
		return (RateCode)getProperty( ctx, SUPPLIERRATECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateCode</code> attribute.
	 * @return the supplierRateCode
	 */
	public RateCode getSupplierRateCode()
	{
		return getSupplierRateCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final SessionContext ctx, final RateCode value)
	{
		setProperty(ctx, SUPPLIERRATECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateCode</code> attribute. 
	 * @param value the supplierRateCode
	 */
	public void setSupplierRateCode(final RateCode value)
	{
		setSupplierRateCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType(final SessionContext ctx)
	{
		return (RateType)getProperty( ctx, SUPPLIERRATETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.supplierRateType</code> attribute.
	 * @return the supplierRateType
	 */
	public RateType getSupplierRateType()
	{
		return getSupplierRateType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final SessionContext ctx, final RateType value)
	{
		setProperty(ctx, SUPPLIERRATETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.supplierRateType</code> attribute. 
	 * @param value the supplierRateType
	 */
	public void setSupplierRateType(final RateType value)
	{
		setSupplierRateType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, THRESHOLDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.thresholdType</code> attribute.
	 * @return the thresholdType
	 */
	public EnumerationValue getThresholdType()
	{
		return getThresholdType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, THRESHOLDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.thresholdType</code> attribute. 
	 * @param value the thresholdType
	 */
	public void setThresholdType(final EnumerationValue value)
	{
		setThresholdType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, WORKFLOWSTATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.workFlowStatus</code> attribute.
	 * @return the workFlowStatus - Work Flow Status
	 */
	public EnumerationValue getWorkFlowStatus()
	{
		return getWorkFlowStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, WORKFLOWSTATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.workFlowStatus</code> attribute. 
	 * @param value the workFlowStatus - Work Flow Status
	 */
	public void setWorkFlowStatus(final EnumerationValue value)
	{
		setWorkFlowStatus( getSession().getSessionContext(), value );
	}
	
}
