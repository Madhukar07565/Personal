/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.mdmbackoffice.process.jalo;

import com.cnk.travelogix.mdmbackoffice.constants.MdmbackofficeConstants;
import de.hybris.platform.commerceservices.jalo.process.StoreFrontProcess;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.user.Employee;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.mdmbackoffice.process.jalo.EmployeeRegistrationProcess EmployeeRegistrationProcess}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedEmployeeRegistrationProcess extends StoreFrontProcess
{
	/** Qualifier of the <code>EmployeeRegistrationProcess.employee</code> attribute **/
	public static final String EMPLOYEE = "employee";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(StoreFrontProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EMPLOYEE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeRegistrationProcess.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee(final SessionContext ctx)
	{
		return (Employee)getProperty( ctx, EMPLOYEE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>EmployeeRegistrationProcess.employee</code> attribute.
	 * @return the employee
	 */
	public Employee getEmployee()
	{
		return getEmployee( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeRegistrationProcess.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final SessionContext ctx, final Employee value)
	{
		setProperty(ctx, EMPLOYEE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>EmployeeRegistrationProcess.employee</code> attribute. 
	 * @param value the employee
	 */
	public void setEmployee(final Employee value)
	{
		setEmployee( getSession().getSessionContext(), value );
	}
	
}
