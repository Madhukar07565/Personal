/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.tds.jalo;

import com.cnk.travelogix.masterdata.core.general.jalo.AbstractTravelogixItem;
import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.tds.jalo.AbstractTDSRule;
import com.cnk.travelogix.operation.tds.jalo.TDSCompanyType;
import com.cnk.travelogix.operation.tds.jalo.TDSExemption;
import com.cnk.travelogix.operation.tds.jalo.TDSTaxComponent;
import de.hybris.platform.catalog.jalo.Company;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.tds.jalo.TDSMaster TDSMaster}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTDSMaster extends AbstractTravelogixItem
{
	/** Qualifier of the <code>TDSMaster.company</code> attribute **/
	public static final String COMPANY = "company";
	/** Qualifier of the <code>TDSMaster.tdsType</code> attribute **/
	public static final String TDSTYPE = "tdsType";
	/** Qualifier of the <code>TDSMaster.tdsTypeDescription</code> attribute **/
	public static final String TDSTYPEDESCRIPTION = "tdsTypeDescription";
	/** Qualifier of the <code>TDSMaster.startDate</code> attribute **/
	public static final String STARTDATE = "startDate";
	/** Qualifier of the <code>TDSMaster.endDate</code> attribute **/
	public static final String ENDDATE = "endDate";
	/** Qualifier of the <code>TDSMaster.taxComponents</code> attribute **/
	public static final String TAXCOMPONENTS = "taxComponents";
	/** Qualifier of the <code>TDSMaster.tdsRules</code> attribute **/
	public static final String TDSRULES = "tdsRules";
	/** Qualifier of the <code>TDSMaster.tdsExemptions</code> attribute **/
	public static final String TDSEXEMPTIONS = "tdsExemptions";
	/** Qualifier of the <code>TDSMaster.tdsCompanyTypes</code> attribute **/
	public static final String TDSCOMPANYTYPES = "tdsCompanyTypes";
	/** Relation ordering override parameter constants for TDSMaster2TDSCompanyTypeREL from ((operationmastercore))*/
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_SRC_ORDERED = "relation.TDSMaster2TDSCompanyTypeREL.source.ordered";
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_TGT_ORDERED = "relation.TDSMaster2TDSCompanyTypeREL.target.ordered";
	/** Relation disable markmodifed parameter constants for TDSMaster2TDSCompanyTypeREL from ((operationmastercore))*/
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED = "relation.TDSMaster2TDSCompanyTypeREL.markmodified";
	/**
	* {@link OneToManyHandler} for handling 1:n TAXCOMPONENTS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TDSTaxComponent> TAXCOMPONENTSHANDLER = new OneToManyHandler<TDSTaxComponent>(
	OperationmastercoreConstants.TC.TDSTAXCOMPONENT,
	false,
	"tdsMaster",
	null,
	false,
	true,
	CollectionType.LIST
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TDSRULES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<AbstractTDSRule> TDSRULESHANDLER = new OneToManyHandler<AbstractTDSRule>(
	OperationmastercoreConstants.TC.ABSTRACTTDSRULE,
	false,
	"tdsMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n TDSEXEMPTIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<TDSExemption> TDSEXEMPTIONSHANDLER = new OneToManyHandler<TDSExemption>(
	OperationmastercoreConstants.TC.TDSEXEMPTION,
	false,
	"tdsMaster",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTravelogixItem.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(COMPANY, AttributeMode.INITIAL);
		tmp.put(TDSTYPE, AttributeMode.INITIAL);
		tmp.put(TDSTYPEDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(STARTDATE, AttributeMode.INITIAL);
		tmp.put(ENDDATE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany(final SessionContext ctx)
	{
		return (Company)getProperty( ctx, COMPANY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.company</code> attribute.
	 * @return the company
	 */
	public Company getCompany()
	{
		return getCompany( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final SessionContext ctx, final Company value)
	{
		setProperty(ctx, COMPANY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.company</code> attribute. 
	 * @param value the company
	 */
	public void setCompany(final Company value)
	{
		setCompany( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ENDDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.endDate</code> attribute.
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return getEndDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ENDDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.endDate</code> attribute. 
	 * @param value the endDate
	 */
	public void setEndDate(final Date value)
	{
		setEndDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, STARTDATE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.startDate</code> attribute.
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return getStartDate( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, STARTDATE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.startDate</code> attribute. 
	 * @param value the startDate
	 */
	public void setStartDate(final Date value)
	{
		setStartDate( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.taxComponents</code> attribute.
	 * @return the taxComponents
	 */
	public List<TDSTaxComponent> getTaxComponents(final SessionContext ctx)
	{
		return (List<TDSTaxComponent>)TAXCOMPONENTSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.taxComponents</code> attribute.
	 * @return the taxComponents
	 */
	public List<TDSTaxComponent> getTaxComponents()
	{
		return getTaxComponents( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.taxComponents</code> attribute. 
	 * @param value the taxComponents
	 */
	public void setTaxComponents(final SessionContext ctx, final List<TDSTaxComponent> value)
	{
		TAXCOMPONENTSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.taxComponents</code> attribute. 
	 * @param value the taxComponents
	 */
	public void setTaxComponents(final List<TDSTaxComponent> value)
	{
		setTaxComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxComponents. 
	 * @param value the item to add to taxComponents
	 */
	public void addToTaxComponents(final SessionContext ctx, final TDSTaxComponent value)
	{
		TAXCOMPONENTSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to taxComponents. 
	 * @param value the item to add to taxComponents
	 */
	public void addToTaxComponents(final TDSTaxComponent value)
	{
		addToTaxComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxComponents. 
	 * @param value the item to remove from taxComponents
	 */
	public void removeFromTaxComponents(final SessionContext ctx, final TDSTaxComponent value)
	{
		TAXCOMPONENTSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from taxComponents. 
	 * @param value the item to remove from taxComponents
	 */
	public void removeFromTaxComponents(final TDSTaxComponent value)
	{
		removeFromTaxComponents( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsCompanyTypes</code> attribute.
	 * @return the tdsCompanyTypes
	 */
	public Collection<TDSCompanyType> getTdsCompanyTypes(final SessionContext ctx)
	{
		final List<TDSCompanyType> items = getLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			"TDSCompanyType",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsCompanyTypes</code> attribute.
	 * @return the tdsCompanyTypes
	 */
	public Collection<TDSCompanyType> getTdsCompanyTypes()
	{
		return getTdsCompanyTypes( getSession().getSessionContext() );
	}
	
	public long getTdsCompanyTypesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			"TDSCompanyType",
			null
		);
	}
	
	public long getTdsCompanyTypesCount()
	{
		return getTdsCompanyTypesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsCompanyTypes</code> attribute. 
	 * @param value the tdsCompanyTypes
	 */
	public void setTdsCompanyTypes(final SessionContext ctx, final Collection<TDSCompanyType> value)
	{
		setLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsCompanyTypes</code> attribute. 
	 * @param value the tdsCompanyTypes
	 */
	public void setTdsCompanyTypes(final Collection<TDSCompanyType> value)
	{
		setTdsCompanyTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsCompanyTypes. 
	 * @param value the item to add to tdsCompanyTypes
	 */
	public void addToTdsCompanyTypes(final SessionContext ctx, final TDSCompanyType value)
	{
		addLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsCompanyTypes. 
	 * @param value the item to add to tdsCompanyTypes
	 */
	public void addToTdsCompanyTypes(final TDSCompanyType value)
	{
		addToTdsCompanyTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsCompanyTypes. 
	 * @param value the item to remove from tdsCompanyTypes
	 */
	public void removeFromTdsCompanyTypes(final SessionContext ctx, final TDSCompanyType value)
	{
		removeLinkedItems( 
			ctx,
			true,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsCompanyTypes. 
	 * @param value the item to remove from tdsCompanyTypes
	 */
	public void removeFromTdsCompanyTypes(final TDSCompanyType value)
	{
		removeFromTdsCompanyTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsExemptions</code> attribute.
	 * @return the tdsExemptions
	 */
	public Collection<TDSExemption> getTdsExemptions(final SessionContext ctx)
	{
		return TDSEXEMPTIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsExemptions</code> attribute.
	 * @return the tdsExemptions
	 */
	public Collection<TDSExemption> getTdsExemptions()
	{
		return getTdsExemptions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsExemptions</code> attribute. 
	 * @param value the tdsExemptions
	 */
	public void setTdsExemptions(final SessionContext ctx, final Collection<TDSExemption> value)
	{
		TDSEXEMPTIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsExemptions</code> attribute. 
	 * @param value the tdsExemptions
	 */
	public void setTdsExemptions(final Collection<TDSExemption> value)
	{
		setTdsExemptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsExemptions. 
	 * @param value the item to add to tdsExemptions
	 */
	public void addToTdsExemptions(final SessionContext ctx, final TDSExemption value)
	{
		TDSEXEMPTIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsExemptions. 
	 * @param value the item to add to tdsExemptions
	 */
	public void addToTdsExemptions(final TDSExemption value)
	{
		addToTdsExemptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsExemptions. 
	 * @param value the item to remove from tdsExemptions
	 */
	public void removeFromTdsExemptions(final SessionContext ctx, final TDSExemption value)
	{
		TDSEXEMPTIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsExemptions. 
	 * @param value the item to remove from tdsExemptions
	 */
	public void removeFromTdsExemptions(final TDSExemption value)
	{
		removeFromTdsExemptions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsRules</code> attribute.
	 * @return the tdsRules
	 */
	public Collection<AbstractTDSRule> getTdsRules(final SessionContext ctx)
	{
		return TDSRULESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsRules</code> attribute.
	 * @return the tdsRules
	 */
	public Collection<AbstractTDSRule> getTdsRules()
	{
		return getTdsRules( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsRules</code> attribute. 
	 * @param value the tdsRules
	 */
	public void setTdsRules(final SessionContext ctx, final Collection<AbstractTDSRule> value)
	{
		TDSRULESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsRules</code> attribute. 
	 * @param value the tdsRules
	 */
	public void setTdsRules(final Collection<AbstractTDSRule> value)
	{
		setTdsRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsRules. 
	 * @param value the item to add to tdsRules
	 */
	public void addToTdsRules(final SessionContext ctx, final AbstractTDSRule value)
	{
		TDSRULESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsRules. 
	 * @param value the item to add to tdsRules
	 */
	public void addToTdsRules(final AbstractTDSRule value)
	{
		addToTdsRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsRules. 
	 * @param value the item to remove from tdsRules
	 */
	public void removeFromTdsRules(final SessionContext ctx, final AbstractTDSRule value)
	{
		TDSRULESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsRules. 
	 * @param value the item to remove from tdsRules
	 */
	public void removeFromTdsRules(final AbstractTDSRule value)
	{
		removeFromTdsRules( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsType</code> attribute.
	 * @return the tdsType
	 */
	public String getTdsType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TDSTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsType</code> attribute.
	 * @return the tdsType
	 */
	public String getTdsType()
	{
		return getTdsType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsType</code> attribute. 
	 * @param value the tdsType
	 */
	public void setTdsType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TDSTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsType</code> attribute. 
	 * @param value the tdsType
	 */
	public void setTdsType(final String value)
	{
		setTdsType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsTypeDescription</code> attribute.
	 * @return the tdsTypeDescription
	 */
	public String getTdsTypeDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TDSTYPEDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSMaster.tdsTypeDescription</code> attribute.
	 * @return the tdsTypeDescription
	 */
	public String getTdsTypeDescription()
	{
		return getTdsTypeDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsTypeDescription</code> attribute. 
	 * @param value the tdsTypeDescription
	 */
	public void setTdsTypeDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TDSTYPEDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSMaster.tdsTypeDescription</code> attribute. 
	 * @param value the tdsTypeDescription
	 */
	public void setTdsTypeDescription(final String value)
	{
		setTdsTypeDescription( getSession().getSessionContext(), value );
	}
	
}
