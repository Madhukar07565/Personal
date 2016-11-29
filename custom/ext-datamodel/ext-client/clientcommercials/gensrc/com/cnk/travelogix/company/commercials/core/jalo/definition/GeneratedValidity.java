/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.company.commercials.core.jalo.definition;

import com.cnk.travelogix.client.commercials.constants.ClientcommercialsConstants;
import com.cnk.travelogix.company.commercials.core.jalo.definition.Validity;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.util.StandardDateRange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.company.commercials.core.jalo.definition.Validity Validity}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedValidity extends GenericItem
{
	/** Qualifier of the <code>Validity.sale</code> attribute **/
	public static final String SALE = "sale";
	/** Qualifier of the <code>Validity.validity</code> attribute **/
	public static final String VALIDITY = "validity";
	/** Qualifier of the <code>Validity.travel</code> attribute **/
	public static final String TRAVEL = "travel";
	/** Qualifier of the <code>Validity.saleandTravel</code> attribute **/
	public static final String SALEANDTRAVEL = "saleandTravel";
	/** Qualifier of the <code>Validity.ticketing</code> attribute **/
	public static final String TICKETING = "ticketing";
	/** Qualifier of the <code>Validity.tiicketingAndTravel</code> attribute **/
	public static final String TIICKETINGANDTRAVEL = "tiicketingAndTravel";
	/** Qualifier of the <code>Validity.travelDates</code> attribute **/
	public static final String TRAVELDATES = "travelDates";
	/** Qualifier of the <code>Validity.travelblockOutDates</code> attribute **/
	public static final String TRAVELBLOCKOUTDATES = "travelblockOutDates";
	/** Qualifier of the <code>Validity.saleDates</code> attribute **/
	public static final String SALEDATES = "saleDates";
	/** Qualifier of the <code>Validity.saleblockOutDates</code> attribute **/
	public static final String SALEBLOCKOUTDATES = "saleblockOutDates";
	/** Qualifier of the <code>Validity.ticketingDates</code> attribute **/
	public static final String TICKETINGDATES = "ticketingDates";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SALE, AttributeMode.INITIAL);
		tmp.put(VALIDITY, AttributeMode.INITIAL);
		tmp.put(TRAVEL, AttributeMode.INITIAL);
		tmp.put(SALEANDTRAVEL, AttributeMode.INITIAL);
		tmp.put(TICKETING, AttributeMode.INITIAL);
		tmp.put(TIICKETINGANDTRAVEL, AttributeMode.INITIAL);
		tmp.put(TRAVELDATES, AttributeMode.INITIAL);
		tmp.put(TRAVELBLOCKOUTDATES, AttributeMode.INITIAL);
		tmp.put(SALEDATES, AttributeMode.INITIAL);
		tmp.put(SALEBLOCKOUTDATES, AttributeMode.INITIAL);
		tmp.put(TICKETINGDATES, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.sale</code> attribute.
	 * @return the sale
	 */
	public Boolean isSale(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.sale</code> attribute.
	 * @return the sale
	 */
	public Boolean isSale()
	{
		return isSale( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.sale</code> attribute. 
	 * @return the sale
	 */
	public boolean isSaleAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSale( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.sale</code> attribute. 
	 * @return the sale
	 */
	public boolean isSaleAsPrimitive()
	{
		return isSaleAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.sale</code> attribute. 
	 * @param value the sale
	 */
	public void setSale(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.sale</code> attribute. 
	 * @param value the sale
	 */
	public void setSale(final Boolean value)
	{
		setSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.sale</code> attribute. 
	 * @param value the sale
	 */
	public void setSale(final SessionContext ctx, final boolean value)
	{
		setSale( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.sale</code> attribute. 
	 * @param value the sale
	 */
	public void setSale(final boolean value)
	{
		setSale( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleandTravel</code> attribute.
	 * @return the saleandTravel
	 */
	public Boolean isSaleandTravel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SALEANDTRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleandTravel</code> attribute.
	 * @return the saleandTravel
	 */
	public Boolean isSaleandTravel()
	{
		return isSaleandTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleandTravel</code> attribute. 
	 * @return the saleandTravel
	 */
	public boolean isSaleandTravelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSaleandTravel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleandTravel</code> attribute. 
	 * @return the saleandTravel
	 */
	public boolean isSaleandTravelAsPrimitive()
	{
		return isSaleandTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleandTravel</code> attribute. 
	 * @param value the saleandTravel
	 */
	public void setSaleandTravel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SALEANDTRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleandTravel</code> attribute. 
	 * @param value the saleandTravel
	 */
	public void setSaleandTravel(final Boolean value)
	{
		setSaleandTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleandTravel</code> attribute. 
	 * @param value the saleandTravel
	 */
	public void setSaleandTravel(final SessionContext ctx, final boolean value)
	{
		setSaleandTravel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleandTravel</code> attribute. 
	 * @param value the saleandTravel
	 */
	public void setSaleandTravel(final boolean value)
	{
		setSaleandTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleblockOutDates</code> attribute.
	 * @return the saleblockOutDates
	 */
	public Set<StandardDateRange> getSaleblockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, SALEBLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleblockOutDates</code> attribute.
	 * @return the saleblockOutDates
	 */
	public Set<StandardDateRange> getSaleblockOutDates()
	{
		return getSaleblockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleblockOutDates</code> attribute. 
	 * @param value the saleblockOutDates
	 */
	public void setSaleblockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, SALEBLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleblockOutDates</code> attribute. 
	 * @param value the saleblockOutDates
	 */
	public void setSaleblockOutDates(final Set<StandardDateRange> value)
	{
		setSaleblockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleDates</code> attribute.
	 * @return the saleDates
	 */
	public Set<StandardDateRange> getSaleDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, SALEDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.saleDates</code> attribute.
	 * @return the saleDates
	 */
	public Set<StandardDateRange> getSaleDates()
	{
		return getSaleDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleDates</code> attribute. 
	 * @param value the saleDates
	 */
	public void setSaleDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, SALEDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.saleDates</code> attribute. 
	 * @param value the saleDates
	 */
	public void setSaleDates(final Set<StandardDateRange> value)
	{
		setSaleDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketing</code> attribute.
	 * @return the ticketing
	 */
	public Boolean isTicketing(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TICKETING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketing</code> attribute.
	 * @return the ticketing
	 */
	public Boolean isTicketing()
	{
		return isTicketing( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketing</code> attribute. 
	 * @return the ticketing
	 */
	public boolean isTicketingAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTicketing( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketing</code> attribute. 
	 * @return the ticketing
	 */
	public boolean isTicketingAsPrimitive()
	{
		return isTicketingAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketing</code> attribute. 
	 * @param value the ticketing
	 */
	public void setTicketing(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TICKETING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketing</code> attribute. 
	 * @param value the ticketing
	 */
	public void setTicketing(final Boolean value)
	{
		setTicketing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketing</code> attribute. 
	 * @param value the ticketing
	 */
	public void setTicketing(final SessionContext ctx, final boolean value)
	{
		setTicketing( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketing</code> attribute. 
	 * @param value the ticketing
	 */
	public void setTicketing(final boolean value)
	{
		setTicketing( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketingDates</code> attribute.
	 * @return the ticketingDates
	 */
	public Set<StandardDateRange> getTicketingDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, TICKETINGDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.ticketingDates</code> attribute.
	 * @return the ticketingDates
	 */
	public Set<StandardDateRange> getTicketingDates()
	{
		return getTicketingDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketingDates</code> attribute. 
	 * @param value the ticketingDates
	 */
	public void setTicketingDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, TICKETINGDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.ticketingDates</code> attribute. 
	 * @param value the ticketingDates
	 */
	public void setTicketingDates(final Set<StandardDateRange> value)
	{
		setTicketingDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.tiicketingAndTravel</code> attribute.
	 * @return the tiicketingAndTravel
	 */
	public Boolean isTiicketingAndTravel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TIICKETINGANDTRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.tiicketingAndTravel</code> attribute.
	 * @return the tiicketingAndTravel
	 */
	public Boolean isTiicketingAndTravel()
	{
		return isTiicketingAndTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @return the tiicketingAndTravel
	 */
	public boolean isTiicketingAndTravelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTiicketingAndTravel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @return the tiicketingAndTravel
	 */
	public boolean isTiicketingAndTravelAsPrimitive()
	{
		return isTiicketingAndTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @param value the tiicketingAndTravel
	 */
	public void setTiicketingAndTravel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TIICKETINGANDTRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @param value the tiicketingAndTravel
	 */
	public void setTiicketingAndTravel(final Boolean value)
	{
		setTiicketingAndTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @param value the tiicketingAndTravel
	 */
	public void setTiicketingAndTravel(final SessionContext ctx, final boolean value)
	{
		setTiicketingAndTravel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.tiicketingAndTravel</code> attribute. 
	 * @param value the tiicketingAndTravel
	 */
	public void setTiicketingAndTravel(final boolean value)
	{
		setTiicketingAndTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travel</code> attribute.
	 * @return the travel
	 */
	public Boolean isTravel(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, TRAVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travel</code> attribute.
	 * @return the travel
	 */
	public Boolean isTravel()
	{
		return isTravel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travel</code> attribute. 
	 * @return the travel
	 */
	public boolean isTravelAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isTravel( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travel</code> attribute. 
	 * @return the travel
	 */
	public boolean isTravelAsPrimitive()
	{
		return isTravelAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travel</code> attribute. 
	 * @param value the travel
	 */
	public void setTravel(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, TRAVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travel</code> attribute. 
	 * @param value the travel
	 */
	public void setTravel(final Boolean value)
	{
		setTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travel</code> attribute. 
	 * @param value the travel
	 */
	public void setTravel(final SessionContext ctx, final boolean value)
	{
		setTravel( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travel</code> attribute. 
	 * @param value the travel
	 */
	public void setTravel(final boolean value)
	{
		setTravel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travelblockOutDates</code> attribute.
	 * @return the travelblockOutDates
	 */
	public Set<StandardDateRange> getTravelblockOutDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, TRAVELBLOCKOUTDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travelblockOutDates</code> attribute.
	 * @return the travelblockOutDates
	 */
	public Set<StandardDateRange> getTravelblockOutDates()
	{
		return getTravelblockOutDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travelblockOutDates</code> attribute. 
	 * @param value the travelblockOutDates
	 */
	public void setTravelblockOutDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, TRAVELBLOCKOUTDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travelblockOutDates</code> attribute. 
	 * @param value the travelblockOutDates
	 */
	public void setTravelblockOutDates(final Set<StandardDateRange> value)
	{
		setTravelblockOutDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travelDates</code> attribute.
	 * @return the travelDates
	 */
	public Set<StandardDateRange> getTravelDates(final SessionContext ctx)
	{
		Set<StandardDateRange> coll = (Set<StandardDateRange>)getProperty( ctx, TRAVELDATES);
		return coll != null ? coll : Collections.EMPTY_SET;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.travelDates</code> attribute.
	 * @return the travelDates
	 */
	public Set<StandardDateRange> getTravelDates()
	{
		return getTravelDates( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travelDates</code> attribute. 
	 * @param value the travelDates
	 */
	public void setTravelDates(final SessionContext ctx, final Set<StandardDateRange> value)
	{
		setProperty(ctx, TRAVELDATES,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.travelDates</code> attribute. 
	 * @param value the travelDates
	 */
	public void setTravelDates(final Set<StandardDateRange> value)
	{
		setTravelDates( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.validity</code> attribute.
	 * @return the validity
	 */
	public Validity getValidity(final SessionContext ctx)
	{
		return (Validity)getProperty( ctx, VALIDITY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Validity.validity</code> attribute.
	 * @return the validity
	 */
	public Validity getValidity()
	{
		return getValidity( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final SessionContext ctx, final Validity value)
	{
		setProperty(ctx, VALIDITY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Validity.validity</code> attribute. 
	 * @param value the validity
	 */
	public void setValidity(final Validity value)
	{
		setValidity( getSession().getSessionContext(), value );
	}
	
}
