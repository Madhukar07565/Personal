/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo;

import com.cnk.travelogix.masterdata.core.products.jalo.FareComponent;
import com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.SupplierFOCCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.advanced.foc.jalo.FOCRecord FOCRecord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFOCRecord extends GenericItem
{
	/** Qualifier of the <code>FOCRecord.slab</code> attribute **/
	public static final String SLAB = "slab";
	/** Qualifier of the <code>FOCRecord.fareComponent</code> attribute **/
	public static final String FARECOMPONENT = "fareComponent";
	/** Qualifier of the <code>FOCRecord.slabtype</code> attribute **/
	public static final String SLABTYPE = "slabtype";
	/** Qualifier of the <code>FOCRecord.fromValue</code> attribute **/
	public static final String FROMVALUE = "fromValue";
	/** Qualifier of the <code>FOCRecord.fromValueInWords</code> attribute **/
	public static final String FROMVALUEINWORDS = "fromValueInWords";
	/** Qualifier of the <code>FOCRecord.toValue</code> attribute **/
	public static final String TOVALUE = "toValue";
	/** Qualifier of the <code>FOCRecord.toValueInWords</code> attribute **/
	public static final String TOVALUEINWORDS = "toValueInWords";
	/** Qualifier of the <code>FOCRecord.runningEvery</code> attribute **/
	public static final String RUNNINGEVERY = "runningEvery";
	/** Qualifier of the <code>FOCRecord.runningType</code> attribute **/
	public static final String RUNNINGTYPE = "runningType";
	/** Qualifier of the <code>FOCRecord.focByPercentage</code> attribute **/
	public static final String FOCBYPERCENTAGE = "focByPercentage";
	/** Qualifier of the <code>FOCRecord.noOfUpgrades</code> attribute **/
	public static final String NOOFUPGRADES = "noOfUpgrades";
	/** Qualifier of the <code>FOCRecord.product</code> attribute **/
	public static final String PRODUCT = "product";
	/** Qualifier of the <code>FOCRecord.passengerType</code> attribute **/
	public static final String PASSENGERTYPE = "passengerType";
	/** Qualifier of the <code>FOCRecord.focCommercialRecord</code> attribute **/
	public static final String FOCCOMMERCIALRECORD = "focCommercialRecord";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n FOCCOMMERCIALRECORD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFOCRecord> FOCCOMMERCIALRECORDHANDLER = new BidirectionalOneToManyHandler<GeneratedFOCRecord>(
	SuppliercommercialscoreConstants.TC.FOCRECORD,
	false,
	"focCommercialRecord",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SLAB, AttributeMode.INITIAL);
		tmp.put(FARECOMPONENT, AttributeMode.INITIAL);
		tmp.put(SLABTYPE, AttributeMode.INITIAL);
		tmp.put(FROMVALUE, AttributeMode.INITIAL);
		tmp.put(FROMVALUEINWORDS, AttributeMode.INITIAL);
		tmp.put(TOVALUE, AttributeMode.INITIAL);
		tmp.put(TOVALUEINWORDS, AttributeMode.INITIAL);
		tmp.put(RUNNINGEVERY, AttributeMode.INITIAL);
		tmp.put(RUNNINGTYPE, AttributeMode.INITIAL);
		tmp.put(FOCBYPERCENTAGE, AttributeMode.INITIAL);
		tmp.put(NOOFUPGRADES, AttributeMode.INITIAL);
		tmp.put(PRODUCT, AttributeMode.INITIAL);
		tmp.put(PASSENGERTYPE, AttributeMode.INITIAL);
		tmp.put(FOCCOMMERCIALRECORD, AttributeMode.INITIAL);
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
		FOCCOMMERCIALRECORDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent(final SessionContext ctx)
	{
		return (FareComponent)getProperty( ctx, FARECOMPONENT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fareComponent</code> attribute.
	 * @return the fareComponent
	 */
	public FareComponent getFareComponent()
	{
		return getFareComponent( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final SessionContext ctx, final FareComponent value)
	{
		setProperty(ctx, FARECOMPONENT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fareComponent</code> attribute. 
	 * @param value the fareComponent
	 */
	public void setFareComponent(final FareComponent value)
	{
		setFareComponent( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focByPercentage</code> attribute.
	 * @return the focByPercentage
	 */
	public Integer getFocByPercentage(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FOCBYPERCENTAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focByPercentage</code> attribute.
	 * @return the focByPercentage
	 */
	public Integer getFocByPercentage()
	{
		return getFocByPercentage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @return the focByPercentage
	 */
	public int getFocByPercentageAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFocByPercentage( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @return the focByPercentage
	 */
	public int getFocByPercentageAsPrimitive()
	{
		return getFocByPercentageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @param value the focByPercentage
	 */
	public void setFocByPercentage(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FOCBYPERCENTAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @param value the focByPercentage
	 */
	public void setFocByPercentage(final Integer value)
	{
		setFocByPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @param value the focByPercentage
	 */
	public void setFocByPercentage(final SessionContext ctx, final int value)
	{
		setFocByPercentage( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focByPercentage</code> attribute. 
	 * @param value the focByPercentage
	 */
	public void setFocByPercentage(final int value)
	{
		setFocByPercentage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focCommercialRecord</code> attribute.
	 * @return the focCommercialRecord
	 */
	public SupplierFOCCommercialRecord getFocCommercialRecord(final SessionContext ctx)
	{
		return (SupplierFOCCommercialRecord)getProperty( ctx, FOCCOMMERCIALRECORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.focCommercialRecord</code> attribute.
	 * @return the focCommercialRecord
	 */
	public SupplierFOCCommercialRecord getFocCommercialRecord()
	{
		return getFocCommercialRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focCommercialRecord</code> attribute. 
	 * @param value the focCommercialRecord
	 */
	public void setFocCommercialRecord(final SessionContext ctx, final SupplierFOCCommercialRecord value)
	{
		FOCCOMMERCIALRECORDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.focCommercialRecord</code> attribute. 
	 * @param value the focCommercialRecord
	 */
	public void setFocCommercialRecord(final SupplierFOCCommercialRecord value)
	{
		setFocCommercialRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public Integer getFromValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, FROMVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValue</code> attribute.
	 * @return the fromValue
	 */
	public Integer getFromValue()
	{
		return getFromValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @return the fromValue
	 */
	public int getFromValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getFromValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @return the fromValue
	 */
	public int getFromValueAsPrimitive()
	{
		return getFromValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, FROMVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final Integer value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final SessionContext ctx, final int value)
	{
		setFromValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValue</code> attribute. 
	 * @param value the fromValue
	 */
	public void setFromValue(final int value)
	{
		setFromValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValueInWords</code> attribute.
	 * @return the fromValueInWords
	 */
	public String getFromValueInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FROMVALUEINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.fromValueInWords</code> attribute.
	 * @return the fromValueInWords
	 */
	public String getFromValueInWords()
	{
		return getFromValueInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValueInWords</code> attribute. 
	 * @param value the fromValueInWords
	 */
	public void setFromValueInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FROMVALUEINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.fromValueInWords</code> attribute. 
	 * @param value the fromValueInWords
	 */
	public void setFromValueInWords(final String value)
	{
		setFromValueInWords( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.noOfUpgrades</code> attribute.
	 * @return the noOfUpgrades
	 */
	public Integer getNoOfUpgrades(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, NOOFUPGRADES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.noOfUpgrades</code> attribute.
	 * @return the noOfUpgrades
	 */
	public Integer getNoOfUpgrades()
	{
		return getNoOfUpgrades( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @return the noOfUpgrades
	 */
	public int getNoOfUpgradesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getNoOfUpgrades( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @return the noOfUpgrades
	 */
	public int getNoOfUpgradesAsPrimitive()
	{
		return getNoOfUpgradesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @param value the noOfUpgrades
	 */
	public void setNoOfUpgrades(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, NOOFUPGRADES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @param value the noOfUpgrades
	 */
	public void setNoOfUpgrades(final Integer value)
	{
		setNoOfUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @param value the noOfUpgrades
	 */
	public void setNoOfUpgrades(final SessionContext ctx, final int value)
	{
		setNoOfUpgrades( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.noOfUpgrades</code> attribute. 
	 * @param value the noOfUpgrades
	 */
	public void setNoOfUpgrades(final int value)
	{
		setNoOfUpgrades( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PASSENGERTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.passengerType</code> attribute.
	 * @return the passengerType
	 */
	public EnumerationValue getPassengerType()
	{
		return getPassengerType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PASSENGERTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.passengerType</code> attribute. 
	 * @param value the passengerType
	 */
	public void setPassengerType(final EnumerationValue value)
	{
		setPassengerType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct(final SessionContext ctx)
	{
		return (Product)getProperty( ctx, PRODUCT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.product</code> attribute.
	 * @return the product
	 */
	public Product getProduct()
	{
		return getProduct( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final SessionContext ctx, final Product value)
	{
		setProperty(ctx, PRODUCT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.product</code> attribute. 
	 * @param value the product
	 */
	public void setProduct(final Product value)
	{
		setProduct( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.runningEvery</code> attribute.
	 * @return the runningEvery
	 */
	public String getRunningEvery(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RUNNINGEVERY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.runningEvery</code> attribute.
	 * @return the runningEvery
	 */
	public String getRunningEvery()
	{
		return getRunningEvery( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.runningEvery</code> attribute. 
	 * @param value the runningEvery
	 */
	public void setRunningEvery(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RUNNINGEVERY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.runningEvery</code> attribute. 
	 * @param value the runningEvery
	 */
	public void setRunningEvery(final String value)
	{
		setRunningEvery( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.runningType</code> attribute.
	 * @return the runningType
	 */
	public EnumerationValue getRunningType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, RUNNINGTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.runningType</code> attribute.
	 * @return the runningType
	 */
	public EnumerationValue getRunningType()
	{
		return getRunningType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.runningType</code> attribute. 
	 * @param value the runningType
	 */
	public void setRunningType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, RUNNINGTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.runningType</code> attribute. 
	 * @param value the runningType
	 */
	public void setRunningType(final EnumerationValue value)
	{
		setRunningType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slab</code> attribute.
	 * @return the slab
	 */
	public Boolean isSlab(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SLAB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slab</code> attribute.
	 * @return the slab
	 */
	public Boolean isSlab()
	{
		return isSlab( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slab</code> attribute. 
	 * @return the slab
	 */
	public boolean isSlabAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSlab( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slab</code> attribute. 
	 * @return the slab
	 */
	public boolean isSlabAsPrimitive()
	{
		return isSlabAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SLAB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final Boolean value)
	{
		setSlab( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final SessionContext ctx, final boolean value)
	{
		setSlab( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slab</code> attribute. 
	 * @param value the slab
	 */
	public void setSlab(final boolean value)
	{
		setSlab( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slabtype</code> attribute.
	 * @return the slabtype
	 */
	public EnumerationValue getSlabtype(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, SLABTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.slabtype</code> attribute.
	 * @return the slabtype
	 */
	public EnumerationValue getSlabtype()
	{
		return getSlabtype( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slabtype</code> attribute. 
	 * @param value the slabtype
	 */
	public void setSlabtype(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, SLABTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.slabtype</code> attribute. 
	 * @param value the slabtype
	 */
	public void setSlabtype(final EnumerationValue value)
	{
		setSlabtype( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValue</code> attribute.
	 * @return the toValue
	 */
	public Integer getToValue(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, TOVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValue</code> attribute.
	 * @return the toValue
	 */
	public Integer getToValue()
	{
		return getToValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValue</code> attribute. 
	 * @return the toValue
	 */
	public int getToValueAsPrimitive(final SessionContext ctx)
	{
		Integer value = getToValue( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValue</code> attribute. 
	 * @return the toValue
	 */
	public int getToValueAsPrimitive()
	{
		return getToValueAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, TOVALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final Integer value)
	{
		setToValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final SessionContext ctx, final int value)
	{
		setToValue( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValue</code> attribute. 
	 * @param value the toValue
	 */
	public void setToValue(final int value)
	{
		setToValue( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValueInWords</code> attribute.
	 * @return the toValueInWords
	 */
	public String getToValueInWords(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOVALUEINWORDS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FOCRecord.toValueInWords</code> attribute.
	 * @return the toValueInWords
	 */
	public String getToValueInWords()
	{
		return getToValueInWords( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValueInWords</code> attribute. 
	 * @param value the toValueInWords
	 */
	public void setToValueInWords(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOVALUEINWORDS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FOCRecord.toValueInWords</code> attribute. 
	 * @param value the toValueInWords
	 */
	public void setToValueInWords(final String value)
	{
		setToValueInWords( getSession().getSessionContext(), value );
	}
	
}
