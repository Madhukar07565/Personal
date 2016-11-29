/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.operation.tds.jalo;

import com.cnk.travelogix.operation.constants.OperationmastercoreConstants;
import com.cnk.travelogix.operation.tds.jalo.TDSMaster;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Country;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.tds.jalo.AbstractTDSRule AbstractTDSRule}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAbstractTDSRule extends GenericItem
{
	/** Qualifier of the <code>AbstractTDSRule.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>AbstractTDSRule.country</code> attribute **/
	public static final String COUNTRY = "country";
	/** Qualifier of the <code>AbstractTDSRule.isIncluded</code> attribute **/
	public static final String ISINCLUDED = "isIncluded";
	/** Qualifier of the <code>AbstractTDSRule.tdsMaster</code> attribute **/
	public static final String TDSMASTER = "tdsMaster";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n TDSMASTER's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedAbstractTDSRule> TDSMASTERHANDLER = new BidirectionalOneToManyHandler<GeneratedAbstractTDSRule>(
	OperationmastercoreConstants.TC.ABSTRACTTDSRULE,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(COUNTRY, AttributeMode.INITIAL);
		tmp.put(ISINCLUDED, AttributeMode.INITIAL);
		tmp.put(TDSMASTER, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry(final SessionContext ctx)
	{
		return (Country)getProperty( ctx, COUNTRY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.country</code> attribute.
	 * @return the country
	 */
	public Country getCountry()
	{
		return getCountry( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final SessionContext ctx, final Country value)
	{
		setProperty(ctx, COUNTRY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.country</code> attribute. 
	 * @param value the country
	 */
	public void setCountry(final Country value)
	{
		setCountry( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		TDSMASTERHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.isIncluded</code> attribute.
	 * @return the isIncluded
	 */
	public Boolean isIsIncluded(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ISINCLUDED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.isIncluded</code> attribute.
	 * @return the isIncluded
	 */
	public Boolean isIsIncluded()
	{
		return isIsIncluded( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @return the isIncluded
	 */
	public boolean isIsIncludedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isIsIncluded( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @return the isIncluded
	 */
	public boolean isIsIncludedAsPrimitive()
	{
		return isIsIncludedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @param value the isIncluded
	 */
	public void setIsIncluded(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ISINCLUDED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @param value the isIncluded
	 */
	public void setIsIncluded(final Boolean value)
	{
		setIsIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @param value the isIncluded
	 */
	public void setIsIncluded(final SessionContext ctx, final boolean value)
	{
		setIsIncluded( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.isIncluded</code> attribute. 
	 * @param value the isIncluded
	 */
	public void setIsIncluded(final boolean value)
	{
		setIsIncluded( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster(final SessionContext ctx)
	{
		return (TDSMaster)getProperty( ctx, TDSMASTER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AbstractTDSRule.tdsMaster</code> attribute.
	 * @return the tdsMaster
	 */
	public TDSMaster getTdsMaster()
	{
		return getTdsMaster( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final SessionContext ctx, final TDSMaster value)
	{
		TDSMASTERHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AbstractTDSRule.tdsMaster</code> attribute. 
	 * @param value the tdsMaster
	 */
	public void setTdsMaster(final TDSMaster value)
	{
		setTdsMaster( getSession().getSessionContext(), value );
	}
	
}
