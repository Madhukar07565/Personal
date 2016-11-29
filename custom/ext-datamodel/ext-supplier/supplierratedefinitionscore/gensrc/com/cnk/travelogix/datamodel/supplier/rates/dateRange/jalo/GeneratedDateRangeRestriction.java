/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.SeasonDetail;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractRateAdvDefinition;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.parent.AbstractSurchargeSuppDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.datamodel.supplier.rates.dateRange.jalo.DateRangeRestriction DateRangeRestriction}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDateRangeRestriction extends GenericItem
{
	/** Qualifier of the <code>DateRangeRestriction.standardDateRange</code> attribute **/
	public static final String STANDARDDATERANGE = "standardDateRange";
	/** Qualifier of the <code>DateRangeRestriction.rateAdvDefinitions</code> attribute **/
	public static final String RATEADVDEFINITIONS = "rateAdvDefinitions";
	/** Qualifier of the <code>DateRangeRestriction.absSurchargeSuppDetail</code> attribute **/
	public static final String ABSSURCHARGESUPPDETAIL = "absSurchargeSuppDetail";
	/** Qualifier of the <code>DateRangeRestriction.seasonDetail</code> attribute **/
	public static final String SEASONDETAIL = "seasonDetail";
	/** Qualifier of the <code>DateRangeRestriction.abstractTravelogixSupplierOffer</code> attribute **/
	public static final String ABSTRACTTRAVELOGIXSUPPLIEROFFER = "abstractTravelogixSupplierOffer";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n RATEADVDEFINITIONS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDateRangeRestriction> RATEADVDEFINITIONSHANDLER = new BidirectionalOneToManyHandler<GeneratedDateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	false,
	"rateAdvDefinitions",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSSURCHARGESUPPDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDateRangeRestriction> ABSSURCHARGESUPPDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedDateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	false,
	"absSurchargeSuppDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SEASONDETAIL's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDateRangeRestriction> SEASONDETAILHANDLER = new BidirectionalOneToManyHandler<GeneratedDateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	false,
	"seasonDetail",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ABSTRACTTRAVELOGIXSUPPLIEROFFER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedDateRangeRestriction> ABSTRACTTRAVELOGIXSUPPLIEROFFERHANDLER = new BidirectionalOneToManyHandler<GeneratedDateRangeRestriction>(
	SupplierratedefinitionscoreConstants.TC.DATERANGERESTRICTION,
	false,
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
		tmp.put(STANDARDDATERANGE, AttributeMode.INITIAL);
		tmp.put(RATEADVDEFINITIONS, AttributeMode.INITIAL);
		tmp.put(ABSSURCHARGESUPPDETAIL, AttributeMode.INITIAL);
		tmp.put(SEASONDETAIL, AttributeMode.INITIAL);
		tmp.put(ABSTRACTTRAVELOGIXSUPPLIEROFFER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.absSurchargeSuppDetail</code> attribute.
	 * @return the absSurchargeSuppDetail
	 */
	public AbstractSurchargeSuppDetail getAbsSurchargeSuppDetail(final SessionContext ctx)
	{
		return (AbstractSurchargeSuppDetail)getProperty( ctx, ABSSURCHARGESUPPDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.absSurchargeSuppDetail</code> attribute.
	 * @return the absSurchargeSuppDetail
	 */
	public AbstractSurchargeSuppDetail getAbsSurchargeSuppDetail()
	{
		return getAbsSurchargeSuppDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.absSurchargeSuppDetail</code> attribute. 
	 * @param value the absSurchargeSuppDetail
	 */
	public void setAbsSurchargeSuppDetail(final SessionContext ctx, final AbstractSurchargeSuppDetail value)
	{
		ABSSURCHARGESUPPDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.absSurchargeSuppDetail</code> attribute. 
	 * @param value the absSurchargeSuppDetail
	 */
	public void setAbsSurchargeSuppDetail(final AbstractSurchargeSuppDetail value)
	{
		setAbsSurchargeSuppDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.abstractTravelogixSupplierOffer</code> attribute.
	 * @return the abstractTravelogixSupplierOffer
	 */
	public AbstractTravelogixSupplierOffer getAbstractTravelogixSupplierOffer(final SessionContext ctx)
	{
		return (AbstractTravelogixSupplierOffer)getProperty( ctx, ABSTRACTTRAVELOGIXSUPPLIEROFFER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.abstractTravelogixSupplierOffer</code> attribute.
	 * @return the abstractTravelogixSupplierOffer
	 */
	public AbstractTravelogixSupplierOffer getAbstractTravelogixSupplierOffer()
	{
		return getAbstractTravelogixSupplierOffer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.abstractTravelogixSupplierOffer</code> attribute. 
	 * @param value the abstractTravelogixSupplierOffer
	 */
	public void setAbstractTravelogixSupplierOffer(final SessionContext ctx, final AbstractTravelogixSupplierOffer value)
	{
		ABSTRACTTRAVELOGIXSUPPLIEROFFERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.abstractTravelogixSupplierOffer</code> attribute. 
	 * @param value the abstractTravelogixSupplierOffer
	 */
	public void setAbstractTravelogixSupplierOffer(final AbstractTravelogixSupplierOffer value)
	{
		setAbstractTravelogixSupplierOffer( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		RATEADVDEFINITIONSHANDLER.newInstance(ctx, allAttributes);
		ABSSURCHARGESUPPDETAILHANDLER.newInstance(ctx, allAttributes);
		SEASONDETAILHANDLER.newInstance(ctx, allAttributes);
		ABSTRACTTRAVELOGIXSUPPLIEROFFERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions(final SessionContext ctx)
	{
		return (AbstractRateAdvDefinition)getProperty( ctx, RATEADVDEFINITIONS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.rateAdvDefinitions</code> attribute.
	 * @return the rateAdvDefinitions
	 */
	public AbstractRateAdvDefinition getRateAdvDefinitions()
	{
		return getRateAdvDefinitions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final SessionContext ctx, final AbstractRateAdvDefinition value)
	{
		RATEADVDEFINITIONSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.rateAdvDefinitions</code> attribute. 
	 * @param value the rateAdvDefinitions
	 */
	public void setRateAdvDefinitions(final AbstractRateAdvDefinition value)
	{
		setRateAdvDefinitions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.seasonDetail</code> attribute.
	 * @return the seasonDetail
	 */
	public SeasonDetail getSeasonDetail(final SessionContext ctx)
	{
		return (SeasonDetail)getProperty( ctx, SEASONDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.seasonDetail</code> attribute.
	 * @return the seasonDetail
	 */
	public SeasonDetail getSeasonDetail()
	{
		return getSeasonDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.seasonDetail</code> attribute. 
	 * @param value the seasonDetail
	 */
	public void setSeasonDetail(final SessionContext ctx, final SeasonDetail value)
	{
		SEASONDETAILHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.seasonDetail</code> attribute. 
	 * @param value the seasonDetail
	 */
	public void setSeasonDetail(final SeasonDetail value)
	{
		setSeasonDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.standardDateRange</code> attribute.
	 * @return the standardDateRange
	 */
	public StandardDateRange getStandardDateRange(final SessionContext ctx)
	{
		return (StandardDateRange)getProperty( ctx, STANDARDDATERANGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DateRangeRestriction.standardDateRange</code> attribute.
	 * @return the standardDateRange
	 */
	public StandardDateRange getStandardDateRange()
	{
		return getStandardDateRange( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.standardDateRange</code> attribute. 
	 * @param value the standardDateRange
	 */
	public void setStandardDateRange(final SessionContext ctx, final StandardDateRange value)
	{
		setProperty(ctx, STANDARDDATERANGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DateRangeRestriction.standardDateRange</code> attribute. 
	 * @param value the standardDateRange
	 */
	public void setStandardDateRange(final StandardDateRange value)
	{
		setStandardDateRange( getSession().getSessionContext(), value );
	}
	
}
