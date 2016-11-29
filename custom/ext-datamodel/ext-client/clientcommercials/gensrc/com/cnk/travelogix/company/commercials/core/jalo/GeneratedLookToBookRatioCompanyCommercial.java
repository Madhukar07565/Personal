/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.AbstractLookToBookCompanyCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.LookToBookRatioCompanyCommercial LookToBookRatioCompanyCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedLookToBookRatioCompanyCommercial extends AbstractLookToBookCompanyCommercial
{
	/** Qualifier of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute **/
	public static final String LOOKFROMRATIO = "lookFromRatio";
	/** Qualifier of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute **/
	public static final String LOOKTORATIO = "lookToRatio";
	/** Qualifier of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute **/
	public static final String BOOKRATIO = "bookRatio";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractLookToBookCompanyCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(LOOKFROMRATIO, AttributeMode.INITIAL);
		tmp.put(LOOKTORATIO, AttributeMode.INITIAL);
		tmp.put(BOOKRATIO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute.
	 * @return the bookRatio
	 */
	public Double getBookRatio(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BOOKRATIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute.
	 * @return the bookRatio
	 */
	public Double getBookRatio()
	{
		return getBookRatio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @return the bookRatio
	 */
	public double getBookRatioAsPrimitive(final SessionContext ctx)
	{
		Double value = getBookRatio( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @return the bookRatio
	 */
	public double getBookRatioAsPrimitive()
	{
		return getBookRatioAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BOOKRATIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final Double value)
	{
		setBookRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final SessionContext ctx, final double value)
	{
		setBookRatio( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.bookRatio</code> attribute. 
	 * @param value the bookRatio
	 */
	public void setBookRatio(final double value)
	{
		setBookRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute.
	 * @return the lookFromRatio
	 */
	public Double getLookFromRatio(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LOOKFROMRATIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute.
	 * @return the lookFromRatio
	 */
	public Double getLookFromRatio()
	{
		return getLookFromRatio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @return the lookFromRatio
	 */
	public double getLookFromRatioAsPrimitive(final SessionContext ctx)
	{
		Double value = getLookFromRatio( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @return the lookFromRatio
	 */
	public double getLookFromRatioAsPrimitive()
	{
		return getLookFromRatioAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @param value the lookFromRatio
	 */
	public void setLookFromRatio(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LOOKFROMRATIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @param value the lookFromRatio
	 */
	public void setLookFromRatio(final Double value)
	{
		setLookFromRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @param value the lookFromRatio
	 */
	public void setLookFromRatio(final SessionContext ctx, final double value)
	{
		setLookFromRatio( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookFromRatio</code> attribute. 
	 * @param value the lookFromRatio
	 */
	public void setLookFromRatio(final double value)
	{
		setLookFromRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute.
	 * @return the lookToRatio
	 */
	public Double getLookToRatio(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, LOOKTORATIO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute.
	 * @return the lookToRatio
	 */
	public Double getLookToRatio()
	{
		return getLookToRatio( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @return the lookToRatio
	 */
	public double getLookToRatioAsPrimitive(final SessionContext ctx)
	{
		Double value = getLookToRatio( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @return the lookToRatio
	 */
	public double getLookToRatioAsPrimitive()
	{
		return getLookToRatioAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @param value the lookToRatio
	 */
	public void setLookToRatio(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, LOOKTORATIO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @param value the lookToRatio
	 */
	public void setLookToRatio(final Double value)
	{
		setLookToRatio( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @param value the lookToRatio
	 */
	public void setLookToRatio(final SessionContext ctx, final double value)
	{
		setLookToRatio( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>LookToBookRatioCompanyCommercial.lookToRatio</code> attribute. 
	 * @param value the lookToRatio
	 */
	public void setLookToRatio(final double value)
	{
		setLookToRatio( getSession().getSessionContext(), value );
	}
	
}
