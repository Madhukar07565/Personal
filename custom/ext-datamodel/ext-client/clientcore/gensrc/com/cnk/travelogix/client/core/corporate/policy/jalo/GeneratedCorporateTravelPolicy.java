/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.policy.jalo;

import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import com.cnk.travelogix.masterdata.core.c2l.jalo.Location;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.version.jalo.VersionDetail;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.policy.jalo.CorporateTravelPolicy CorporateTravelPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCorporateTravelPolicy extends GenericItem
{
	/** Qualifier of the <code>CorporateTravelPolicy.policyName</code> attribute **/
	public static final String POLICYNAME = "policyName";
	/** Qualifier of the <code>CorporateTravelPolicy.policyParameterName</code> attribute **/
	public static final String POLICYPARAMETERNAME = "policyParameterName";
	/** Qualifier of the <code>CorporateTravelPolicy.policyProduct</code> attribute **/
	public static final String POLICYPRODUCT = "policyProduct";
	/** Qualifier of the <code>CorporateTravelPolicy.effectiveFrom</code> attribute **/
	public static final String EFFECTIVEFROM = "effectiveFrom";
	/** Qualifier of the <code>CorporateTravelPolicy.effectiveTo</code> attribute **/
	public static final String EFFECTIVETO = "effectiveTo";
	/** Qualifier of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute **/
	public static final String BOOLEANCONSTRUCT = "booleanConstruct";
	/** Qualifier of the <code>CorporateTravelPolicy.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>CorporateTravelPolicy.valueTo</code> attribute **/
	public static final String VALUETO = "valueTo";
	/** Qualifier of the <code>CorporateTravelPolicy.operator</code> attribute **/
	public static final String OPERATOR = "operator";
	/** Qualifier of the <code>CorporateTravelPolicy.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CorporateTravelPolicy.listConstruct</code> attribute **/
	public static final String LISTCONSTRUCT = "listConstruct";
	/** Qualifier of the <code>CorporateTravelPolicy.versionDetails</code> attribute **/
	public static final String VERSIONDETAILS = "versionDetails";
	/** Qualifier of the <code>CorporateTravelPolicy.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>CorporateTravelPolicy.locations</code> attribute **/
	public static final String LOCATIONS = "locations";
	/** Qualifier of the <code>CorporateTravelPolicy.countries</code> attribute **/
	public static final String COUNTRIES = "countries";
	/**
	* {@link OneToManyHandler} for handling 1:n VERSIONDETAILS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<VersionDetail> VERSIONDETAILSHANDLER = new OneToManyHandler<VersionDetail>(
	MasterdatacoreConstants.TC.VERSIONDETAIL,
	false,
	"corporateTravelPolicy",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n GRADE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> GRADEHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.GRADE,
	false,
	"corporateTravelPolicy",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n LOCATIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Location> LOCATIONSHANDLER = new OneToManyHandler<Location>(
	MasterdatacoreConstants.TC.LOCATION,
	false,
	"corporateTravelPolicy",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COUNTRIES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Country> COUNTRIESHANDLER = new OneToManyHandler<Country>(
	CoreConstants.TC.COUNTRY,
	false,
	"corporateTravelPolicy",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(POLICYNAME, AttributeMode.INITIAL);
		tmp.put(POLICYPARAMETERNAME, AttributeMode.INITIAL);
		tmp.put(POLICYPRODUCT, AttributeMode.INITIAL);
		tmp.put(EFFECTIVEFROM, AttributeMode.INITIAL);
		tmp.put(EFFECTIVETO, AttributeMode.INITIAL);
		tmp.put(BOOLEANCONSTRUCT, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		tmp.put(VALUETO, AttributeMode.INITIAL);
		tmp.put(OPERATOR, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(LISTCONSTRUCT, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute.
	 * @return the booleanConstruct
	 */
	public Boolean isBooleanConstruct(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, BOOLEANCONSTRUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute.
	 * @return the booleanConstruct
	 */
	public Boolean isBooleanConstruct()
	{
		return isBooleanConstruct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @return the booleanConstruct
	 */
	public boolean isBooleanConstructAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isBooleanConstruct( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @return the booleanConstruct
	 */
	public boolean isBooleanConstructAsPrimitive()
	{
		return isBooleanConstructAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @param value the booleanConstruct
	 */
	public void setBooleanConstruct(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, BOOLEANCONSTRUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @param value the booleanConstruct
	 */
	public void setBooleanConstruct(final Boolean value)
	{
		setBooleanConstruct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @param value the booleanConstruct
	 */
	public void setBooleanConstruct(final SessionContext ctx, final boolean value)
	{
		setBooleanConstruct( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.booleanConstruct</code> attribute. 
	 * @param value the booleanConstruct
	 */
	public void setBooleanConstruct(final boolean value)
	{
		setBooleanConstruct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries(final SessionContext ctx)
	{
		return (Set<Country>)COUNTRIESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.countries</code> attribute.
	 * @return the countries
	 */
	public Set<Country> getCountries()
	{
		return getCountries( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final SessionContext ctx, final Set<Country> value)
	{
		COUNTRIESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.countries</code> attribute. 
	 * @param value the countries
	 */
	public void setCountries(final Set<Country> value)
	{
		setCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final SessionContext ctx, final Country value)
	{
		COUNTRIESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to countries. 
	 * @param value the item to add to countries
	 */
	public void addToCountries(final Country value)
	{
		addToCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final SessionContext ctx, final Country value)
	{
		COUNTRIESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from countries. 
	 * @param value the item to remove from countries
	 */
	public void removeFromCountries(final Country value)
	{
		removeFromCountries( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.currency</code> attribute.
	 * @return the currency
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.currency</code> attribute. 
	 * @param value the currency
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVEFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.effectiveFrom</code> attribute.
	 * @return the effectiveFrom
	 */
	public Date getEffectiveFrom()
	{
		return getEffectiveFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVEFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.effectiveFrom</code> attribute. 
	 * @param value the effectiveFrom
	 */
	public void setEffectiveFrom(final Date value)
	{
		setEffectiveFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.effectiveTo</code> attribute.
	 * @return the effectiveTo
	 */
	public Date getEffectiveTo(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, EFFECTIVETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.effectiveTo</code> attribute.
	 * @return the effectiveTo
	 */
	public Date getEffectiveTo()
	{
		return getEffectiveTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.effectiveTo</code> attribute. 
	 * @param value the effectiveTo
	 */
	public void setEffectiveTo(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, EFFECTIVETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.effectiveTo</code> attribute. 
	 * @param value the effectiveTo
	 */
	public void setEffectiveTo(final Date value)
	{
		setEffectiveTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.grade</code> attribute.
	 * @return the grade
	 */
	public Set<EnumerationValue> getGrade(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)GRADEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.grade</code> attribute.
	 * @return the grade
	 */
	public Set<EnumerationValue> getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		GRADEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final Set<EnumerationValue> value)
	{
		setGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to grade. 
	 * @param value the item to add to grade
	 */
	public void addToGrade(final SessionContext ctx, final EnumerationValue value)
	{
		GRADEHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to grade. 
	 * @param value the item to add to grade
	 */
	public void addToGrade(final EnumerationValue value)
	{
		addToGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from grade. 
	 * @param value the item to remove from grade
	 */
	public void removeFromGrade(final SessionContext ctx, final EnumerationValue value)
	{
		GRADEHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from grade. 
	 * @param value the item to remove from grade
	 */
	public void removeFromGrade(final EnumerationValue value)
	{
		removeFromGrade( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.listConstruct</code> attribute.
	 * @return the listConstruct
	 */
	public Collection<String> getListConstruct(final SessionContext ctx)
	{
		Collection<String> coll = (Collection<String>)getProperty( ctx, LISTCONSTRUCT);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.listConstruct</code> attribute.
	 * @return the listConstruct
	 */
	public Collection<String> getListConstruct()
	{
		return getListConstruct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.listConstruct</code> attribute. 
	 * @param value the listConstruct
	 */
	public void setListConstruct(final SessionContext ctx, final Collection<String> value)
	{
		setProperty(ctx, LISTCONSTRUCT,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.listConstruct</code> attribute. 
	 * @param value the listConstruct
	 */
	public void setListConstruct(final Collection<String> value)
	{
		setListConstruct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.locations</code> attribute.
	 * @return the locations
	 */
	public Set<Location> getLocations(final SessionContext ctx)
	{
		return (Set<Location>)LOCATIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.locations</code> attribute.
	 * @return the locations
	 */
	public Set<Location> getLocations()
	{
		return getLocations( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.locations</code> attribute. 
	 * @param value the locations
	 */
	public void setLocations(final SessionContext ctx, final Set<Location> value)
	{
		LOCATIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.locations</code> attribute. 
	 * @param value the locations
	 */
	public void setLocations(final Set<Location> value)
	{
		setLocations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to locations. 
	 * @param value the item to add to locations
	 */
	public void addToLocations(final SessionContext ctx, final Location value)
	{
		LOCATIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to locations. 
	 * @param value the item to add to locations
	 */
	public void addToLocations(final Location value)
	{
		addToLocations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from locations. 
	 * @param value the item to remove from locations
	 */
	public void removeFromLocations(final SessionContext ctx, final Location value)
	{
		LOCATIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from locations. 
	 * @param value the item to remove from locations
	 */
	public void removeFromLocations(final Location value)
	{
		removeFromLocations( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.operator</code> attribute.
	 * @return the operator
	 */
	public EnumerationValue getOperator(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, OPERATOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.operator</code> attribute.
	 * @return the operator
	 */
	public EnumerationValue getOperator()
	{
		return getOperator( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.operator</code> attribute. 
	 * @param value the operator
	 */
	public void setOperator(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, OPERATOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.operator</code> attribute. 
	 * @param value the operator
	 */
	public void setOperator(final EnumerationValue value)
	{
		setOperator( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyName</code> attribute.
	 * @return the policyName
	 */
	public String getPolicyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, POLICYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyName</code> attribute.
	 * @return the policyName
	 */
	public String getPolicyName()
	{
		return getPolicyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyName</code> attribute. 
	 * @param value the policyName
	 */
	public void setPolicyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, POLICYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyName</code> attribute. 
	 * @param value the policyName
	 */
	public void setPolicyName(final String value)
	{
		setPolicyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyParameterName</code> attribute.
	 * @return the policyParameterName
	 */
	public EnumerationValue getPolicyParameterName(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, POLICYPARAMETERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyParameterName</code> attribute.
	 * @return the policyParameterName
	 */
	public EnumerationValue getPolicyParameterName()
	{
		return getPolicyParameterName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyParameterName</code> attribute. 
	 * @param value the policyParameterName
	 */
	public void setPolicyParameterName(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, POLICYPARAMETERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyParameterName</code> attribute. 
	 * @param value the policyParameterName
	 */
	public void setPolicyParameterName(final EnumerationValue value)
	{
		setPolicyParameterName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyProduct</code> attribute.
	 * @return the policyProduct
	 */
	public Product getPolicyProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, POLICYPRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.policyProduct</code> attribute.
	 * @return the policyProduct
	 */
	public Product getPolicyProduct()
	{
		return getPolicyProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyProduct</code> attribute. 
	 * @param value the policyProduct
	 */
	public void setPolicyProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, POLICYPRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.policyProduct</code> attribute. 
	 * @param value the policyProduct
	 */
	public void setPolicyProduct(final Product value)
	{
		setPolicyProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.value</code> attribute.
	 * @return the value
	 */
	public Double getValue(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.value</code> attribute.
	 * @return the value
	 */
	public Double getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive(final SessionContext ctx)
	{
		Double value = getValue( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @return the value
	 */
	public double getValueAsPrimitive()
	{
		return getValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final Double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final double value)
	{
		setValue( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final double value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.valueTo</code> attribute.
	 * @return the valueTo
	 */
	public Double getValueTo(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, VALUETO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.valueTo</code> attribute.
	 * @return the valueTo
	 */
	public Double getValueTo()
	{
		return getValueTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @return the valueTo
	 */
	public double getValueToAsPrimitive(final SessionContext ctx)
	{
		Double value = getValueTo( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @return the valueTo
	 */
	public double getValueToAsPrimitive()
	{
		return getValueToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, VALUETO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final Double value)
	{
		setValueTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final SessionContext ctx, final double value)
	{
		setValueTo( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.valueTo</code> attribute. 
	 * @param value the valueTo
	 */
	public void setValueTo(final double value)
	{
		setValueTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.versionDetails</code> attribute.
	 * @return the versionDetails
	 */
	public Set<VersionDetail> getVersionDetails(final SessionContext ctx)
	{
		return (Set<VersionDetail>)VERSIONDETAILSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CorporateTravelPolicy.versionDetails</code> attribute.
	 * @return the versionDetails
	 */
	public Set<VersionDetail> getVersionDetails()
	{
		return getVersionDetails( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.versionDetails</code> attribute. 
	 * @param value the versionDetails
	 */
	public void setVersionDetails(final SessionContext ctx, final Set<VersionDetail> value)
	{
		VERSIONDETAILSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CorporateTravelPolicy.versionDetails</code> attribute. 
	 * @param value the versionDetails
	 */
	public void setVersionDetails(final Set<VersionDetail> value)
	{
		setVersionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetails. 
	 * @param value the item to add to versionDetails
	 */
	public void addToVersionDetails(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to versionDetails. 
	 * @param value the item to add to versionDetails
	 */
	public void addToVersionDetails(final VersionDetail value)
	{
		addToVersionDetails( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetails. 
	 * @param value the item to remove from versionDetails
	 */
	public void removeFromVersionDetails(final SessionContext ctx, final VersionDetail value)
	{
		VERSIONDETAILSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from versionDetails. 
	 * @param value the item to remove from versionDetails
	 */
	public void removeFromVersionDetails(final VersionDetail value)
	{
		removeFromVersionDetails( getSession().getSessionContext(), value );
	}
	
}
