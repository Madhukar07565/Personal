/**
 *
 */
package com.cnk.travelogix.mdmbackoffice.interceptor;

import de.hybris.platform.core.model.user.EmployeeModel;
import de.hybris.platform.servicelayer.interceptor.InterceptorContext;
import de.hybris.platform.servicelayer.interceptor.InterceptorException;
import de.hybris.platform.servicelayer.interceptor.ValidateInterceptor;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * This Class is used for validate the unique value of contactEmail attribute of Employee. If value is not unique system
 * will generate Error message Employee contactEmail already Used Please another one.
 *
 * @author C5244543-Shivraj
 *
 *
 */
public class EmployeeEmailUniqueValueValidateInterceptor implements ValidateInterceptor<EmployeeModel>
{

	@Autowired
	private FlexibleSearchService flexibleSearchService;

	/**
	 * @param employee
	 * @param ctx
	 * @throws InterceptorException
	 */
	@Override
	public void onValidate(final EmployeeModel employee, final InterceptorContext ctx) throws InterceptorException
	{
		boolean flag = false;
		if (employee != null)
		{
			flag = isUniqueContactEmail(employee.getUid(), employee.getContactEmail());
		}

		if (flag == true)
		{
			throw new InterceptorException("Employee contactEmail already Used Please another one. ");

		}
	}

	/**
	 *
	 * @param contactEmail
	 *           if contactEmail attribute value is used already in other employee then
	 * @return true else
	 * @return false
	 */
	public boolean isUniqueContactEmail(final String uid, final String contactEmail)
	{
		final String query = "Select {PK} from {Employee as e} where {e.uid} !='" + uid + "' AND {e.contactEmail} ='" + contactEmail
				+ "'";
		final FlexibleSearchQuery flexibleSearchQuery = new FlexibleSearchQuery(query);
		final List<Object> employees = flexibleSearchService.search(flexibleSearchQuery).getResult();
		if (employees != null && employees.size() > 0)
		{
			return true;
		}
		return false;
	}
}
