/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.common.core.jalo;

import com.cnk.travelogix.product.transport.masters.core.constants.TransportproductmasterscoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.product.common.core.jalo.ShipOverview ShipOverview}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedShipOverview extends GenericItem
{
	/** Qualifier of the <code>ShipOverview.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>ShipOverview.type</code> attribute **/
	public static final String TYPE = "type";
	/** Qualifier of the <code>ShipOverview.model</code> attribute **/
	public static final String MODEL = "model";
	/** Qualifier of the <code>ShipOverview.builder</code> attribute **/
	public static final String BUILDER = "builder";
	/** Qualifier of the <code>ShipOverview.navalArchitect</code> attribute **/
	public static final String NAVALARCHITECT = "navalArchitect";
	/** Qualifier of the <code>ShipOverview.exteriorDesign</code> attribute **/
	public static final String EXTERIORDESIGN = "exteriorDesign";
	/** Qualifier of the <code>ShipOverview.interiorDesign</code> attribute **/
	public static final String INTERIORDESIGN = "interiorDesign";
	/** Qualifier of the <code>ShipOverview.year</code> attribute **/
	public static final String YEAR = "year";
	/** Qualifier of the <code>ShipOverview.refurbished</code> attribute **/
	public static final String REFURBISHED = "refurbished";
	/** Qualifier of the <code>ShipOverview.refurbishedDescription</code> attribute **/
	public static final String REFURBISHEDDESCRIPTION = "refurbishedDescription";
	/** Qualifier of the <code>ShipOverview.flag</code> attribute **/
	public static final String FLAG = "flag";
	/** Qualifier of the <code>ShipOverview.subType</code> attribute **/
	public static final String SUBTYPE = "subType";
	/** Qualifier of the <code>ShipOverview.mca</code> attribute **/
	public static final String MCA = "mca";
	/** Qualifier of the <code>ShipOverview.shipClass</code> attribute **/
	public static final String SHIPCLASS = "shipClass";
	/** Qualifier of the <code>ShipOverview.hullNB</code> attribute **/
	public static final String HULLNB = "hullNB";
	/** Qualifier of the <code>ShipOverview.hullColor</code> attribute **/
	public static final String HULLCOLOR = "hullColor";
	/** Qualifier of the <code>ShipOverview.formalyKnownAs</code> attribute **/
	public static final String FORMALYKNOWNAS = "formalyKnownAs";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(TYPE, AttributeMode.INITIAL);
		tmp.put(MODEL, AttributeMode.INITIAL);
		tmp.put(BUILDER, AttributeMode.INITIAL);
		tmp.put(NAVALARCHITECT, AttributeMode.INITIAL);
		tmp.put(EXTERIORDESIGN, AttributeMode.INITIAL);
		tmp.put(INTERIORDESIGN, AttributeMode.INITIAL);
		tmp.put(YEAR, AttributeMode.INITIAL);
		tmp.put(REFURBISHED, AttributeMode.INITIAL);
		tmp.put(REFURBISHEDDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FLAG, AttributeMode.INITIAL);
		tmp.put(SUBTYPE, AttributeMode.INITIAL);
		tmp.put(MCA, AttributeMode.INITIAL);
		tmp.put(SHIPCLASS, AttributeMode.INITIAL);
		tmp.put(HULLNB, AttributeMode.INITIAL);
		tmp.put(HULLCOLOR, AttributeMode.INITIAL);
		tmp.put(FORMALYKNOWNAS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.builder</code> attribute.
	 * @return the builder - Builder
	 */
	public String getBuilder(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BUILDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.builder</code> attribute.
	 * @return the builder - Builder
	 */
	public String getBuilder()
	{
		return getBuilder( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.builder</code> attribute. 
	 * @param value the builder - Builder
	 */
	public void setBuilder(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BUILDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.builder</code> attribute. 
	 * @param value the builder - Builder
	 */
	public void setBuilder(final String value)
	{
		setBuilder( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.exteriorDesign</code> attribute.
	 * @return the exteriorDesign - Exterior Design
	 */
	public String getExteriorDesign(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EXTERIORDESIGN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.exteriorDesign</code> attribute.
	 * @return the exteriorDesign - Exterior Design
	 */
	public String getExteriorDesign()
	{
		return getExteriorDesign( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.exteriorDesign</code> attribute. 
	 * @param value the exteriorDesign - Exterior Design
	 */
	public void setExteriorDesign(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EXTERIORDESIGN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.exteriorDesign</code> attribute. 
	 * @param value the exteriorDesign - Exterior Design
	 */
	public void setExteriorDesign(final String value)
	{
		setExteriorDesign( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.flag</code> attribute.
	 * @return the flag - Flag
	 */
	public String getFlag(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FLAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.flag</code> attribute.
	 * @return the flag - Flag
	 */
	public String getFlag()
	{
		return getFlag( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.flag</code> attribute. 
	 * @param value the flag - Flag
	 */
	public void setFlag(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FLAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.flag</code> attribute. 
	 * @param value the flag - Flag
	 */
	public void setFlag(final String value)
	{
		setFlag( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.formalyKnownAs</code> attribute.
	 * @return the formalyKnownAs - Formaly Known As
	 */
	public String getFormalyKnownAs(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FORMALYKNOWNAS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.formalyKnownAs</code> attribute.
	 * @return the formalyKnownAs - Formaly Known As
	 */
	public String getFormalyKnownAs()
	{
		return getFormalyKnownAs( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.formalyKnownAs</code> attribute. 
	 * @param value the formalyKnownAs - Formaly Known As
	 */
	public void setFormalyKnownAs(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FORMALYKNOWNAS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.formalyKnownAs</code> attribute. 
	 * @param value the formalyKnownAs - Formaly Known As
	 */
	public void setFormalyKnownAs(final String value)
	{
		setFormalyKnownAs( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.hullColor</code> attribute.
	 * @return the hullColor - Hull Color
	 */
	public String getHullColor(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HULLCOLOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.hullColor</code> attribute.
	 * @return the hullColor - Hull Color
	 */
	public String getHullColor()
	{
		return getHullColor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.hullColor</code> attribute. 
	 * @param value the hullColor - Hull Color
	 */
	public void setHullColor(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HULLCOLOR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.hullColor</code> attribute. 
	 * @param value the hullColor - Hull Color
	 */
	public void setHullColor(final String value)
	{
		setHullColor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.hullNB</code> attribute.
	 * @return the hullNB - Hull NB
	 */
	public String getHullNB(final SessionContext ctx)
	{
		return (String)getProperty( ctx, HULLNB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.hullNB</code> attribute.
	 * @return the hullNB - Hull NB
	 */
	public String getHullNB()
	{
		return getHullNB( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.hullNB</code> attribute. 
	 * @param value the hullNB - Hull NB
	 */
	public void setHullNB(final SessionContext ctx, final String value)
	{
		setProperty(ctx, HULLNB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.hullNB</code> attribute. 
	 * @param value the hullNB - Hull NB
	 */
	public void setHullNB(final String value)
	{
		setHullNB( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.interiorDesign</code> attribute.
	 * @return the interiorDesign - Interior Design
	 */
	public String getInteriorDesign(final SessionContext ctx)
	{
		return (String)getProperty( ctx, INTERIORDESIGN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.interiorDesign</code> attribute.
	 * @return the interiorDesign - Interior Design
	 */
	public String getInteriorDesign()
	{
		return getInteriorDesign( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.interiorDesign</code> attribute. 
	 * @param value the interiorDesign - Interior Design
	 */
	public void setInteriorDesign(final SessionContext ctx, final String value)
	{
		setProperty(ctx, INTERIORDESIGN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.interiorDesign</code> attribute. 
	 * @param value the interiorDesign - Interior Design
	 */
	public void setInteriorDesign(final String value)
	{
		setInteriorDesign( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.mca</code> attribute.
	 * @return the mca - Mca
	 */
	public String getMca(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MCA);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.mca</code> attribute.
	 * @return the mca - Mca
	 */
	public String getMca()
	{
		return getMca( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.mca</code> attribute. 
	 * @param value the mca - Mca
	 */
	public void setMca(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MCA,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.mca</code> attribute. 
	 * @param value the mca - Mca
	 */
	public void setMca(final String value)
	{
		setMca( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.model</code> attribute.
	 * @return the model - Model
	 */
	public String getModel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MODEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.model</code> attribute.
	 * @return the model - Model
	 */
	public String getModel()
	{
		return getModel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.model</code> attribute. 
	 * @param value the model - Model
	 */
	public void setModel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MODEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.model</code> attribute. 
	 * @param value the model - Model
	 */
	public void setModel(final String value)
	{
		setModel( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.name</code> attribute.
	 * @return the name - name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.name</code> attribute.
	 * @return the name - name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.name</code> attribute. 
	 * @param value the name - name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.name</code> attribute. 
	 * @param value the name - name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.navalArchitect</code> attribute.
	 * @return the navalArchitect - Naval Architect
	 */
	public String getNavalArchitect(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAVALARCHITECT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.navalArchitect</code> attribute.
	 * @return the navalArchitect - Naval Architect
	 */
	public String getNavalArchitect()
	{
		return getNavalArchitect( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.navalArchitect</code> attribute. 
	 * @param value the navalArchitect - Naval Architect
	 */
	public void setNavalArchitect(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAVALARCHITECT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.navalArchitect</code> attribute. 
	 * @param value the navalArchitect - Naval Architect
	 */
	public void setNavalArchitect(final String value)
	{
		setNavalArchitect( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.refurbished</code> attribute.
	 * @return the refurbished - Refurbished
	 */
	public String getRefurbished(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFURBISHED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.refurbished</code> attribute.
	 * @return the refurbished - Refurbished
	 */
	public String getRefurbished()
	{
		return getRefurbished( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.refurbished</code> attribute. 
	 * @param value the refurbished - Refurbished
	 */
	public void setRefurbished(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFURBISHED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.refurbished</code> attribute. 
	 * @param value the refurbished - Refurbished
	 */
	public void setRefurbished(final String value)
	{
		setRefurbished( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.refurbishedDescription</code> attribute.
	 * @return the refurbishedDescription - Refurbished Description
	 */
	public String getRefurbishedDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, REFURBISHEDDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.refurbishedDescription</code> attribute.
	 * @return the refurbishedDescription - Refurbished Description
	 */
	public String getRefurbishedDescription()
	{
		return getRefurbishedDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.refurbishedDescription</code> attribute. 
	 * @param value the refurbishedDescription - Refurbished Description
	 */
	public void setRefurbishedDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, REFURBISHEDDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.refurbishedDescription</code> attribute. 
	 * @param value the refurbishedDescription - Refurbished Description
	 */
	public void setRefurbishedDescription(final String value)
	{
		setRefurbishedDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.shipClass</code> attribute.
	 * @return the shipClass - Class
	 */
	public String getShipClass(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SHIPCLASS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.shipClass</code> attribute.
	 * @return the shipClass - Class
	 */
	public String getShipClass()
	{
		return getShipClass( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.shipClass</code> attribute. 
	 * @param value the shipClass - Class
	 */
	public void setShipClass(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SHIPCLASS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.shipClass</code> attribute. 
	 * @param value the shipClass - Class
	 */
	public void setShipClass(final String value)
	{
		setShipClass( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.subType</code> attribute.
	 * @return the subType - SubType
	 */
	public String getSubType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SUBTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.subType</code> attribute.
	 * @return the subType - SubType
	 */
	public String getSubType()
	{
		return getSubType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.subType</code> attribute. 
	 * @param value the subType - SubType
	 */
	public void setSubType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SUBTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.subType</code> attribute. 
	 * @param value the subType - SubType
	 */
	public void setSubType(final String value)
	{
		setSubType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.type</code> attribute.
	 * @return the type - Type
	 */
	public String getType(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.type</code> attribute.
	 * @return the type - Type
	 */
	public String getType()
	{
		return getType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.type</code> attribute. 
	 * @param value the type - Type
	 */
	public void setType(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.type</code> attribute. 
	 * @param value the type - Type
	 */
	public void setType(final String value)
	{
		setType( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.year</code> attribute.
	 * @return the year - Year
	 */
	public Date getYear(final SessionContext ctx)
	{
		return (Date)getProperty( ctx, YEAR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ShipOverview.year</code> attribute.
	 * @return the year - Year
	 */
	public Date getYear()
	{
		return getYear( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.year</code> attribute. 
	 * @param value the year - Year
	 */
	public void setYear(final SessionContext ctx, final Date value)
	{
		setProperty(ctx, YEAR,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ShipOverview.year</code> attribute. 
	 * @param value the year - Year
	 */
	public void setYear(final Date value)
	{
		setYear( getSession().getSessionContext(), value );
	}
	
}
