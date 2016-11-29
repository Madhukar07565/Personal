/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.rates.supplierrate.jalo.common;

import com.cnk.travelogix.supplier.rates.constants.SupplierratedefinitionscoreConstants;
import com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.AgeDetail;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.rates.supplierrate.jalo.common.ChildAgeDetail ChildAgeDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedChildAgeDetail extends GenericItem
{
	/** Qualifier of the <code>ChildAgeDetail.ageDetail</code> attribute **/
	public static final String AGEDETAIL = "ageDetail";
	/** Qualifier of the <code>ChildAgeDetail.childBedType</code> attribute **/
	public static final String CHILDBEDTYPE = "childBedType";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(AGEDETAIL, AttributeMode.INITIAL);
		tmp.put(CHILDBEDTYPE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail(final SessionContext ctx)
	{
		return (AgeDetail)getProperty( ctx, AGEDETAIL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.ageDetail</code> attribute.
	 * @return the ageDetail
	 */
	public AgeDetail getAgeDetail()
	{
		return getAgeDetail( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final SessionContext ctx, final AgeDetail value)
	{
		setProperty(ctx, AGEDETAIL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.ageDetail</code> attribute. 
	 * @param value the ageDetail
	 */
	public void setAgeDetail(final AgeDetail value)
	{
		setAgeDetail( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.childBedType</code> attribute.
	 * @return the childBedType
	 */
	public EnumerationValue getChildBedType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, CHILDBEDTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ChildAgeDetail.childBedType</code> attribute.
	 * @return the childBedType
	 */
	public EnumerationValue getChildBedType()
	{
		return getChildBedType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.childBedType</code> attribute. 
	 * @param value the childBedType
	 */
	public void setChildBedType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, CHILDBEDTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ChildAgeDetail.childBedType</code> attribute. 
	 * @param value the childBedType
	 */
	public void setChildBedType(final EnumerationValue value)
	{
		setChildBedType( getSession().getSessionContext(), value );
	}
	
}
