/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.jalo;

import com.cnk.travelogix.datamodel.supplier.rates.cabinoffer.jalo.CabinOffer;
import com.cnk.travelogix.datamodel.supplier.rates.cruiserateadvdefinition.jalo.CruiseRateAdvDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.cruiseratedefinition.jalo.CruiseRateDefinition;
import com.cnk.travelogix.datamodel.supplier.rates.cruiseratedetail.jalo.CruiseRateDetail;
import com.cnk.travelogix.datamodel.supplier.rates.cruisesupplierrate.jalo.CruiseSupplierRate;
import com.cnk.travelogix.datamodel.supplier.rates.cruisesurchargesuppdetail.jalo.CruiseSurchargeSuppDetail;
import com.cnk.travelogix.datamodel.supplier.rates.occupancydetail.jalo.OccupancyDetail;
import com.cnk.travelogix.datamodel.supplier.rates.supplieroffervalidity.jalo.SupplierOfferValidity;
import com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer;
import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy;
import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscruiseConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>SupplierratedefinitionscruiseManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierratedefinitionscruiseManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruiseratedetail", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.datamodel.supplier.rates.travelogixsupplieroffer.jalo.AbstractTravelogixSupplierOffer", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cruiseratedefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.masterdata.core.jalo.TravelogixPolicy", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public CabinOffer createCabinOffer(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CABINOFFER );
			return (CabinOffer)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CabinOffer : "+e.getMessage(), 0 );
		}
	}
	
	public CabinOffer createCabinOffer(final Map attributeValues)
	{
		return createCabinOffer( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseRateAdvDefinition createCruiseRateAdvDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CRUISERATEADVDEFINITION );
			return (CruiseRateAdvDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseRateAdvDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseRateAdvDefinition createCruiseRateAdvDefinition(final Map attributeValues)
	{
		return createCruiseRateAdvDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseRateDefinition createCruiseRateDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CRUISERATEDEFINITION );
			return (CruiseRateDefinition)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseRateDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseRateDefinition createCruiseRateDefinition(final Map attributeValues)
	{
		return createCruiseRateDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseRateDetail createCruiseRateDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CRUISERATEDETAIL );
			return (CruiseRateDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseRateDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseRateDetail createCruiseRateDetail(final Map attributeValues)
	{
		return createCruiseRateDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseSupplierRate createCruiseSupplierRate(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CRUISESUPPLIERRATE );
			return (CruiseSupplierRate)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseSupplierRate : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseSupplierRate createCruiseSupplierRate(final Map attributeValues)
	{
		return createCruiseSupplierRate( getSession().getSessionContext(), attributeValues );
	}
	
	public CruiseSurchargeSuppDetail createCruiseSurchargeSuppDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.CRUISESURCHARGESUPPDETAIL );
			return (CruiseSurchargeSuppDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CruiseSurchargeSuppDetail : "+e.getMessage(), 0 );
		}
	}
	
	public CruiseSurchargeSuppDetail createCruiseSurchargeSuppDetail(final Map attributeValues)
	{
		return createCruiseSurchargeSuppDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public OccupancyDetail createOccupancyDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.OCCUPANCYDETAIL );
			return (OccupancyDetail)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating OccupancyDetail : "+e.getMessage(), 0 );
		}
	}
	
	public OccupancyDetail createOccupancyDetail(final Map attributeValues)
	{
		return createOccupancyDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public SupplierOfferValidity createSupplierOfferValidity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( SupplierratedefinitionscruiseConstants.TC.SUPPLIEROFFERVALIDITY );
			return (SupplierOfferValidity)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SupplierOfferValidity : "+e.getMessage(), 0 );
		}
	}
	
	public SupplierOfferValidity createSupplierOfferValidity(final Map attributeValues)
	{
		return createSupplierOfferValidity( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.cruiseratedefinition</code> attribute.
	 * @return the cruiseratedefinition
	 */
	public CruiseRateDefinition getCruiseratedefinition(final SessionContext ctx, final TravelogixPolicy item)
	{
		return (CruiseRateDefinition)item.getProperty( ctx, SupplierratedefinitionscruiseConstants.Attributes.TravelogixPolicy.CRUISERATEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixPolicy.cruiseratedefinition</code> attribute.
	 * @return the cruiseratedefinition
	 */
	public CruiseRateDefinition getCruiseratedefinition(final TravelogixPolicy item)
	{
		return getCruiseratedefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.cruiseratedefinition</code> attribute. 
	 * @param value the cruiseratedefinition
	 */
	public void setCruiseratedefinition(final SessionContext ctx, final TravelogixPolicy item, final CruiseRateDefinition value)
	{
		item.setProperty(ctx, SupplierratedefinitionscruiseConstants.Attributes.TravelogixPolicy.CRUISERATEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixPolicy.cruiseratedefinition</code> attribute. 
	 * @param value the cruiseratedefinition
	 */
	public void setCruiseratedefinition(final TravelogixPolicy item, final CruiseRateDefinition value)
	{
		setCruiseratedefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.cruiseratedetail</code> attribute.
	 * @return the cruiseratedetail
	 */
	public CruiseRateDetail getCruiseratedetail(final SessionContext ctx, final AbstractTravelogixSupplierOffer item)
	{
		return (CruiseRateDetail)item.getProperty( ctx, SupplierratedefinitionscruiseConstants.Attributes.AbstractTravelogixSupplierOffer.CRUISERATEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTravelogixSupplierOffer.cruiseratedetail</code> attribute.
	 * @return the cruiseratedetail
	 */
	public CruiseRateDetail getCruiseratedetail(final AbstractTravelogixSupplierOffer item)
	{
		return getCruiseratedetail( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.cruiseratedetail</code> attribute. 
	 * @param value the cruiseratedetail
	 */
	public void setCruiseratedetail(final SessionContext ctx, final AbstractTravelogixSupplierOffer item, final CruiseRateDetail value)
	{
		item.setProperty(ctx, SupplierratedefinitionscruiseConstants.Attributes.AbstractTravelogixSupplierOffer.CRUISERATEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTravelogixSupplierOffer.cruiseratedetail</code> attribute. 
	 * @param value the cruiseratedetail
	 */
	public void setCruiseratedetail(final AbstractTravelogixSupplierOffer item, final CruiseRateDetail value)
	{
		setCruiseratedetail( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return SupplierratedefinitionscruiseConstants.EXTENSIONNAME;
	}
	
}
