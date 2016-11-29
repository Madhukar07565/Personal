/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.common.core.constants.CommonproductcoreConstants;
import com.cnk.travelogix.product.common.core.jalo.DescriptionDetails;
import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipDescription ShipDescription}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipDescription extends GenericItem
{
	/** Qualifier of the <code>ShipDescription.highlights</code> attribute **/
	public static final String HIGHLIGHTS = "highlights";
	/** Qualifier of the <code>ShipDescription.sellingTips</code> attribute **/
	public static final String SELLINGTIPS = "sellingTips";
	/** Qualifier of the <code>ShipDescription.uniqueSellingPoints</code> attribute **/
	public static final String UNIQUESELLINGPOINTS = "uniqueSellingPoints";
	/** Qualifier of the <code>ShipDescription.longDescription</code> attribute **/
	public static final String LONGDESCRIPTION = "longDescription";
	/** Qualifier of the <code>ShipDescription.shortDescription</code> attribute **/
	public static final String SHORTDESCRIPTION = "shortDescription";
	/**
	* {@link OneToManyHandler} for handling 1:n LONGDESCRIPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> LONGDESCRIPTIONHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	true,
	"shipDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n SHORTDESCRIPTION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<DescriptionDetails> SHORTDESCRIPTIONHANDLER = new OneToManyHandler<DescriptionDetails>(
	CommonproductcoreConstants.TC.DESCRIPTIONDETAILS,
	true,
	"shipDescription",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(HIGHLIGHTS, AttributeMode.INITIAL);
		tmp.put(SELLINGTIPS, AttributeMode.INITIAL);
		tmp.put(UNIQUESELLINGPOINTS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.highlights</code> attribute.
	 * @return the highlights - Highlights
	 */
	public String getHighlights(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HIGHLIGHTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.highlights</code> attribute.
	 * @return the highlights - Highlights
	 */
	public String getHighlights()
	{
		return getHighlights( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.highlights</code> attribute. 
	 * @param value the highlights - Highlights
	 */
	public void setHighlights(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HIGHLIGHTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.highlights</code> attribute. 
	 * @param value the highlights - Highlights
	 */
	public void setHighlights(final String value)
	{
		setHighlights( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public Collection<DescriptionDetails> getLongDescription(final SessionContext ctx)
	{
		return LONGDESCRIPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.longDescription</code> attribute.
	 * @return the longDescription
	 */
	public Collection<DescriptionDetails> getLongDescription()
	{
		return getLongDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		LONGDESCRIPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.longDescription</code> attribute. 
	 * @param value the longDescription
	 */
	public void setLongDescription(final Collection<DescriptionDetails> value)
	{
		setLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescription. 
	 * @param value the item to add to longDescription
	 */
	public void addToLongDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		LONGDESCRIPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to longDescription. 
	 * @param value the item to add to longDescription
	 */
	public void addToLongDescription(final DescriptionDetails value)
	{
		addToLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescription. 
	 * @param value the item to remove from longDescription
	 */
	public void removeFromLongDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		LONGDESCRIPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from longDescription. 
	 * @param value the item to remove from longDescription
	 */
	public void removeFromLongDescription(final DescriptionDetails value)
	{
		removeFromLongDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.sellingTips</code> attribute.
	 * @return the sellingTips - Selling Tips
	 */
	public String getSellingTips(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SELLINGTIPS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.sellingTips</code> attribute.
	 * @return the sellingTips - Selling Tips
	 */
	public String getSellingTips()
	{
		return getSellingTips( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.sellingTips</code> attribute. 
	 * @param value the sellingTips - Selling Tips
	 */
	public void setSellingTips(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SELLINGTIPS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.sellingTips</code> attribute. 
	 * @param value the sellingTips - Selling Tips
	 */
	public void setSellingTips(final String value)
	{
		setSellingTips( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public Collection<DescriptionDetails> getShortDescription(final SessionContext ctx)
	{
		return SHORTDESCRIPTIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.shortDescription</code> attribute.
	 * @return the shortDescription
	 */
	public Collection<DescriptionDetails> getShortDescription()
	{
		return getShortDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final SessionContext ctx, final Collection<DescriptionDetails> value)
	{
		SHORTDESCRIPTIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.shortDescription</code> attribute. 
	 * @param value the shortDescription
	 */
	public void setShortDescription(final Collection<DescriptionDetails> value)
	{
		setShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescription. 
	 * @param value the item to add to shortDescription
	 */
	public void addToShortDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		SHORTDESCRIPTIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to shortDescription. 
	 * @param value the item to add to shortDescription
	 */
	public void addToShortDescription(final DescriptionDetails value)
	{
		addToShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescription. 
	 * @param value the item to remove from shortDescription
	 */
	public void removeFromShortDescription(final SessionContext ctx, final DescriptionDetails value)
	{
		SHORTDESCRIPTIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from shortDescription. 
	 * @param value the item to remove from shortDescription
	 */
	public void removeFromShortDescription(final DescriptionDetails value)
	{
		removeFromShortDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.uniqueSellingPoints</code> attribute.
	 * @return the uniqueSellingPoints - Unique Selling Points
	 */
	public String getUniqueSellingPoints(final SessionContext ctx)
	{
		return (String)getProperty( ctx, UNIQUESELLINGPOINTS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipDescription.uniqueSellingPoints</code> attribute.
	 * @return the uniqueSellingPoints - Unique Selling Points
	 */
	public String getUniqueSellingPoints()
	{
		return getUniqueSellingPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.uniqueSellingPoints</code> attribute. 
	 * @param value the uniqueSellingPoints - Unique Selling Points
	 */
	public void setUniqueSellingPoints(final SessionContext ctx, final String value)
	{
		setProperty(ctx, UNIQUESELLINGPOINTS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipDescription.uniqueSellingPoints</code> attribute. 
	 * @param value the uniqueSellingPoints - Unique Selling Points
	 */
	public void setUniqueSellingPoints(final String value)
	{
		setUniqueSellingPoints( getSession().getSessionContext(), value );
	}
	
}
