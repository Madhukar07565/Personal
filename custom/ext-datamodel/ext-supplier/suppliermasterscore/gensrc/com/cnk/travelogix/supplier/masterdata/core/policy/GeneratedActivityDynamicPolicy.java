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
 * Generated class for type {@link com.cnk.travelogix.supplier.masterdata.core.policy.ActivityDynamicPolicy ActivityDynamicPolicy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedActivityDynamicPolicy extends AbstractDynamicPolicy
{
	/** Qualifier of the <code>ActivityDynamicPolicy.perPerson</code> attribute **/
	public static final String PERPERSON = "perPerson";
	/** Qualifier of the <code>ActivityDynamicPolicy.perAdult</code> attribute **/
	public static final String PERADULT = "perAdult";
	/** Qualifier of the <code>ActivityDynamicPolicy.perChild</code> attribute **/
	public static final String PERCHILD = "perChild";
	/** Qualifier of the <code>ActivityDynamicPolicy.perInfant</code> attribute **/
	public static final String PERINFANT = "perInfant";
	/** Qualifier of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute **/
	public static final String ALLPAXTYPES = "allPaxTypes";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractDynamicPolicy.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PERPERSON, AttributeMode.INITIAL);
		tmp.put(PERADULT, AttributeMode.INITIAL);
		tmp.put(PERCHILD, AttributeMode.INITIAL);
		tmp.put(PERINFANT, AttributeMode.INITIAL);
		tmp.put(ALLPAXTYPES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute.
	 * @return the allPaxTypes
	 */
	public Boolean isAllPaxTypes(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, ALLPAXTYPES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute.
	 * @return the allPaxTypes
	 */
	public Boolean isAllPaxTypes()
	{
		return isAllPaxTypes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @return the allPaxTypes
	 */
	public boolean isAllPaxTypesAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isAllPaxTypes( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @return the allPaxTypes
	 */
	public boolean isAllPaxTypesAsPrimitive()
	{
		return isAllPaxTypesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, ALLPAXTYPES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final Boolean value)
	{
		setAllPaxTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final SessionContext ctx, final boolean value)
	{
		setAllPaxTypes( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.allPaxTypes</code> attribute. 
	 * @param value the allPaxTypes
	 */
	public void setAllPaxTypes(final boolean value)
	{
		setAllPaxTypes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perAdult</code> attribute.
	 * @return the perAdult
	 */
	public Boolean isPerAdult()
	{
		return isPerAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerAdult( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @return the perAdult
	 */
	public boolean isPerAdultAsPrimitive()
	{
		return isPerAdultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final Boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final SessionContext ctx, final boolean value)
	{
		setPerAdult( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perAdult</code> attribute. 
	 * @param value the perAdult
	 */
	public void setPerAdult(final boolean value)
	{
		setPerAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perChild</code> attribute.
	 * @return the perChild
	 */
	public Boolean isPerChild()
	{
		return isPerChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerChild( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @return the perChild
	 */
	public boolean isPerChildAsPrimitive()
	{
		return isPerChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final Boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final SessionContext ctx, final boolean value)
	{
		setPerChild( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perChild</code> attribute. 
	 * @param value the perChild
	 */
	public void setPerChild(final boolean value)
	{
		setPerChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perInfant</code> attribute.
	 * @return the perInfant
	 */
	public Boolean isPerInfant(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERINFANT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perInfant</code> attribute.
	 * @return the perInfant
	 */
	public Boolean isPerInfant()
	{
		return isPerInfant( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @return the perInfant
	 */
	public boolean isPerInfantAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerInfant( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @return the perInfant
	 */
	public boolean isPerInfantAsPrimitive()
	{
		return isPerInfantAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERINFANT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final Boolean value)
	{
		setPerInfant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final SessionContext ctx, final boolean value)
	{
		setPerInfant( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perInfant</code> attribute. 
	 * @param value the perInfant
	 */
	public void setPerInfant(final boolean value)
	{
		setPerInfant( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, PERPERSON);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perPerson</code> attribute.
	 * @return the perPerson
	 */
	public Boolean isPerPerson()
	{
		return isPerPerson( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isPerPerson( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @return the perPerson
	 */
	public boolean isPerPersonAsPrimitive()
	{
		return isPerPersonAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, PERPERSON,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final Boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final SessionContext ctx, final boolean value)
	{
		setPerPerson( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ActivityDynamicPolicy.perPerson</code> attribute. 
	 * @param value the perPerson
	 */
	public void setPerPerson(final boolean value)
	{
		setPerPerson( getSession().getSessionContext(), value );
	}
	
}
