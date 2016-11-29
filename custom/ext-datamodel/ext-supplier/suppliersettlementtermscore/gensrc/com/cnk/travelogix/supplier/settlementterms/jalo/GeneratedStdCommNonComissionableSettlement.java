/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.settlementterms.jalo;

import com.cnk.travelogix.supplier.settlementterms.core.constants.SuppliersettlementtermscoreConstants;
import com.cnk.travelogix.supplier.settlementterms.jalo.AbstractSupplierSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.NoCreditPrePaymentCommSettlement;
import com.cnk.travelogix.supplier.settlementterms.jalo.SupplierSettlement;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.settlementterms.jalo.StdCommNonComissionableSettlement StdCommNonComissionableSettlement}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStdCommNonComissionableSettlement extends AbstractSupplierSettlement
{
	/** Qualifier of the <code>StdCommNonComissionableSettlement.typeOfSettlement</code> attribute **/
	public static final String TYPEOFSETTLEMENT = "typeOfSettlement";
	/** Qualifier of the <code>StdCommNonComissionableSettlement.noCreditPrePaymentDetails</code> attribute **/
	public static final String NOCREDITPREPAYMENTDETAILS = "noCreditPrePaymentDetails";
	/** Qualifier of the <code>StdCommNonComissionableSettlement.supplierSettlement</code> attribute **/
	public static final String SUPPLIERSETTLEMENT = "supplierSettlement";
	/**
	* {@link OneToManyHandler} for handling 1:n NOCREDITPREPAYMENTDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<NoCreditPrePaymentCommSettlement> NOCREDITPREPAYMENTDETAILSHANDLER = new OneToManyHandler<NoCreditPrePaymentCommSettlement>(
	SuppliersettlementtermscoreConstants.TC.NOCREDITPREPAYMENTCOMMSETTLEMENT,
	false,
	"stdCommNonComissionableSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n SUPPLIERSETTLEMENT's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedStdCommNonComissionableSettlement> SUPPLIERSETTLEMENTHANDLER = new BidirectionalOneToManyHandler<GeneratedStdCommNonComissionableSettlement>(
	SuppliersettlementtermscoreConstants.TC.STDCOMMNONCOMISSIONABLESETTLEMENT,
	false,
	"supplierSettlement",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractSupplierSettlement.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TYPEOFSETTLEMENT, AttributeMode.INITIAL);
		tmp.put(SUPPLIERSETTLEMENT, AttributeMode.INITIAL);
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
		SUPPLIERSETTLEMENTHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.noCreditPrePaymentDetails</code> attribute.
	 * @return the noCreditPrePaymentDetails
	 */
	public Collection<NoCreditPrePaymentCommSettlement> getNoCreditPrePaymentDetails(final SessionContext ctx)
	{
		return NOCREDITPREPAYMENTDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.noCreditPrePaymentDetails</code> attribute.
	 * @return the noCreditPrePaymentDetails
	 */
	public Collection<NoCreditPrePaymentCommSettlement> getNoCreditPrePaymentDetails()
	{
		return getNoCreditPrePaymentDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.noCreditPrePaymentDetails</code> attribute. 
	 * @param value the noCreditPrePaymentDetails
	 */
	public void setNoCreditPrePaymentDetails(final SessionContext ctx, final Collection<NoCreditPrePaymentCommSettlement> value)
	{
		NOCREDITPREPAYMENTDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.noCreditPrePaymentDetails</code> attribute. 
	 * @param value the noCreditPrePaymentDetails
	 */
	public void setNoCreditPrePaymentDetails(final Collection<NoCreditPrePaymentCommSettlement> value)
	{
		setNoCreditPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noCreditPrePaymentDetails. 
	 * @param value the item to add to noCreditPrePaymentDetails
	 */
	public void addToNoCreditPrePaymentDetails(final SessionContext ctx, final NoCreditPrePaymentCommSettlement value)
	{
		NOCREDITPREPAYMENTDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to noCreditPrePaymentDetails. 
	 * @param value the item to add to noCreditPrePaymentDetails
	 */
	public void addToNoCreditPrePaymentDetails(final NoCreditPrePaymentCommSettlement value)
	{
		addToNoCreditPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noCreditPrePaymentDetails. 
	 * @param value the item to remove from noCreditPrePaymentDetails
	 */
	public void removeFromNoCreditPrePaymentDetails(final SessionContext ctx, final NoCreditPrePaymentCommSettlement value)
	{
		NOCREDITPREPAYMENTDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from noCreditPrePaymentDetails. 
	 * @param value the item to remove from noCreditPrePaymentDetails
	 */
	public void removeFromNoCreditPrePaymentDetails(final NoCreditPrePaymentCommSettlement value)
	{
		removeFromNoCreditPrePaymentDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement(final SessionContext ctx)
	{
		return (SupplierSettlement)getProperty( ctx, SUPPLIERSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.supplierSettlement</code> attribute.
	 * @return the supplierSettlement
	 */
	public SupplierSettlement getSupplierSettlement()
	{
		return getSupplierSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SessionContext ctx, final SupplierSettlement value)
	{
		SUPPLIERSETTLEMENTHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.supplierSettlement</code> attribute. 
	 * @param value the supplierSettlement
	 */
	public void setSupplierSettlement(final SupplierSettlement value)
	{
		setSupplierSettlement( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.typeOfSettlement</code> attribute.
	 * @return the typeOfSettlement
	 */
	public EnumerationValue getTypeOfSettlement(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, TYPEOFSETTLEMENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>StdCommNonComissionableSettlement.typeOfSettlement</code> attribute.
	 * @return the typeOfSettlement
	 */
	public EnumerationValue getTypeOfSettlement()
	{
		return getTypeOfSettlement( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.typeOfSettlement</code> attribute. 
	 * @param value the typeOfSettlement
	 */
	public void setTypeOfSettlement(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, TYPEOFSETTLEMENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>StdCommNonComissionableSettlement.typeOfSettlement</code> attribute. 
	 * @param value the typeOfSettlement
	 */
	public void setTypeOfSettlement(final EnumerationValue value)
	{
		setTypeOfSettlement( getSession().getSessionContext(), value );
	}
	
}
