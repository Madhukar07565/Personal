/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.orgstructure.core.iata.jalo.IATAAgency;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.jalo.AbstractCommercialValue;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialProductInfo;
import com.cnk.travelogix.supplier.commercials.core.jalo.CommercialRateTypeDetail;
import de.hybris.platform.jalo.ConsistencyCheckException;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.security.Principal;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import de.hybris.platform.util.PartOfHandler;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.GeneralCommercialRecord GeneralCommercialRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedGeneralCommercialRecord extends AbstractCommercialRecord
{
	/** Qualifier of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute **/
	public static final String TRANSACTIONWISESETTLEMENT = "transactionWiseSettlement";
	/** Qualifier of the <code>GeneralCommercialRecord.transactional</code> attribute **/
	public static final String TRANSACTIONAL = "transactional";
	/** Qualifier of the <code>GeneralCommercialRecord.comissionable</code> attribute **/
	public static final String COMISSIONABLE = "comissionable";
	/** Qualifier of the <code>GeneralCommercialRecord.commercialValue</code> attribute **/
	public static final String COMMERCIALVALUE = "commercialValue";
	/** Qualifier of the <code>GeneralCommercialRecord.calculationType</code> attribute **/
	public static final String CALCULATIONTYPE = "calculationType";
	/** Qualifier of the <code>GeneralCommercialRecord.commercialHeadForCalculationType</code> attribute **/
	public static final String COMMERCIALHEADFORCALCULATIONTYPE = "commercialHeadForCalculationType";
	/** Qualifier of the <code>GeneralCommercialRecord.markDownComplete</code> attribute **/
	public static final String MARKDOWNCOMPLETE = "markDownComplete";
	/** Qualifier of the <code>GeneralCommercialRecord.markDownCompleteClientType</code> attribute **/
	public static final String MARKDOWNCOMPLETECLIENTTYPE = "markDownCompleteClientType";
	/** Qualifier of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute **/
	public static final String MINMARKUPPERCENTAGE = "minMarkupPercentage";
	/** Qualifier of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute **/
	public static final String MAXMARKUPPERCENTAGE = "maxMarkupPercentage";
	/** Qualifier of the <code>GeneralCommercialRecord.minMaxMarkupClientType</code> attribute **/
	public static final String MINMAXMARKUPCLIENTTYPE = "minMaxMarkupClientType";
	/** Qualifier of the <code>GeneralCommercialRecord.final</code> attribute **/
	public static final String FINAL = "final";
	/** Qualifier of the <code>GeneralCommercialRecord.utilizedProducts</code> attribute **/
	public static final String UTILIZEDPRODUCTS = "utilizedProducts";
	/** Relation ordering override parameter constants for genCommercialrcd2ProductInfos from ((suppliercommercialscore))*/
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_SRC_ORDERED = "relation.genCommercialrcd2ProductInfos.source.ordered";
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_TGT_ORDERED = "relation.genCommercialrcd2ProductInfos.target.ordered";
	/** Relation disable markmodifed parameter constants for genCommercialrcd2ProductInfos from ((suppliercommercialscore))*/
	protected static String GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED = "relation.genCommercialrcd2ProductInfos.markmodified";
	/** Qualifier of the <code>GeneralCommercialRecord.clients</code> attribute **/
	public static final String CLIENTS = "clients";
	/** Relation ordering override parameter constants for GeneralCommercial2Principal from ((suppliercommercialscore))*/
	protected static String GENERALCOMMERCIAL2PRINCIPAL_SRC_ORDERED = "relation.GeneralCommercial2Principal.source.ordered";
	protected static String GENERALCOMMERCIAL2PRINCIPAL_TGT_ORDERED = "relation.GeneralCommercial2Principal.target.ordered";
	/** Relation disable markmodifed parameter constants for GeneralCommercial2Principal from ((suppliercommercialscore))*/
	protected static String GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED = "relation.GeneralCommercial2Principal.markmodified";
	/** Qualifier of the <code>GeneralCommercialRecord.rateTypes</code> attribute **/
	public static final String RATETYPES = "rateTypes";
	/** Qualifier of the <code>GeneralCommercialRecord.iataAgencies</code> attribute **/
	public static final String IATAAGENCIES = "iataAgencies";
	/** Relation ordering override parameter constants for genCom2IATAAgency from ((suppliercommercialscore))*/
	protected static String GENCOM2IATAAGENCY_SRC_ORDERED = "relation.genCom2IATAAgency.source.ordered";
	protected static String GENCOM2IATAAGENCY_TGT_ORDERED = "relation.genCom2IATAAgency.target.ordered";
	/** Relation disable markmodifed parameter constants for genCom2IATAAgency from ((suppliercommercialscore))*/
	protected static String GENCOM2IATAAGENCY_MARKMODIFIED = "relation.genCom2IATAAgency.markmodified";
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
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractCommercialRecord.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TRANSACTIONWISESETTLEMENT, AttributeMode.INITIAL);
		tmp.put(TRANSACTIONAL, AttributeMode.INITIAL);
		tmp.put(COMISSIONABLE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALVALUE, AttributeMode.INITIAL);
		tmp.put(CALCULATIONTYPE, AttributeMode.INITIAL);
		tmp.put(COMMERCIALHEADFORCALCULATIONTYPE, AttributeMode.INITIAL);
		tmp.put(MARKDOWNCOMPLETE, AttributeMode.INITIAL);
		tmp.put(MARKDOWNCOMPLETECLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(MINMARKUPPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(MAXMARKUPPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(MINMAXMARKUPCLIENTTYPE, AttributeMode.INITIAL);
		tmp.put(FINAL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.calculationType</code> attribute.
	 * @return the calculationType
	 */
	public EnumerationValue getCalculationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CALCULATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.calculationType</code> attribute.
	 * @return the calculationType
	 */
	public EnumerationValue getCalculationType()
	{
		return getCalculationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.calculationType</code> attribute. 
	 * @param value the calculationType
	 */
	public void setCalculationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CALCULATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.calculationType</code> attribute. 
	 * @param value the calculationType
	 */
	public void setCalculationType(final EnumerationValue value)
	{
		setCalculationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.clients</code> attribute.
	 * @return the clients
	 */
	public Set<Principal> getClients(final SessionContext ctx)
	{
		final List<Principal> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			"Principal",
			null,
			false,
			false
		);
		return new LinkedHashSet<Principal>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.clients</code> attribute.
	 * @return the clients
	 */
	public Set<Principal> getClients()
	{
		return getClients( getSession().getSessionContext() );
	}
	
	public long getClientsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			"Principal",
			null
		);
	}
	
	public long getClientsCount()
	{
		return getClientsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.clients</code> attribute. 
	 * @param value the clients
	 */
	public void setClients(final SessionContext ctx, final Set<Principal> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.clients</code> attribute. 
	 * @param value the clients
	 */
	public void setClients(final Set<Principal> value)
	{
		setClients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clients. 
	 * @param value the item to add to clients
	 */
	public void addToClients(final SessionContext ctx, final Principal value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clients. 
	 * @param value the item to add to clients
	 */
	public void addToClients(final Principal value)
	{
		addToClients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clients. 
	 * @param value the item to remove from clients
	 */
	public void removeFromClients(final SessionContext ctx, final Principal value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENERALCOMMERCIAL2PRINCIPAL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENERALCOMMERCIAL2PRINCIPAL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clients. 
	 * @param value the item to remove from clients
	 */
	public void removeFromClients(final Principal value)
	{
		removeFromClients( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.comissionable</code> attribute.
	 * @return the comissionable
	 */
	public Boolean isComissionable(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, COMISSIONABLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.comissionable</code> attribute.
	 * @return the comissionable
	 */
	public Boolean isComissionable()
	{
		return isComissionable( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @return the comissionable
	 */
	public boolean isComissionableAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isComissionable( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @return the comissionable
	 */
	public boolean isComissionableAsPrimitive()
	{
		return isComissionableAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @param value the comissionable
	 */
	public void setComissionable(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, COMISSIONABLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @param value the comissionable
	 */
	public void setComissionable(final Boolean value)
	{
		setComissionable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @param value the comissionable
	 */
	public void setComissionable(final SessionContext ctx, final boolean value)
	{
		setComissionable( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.comissionable</code> attribute. 
	 * @param value the comissionable
	 */
	public void setComissionable(final boolean value)
	{
		setComissionable( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.commercialHeadForCalculationType</code> attribute.
	 * @return the commercialHeadForCalculationType
	 */
	public EnumerationValue getCommercialHeadForCalculationType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, COMMERCIALHEADFORCALCULATIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.commercialHeadForCalculationType</code> attribute.
	 * @return the commercialHeadForCalculationType
	 */
	public EnumerationValue getCommercialHeadForCalculationType()
	{
		return getCommercialHeadForCalculationType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.commercialHeadForCalculationType</code> attribute. 
	 * @param value the commercialHeadForCalculationType
	 */
	public void setCommercialHeadForCalculationType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, COMMERCIALHEADFORCALCULATIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.commercialHeadForCalculationType</code> attribute. 
	 * @param value the commercialHeadForCalculationType
	 */
	public void setCommercialHeadForCalculationType(final EnumerationValue value)
	{
		setCommercialHeadForCalculationType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.commercialValue</code> attribute.
	 * @return the commercialValue
	 */
	public AbstractCommercialValue getCommercialValue(final SessionContext ctx)
	{
		return (AbstractCommercialValue)getProperty( ctx, COMMERCIALVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.commercialValue</code> attribute.
	 * @return the commercialValue
	 */
	public AbstractCommercialValue getCommercialValue()
	{
		return getCommercialValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.commercialValue</code> attribute. 
	 * @param value the commercialValue
	 */
	public void setCommercialValue(final SessionContext ctx, final AbstractCommercialValue value)
	{
		new PartOfHandler<AbstractCommercialValue>()
		{
			@Override
			protected AbstractCommercialValue doGetValue(final SessionContext ctx)
			{
				return getCommercialValue( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final AbstractCommercialValue _value)
			{
				final AbstractCommercialValue value = _value;
				setProperty(ctx, COMMERCIALVALUE,value);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.commercialValue</code> attribute. 
	 * @param value the commercialValue
	 */
	public void setCommercialValue(final AbstractCommercialValue value)
	{
		setCommercialValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.final</code> attribute.
	 * @return the final
	 */
	public Boolean isFinal(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, FINAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.final</code> attribute.
	 * @return the final
	 */
	public Boolean isFinal()
	{
		return isFinal( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @return the final
	 */
	public boolean isFinalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isFinal( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @return the final
	 */
	public boolean isFinalAsPrimitive()
	{
		return isFinalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @param value the final
	 */
	public void setFinal(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, FINAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @param value the final
	 */
	public void setFinal(final Boolean value)
	{
		setFinal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @param value the final
	 */
	public void setFinal(final SessionContext ctx, final boolean value)
	{
		setFinal( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.final</code> attribute. 
	 * @param value the final
	 */
	public void setFinal(final boolean value)
	{
		setFinal( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.iataAgencies</code> attribute.
	 * @return the iataAgencies
	 */
	public Set<IATAAgency> getIataAgencies(final SessionContext ctx)
	{
		final List<IATAAgency> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			"IATAAgency",
			null,
			false,
			false
		);
		return new LinkedHashSet<IATAAgency>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.iataAgencies</code> attribute.
	 * @return the iataAgencies
	 */
	public Set<IATAAgency> getIataAgencies()
	{
		return getIataAgencies( getSession().getSessionContext() );
	}
	
	public long getIataAgenciesCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			"IATAAgency",
			null
		);
	}
	
	public long getIataAgenciesCount()
	{
		return getIataAgenciesCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.iataAgencies</code> attribute. 
	 * @param value the iataAgencies
	 */
	public void setIataAgencies(final SessionContext ctx, final Set<IATAAgency> value)
	{
		new PartOfHandler<Set<IATAAgency>>()
		{
			@Override
			protected Set<IATAAgency> doGetValue(final SessionContext ctx)
			{
				return getIataAgencies( ctx );
			}
			@Override
			protected void doSetValue(final SessionContext ctx, final Set<IATAAgency> _value)
			{
				final Set<IATAAgency> value = _value;
				setLinkedItems( 
					ctx,
					true,
					SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
					null,
					value,
					false,
					false,
					Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
				);
			}
		}.setValue( ctx, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.iataAgencies</code> attribute. 
	 * @param value the iataAgencies
	 */
	public void setIataAgencies(final Set<IATAAgency> value)
	{
		setIataAgencies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to iataAgencies. 
	 * @param value the item to add to iataAgencies
	 */
	public void addToIataAgencies(final SessionContext ctx, final IATAAgency value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to iataAgencies. 
	 * @param value the item to add to iataAgencies
	 */
	public void addToIataAgencies(final IATAAgency value)
	{
		addToIataAgencies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from iataAgencies. 
	 * @param value the item to remove from iataAgencies
	 */
	public void removeFromIataAgencies(final SessionContext ctx, final IATAAgency value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOM2IATAAGENCY_MARKMODIFIED)
		);
		if( !getLinkedItems( ctx, true,SuppliercommercialscoreConstants.Relations.GENCOM2IATAAGENCY,null).contains( value ) )
		{
			try
			{
				value.remove( ctx );
			}
			catch( ConsistencyCheckException e )
			{
				throw new JaloSystemException(e);
			}
		}
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from iataAgencies. 
	 * @param value the item to remove from iataAgencies
	 */
	public void removeFromIataAgencies(final IATAAgency value)
	{
		removeFromIataAgencies( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute.
	 * @return the markDownComplete
	 */
	public Boolean isMarkDownComplete(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, MARKDOWNCOMPLETE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute.
	 * @return the markDownComplete
	 */
	public Boolean isMarkDownComplete()
	{
		return isMarkDownComplete( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @return the markDownComplete
	 */
	public boolean isMarkDownCompleteAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isMarkDownComplete( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @return the markDownComplete
	 */
	public boolean isMarkDownCompleteAsPrimitive()
	{
		return isMarkDownCompleteAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @param value the markDownComplete
	 */
	public void setMarkDownComplete(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, MARKDOWNCOMPLETE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @param value the markDownComplete
	 */
	public void setMarkDownComplete(final Boolean value)
	{
		setMarkDownComplete( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @param value the markDownComplete
	 */
	public void setMarkDownComplete(final SessionContext ctx, final boolean value)
	{
		setMarkDownComplete( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownComplete</code> attribute. 
	 * @param value the markDownComplete
	 */
	public void setMarkDownComplete(final boolean value)
	{
		setMarkDownComplete( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownCompleteClientType</code> attribute.
	 * @return the markDownCompleteClientType
	 */
	public EnumerationValue getMarkDownCompleteClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MARKDOWNCOMPLETECLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.markDownCompleteClientType</code> attribute.
	 * @return the markDownCompleteClientType
	 */
	public EnumerationValue getMarkDownCompleteClientType()
	{
		return getMarkDownCompleteClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownCompleteClientType</code> attribute. 
	 * @param value the markDownCompleteClientType
	 */
	public void setMarkDownCompleteClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MARKDOWNCOMPLETECLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.markDownCompleteClientType</code> attribute. 
	 * @param value the markDownCompleteClientType
	 */
	public void setMarkDownCompleteClientType(final EnumerationValue value)
	{
		setMarkDownCompleteClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute.
	 * @return the maxMarkupPercentage
	 */
	public Double getMaxMarkupPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MAXMARKUPPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute.
	 * @return the maxMarkupPercentage
	 */
	public Double getMaxMarkupPercentage()
	{
		return getMaxMarkupPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @return the maxMarkupPercentage
	 */
	public double getMaxMarkupPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getMaxMarkupPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @return the maxMarkupPercentage
	 */
	public double getMaxMarkupPercentageAsPrimitive()
	{
		return getMaxMarkupPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @param value the maxMarkupPercentage
	 */
	public void setMaxMarkupPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MAXMARKUPPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @param value the maxMarkupPercentage
	 */
	public void setMaxMarkupPercentage(final Double value)
	{
		setMaxMarkupPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @param value the maxMarkupPercentage
	 */
	public void setMaxMarkupPercentage(final SessionContext ctx, final double value)
	{
		setMaxMarkupPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.maxMarkupPercentage</code> attribute. 
	 * @param value the maxMarkupPercentage
	 */
	public void setMaxMarkupPercentage(final double value)
	{
		setMaxMarkupPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute.
	 * @return the minMarkupPercentage
	 */
	public Double getMinMarkupPercentage(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, MINMARKUPPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute.
	 * @return the minMarkupPercentage
	 */
	public Double getMinMarkupPercentage()
	{
		return getMinMarkupPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @return the minMarkupPercentage
	 */
	public double getMinMarkupPercentageAsPrimitive(final SessionContext ctx)
	{
		Double value = getMinMarkupPercentage( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @return the minMarkupPercentage
	 */
	public double getMinMarkupPercentageAsPrimitive()
	{
		return getMinMarkupPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @param value the minMarkupPercentage
	 */
	public void setMinMarkupPercentage(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, MINMARKUPPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @param value the minMarkupPercentage
	 */
	public void setMinMarkupPercentage(final Double value)
	{
		setMinMarkupPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @param value the minMarkupPercentage
	 */
	public void setMinMarkupPercentage(final SessionContext ctx, final double value)
	{
		setMinMarkupPercentage( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMarkupPercentage</code> attribute. 
	 * @param value the minMarkupPercentage
	 */
	public void setMinMarkupPercentage(final double value)
	{
		setMinMarkupPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMaxMarkupClientType</code> attribute.
	 * @return the minMaxMarkupClientType
	 */
	public EnumerationValue getMinMaxMarkupClientType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, MINMAXMARKUPCLIENTTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.minMaxMarkupClientType</code> attribute.
	 * @return the minMaxMarkupClientType
	 */
	public EnumerationValue getMinMaxMarkupClientType()
	{
		return getMinMaxMarkupClientType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMaxMarkupClientType</code> attribute. 
	 * @param value the minMaxMarkupClientType
	 */
	public void setMinMaxMarkupClientType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, MINMAXMARKUPCLIENTTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.minMaxMarkupClientType</code> attribute. 
	 * @param value the minMaxMarkupClientType
	 */
	public void setMinMaxMarkupClientType(final EnumerationValue value)
	{
		setMinMaxMarkupClientType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.rateTypes</code> attribute.
	 * @return the rateTypes
	 */
	public Set<CommercialRateTypeDetail> getRateTypes(final SessionContext ctx)
	{
		return (Set<CommercialRateTypeDetail>)RATETYPESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.rateTypes</code> attribute.
	 * @return the rateTypes
	 */
	public Set<CommercialRateTypeDetail> getRateTypes()
	{
		return getRateTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.rateTypes</code> attribute. 
	 * @param value the rateTypes
	 */
	public void setRateTypes(final SessionContext ctx, final Set<CommercialRateTypeDetail> value)
	{
		RATETYPESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.rateTypes</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONAL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactional</code> attribute.
	 * @return the transactional
	 */
	public Boolean isTransactional()
	{
		return isTransactional( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactional( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @return the transactional
	 */
	public boolean isTransactionalAsPrimitive()
	{
		return isTransactionalAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONAL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final Boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final SessionContext ctx, final boolean value)
	{
		setTransactional( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactional</code> attribute. 
	 * @param value the transactional
	 */
	public void setTransactional(final boolean value)
	{
		setTransactional( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute.
	 * @return the transactionWiseSettlement
	 */
	public Boolean isTransactionWiseSettlement(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRANSACTIONWISESETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute.
	 * @return the transactionWiseSettlement
	 */
	public Boolean isTransactionWiseSettlement()
	{
		return isTransactionWiseSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @return the transactionWiseSettlement
	 */
	public boolean isTransactionWiseSettlementAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTransactionWiseSettlement( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @return the transactionWiseSettlement
	 */
	public boolean isTransactionWiseSettlementAsPrimitive()
	{
		return isTransactionWiseSettlementAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @param value the transactionWiseSettlement
	 */
	public void setTransactionWiseSettlement(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRANSACTIONWISESETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @param value the transactionWiseSettlement
	 */
	public void setTransactionWiseSettlement(final Boolean value)
	{
		setTransactionWiseSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @param value the transactionWiseSettlement
	 */
	public void setTransactionWiseSettlement(final SessionContext ctx, final boolean value)
	{
		setTransactionWiseSettlement( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.transactionWiseSettlement</code> attribute. 
	 * @param value the transactionWiseSettlement
	 */
	public void setTransactionWiseSettlement(final boolean value)
	{
		setTransactionWiseSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.utilizedProducts</code> attribute.
	 * @return the utilizedProducts
	 */
	public Set<CommercialProductInfo> getUtilizedProducts(final SessionContext ctx)
	{
		final List<CommercialProductInfo> items = getLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			"CommercialProductInfo",
			null,
			false,
			false
		);
		return new LinkedHashSet<CommercialProductInfo>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>GeneralCommercialRecord.utilizedProducts</code> attribute.
	 * @return the utilizedProducts
	 */
	public Set<CommercialProductInfo> getUtilizedProducts()
	{
		return getUtilizedProducts( getSession().getSessionContext() );
	}
	
	public long getUtilizedProductsCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			"CommercialProductInfo",
			null
		);
	}
	
	public long getUtilizedProductsCount()
	{
		return getUtilizedProductsCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.utilizedProducts</code> attribute. 
	 * @param value the utilizedProducts
	 */
	public void setUtilizedProducts(final SessionContext ctx, final Set<CommercialProductInfo> value)
	{
		setLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>GeneralCommercialRecord.utilizedProducts</code> attribute. 
	 * @param value the utilizedProducts
	 */
	public void setUtilizedProducts(final Set<CommercialProductInfo> value)
	{
		setUtilizedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to utilizedProducts. 
	 * @param value the item to add to utilizedProducts
	 */
	public void addToUtilizedProducts(final SessionContext ctx, final CommercialProductInfo value)
	{
		addLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to utilizedProducts. 
	 * @param value the item to add to utilizedProducts
	 */
	public void addToUtilizedProducts(final CommercialProductInfo value)
	{
		addToUtilizedProducts( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from utilizedProducts. 
	 * @param value the item to remove from utilizedProducts
	 */
	public void removeFromUtilizedProducts(final SessionContext ctx, final CommercialProductInfo value)
	{
		removeLinkedItems( 
			ctx,
			true,
			SuppliercommercialscoreConstants.Relations.GENCOMMERCIALRCD2PRODUCTINFOS,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(GENCOMMERCIALRCD2PRODUCTINFOS_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from utilizedProducts. 
	 * @param value the item to remove from utilizedProducts
	 */
	public void removeFromUtilizedProducts(final CommercialProductInfo value)
	{
		removeFromUtilizedProducts( getSession().getSessionContext(), value );
	}
	
}
