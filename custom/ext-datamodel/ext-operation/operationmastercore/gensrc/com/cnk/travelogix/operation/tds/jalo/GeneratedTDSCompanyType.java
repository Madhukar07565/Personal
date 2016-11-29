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
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.Utilities;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.operation.tds.jalo.TDSCompanyType TDSCompanyType}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTDSCompanyType extends GenericItem
{
	/** Qualifier of the <code>TDSCompanyType.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>TDSCompanyType.value</code> attribute **/
	public static final String VALUE = "value";
	/** Qualifier of the <code>TDSCompanyType.tdsMasters</code> attribute **/
	public static final String TDSMASTERS = "tdsMasters";
	/** Relation ordering override parameter constants for TDSMaster2TDSCompanyTypeREL from ((operationmastercore))*/
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_SRC_ORDERED = "relation.TDSMaster2TDSCompanyTypeREL.source.ordered";
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_TGT_ORDERED = "relation.TDSMaster2TDSCompanyTypeREL.target.ordered";
	/** Relation disable markmodifed parameter constants for TDSMaster2TDSCompanyTypeREL from ((operationmastercore))*/
	protected static String TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED = "relation.TDSMaster2TDSCompanyTypeREL.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(VALUE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.code</code> attribute.
	 * @return the code
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.code</code> attribute.
	 * @return the code
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.code</code> attribute. 
	 * @param value the code
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.tdsMasters</code> attribute.
	 * @return the tdsMasters
	 */
	public Collection<TDSMaster> getTdsMasters(final SessionContext ctx)
	{
		final List<TDSMaster> items = getLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			"TDSMaster",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.tdsMasters</code> attribute.
	 * @return the tdsMasters
	 */
	public Collection<TDSMaster> getTdsMasters()
	{
		return getTdsMasters( getSession().getSessionContext() );
	}
	
	public long getTdsMastersCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			"TDSMaster",
			null
		);
	}
	
	public long getTdsMastersCount()
	{
		return getTdsMastersCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.tdsMasters</code> attribute. 
	 * @param value the tdsMasters
	 */
	public void setTdsMasters(final SessionContext ctx, final Collection<TDSMaster> value)
	{
		setLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.tdsMasters</code> attribute. 
	 * @param value the tdsMasters
	 */
	public void setTdsMasters(final Collection<TDSMaster> value)
	{
		setTdsMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsMasters. 
	 * @param value the item to add to tdsMasters
	 */
	public void addToTdsMasters(final SessionContext ctx, final TDSMaster value)
	{
		addLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to tdsMasters. 
	 * @param value the item to add to tdsMasters
	 */
	public void addToTdsMasters(final TDSMaster value)
	{
		addToTdsMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsMasters. 
	 * @param value the item to remove from tdsMasters
	 */
	public void removeFromTdsMasters(final SessionContext ctx, final TDSMaster value)
	{
		removeLinkedItems( 
			ctx,
			false,
			OperationmastercoreConstants.Relations.TDSMASTER2TDSCOMPANYTYPEREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(TDSMASTER2TDSCOMPANYTYPEREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from tdsMasters. 
	 * @param value the item to remove from tdsMasters
	 */
	public void removeFromTdsMasters(final TDSMaster value)
	{
		removeFromTdsMasters( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.value</code> attribute.
	 * @return the value
	 */
	public String getValue(final SessionContext ctx)
	{
		return (String)getProperty( ctx, VALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TDSCompanyType.value</code> attribute.
	 * @return the value
	 */
	public String getValue()
	{
		return getValue( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final SessionContext ctx, final String value)
	{
		setProperty(ctx, VALUE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TDSCompanyType.value</code> attribute. 
	 * @param value the value
	 */
	public void setValue(final String value)
	{
		setValue( getSession().getSessionContext(), value );
	}
	
}
