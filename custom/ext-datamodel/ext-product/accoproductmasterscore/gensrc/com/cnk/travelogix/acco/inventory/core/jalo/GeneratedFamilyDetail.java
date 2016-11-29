/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.acco.inventory.core.jalo;

import com.cnk.travelogix.product.accommodation.masters.core.constants.AccoproductmasterscoreConstants;
import com.cnk.travelogix.product.common.core.jalo.Accommodation;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.acco.inventory.core.jalo.FamilyDetail FamilyDetail}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedFamilyDetail extends GenericItem
{
	/** Qualifier of the <code>FamilyDetail.familyName</code> attribute **/
	public static final String FAMILYNAME = "familyName";
	/** Qualifier of the <code>FamilyDetail.familyDescription</code> attribute **/
	public static final String FAMILYDESCRIPTION = "familyDescription";
	/** Qualifier of the <code>FamilyDetail.familyMember</code> attribute **/
	public static final String FAMILYMEMBER = "familyMember";
	/** Qualifier of the <code>FamilyDetail.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>FamilyDetail.gender</code> attribute **/
	public static final String GENDER = "gender";
	/** Qualifier of the <code>FamilyDetail.memberName</code> attribute **/
	public static final String MEMBERNAME = "memberName";
	/** Qualifier of the <code>FamilyDetail.familyMemberDescription</code> attribute **/
	public static final String FAMILYMEMBERDESCRIPTION = "familyMemberDescription";
	/** Qualifier of the <code>FamilyDetail.accommodation</code> attribute **/
	public static final String ACCOMMODATION = "accommodation";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n ACCOMMODATION's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedFamilyDetail> ACCOMMODATIONHANDLER = new BidirectionalOneToManyHandler<GeneratedFamilyDetail>(
	AccoproductmasterscoreConstants.TC.FAMILYDETAIL,
	false,
	"accommodation",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FAMILYNAME, AttributeMode.INITIAL);
		tmp.put(FAMILYDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(FAMILYMEMBER, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(GENDER, AttributeMode.INITIAL);
		tmp.put(MEMBERNAME, AttributeMode.INITIAL);
		tmp.put(FAMILYMEMBERDESCRIPTION, AttributeMode.INITIAL);
		tmp.put(ACCOMMODATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation(final SessionContext ctx)
	{
		return (Accommodation)getProperty( ctx, ACCOMMODATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.accommodation</code> attribute.
	 * @return the accommodation
	 */
	public Accommodation getAccommodation()
	{
		return getAccommodation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final SessionContext ctx, final Accommodation value)
	{
		ACCOMMODATIONHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.accommodation</code> attribute. 
	 * @param value the accommodation
	 */
	public void setAccommodation(final Accommodation value)
	{
		setAccommodation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.age</code> attribute.
	 * @return the age - Age
	 */
	public String getAge(final SessionContext ctx)
	{
		return (String)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.age</code> attribute.
	 * @return the age - Age
	 */
	public String getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final SessionContext ctx, final String value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.age</code> attribute. 
	 * @param value the age - Age
	 */
	public void setAge(final String value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		ACCOMMODATIONHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyDescription</code> attribute.
	 * @return the familyDescription - Family Description
	 */
	public String getFamilyDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAMILYDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyDescription</code> attribute.
	 * @return the familyDescription - Family Description
	 */
	public String getFamilyDescription()
	{
		return getFamilyDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyDescription</code> attribute. 
	 * @param value the familyDescription - Family Description
	 */
	public void setFamilyDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAMILYDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyDescription</code> attribute. 
	 * @param value the familyDescription - Family Description
	 */
	public void setFamilyDescription(final String value)
	{
		setFamilyDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyMember</code> attribute.
	 * @return the familyMember - Family Member
	 */
	public String getFamilyMember(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAMILYMEMBER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyMember</code> attribute.
	 * @return the familyMember - Family Member
	 */
	public String getFamilyMember()
	{
		return getFamilyMember( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyMember</code> attribute. 
	 * @param value the familyMember - Family Member
	 */
	public void setFamilyMember(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAMILYMEMBER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyMember</code> attribute. 
	 * @param value the familyMember - Family Member
	 */
	public void setFamilyMember(final String value)
	{
		setFamilyMember( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyMemberDescription</code> attribute.
	 * @return the familyMemberDescription - family Member Description
	 */
	public String getFamilyMemberDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAMILYMEMBERDESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyMemberDescription</code> attribute.
	 * @return the familyMemberDescription - family Member Description
	 */
	public String getFamilyMemberDescription()
	{
		return getFamilyMemberDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyMemberDescription</code> attribute. 
	 * @param value the familyMemberDescription - family Member Description
	 */
	public void setFamilyMemberDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAMILYMEMBERDESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyMemberDescription</code> attribute. 
	 * @param value the familyMemberDescription - family Member Description
	 */
	public void setFamilyMemberDescription(final String value)
	{
		setFamilyMemberDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyName</code> attribute.
	 * @return the familyName - Family Name
	 */
	public String getFamilyName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FAMILYNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.familyName</code> attribute.
	 * @return the familyName - Family Name
	 */
	public String getFamilyName()
	{
		return getFamilyName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyName</code> attribute. 
	 * @param value the familyName - Family Name
	 */
	public void setFamilyName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FAMILYNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.familyName</code> attribute. 
	 * @param value the familyName - Family Name
	 */
	public void setFamilyName(final String value)
	{
		setFamilyName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.gender</code> attribute.
	 * @return the gender - Gender
	 */
	public EnumerationValue getGender(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENDER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.gender</code> attribute.
	 * @return the gender - Gender
	 */
	public EnumerationValue getGender()
	{
		return getGender( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.gender</code> attribute. 
	 * @param value the gender - Gender
	 */
	public void setGender(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENDER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.gender</code> attribute. 
	 * @param value the gender - Gender
	 */
	public void setGender(final EnumerationValue value)
	{
		setGender( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.memberName</code> attribute.
	 * @return the memberName - Member Name
	 */
	public String getMemberName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, MEMBERNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>FamilyDetail.memberName</code> attribute.
	 * @return the memberName - Member Name
	 */
	public String getMemberName()
	{
		return getMemberName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.memberName</code> attribute. 
	 * @param value the memberName - Member Name
	 */
	public void setMemberName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, MEMBERNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>FamilyDetail.memberName</code> attribute. 
	 * @param value the memberName - Member Name
	 */
	public void setMemberName(final String value)
	{
		setMemberName( getSession().getSessionContext(), value );
	}
	
}
