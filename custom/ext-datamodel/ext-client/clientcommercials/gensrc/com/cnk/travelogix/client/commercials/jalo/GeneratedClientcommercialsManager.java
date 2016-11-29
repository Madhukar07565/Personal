/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.commercials.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.client.commercials.core.jalo.BudgetMargin;
import com.cnk.travelogix.client.commercials.core.jalo.ClientCompanyCommercialDetail;
import com.cnk.travelogix.client.commercials.core.jalo.PenaltyKickBackFeeCompanyCommercial;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AbstractClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.commercials.core.jalo.definition.AccoClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.commercials.core.jalo.definition.ActivityClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.commercials.core.jalo.definition.HolidayClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.commercials.core.jalo.definition.TransportClientCompanyAdvanceDefinition;
import com.cnk.travelogix.client.core.jalo.FlightNumber;
import com.cnk.travelogix.company.commercials.core.jalo.Criteria;
import com.cnk.travelogix.company.commercials.core.jalo.Fees;
import com.cnk.travelogix.company.commercials.core.jalo.LookToBookRateCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.LookToBookRatioCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.MarkUpCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.OtherFeeCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.OveridingCompanyCommerical;
import com.cnk.travelogix.company.commercials.core.jalo.Penalty;
import com.cnk.travelogix.company.commercials.core.jalo.SignUpBonusCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.SlabCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.StandardCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.TerminationFeeCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.TopUpIncentiveCompanyCommercial;
import com.cnk.travelogix.company.commercials.core.jalo.definition.CompanyClientPCC;
import com.cnk.travelogix.company.commercials.core.jalo.definition.FareDetail;
import com.cnk.travelogix.company.commercials.core.jalo.definition.FlightClientCompanyAdvanceDefinition;
import com.cnk.travelogix.company.commercials.core.jalo.definition.TravelDestination;
import com.cnk.travelogix.company.commercials.core.jalo.definition.Validity;
import com.cnk.travelogix.product.common.core.jalo.Ancillary;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>ClientcommercialsManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedClientcommercialsManager extends Extension
{
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTCOMMERCIAL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BudgetMargin> PRINCIPALTOBUDGETMARGINCLIENTCOMMERCIALHANDLER = new OneToManyHandler<BudgetMargin>(
	ClientcommercialsConstants.TC.BUDGETMARGIN,
	false,
	"client",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("absclntCompanyAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.product.common.core.jalo.Ancillary", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("flightCompanyAdvanceDefinition", AttributeMode.INITIAL);
		ttmp.put("com.cnk.travelogix.client.core.jalo.FlightNumber", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("abstcompclntAdvDef", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
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
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.absclntCompanyAdvanceDefinition</code> attribute.
	 * @return the absclntCompanyAdvanceDefinition
	 */
	public AbstractClientCompanyAdvanceDefinition getAbsclntCompanyAdvanceDefinition(final SessionContext ctx, final Ancillary item)
	{
		return (AbstractClientCompanyAdvanceDefinition)item.getProperty( ctx, ClientcommercialsConstants.Attributes.Ancillary.ABSCLNTCOMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Ancillary.absclntCompanyAdvanceDefinition</code> attribute.
	 * @return the absclntCompanyAdvanceDefinition
	 */
	public AbstractClientCompanyAdvanceDefinition getAbsclntCompanyAdvanceDefinition(final Ancillary item)
	{
		return getAbsclntCompanyAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.absclntCompanyAdvanceDefinition</code> attribute. 
	 * @param value the absclntCompanyAdvanceDefinition
	 */
	public void setAbsclntCompanyAdvanceDefinition(final SessionContext ctx, final Ancillary item, final AbstractClientCompanyAdvanceDefinition value)
	{
		item.setProperty(ctx, ClientcommercialsConstants.Attributes.Ancillary.ABSCLNTCOMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Ancillary.absclntCompanyAdvanceDefinition</code> attribute. 
	 * @param value the absclntCompanyAdvanceDefinition
	 */
	public void setAbsclntCompanyAdvanceDefinition(final Ancillary item, final AbstractClientCompanyAdvanceDefinition value)
	{
		setAbsclntCompanyAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.abstcompclntAdvDef</code> attribute.
	 * @return the abstcompclntAdvDef
	 */
	public AbstractClientCompanyAdvanceDefinition getAbstcompclntAdvDef(final SessionContext ctx, final Product item)
	{
		return (AbstractClientCompanyAdvanceDefinition)item.getProperty( ctx, ClientcommercialsConstants.Attributes.Product.ABSTCOMPCLNTADVDEF);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.abstcompclntAdvDef</code> attribute.
	 * @return the abstcompclntAdvDef
	 */
	public AbstractClientCompanyAdvanceDefinition getAbstcompclntAdvDef(final Product item)
	{
		return getAbstcompclntAdvDef( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.abstcompclntAdvDef</code> attribute. 
	 * @param value the abstcompclntAdvDef
	 */
	public void setAbstcompclntAdvDef(final SessionContext ctx, final Product item, final AbstractClientCompanyAdvanceDefinition value)
	{
		item.setProperty(ctx, ClientcommercialsConstants.Attributes.Product.ABSTCOMPCLNTADVDEF,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.abstcompclntAdvDef</code> attribute. 
	 * @param value the abstcompclntAdvDef
	 */
	public void setAbstcompclntAdvDef(final Product item, final AbstractClientCompanyAdvanceDefinition value)
	{
		setAbstcompclntAdvDef( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.clientCommercial</code> attribute.
	 * @return the clientCommercial
	 */
	public Collection<BudgetMargin> getClientCommercial(final SessionContext ctx, final Principal item)
	{
		return PRINCIPALTOBUDGETMARGINCLIENTCOMMERCIALHANDLER.getValues( ctx, item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Principal.clientCommercial</code> attribute.
	 * @return the clientCommercial
	 */
	public Collection<BudgetMargin> getClientCommercial(final Principal item)
	{
		return getClientCommercial( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.clientCommercial</code> attribute. 
	 * @param value the clientCommercial
	 */
	public void setClientCommercial(final SessionContext ctx, final Principal item, final Collection<BudgetMargin> value)
	{
		PRINCIPALTOBUDGETMARGINCLIENTCOMMERCIALHANDLER.setValues( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Principal.clientCommercial</code> attribute. 
	 * @param value the clientCommercial
	 */
	public void setClientCommercial(final Principal item, final Collection<BudgetMargin> value)
	{
		setClientCommercial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCommercial. 
	 * @param value the item to add to clientCommercial
	 */
	public void addToClientCommercial(final SessionContext ctx, final Principal item, final BudgetMargin value)
	{
		PRINCIPALTOBUDGETMARGINCLIENTCOMMERCIALHANDLER.addValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientCommercial. 
	 * @param value the item to add to clientCommercial
	 */
	public void addToClientCommercial(final Principal item, final BudgetMargin value)
	{
		addToClientCommercial( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCommercial. 
	 * @param value the item to remove from clientCommercial
	 */
	public void removeFromClientCommercial(final SessionContext ctx, final Principal item, final BudgetMargin value)
	{
		PRINCIPALTOBUDGETMARGINCLIENTCOMMERCIALHANDLER.removeValue( ctx, item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientCommercial. 
	 * @param value the item to remove from clientCommercial
	 */
	public void removeFromClientCommercial(final Principal item, final BudgetMargin value)
	{
		removeFromClientCommercial( getSession().getSessionContext(), item, value );
	}
	
	public AccoClientCompanyAdvanceDefinition createAccoClientCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.ACCOCLIENTCOMPANYADVANCEDEFINITION );
			return (AccoClientCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating AccoClientCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public AccoClientCompanyAdvanceDefinition createAccoClientCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createAccoClientCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public ActivityClientCompanyAdvanceDefinition createActivityClientCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.ACTIVITYCLIENTCOMPANYADVANCEDEFINITION );
			return (ActivityClientCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ActivityClientCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public ActivityClientCompanyAdvanceDefinition createActivityClientCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createActivityClientCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public BudgetMargin createBudgetMargin(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.BUDGETMARGIN );
			return (BudgetMargin)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating BudgetMargin : "+e.getMessage(), 0 );
		}
	}
	
	public BudgetMargin createBudgetMargin(final Map attributeValues)
	{
		return createBudgetMargin( getSession().getSessionContext(), attributeValues );
	}
	
	public ClientCompanyCommercialDetail createClientCompanyCommercialDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.CLIENTCOMPANYCOMMERCIALDETAIL );
			return (ClientCompanyCommercialDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating ClientCompanyCommercialDetail : "+e.getMessage(), 0 );
		}
	}
	
	public ClientCompanyCommercialDetail createClientCompanyCommercialDetail(final Map attributeValues)
	{
		return createClientCompanyCommercialDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public CompanyClientPCC createCompanyClientPCC(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.COMPANYCLIENTPCC );
			return (CompanyClientPCC)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CompanyClientPCC : "+e.getMessage(), 0 );
		}
	}
	
	public CompanyClientPCC createCompanyClientPCC(final Map attributeValues)
	{
		return createCompanyClientPCC( getSession().getSessionContext(), attributeValues );
	}
	
	public Criteria createCriteria(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.CRITERIA );
			return (Criteria)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Criteria : "+e.getMessage(), 0 );
		}
	}
	
	public Criteria createCriteria(final Map attributeValues)
	{
		return createCriteria( getSession().getSessionContext(), attributeValues );
	}
	
	public FareDetail createFareDetail(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.FAREDETAIL );
			return (FareDetail)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FareDetail : "+e.getMessage(), 0 );
		}
	}
	
	public FareDetail createFareDetail(final Map attributeValues)
	{
		return createFareDetail( getSession().getSessionContext(), attributeValues );
	}
	
	public Fees createFees(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.FEES );
			return (Fees)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Fees : "+e.getMessage(), 0 );
		}
	}
	
	public Fees createFees(final Map attributeValues)
	{
		return createFees( getSession().getSessionContext(), attributeValues );
	}
	
	public FlightClientCompanyAdvanceDefinition createFlightClientCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.FLIGHTCLIENTCOMPANYADVANCEDEFINITION );
			return (FlightClientCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating FlightClientCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public FlightClientCompanyAdvanceDefinition createFlightClientCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createFlightClientCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public HolidayClientCompanyAdvanceDefinition createHolidayClientCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.HOLIDAYCLIENTCOMPANYADVANCEDEFINITION );
			return (HolidayClientCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating HolidayClientCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public HolidayClientCompanyAdvanceDefinition createHolidayClientCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createHolidayClientCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public LookToBookRateCompanyCommercial createLookToBookRateCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.LOOKTOBOOKRATECOMPANYCOMMERCIAL );
			return (LookToBookRateCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LookToBookRateCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public LookToBookRateCompanyCommercial createLookToBookRateCompanyCommercial(final Map attributeValues)
	{
		return createLookToBookRateCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public LookToBookRatioCompanyCommercial createLookToBookRatioCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.LOOKTOBOOKRATIOCOMPANYCOMMERCIAL );
			return (LookToBookRatioCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating LookToBookRatioCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public LookToBookRatioCompanyCommercial createLookToBookRatioCompanyCommercial(final Map attributeValues)
	{
		return createLookToBookRatioCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public MarkUpCompanyCommercial createMarkUpCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.MARKUPCOMPANYCOMMERCIAL );
			return (MarkUpCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating MarkUpCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public MarkUpCompanyCommercial createMarkUpCompanyCommercial(final Map attributeValues)
	{
		return createMarkUpCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public OtherFeeCompanyCommercial createOtherFeeCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.OTHERFEECOMPANYCOMMERCIAL );
			return (OtherFeeCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OtherFeeCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public OtherFeeCompanyCommercial createOtherFeeCompanyCommercial(final Map attributeValues)
	{
		return createOtherFeeCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public OveridingCompanyCommerical createOveridingCompanyCommerical(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.OVERIDINGCOMPANYCOMMERICAL );
			return (OveridingCompanyCommerical)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating OveridingCompanyCommerical : "+e.getMessage(), 0 );
		}
	}
	
	public OveridingCompanyCommerical createOveridingCompanyCommerical(final Map attributeValues)
	{
		return createOveridingCompanyCommerical( getSession().getSessionContext(), attributeValues );
	}
	
	public Penalty createPenalty(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.PENALTY );
			return (Penalty)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Penalty : "+e.getMessage(), 0 );
		}
	}
	
	public Penalty createPenalty(final Map attributeValues)
	{
		return createPenalty( getSession().getSessionContext(), attributeValues );
	}
	
	public PenaltyKickBackFeeCompanyCommercial createPenaltyKickBackFeeCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.PENALTYKICKBACKFEECOMPANYCOMMERCIAL );
			return (PenaltyKickBackFeeCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating PenaltyKickBackFeeCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public PenaltyKickBackFeeCompanyCommercial createPenaltyKickBackFeeCompanyCommercial(final Map attributeValues)
	{
		return createPenaltyKickBackFeeCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SignUpBonusCompanyCommercial createSignUpBonusCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.SIGNUPBONUSCOMPANYCOMMERCIAL );
			return (SignUpBonusCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SignUpBonusCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SignUpBonusCompanyCommercial createSignUpBonusCompanyCommercial(final Map attributeValues)
	{
		return createSignUpBonusCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public SlabCompanyCommercial createSlabCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.SLABCOMPANYCOMMERCIAL );
			return (SlabCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating SlabCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public SlabCompanyCommercial createSlabCompanyCommercial(final Map attributeValues)
	{
		return createSlabCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public StandardCompanyCommercial createStandardCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.STANDARDCOMPANYCOMMERCIAL );
			return (StandardCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating StandardCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public StandardCompanyCommercial createStandardCompanyCommercial(final Map attributeValues)
	{
		return createStandardCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public TerminationFeeCompanyCommercial createTerminationFeeCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.TERMINATIONFEECOMPANYCOMMERCIAL );
			return (TerminationFeeCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TerminationFeeCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public TerminationFeeCompanyCommercial createTerminationFeeCompanyCommercial(final Map attributeValues)
	{
		return createTerminationFeeCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public TopUpIncentiveCompanyCommercial createTopUpIncentiveCompanyCommercial(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.TOPUPINCENTIVECOMPANYCOMMERCIAL );
			return (TopUpIncentiveCompanyCommercial)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TopUpIncentiveCompanyCommercial : "+e.getMessage(), 0 );
		}
	}
	
	public TopUpIncentiveCompanyCommercial createTopUpIncentiveCompanyCommercial(final Map attributeValues)
	{
		return createTopUpIncentiveCompanyCommercial( getSession().getSessionContext(), attributeValues );
	}
	
	public TransportClientCompanyAdvanceDefinition createTransportClientCompanyAdvanceDefinition(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.TRANSPORTCLIENTCOMPANYADVANCEDEFINITION );
			return (TransportClientCompanyAdvanceDefinition)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TransportClientCompanyAdvanceDefinition : "+e.getMessage(), 0 );
		}
	}
	
	public TransportClientCompanyAdvanceDefinition createTransportClientCompanyAdvanceDefinition(final Map attributeValues)
	{
		return createTransportClientCompanyAdvanceDefinition( getSession().getSessionContext(), attributeValues );
	}
	
	public TravelDestination createTravelDestination(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.TRAVELDESTINATION );
			return (TravelDestination)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating TravelDestination : "+e.getMessage(), 0 );
		}
	}
	
	public TravelDestination createTravelDestination(final Map attributeValues)
	{
		return createTravelDestination( getSession().getSessionContext(), attributeValues );
	}
	
	public Validity createValidity(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( ClientcommercialsConstants.TC.VALIDITY );
			return (Validity)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating Validity : "+e.getMessage(), 0 );
		}
	}
	
	public Validity createValidity(final Map attributeValues)
	{
		return createValidity( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.flightCompanyAdvanceDefinition</code> attribute.
	 * @return the flightCompanyAdvanceDefinition
	 */
	public FlightClientCompanyAdvanceDefinition getFlightCompanyAdvanceDefinition(final SessionContext ctx, final FlightNumber item)
	{
		return (FlightClientCompanyAdvanceDefinition)item.getProperty( ctx, ClientcommercialsConstants.Attributes.FlightNumber.FLIGHTCOMPANYADVANCEDEFINITION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FlightNumber.flightCompanyAdvanceDefinition</code> attribute.
	 * @return the flightCompanyAdvanceDefinition
	 */
	public FlightClientCompanyAdvanceDefinition getFlightCompanyAdvanceDefinition(final FlightNumber item)
	{
		return getFlightCompanyAdvanceDefinition( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.flightCompanyAdvanceDefinition</code> attribute. 
	 * @param value the flightCompanyAdvanceDefinition
	 */
	public void setFlightCompanyAdvanceDefinition(final SessionContext ctx, final FlightNumber item, final FlightClientCompanyAdvanceDefinition value)
	{
		item.setProperty(ctx, ClientcommercialsConstants.Attributes.FlightNumber.FLIGHTCOMPANYADVANCEDEFINITION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FlightNumber.flightCompanyAdvanceDefinition</code> attribute. 
	 * @param value the flightCompanyAdvanceDefinition
	 */
	public void setFlightCompanyAdvanceDefinition(final FlightNumber item, final FlightClientCompanyAdvanceDefinition value)
	{
		setFlightCompanyAdvanceDefinition( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return ClientcommercialsConstants.EXTENSIONNAME;
	}
	
}
