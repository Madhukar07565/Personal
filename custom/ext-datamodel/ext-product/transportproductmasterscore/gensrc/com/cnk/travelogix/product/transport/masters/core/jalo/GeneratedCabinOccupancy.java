/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.transport.masters.core.jalo;

import com.cnk.travelogix.product.common.core.jalo.Cabin;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
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
 * Generated class for type {@link com.cnk.travelogix.product.transport.masters.core.jalo.CabinOccupancy CabinOccupancy}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCabinOccupancy extends GenericItem
{
	/** Qualifier of the <code>CabinOccupancy.maxPax</code> attribute **/
	public static final String MAXPAX = "maxPax";
	/** Qualifier of the <code>CabinOccupancy.maxChild</code> attribute **/
	public static final String MAXCHILD = "maxChild";
	/** Qualifier of the <code>CabinOccupancy.maxAdult</code> attribute **/
	public static final String MAXADULT = "maxAdult";
	/** Qualifier of the <code>CabinOccupancy.ageForChildFrom</code> attribute **/
	public static final String AGEFORCHILDFROM = "ageForChildFrom";
	/** Qualifier of the <code>CabinOccupancy.ageForChildTo</code> attribute **/
	public static final String AGEFORCHILDTO = "ageForChildTo";
	/** Qualifier of the <code>CabinOccupancy.cabin</code> attribute **/
	public static final String CABIN = "cabin";
	/** Relation ordering override parameter constants for CabinToCabinOccupancies from ((transportproductmasterscore))*/
	protected static String CABINTOCABINOCCUPANCIES_SRC_ORDERED = "relation.CabinToCabinOccupancies.source.ordered";
	protected static String CABINTOCABINOCCUPANCIES_TGT_ORDERED = "relation.CabinToCabinOccupancies.target.ordered";
	/** Relation disable markmodifed parameter constants for CabinToCabinOccupancies from ((transportproductmasterscore))*/
	protected static String CABINTOCABINOCCUPANCIES_MARKMODIFIED = "relation.CabinToCabinOccupancies.markmodified";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(MAXPAX, AttributeMode.INITIAL);
		tmp.put(MAXCHILD, AttributeMode.INITIAL);
		tmp.put(MAXADULT, AttributeMode.INITIAL);
		tmp.put(AGEFORCHILDFROM, AttributeMode.INITIAL);
		tmp.put(AGEFORCHILDTO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildFrom</code> attribute.
	 * @return the ageForChildFrom - Age For Child From
	 */
	public Integer getAgeForChildFrom(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGEFORCHILDFROM);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildFrom</code> attribute.
	 * @return the ageForChildFrom - Age For Child From
	 */
	public Integer getAgeForChildFrom()
	{
		return getAgeForChildFrom( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @return the ageForChildFrom - Age For Child From
	 */
	public int getAgeForChildFromAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeForChildFrom( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @return the ageForChildFrom - Age For Child From
	 */
	public int getAgeForChildFromAsPrimitive()
	{
		return getAgeForChildFromAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @param value the ageForChildFrom - Age For Child From
	 */
	public void setAgeForChildFrom(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGEFORCHILDFROM,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @param value the ageForChildFrom - Age For Child From
	 */
	public void setAgeForChildFrom(final Integer value)
	{
		setAgeForChildFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @param value the ageForChildFrom - Age For Child From
	 */
	public void setAgeForChildFrom(final SessionContext ctx, final int value)
	{
		setAgeForChildFrom( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildFrom</code> attribute. 
	 * @param value the ageForChildFrom - Age For Child From
	 */
	public void setAgeForChildFrom(final int value)
	{
		setAgeForChildFrom( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildTo</code> attribute.
	 * @return the ageForChildTo - Age For Child To
	 */
	public Integer getAgeForChildTo(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, AGEFORCHILDTO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildTo</code> attribute.
	 * @return the ageForChildTo - Age For Child To
	 */
	public Integer getAgeForChildTo()
	{
		return getAgeForChildTo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @return the ageForChildTo - Age For Child To
	 */
	public int getAgeForChildToAsPrimitive(final SessionContext ctx)
	{
		Integer value = getAgeForChildTo( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @return the ageForChildTo - Age For Child To
	 */
	public int getAgeForChildToAsPrimitive()
	{
		return getAgeForChildToAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @param value the ageForChildTo - Age For Child To
	 */
	public void setAgeForChildTo(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, AGEFORCHILDTO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @param value the ageForChildTo - Age For Child To
	 */
	public void setAgeForChildTo(final Integer value)
	{
		setAgeForChildTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @param value the ageForChildTo - Age For Child To
	 */
	public void setAgeForChildTo(final SessionContext ctx, final int value)
	{
		setAgeForChildTo( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.ageForChildTo</code> attribute. 
	 * @param value the ageForChildTo - Age For Child To
	 */
	public void setAgeForChildTo(final int value)
	{
		setAgeForChildTo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.cabin</code> attribute.
	 * @return the cabin
	 */
	public Collection<Cabin> getCabin(final SessionContext ctx)
	{
		final List<Cabin> items = getLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			"Cabin",
			null,
			false,
			false
		);
		return items;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.cabin</code> attribute.
	 * @return the cabin
	 */
	public Collection<Cabin> getCabin()
	{
		return getCabin( getSession().getSessionContext() );
	}
	
	public long getCabinCount(final SessionContext ctx)
	{
		return getLinkedItemsCount(
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			"Cabin",
			null
		);
	}
	
	public long getCabinCount()
	{
		return getCabinCount( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final SessionContext ctx, final Collection<Cabin> value)
	{
		setLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.cabin</code> attribute. 
	 * @param value the cabin
	 */
	public void setCabin(final Collection<Cabin> value)
	{
		setCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabin. 
	 * @param value the item to add to cabin
	 */
	public void addToCabin(final SessionContext ctx, final Cabin value)
	{
		addLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to cabin. 
	 * @param value the item to add to cabin
	 */
	public void addToCabin(final Cabin value)
	{
		addToCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabin. 
	 * @param value the item to remove from cabin
	 */
	public void removeFromCabin(final SessionContext ctx, final Cabin value)
	{
		removeLinkedItems( 
			ctx,
			false,
			TransportproductmasterscoreConstants.Relations.CABINTOCABINOCCUPANCIES,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CABINTOCABINOCCUPANCIES_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from cabin. 
	 * @param value the item to remove from cabin
	 */
	public void removeFromCabin(final Cabin value)
	{
		removeFromCabin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxAdult</code> attribute.
	 * @return the maxAdult - Max Adult
	 */
	public Integer getMaxAdult(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXADULT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxAdult</code> attribute.
	 * @return the maxAdult - Max Adult
	 */
	public Integer getMaxAdult()
	{
		return getMaxAdult( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @return the maxAdult - Max Adult
	 */
	public int getMaxAdultAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxAdult( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @return the maxAdult - Max Adult
	 */
	public int getMaxAdultAsPrimitive()
	{
		return getMaxAdultAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @param value the maxAdult - Max Adult
	 */
	public void setMaxAdult(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXADULT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @param value the maxAdult - Max Adult
	 */
	public void setMaxAdult(final Integer value)
	{
		setMaxAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @param value the maxAdult - Max Adult
	 */
	public void setMaxAdult(final SessionContext ctx, final int value)
	{
		setMaxAdult( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxAdult</code> attribute. 
	 * @param value the maxAdult - Max Adult
	 */
	public void setMaxAdult(final int value)
	{
		setMaxAdult( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxChild</code> attribute.
	 * @return the maxChild - Max Child
	 */
	public Integer getMaxChild(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXCHILD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxChild</code> attribute.
	 * @return the maxChild - Max Child
	 */
	public Integer getMaxChild()
	{
		return getMaxChild( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @return the maxChild - Max Child
	 */
	public int getMaxChildAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxChild( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @return the maxChild - Max Child
	 */
	public int getMaxChildAsPrimitive()
	{
		return getMaxChildAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Max Child
	 */
	public void setMaxChild(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXCHILD,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Max Child
	 */
	public void setMaxChild(final Integer value)
	{
		setMaxChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Max Child
	 */
	public void setMaxChild(final SessionContext ctx, final int value)
	{
		setMaxChild( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxChild</code> attribute. 
	 * @param value the maxChild - Max Child
	 */
	public void setMaxChild(final int value)
	{
		setMaxChild( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxPax</code> attribute.
	 * @return the maxPax - Max Pax
	 */
	public Integer getMaxPax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, MAXPAX);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxPax</code> attribute.
	 * @return the maxPax - Max Pax
	 */
	public Integer getMaxPax()
	{
		return getMaxPax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @return the maxPax - Max Pax
	 */
	public int getMaxPaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getMaxPax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @return the maxPax - Max Pax
	 */
	public int getMaxPaxAsPrimitive()
	{
		return getMaxPaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Max Pax
	 */
	public void setMaxPax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, MAXPAX,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Max Pax
	 */
	public void setMaxPax(final Integer value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Max Pax
	 */
	public void setMaxPax(final SessionContext ctx, final int value)
	{
		setMaxPax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CabinOccupancy.maxPax</code> attribute. 
	 * @param value the maxPax - Max Pax
	 */
	public void setMaxPax(final int value)
	{
		setMaxPax( getSession().getSessionContext(), value );
	}
	
}
