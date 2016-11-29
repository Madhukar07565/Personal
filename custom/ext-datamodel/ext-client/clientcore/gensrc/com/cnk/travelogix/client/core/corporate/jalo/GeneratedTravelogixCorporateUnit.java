/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.client.core.corporate.jalo;

import com.cnk.travelogix.client.core.b2bunit.jalo.TravelogixB2BUnit;
import com.cnk.travelogix.client.core.constants.ClientcoreConstants;
import com.cnk.travelogix.client.core.corporate.jalo.BusinessInformation;
import com.cnk.travelogix.client.core.corporate.jalo.CostCentre;
import com.cnk.travelogix.client.core.corporate.jalo.Designation;
import com.cnk.travelogix.client.core.corporate.jalo.Project;
import com.cnk.travelogix.client.masters.core.constants.ClientmastercoreConstants;
import com.cnk.travelogix.masterdata.core.constants.MasterdatacoreConstants;
import com.cnk.travelogix.masterdata.core.department.jalo.Department;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.client.core.corporate.jalo.TravelogixCorporateUnit TravelogixCorporateUnit}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTravelogixCorporateUnit extends TravelogixB2BUnit
{
	/** Qualifier of the <code>TravelogixCorporateUnit.clientFinanceCode</code> attribute **/
	public static final String CLIENTFINANCECODE = "clientFinanceCode";
	/** Qualifier of the <code>TravelogixCorporateUnit.budget</code> attribute **/
	public static final String BUDGET = "budget";
	/** Qualifier of the <code>TravelogixCorporateUnit.businessInformation</code> attribute **/
	public static final String BUSINESSINFORMATION = "businessInformation";
	/** Qualifier of the <code>TravelogixCorporateUnit.designation</code> attribute **/
	public static final String DESIGNATION = "designation";
	/** Qualifier of the <code>TravelogixCorporateUnit.costCentre</code> attribute **/
	public static final String COSTCENTRE = "costCentre";
	/** Qualifier of the <code>TravelogixCorporateUnit.department</code> attribute **/
	public static final String DEPARTMENT = "department";
	/** Qualifier of the <code>TravelogixCorporateUnit.project</code> attribute **/
	public static final String PROJECT = "project";
	/** Qualifier of the <code>TravelogixCorporateUnit.clientDocument</code> attribute **/
	public static final String CLIENTDOCUMENT = "clientDocument";
	/** Qualifier of the <code>TravelogixCorporateUnit.grade</code> attribute **/
	public static final String GRADE = "grade";
	/** Qualifier of the <code>TravelogixCorporateUnit.bookingInformation</code> attribute **/
	public static final String BOOKINGINFORMATION = "bookingInformation";
	/** Qualifier of the <code>TravelogixCorporateUnit.employmentInformation</code> attribute **/
	public static final String EMPLOYMENTINFORMATION = "employmentInformation";
	/**
	* {@link OneToManyHandler} for handling 1:n BUSINESSINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<BusinessInformation> BUSINESSINFORMATIONHANDLER = new OneToManyHandler<BusinessInformation>(
	ClientcoreConstants.TC.BUSINESSINFORMATION,
	true,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DESIGNATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Designation> DESIGNATIONHANDLER = new OneToManyHandler<Designation>(
	ClientcoreConstants.TC.DESIGNATION,
	true,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n COSTCENTRE's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CostCentre> COSTCENTREHANDLER = new OneToManyHandler<CostCentre>(
	ClientcoreConstants.TC.COSTCENTRE,
	true,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n DEPARTMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Department> DEPARTMENTHANDLER = new OneToManyHandler<Department>(
	MasterdatacoreConstants.TC.DEPARTMENT,
	true,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n PROJECT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Project> PROJECTHANDLER = new OneToManyHandler<Project>(
	ClientcoreConstants.TC.PROJECT,
	true,
	"travelogixCorporateUnit",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n CLIENTDOCUMENT's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> CLIENTDOCUMENTHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.CLIENTDOCUMENT,
	false,
	"travelogixCorporateUnitDoc",
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
	"travelogixCorporateUnitGrade",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKINGINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> BOOKINGINFORMATIONHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.INFORMATION,
	false,
	"travelogixCorporateUnitBookingInfo",
	null,
	false,
	true,
	CollectionType.SET
	);
	/**
	* {@link OneToManyHandler} for handling 1:n EMPLOYMENTINFORMATION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<EnumerationValue> EMPLOYMENTINFORMATIONHANDLER = new OneToManyHandler<EnumerationValue>(
	ClientmastercoreConstants.TC.INFORMATION,
	false,
	"travelogixCorporateUnitEmpInfo",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(TravelogixB2BUnit.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CLIENTFINANCECODE, AttributeMode.INITIAL);
		tmp.put(BUDGET, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.bookingInformation</code> attribute.
	 * @return the bookingInformation
	 */
	public Set<EnumerationValue> getBookingInformation(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)BOOKINGINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.bookingInformation</code> attribute.
	 * @return the bookingInformation
	 */
	public Set<EnumerationValue> getBookingInformation()
	{
		return getBookingInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.bookingInformation</code> attribute. 
	 * @param value the bookingInformation
	 */
	public void setBookingInformation(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		BOOKINGINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.bookingInformation</code> attribute. 
	 * @param value the bookingInformation
	 */
	public void setBookingInformation(final Set<EnumerationValue> value)
	{
		setBookingInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingInformation. 
	 * @param value the item to add to bookingInformation
	 */
	public void addToBookingInformation(final SessionContext ctx, final EnumerationValue value)
	{
		BOOKINGINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to bookingInformation. 
	 * @param value the item to add to bookingInformation
	 */
	public void addToBookingInformation(final EnumerationValue value)
	{
		addToBookingInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingInformation. 
	 * @param value the item to remove from bookingInformation
	 */
	public void removeFromBookingInformation(final SessionContext ctx, final EnumerationValue value)
	{
		BOOKINGINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from bookingInformation. 
	 * @param value the item to remove from bookingInformation
	 */
	public void removeFromBookingInformation(final EnumerationValue value)
	{
		removeFromBookingInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.budget</code> attribute.
	 * @return the budget
	 */
	public Double getBudget(final SessionContext ctx)
	{
		return (Double)getProperty( ctx, BUDGET);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.budget</code> attribute.
	 * @return the budget
	 */
	public Double getBudget()
	{
		return getBudget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @return the budget
	 */
	public double getBudgetAsPrimitive(final SessionContext ctx)
	{
		Double value = getBudget( ctx );
		return value != null ? value.doubleValue() : 0.0d;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @return the budget
	 */
	public double getBudgetAsPrimitive()
	{
		return getBudgetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @param value the budget
	 */
	public void setBudget(final SessionContext ctx, final Double value)
	{
		setProperty(ctx, BUDGET,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @param value the budget
	 */
	public void setBudget(final Double value)
	{
		setBudget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @param value the budget
	 */
	public void setBudget(final SessionContext ctx, final double value)
	{
		setBudget( ctx,Double.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.budget</code> attribute. 
	 * @param value the budget
	 */
	public void setBudget(final double value)
	{
		setBudget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.businessInformation</code> attribute.
	 * @return the businessInformation
	 */
	public Set<BusinessInformation> getBusinessInformation(final SessionContext ctx)
	{
		return (Set<BusinessInformation>)BUSINESSINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.businessInformation</code> attribute.
	 * @return the businessInformation
	 */
	public Set<BusinessInformation> getBusinessInformation()
	{
		return getBusinessInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.businessInformation</code> attribute. 
	 * @param value the businessInformation
	 */
	public void setBusinessInformation(final SessionContext ctx, final Set<BusinessInformation> value)
	{
		BUSINESSINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.businessInformation</code> attribute. 
	 * @param value the businessInformation
	 */
	public void setBusinessInformation(final Set<BusinessInformation> value)
	{
		setBusinessInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessInformation. 
	 * @param value the item to add to businessInformation
	 */
	public void addToBusinessInformation(final SessionContext ctx, final BusinessInformation value)
	{
		BUSINESSINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to businessInformation. 
	 * @param value the item to add to businessInformation
	 */
	public void addToBusinessInformation(final BusinessInformation value)
	{
		addToBusinessInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessInformation. 
	 * @param value the item to remove from businessInformation
	 */
	public void removeFromBusinessInformation(final SessionContext ctx, final BusinessInformation value)
	{
		BUSINESSINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from businessInformation. 
	 * @param value the item to remove from businessInformation
	 */
	public void removeFromBusinessInformation(final BusinessInformation value)
	{
		removeFromBusinessInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.clientDocument</code> attribute.
	 * @return the clientDocument
	 */
	public Set<EnumerationValue> getClientDocument(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)CLIENTDOCUMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.clientDocument</code> attribute.
	 * @return the clientDocument
	 */
	public Set<EnumerationValue> getClientDocument()
	{
		return getClientDocument( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.clientDocument</code> attribute. 
	 * @param value the clientDocument
	 */
	public void setClientDocument(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		CLIENTDOCUMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.clientDocument</code> attribute. 
	 * @param value the clientDocument
	 */
	public void setClientDocument(final Set<EnumerationValue> value)
	{
		setClientDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientDocument. 
	 * @param value the item to add to clientDocument
	 */
	public void addToClientDocument(final SessionContext ctx, final EnumerationValue value)
	{
		CLIENTDOCUMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to clientDocument. 
	 * @param value the item to add to clientDocument
	 */
	public void addToClientDocument(final EnumerationValue value)
	{
		addToClientDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientDocument. 
	 * @param value the item to remove from clientDocument
	 */
	public void removeFromClientDocument(final SessionContext ctx, final EnumerationValue value)
	{
		CLIENTDOCUMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from clientDocument. 
	 * @param value the item to remove from clientDocument
	 */
	public void removeFromClientDocument(final EnumerationValue value)
	{
		removeFromClientDocument( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CLIENTFINANCECODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.clientFinanceCode</code> attribute.
	 * @return the clientFinanceCode
	 */
	public String getClientFinanceCode()
	{
		return getClientFinanceCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CLIENTFINANCECODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.clientFinanceCode</code> attribute. 
	 * @param value the clientFinanceCode
	 */
	public void setClientFinanceCode(final String value)
	{
		setClientFinanceCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.costCentre</code> attribute.
	 * @return the costCentre
	 */
	public Set<CostCentre> getCostCentre(final SessionContext ctx)
	{
		return (Set<CostCentre>)COSTCENTREHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.costCentre</code> attribute.
	 * @return the costCentre
	 */
	public Set<CostCentre> getCostCentre()
	{
		return getCostCentre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.costCentre</code> attribute. 
	 * @param value the costCentre
	 */
	public void setCostCentre(final SessionContext ctx, final Set<CostCentre> value)
	{
		COSTCENTREHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.costCentre</code> attribute. 
	 * @param value the costCentre
	 */
	public void setCostCentre(final Set<CostCentre> value)
	{
		setCostCentre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to costCentre. 
	 * @param value the item to add to costCentre
	 */
	public void addToCostCentre(final SessionContext ctx, final CostCentre value)
	{
		COSTCENTREHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to costCentre. 
	 * @param value the item to add to costCentre
	 */
	public void addToCostCentre(final CostCentre value)
	{
		addToCostCentre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from costCentre. 
	 * @param value the item to remove from costCentre
	 */
	public void removeFromCostCentre(final SessionContext ctx, final CostCentre value)
	{
		COSTCENTREHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from costCentre. 
	 * @param value the item to remove from costCentre
	 */
	public void removeFromCostCentre(final CostCentre value)
	{
		removeFromCostCentre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.department</code> attribute.
	 * @return the department
	 */
	public Set<Department> getDepartment(final SessionContext ctx)
	{
		return (Set<Department>)DEPARTMENTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.department</code> attribute.
	 * @return the department
	 */
	public Set<Department> getDepartment()
	{
		return getDepartment( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final SessionContext ctx, final Set<Department> value)
	{
		DEPARTMENTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.department</code> attribute. 
	 * @param value the department
	 */
	public void setDepartment(final Set<Department> value)
	{
		setDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to department. 
	 * @param value the item to add to department
	 */
	public void addToDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to department. 
	 * @param value the item to add to department
	 */
	public void addToDepartment(final Department value)
	{
		addToDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from department. 
	 * @param value the item to remove from department
	 */
	public void removeFromDepartment(final SessionContext ctx, final Department value)
	{
		DEPARTMENTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from department. 
	 * @param value the item to remove from department
	 */
	public void removeFromDepartment(final Department value)
	{
		removeFromDepartment( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.designation</code> attribute.
	 * @return the designation
	 */
	public Set<Designation> getDesignation(final SessionContext ctx)
	{
		return (Set<Designation>)DESIGNATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.designation</code> attribute.
	 * @return the designation
	 */
	public Set<Designation> getDesignation()
	{
		return getDesignation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final SessionContext ctx, final Set<Designation> value)
	{
		DESIGNATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.designation</code> attribute. 
	 * @param value the designation
	 */
	public void setDesignation(final Set<Designation> value)
	{
		setDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to designation. 
	 * @param value the item to add to designation
	 */
	public void addToDesignation(final SessionContext ctx, final Designation value)
	{
		DESIGNATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to designation. 
	 * @param value the item to add to designation
	 */
	public void addToDesignation(final Designation value)
	{
		addToDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from designation. 
	 * @param value the item to remove from designation
	 */
	public void removeFromDesignation(final SessionContext ctx, final Designation value)
	{
		DESIGNATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from designation. 
	 * @param value the item to remove from designation
	 */
	public void removeFromDesignation(final Designation value)
	{
		removeFromDesignation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.employmentInformation</code> attribute.
	 * @return the employmentInformation
	 */
	public Set<EnumerationValue> getEmploymentInformation(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)EMPLOYMENTINFORMATIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.employmentInformation</code> attribute.
	 * @return the employmentInformation
	 */
	public Set<EnumerationValue> getEmploymentInformation()
	{
		return getEmploymentInformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.employmentInformation</code> attribute. 
	 * @param value the employmentInformation
	 */
	public void setEmploymentInformation(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		EMPLOYMENTINFORMATIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.employmentInformation</code> attribute. 
	 * @param value the employmentInformation
	 */
	public void setEmploymentInformation(final Set<EnumerationValue> value)
	{
		setEmploymentInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to employmentInformation. 
	 * @param value the item to add to employmentInformation
	 */
	public void addToEmploymentInformation(final SessionContext ctx, final EnumerationValue value)
	{
		EMPLOYMENTINFORMATIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to employmentInformation. 
	 * @param value the item to add to employmentInformation
	 */
	public void addToEmploymentInformation(final EnumerationValue value)
	{
		addToEmploymentInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from employmentInformation. 
	 * @param value the item to remove from employmentInformation
	 */
	public void removeFromEmploymentInformation(final SessionContext ctx, final EnumerationValue value)
	{
		EMPLOYMENTINFORMATIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from employmentInformation. 
	 * @param value the item to remove from employmentInformation
	 */
	public void removeFromEmploymentInformation(final EnumerationValue value)
	{
		removeFromEmploymentInformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.grade</code> attribute.
	 * @return the grade
	 */
	public Set<EnumerationValue> getGrade(final SessionContext ctx)
	{
		return (Set<EnumerationValue>)GRADEHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.grade</code> attribute.
	 * @return the grade
	 */
	public Set<EnumerationValue> getGrade()
	{
		return getGrade( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.grade</code> attribute. 
	 * @param value the grade
	 */
	public void setGrade(final SessionContext ctx, final Set<EnumerationValue> value)
	{
		GRADEHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.grade</code> attribute. 
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
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.project</code> attribute.
	 * @return the project
	 */
	public Set<Project> getProject(final SessionContext ctx)
	{
		return (Set<Project>)PROJECTHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TravelogixCorporateUnit.project</code> attribute.
	 * @return the project
	 */
	public Set<Project> getProject()
	{
		return getProject( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.project</code> attribute. 
	 * @param value the project
	 */
	public void setProject(final SessionContext ctx, final Set<Project> value)
	{
		PROJECTHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TravelogixCorporateUnit.project</code> attribute. 
	 * @param value the project
	 */
	public void setProject(final Set<Project> value)
	{
		setProject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to project. 
	 * @param value the item to add to project
	 */
	public void addToProject(final SessionContext ctx, final Project value)
	{
		PROJECTHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to project. 
	 * @param value the item to add to project
	 */
	public void addToProject(final Project value)
	{
		addToProject( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from project. 
	 * @param value the item to remove from project
	 */
	public void removeFromProject(final SessionContext ctx, final Project value)
	{
		PROJECTHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from project. 
	 * @param value the item to remove from project
	 */
	public void removeFromProject(final Project value)
	{
		removeFromProject( getSession().getSessionContext(), value );
	}
	
}
