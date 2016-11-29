/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.masterdata.core.policy;

import com.cnk.travelogix.supplier.masterdata.core.policy.AbstractDynamicPolicy;
import com.cnk.travelogix.supplier.masters.core.constants.SuppliermasterscoreConstants;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.TransportationDynamicPolicy TransportationDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTransportationDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>TransportationDynamicPolicy.perAdult</code> attribute **/
	public static final String PERADULT = "perAdult";
	/** Qualifier of the <code>TransportationDynamicPolicy.perChild</code> attribute **/
	public static final String PERCHILD = "perChild";
	/** Qualifier of the <code>TransportationDynamicPolicy.perPerson</code> attribute **/
	public static final String PERPERSON = "perPerson";
	/** Qualifier of the <code>TransportationDynamicPolicy.perVehicle</code> attribute **/
	public static final String PERVEHICLE = "perVehicle";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERADULT, AttributeMode.INITIAL);
		tmp.put(PERCHILD, AttributeMode.INITIAL);
		tmp.put(PERPERSON, AttributeMode.INITIAL);
		tmp.put(PERVEHICLE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult()
	{
		return isPerAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerAdult( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive()
	{
		return isPerAdultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final Boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final boolean value)
	{
		setPerAdult( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild()
	{
		return isPerChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerChild( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive()
	{
		return isPerChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final Boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final boolean value)
	{
		setPerChild( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson()
	{
		return isPerPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerPerson( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive()
	{
		return isPerPersonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final Boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final boolean value)
	{
		setPerPerson( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute.
	 * @return the perVehicle
	 */
	public Boolean isPerVehicle(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERVEHICLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute.
	 * @return the perVehicle
	 */
	public Boolean isPerVehicle()
	{
		return isPerVehicle( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @return the perVehicle
	 */
	public boolean isPerVehicleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerVehicle( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @return the perVehicle
	 */
	public boolean isPerVehicleAsPrimitive()
	{
		return isPerVehicleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @param value the perVehicle
	 */
	public void setPerVehicle(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERVEHICLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @param value the perVehicle
	 */
	public void setPerVehicle(final Boolean value)
	{
		setPerVehicle( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @param value the perVehicle
	 */
	public void setPerVehicle(final SessionContext ctx, final boolean value)
	{
		setPerVehicle( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TransportationDynamicPolicy.perVehicle</code> attribute. 
	 * @param value the perVehicle
	 */
	public void setPerVehicle(final boolean value)
	{
		setPerVehicle( getSession().getSessionContext(), value );
	}
	
}
