/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.CompanyAdditionalDetails CompanyAdditionalDetails}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCompanyAdditionalDetails extends GenericItem
{
	/** Qualifier of the <code>CompanyAdditionalDetails.registrationNumber</code> attribute **/
	public static final String REGISTRATIONNUMBER = "registrationNumber";
	/** Qualifier of the <code>CompanyAdditionalDetails.establishedIn</code> attribute **/
	public static final String ESTABLISHEDIN = "establishedIn";
	/** Qualifier of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute **/
	public static final String HASOWNGUESTHOUSE = "hasOwnGuestHouse";
	/** Qualifier of the <code>CompanyAdditionalDetails.ownGuestHouseRemarks</code> attribute **/
	public static final String OWNGUESTHOUSEREMARKS = "ownGuestHouseRemarks";
	/** Qualifier of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute **/
	public static final String DEALSWITHSUPPLIER = "dealsWithSupplier";
	/** Qualifier of the <code>CompanyAdditionalDetails.dealsWithSupplierRemarks</code> attribute **/
	public static final String DEALSWITHSUPPLIERREMARKS = "dealsWithSupplierRemarks";
	/** Qualifier of the <code>CompanyAdditionalDetails.ownsCar</code> attribute **/
	public static final String OWNSCAR = "ownsCar";
	/** Qualifier of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute **/
	public static final String COMPANYANNUALTURNOVERAMOUNT = "companyAnnualTurnOverAmount";
	/** Qualifier of the <code>CompanyAdditionalDetails.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute **/
	public static final String EMPLOYEESTRENGTH = "employeeStrength";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(REGISTRATIONNUMBER, AttributeMode.INITIAL);
		tmp.put(ESTABLISHEDIN, AttributeMode.INITIAL);
		tmp.put(HASOWNGUESTHOUSE, AttributeMode.INITIAL);
		tmp.put(OWNGUESTHOUSEREMARKS, AttributeMode.INITIAL);
		tmp.put(DEALSWITHSUPPLIER, AttributeMode.INITIAL);
		tmp.put(DEALSWITHSUPPLIERREMARKS, AttributeMode.INITIAL);
		tmp.put(OWNSCAR, AttributeMode.INITIAL);
		tmp.put(COMPANYANNUALTURNOVERAMOUNT, AttributeMode.INITIAL);
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(EMPLOYEESTRENGTH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute.
	 * @return the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public Long getCompanyAnnualTurnOverAmount(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, COMPANYANNUALTURNOVERAMOUNT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute.
	 * @return the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public Long getCompanyAnnualTurnOverAmount()
	{
		return getCompanyAnnualTurnOverAmount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @return the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public long getCompanyAnnualTurnOverAmountAsPrimitive(final SessionContext ctx)
	{
		Long value = getCompanyAnnualTurnOverAmount( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @return the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public long getCompanyAnnualTurnOverAmountAsPrimitive()
	{
		return getCompanyAnnualTurnOverAmountAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @param value the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public void setCompanyAnnualTurnOverAmount(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, COMPANYANNUALTURNOVERAMOUNT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @param value the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public void setCompanyAnnualTurnOverAmount(final Long value)
	{
		setCompanyAnnualTurnOverAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @param value the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public void setCompanyAnnualTurnOverAmount(final SessionContext ctx, final long value)
	{
		setCompanyAnnualTurnOverAmount( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.companyAnnualTurnOverAmount</code> attribute. 
	 * @param value the companyAnnualTurnOverAmount - Company Annual TurnOver Amount
	 */
	public void setCompanyAnnualTurnOverAmount(final long value)
	{
		setCompanyAnnualTurnOverAmount( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.currency</code> attribute.
	 * @return the currency - Currency for CompanyAdditionalDetails
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.currency</code> attribute.
	 * @return the currency - Currency for CompanyAdditionalDetails
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.currency</code> attribute. 
	 * @param value the currency - Currency for CompanyAdditionalDetails
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.currency</code> attribute. 
	 * @param value the currency - Currency for CompanyAdditionalDetails
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute.
	 * @return the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public Boolean isDealsWithSupplier(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, DEALSWITHSUPPLIER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute.
	 * @return the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public Boolean isDealsWithSupplier()
	{
		return isDealsWithSupplier( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @return the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public boolean isDealsWithSupplierAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isDealsWithSupplier( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @return the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public boolean isDealsWithSupplierAsPrimitive()
	{
		return isDealsWithSupplierAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @param value the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public void setDealsWithSupplier(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, DEALSWITHSUPPLIER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @param value the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public void setDealsWithSupplier(final Boolean value)
	{
		setDealsWithSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @param value the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public void setDealsWithSupplier(final SessionContext ctx, final boolean value)
	{
		setDealsWithSupplier( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplier</code> attribute. 
	 * @param value the dealsWithSupplier - DealsWithSupplier for CompanyAdditionalDetails
	 */
	public void setDealsWithSupplier(final boolean value)
	{
		setDealsWithSupplier( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplierRemarks</code> attribute.
	 * @return the dealsWithSupplierRemarks - Deals With Supplier Remarks
	 */
	public String getDealsWithSupplierRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DEALSWITHSUPPLIERREMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.dealsWithSupplierRemarks</code> attribute.
	 * @return the dealsWithSupplierRemarks - Deals With Supplier Remarks
	 */
	public String getDealsWithSupplierRemarks()
	{
		return getDealsWithSupplierRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplierRemarks</code> attribute. 
	 * @param value the dealsWithSupplierRemarks - Deals With Supplier Remarks
	 */
	public void setDealsWithSupplierRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DEALSWITHSUPPLIERREMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.dealsWithSupplierRemarks</code> attribute. 
	 * @param value the dealsWithSupplierRemarks - Deals With Supplier Remarks
	 */
	public void setDealsWithSupplierRemarks(final String value)
	{
		setDealsWithSupplierRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute.
	 * @return the employeeStrength - Strength of employees in company
	 */
	public Integer getEmployeeStrength(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EMPLOYEESTRENGTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute.
	 * @return the employeeStrength - Strength of employees in company
	 */
	public Integer getEmployeeStrength()
	{
		return getEmployeeStrength( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @return the employeeStrength - Strength of employees in company
	 */
	public int getEmployeeStrengthAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEmployeeStrength( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @return the employeeStrength - Strength of employees in company
	 */
	public int getEmployeeStrengthAsPrimitive()
	{
		return getEmployeeStrengthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @param value the employeeStrength - Strength of employees in company
	 */
	public void setEmployeeStrength(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EMPLOYEESTRENGTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @param value the employeeStrength - Strength of employees in company
	 */
	public void setEmployeeStrength(final Integer value)
	{
		setEmployeeStrength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @param value the employeeStrength - Strength of employees in company
	 */
	public void setEmployeeStrength(final SessionContext ctx, final int value)
	{
		setEmployeeStrength( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.employeeStrength</code> attribute. 
	 * @param value the employeeStrength - Strength of employees in company
	 */
	public void setEmployeeStrength(final int value)
	{
		setEmployeeStrength( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.establishedIn</code> attribute.
	 * @return the establishedIn - Established Date of Company
	 */
	public Date getEstablishedIn(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, ESTABLISHEDIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.establishedIn</code> attribute.
	 * @return the establishedIn - Established Date of Company
	 */
	public Date getEstablishedIn()
	{
		return getEstablishedIn( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.establishedIn</code> attribute. 
	 * @param value the establishedIn - Established Date of Company
	 */
	public void setEstablishedIn(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, ESTABLISHEDIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.establishedIn</code> attribute. 
	 * @param value the establishedIn - Established Date of Company
	 */
	public void setEstablishedIn(final Date value)
	{
		setEstablishedIn( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute.
	 * @return the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public Boolean isHasOwnGuestHouse(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, HASOWNGUESTHOUSE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute.
	 * @return the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public Boolean isHasOwnGuestHouse()
	{
		return isHasOwnGuestHouse( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @return the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public boolean isHasOwnGuestHouseAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isHasOwnGuestHouse( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @return the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public boolean isHasOwnGuestHouseAsPrimitive()
	{
		return isHasOwnGuestHouseAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @param value the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public void setHasOwnGuestHouse(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, HASOWNGUESTHOUSE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @param value the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public void setHasOwnGuestHouse(final Boolean value)
	{
		setHasOwnGuestHouse( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @param value the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public void setHasOwnGuestHouse(final SessionContext ctx, final boolean value)
	{
		setHasOwnGuestHouse( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.hasOwnGuestHouse</code> attribute. 
	 * @param value the hasOwnGuestHouse - OwnGuestHouse of the lead
	 */
	public void setHasOwnGuestHouse(final boolean value)
	{
		setHasOwnGuestHouse( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownGuestHouseRemarks</code> attribute.
	 * @return the ownGuestHouseRemarks - OwnGuestHouse Remarks
	 */
	public String getOwnGuestHouseRemarks(final SessionContext ctx)
	{
		return (String)getProperty( ctx, OWNGUESTHOUSEREMARKS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownGuestHouseRemarks</code> attribute.
	 * @return the ownGuestHouseRemarks - OwnGuestHouse Remarks
	 */
	public String getOwnGuestHouseRemarks()
	{
		return getOwnGuestHouseRemarks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownGuestHouseRemarks</code> attribute. 
	 * @param value the ownGuestHouseRemarks - OwnGuestHouse Remarks
	 */
	public void setOwnGuestHouseRemarks(final SessionContext ctx, final String value)
	{
		setProperty(ctx, OWNGUESTHOUSEREMARKS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownGuestHouseRemarks</code> attribute. 
	 * @param value the ownGuestHouseRemarks - OwnGuestHouse Remarks
	 */
	public void setOwnGuestHouseRemarks(final String value)
	{
		setOwnGuestHouseRemarks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute.
	 * @return the ownsCar - OwnsCar
	 */
	public Boolean isOwnsCar(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, OWNSCAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute.
	 * @return the ownsCar - OwnsCar
	 */
	public Boolean isOwnsCar()
	{
		return isOwnsCar( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @return the ownsCar - OwnsCar
	 */
	public boolean isOwnsCarAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isOwnsCar( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @return the ownsCar - OwnsCar
	 */
	public boolean isOwnsCarAsPrimitive()
	{
		return isOwnsCarAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @param value the ownsCar - OwnsCar
	 */
	public void setOwnsCar(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, OWNSCAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @param value the ownsCar - OwnsCar
	 */
	public void setOwnsCar(final Boolean value)
	{
		setOwnsCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @param value the ownsCar - OwnsCar
	 */
	public void setOwnsCar(final SessionContext ctx, final boolean value)
	{
		setOwnsCar( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.ownsCar</code> attribute. 
	 * @param value the ownsCar - OwnsCar
	 */
	public void setOwnsCar(final boolean value)
	{
		setOwnsCar( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.registrationNumber</code> attribute.
	 * @return the registrationNumber - RegistrationNumber of Company
	 */
	public String getRegistrationNumber(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REGISTRATIONNUMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CompanyAdditionalDetails.registrationNumber</code> attribute.
	 * @return the registrationNumber - RegistrationNumber of Company
	 */
	public String getRegistrationNumber()
	{
		return getRegistrationNumber( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.registrationNumber</code> attribute. 
	 * @param value the registrationNumber - RegistrationNumber of Company
	 */
	public void setRegistrationNumber(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REGISTRATIONNUMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CompanyAdditionalDetails.registrationNumber</code> attribute. 
	 * @param value the registrationNumber - RegistrationNumber of Company
	 */
	public void setRegistrationNumber(final String value)
	{
		setRegistrationNumber( getSession().getSessionContext(), value );
	}
	
}
