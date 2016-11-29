/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.product.activity.masters.core.jalo;

import com.cnk.travelogix.product.activity.masters.core.constants.ActivityproductmasterscoreConstants;
import com.cnk.travelogix.product.activity.masters.core.jalo.PreArrivalInfo;
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
 * Generated class for type {@link com.cnk.travelogix.product.activity.masters.core.jalo.DiningTips DiningTips}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedDiningTips extends GenericItem
{
	/** Qualifier of the <code>DiningTips.diningTipsId</code> attribute **/
	public static final String DININGTIPSID = "diningTipsId";
	/** Qualifier of the <code>DiningTips.reservation</code> attribute **/
	public static final String RESERVATION = "reservation";
	/** Qualifier of the <code>DiningTips.characterDining</code> attribute **/
	public static final String CHARACTERDINING = "characterDining";
	/** Qualifier of the <code>DiningTips.casualDining</code> attribute **/
	public static final String CASUALDINING = "casualDining";
	/** Qualifier of the <code>DiningTips.signatureDining</code> attribute **/
	public static final String SIGNATUREDINING = "signatureDining";
	/** Qualifier of the <code>DiningTips.specialAndUniqueDining</code> attribute **/
	public static final String SPECIALANDUNIQUEDINING = "specialAndUniqueDining";
	/** Qualifier of the <code>DiningTips.quickServicesDining</code> attribute **/
	public static final String QUICKSERVICESDINING = "quickServicesDining";
	/** Qualifier of the <code>DiningTips.barsAndLounges</code> attribute **/
	public static final String BARSANDLOUNGES = "barsAndLounges";
	/** Qualifier of the <code>DiningTips.disneyDiningPlan</code> attribute **/
	public static final String DISNEYDININGPLAN = "disneyDiningPlan";
	/** Qualifier of the <code>DiningTips.preArrival</code> attribute **/
	public static final String PREARRIVAL = "preArrival";
	/**
	* {@link OneToManyHandler} for handling 1:n PREARRIVAL's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PreArrivalInfo> PREARRIVALHANDLER = new OneToManyHandler<PreArrivalInfo>(
	ActivityproductmasterscoreConstants.TC.PREARRIVALINFO,
	false,
	"diningTips",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(DININGTIPSID, AttributeMode.INITIAL);
		tmp.put(RESERVATION, AttributeMode.INITIAL);
		tmp.put(CHARACTERDINING, AttributeMode.INITIAL);
		tmp.put(CASUALDINING, AttributeMode.INITIAL);
		tmp.put(SIGNATUREDINING, AttributeMode.INITIAL);
		tmp.put(SPECIALANDUNIQUEDINING, AttributeMode.INITIAL);
		tmp.put(QUICKSERVICESDINING, AttributeMode.INITIAL);
		tmp.put(BARSANDLOUNGES, AttributeMode.INITIAL);
		tmp.put(DISNEYDININGPLAN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.barsAndLounges</code> attribute.
	 * @return the barsAndLounges - Bars And Lounges.
	 */
	public String getBarsAndLounges(final SessionContext ctx)
	{
		return (String)getProperty( ctx, BARSANDLOUNGES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.barsAndLounges</code> attribute.
	 * @return the barsAndLounges - Bars And Lounges.
	 */
	public String getBarsAndLounges()
	{
		return getBarsAndLounges( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.barsAndLounges</code> attribute. 
	 * @param value the barsAndLounges - Bars And Lounges.
	 */
	public void setBarsAndLounges(final SessionContext ctx, final String value)
	{
		setProperty(ctx, BARSANDLOUNGES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.barsAndLounges</code> attribute. 
	 * @param value the barsAndLounges - Bars And Lounges.
	 */
	public void setBarsAndLounges(final String value)
	{
		setBarsAndLounges( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.casualDining</code> attribute.
	 * @return the casualDining - Casual Dining.
	 */
	public String getCasualDining(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CASUALDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.casualDining</code> attribute.
	 * @return the casualDining - Casual Dining.
	 */
	public String getCasualDining()
	{
		return getCasualDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.casualDining</code> attribute. 
	 * @param value the casualDining - Casual Dining.
	 */
	public void setCasualDining(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CASUALDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.casualDining</code> attribute. 
	 * @param value the casualDining - Casual Dining.
	 */
	public void setCasualDining(final String value)
	{
		setCasualDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.characterDining</code> attribute.
	 * @return the characterDining - Character Dining.
	 */
	public String getCharacterDining(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CHARACTERDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.characterDining</code> attribute.
	 * @return the characterDining - Character Dining.
	 */
	public String getCharacterDining()
	{
		return getCharacterDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.characterDining</code> attribute. 
	 * @param value the characterDining - Character Dining.
	 */
	public void setCharacterDining(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CHARACTERDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.characterDining</code> attribute. 
	 * @param value the characterDining - Character Dining.
	 */
	public void setCharacterDining(final String value)
	{
		setCharacterDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.diningTipsId</code> attribute.
	 * @return the diningTipsId - Dining tip ID.
	 */
	public String getDiningTipsId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DININGTIPSID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.diningTipsId</code> attribute.
	 * @return the diningTipsId - Dining tip ID.
	 */
	public String getDiningTipsId()
	{
		return getDiningTipsId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.diningTipsId</code> attribute. 
	 * @param value the diningTipsId - Dining tip ID.
	 */
	public void setDiningTipsId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DININGTIPSID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.diningTipsId</code> attribute. 
	 * @param value the diningTipsId - Dining tip ID.
	 */
	public void setDiningTipsId(final String value)
	{
		setDiningTipsId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.disneyDiningPlan</code> attribute.
	 * @return the disneyDiningPlan - Disney Dining Plan.
	 */
	public String getDisneyDiningPlan(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DISNEYDININGPLAN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.disneyDiningPlan</code> attribute.
	 * @return the disneyDiningPlan - Disney Dining Plan.
	 */
	public String getDisneyDiningPlan()
	{
		return getDisneyDiningPlan( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.disneyDiningPlan</code> attribute. 
	 * @param value the disneyDiningPlan - Disney Dining Plan.
	 */
	public void setDisneyDiningPlan(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DISNEYDININGPLAN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.disneyDiningPlan</code> attribute. 
	 * @param value the disneyDiningPlan - Disney Dining Plan.
	 */
	public void setDisneyDiningPlan(final String value)
	{
		setDisneyDiningPlan( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.preArrival</code> attribute.
	 * @return the preArrival
	 */
	public Collection<PreArrivalInfo> getPreArrival(final SessionContext ctx)
	{
		return PREARRIVALHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.preArrival</code> attribute.
	 * @return the preArrival
	 */
	public Collection<PreArrivalInfo> getPreArrival()
	{
		return getPreArrival( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.preArrival</code> attribute. 
	 * @param value the preArrival
	 */
	public void setPreArrival(final SessionContext ctx, final Collection<PreArrivalInfo> value)
	{
		PREARRIVALHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.preArrival</code> attribute. 
	 * @param value the preArrival
	 */
	public void setPreArrival(final Collection<PreArrivalInfo> value)
	{
		setPreArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preArrival. 
	 * @param value the item to add to preArrival
	 */
	public void addToPreArrival(final SessionContext ctx, final PreArrivalInfo value)
	{
		PREARRIVALHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to preArrival. 
	 * @param value the item to add to preArrival
	 */
	public void addToPreArrival(final PreArrivalInfo value)
	{
		addToPreArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preArrival. 
	 * @param value the item to remove from preArrival
	 */
	public void removeFromPreArrival(final SessionContext ctx, final PreArrivalInfo value)
	{
		PREARRIVALHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from preArrival. 
	 * @param value the item to remove from preArrival
	 */
	public void removeFromPreArrival(final PreArrivalInfo value)
	{
		removeFromPreArrival( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.quickServicesDining</code> attribute.
	 * @return the quickServicesDining - Quick Services Dining.
	 */
	public String getQuickServicesDining(final SessionContext ctx)
	{
		return (String)getProperty( ctx, QUICKSERVICESDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.quickServicesDining</code> attribute.
	 * @return the quickServicesDining - Quick Services Dining.
	 */
	public String getQuickServicesDining()
	{
		return getQuickServicesDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.quickServicesDining</code> attribute. 
	 * @param value the quickServicesDining - Quick Services Dining.
	 */
	public void setQuickServicesDining(final SessionContext ctx, final String value)
	{
		setProperty(ctx, QUICKSERVICESDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.quickServicesDining</code> attribute. 
	 * @param value the quickServicesDining - Quick Services Dining.
	 */
	public void setQuickServicesDining(final String value)
	{
		setQuickServicesDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public String getReservation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RESERVATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.reservation</code> attribute.
	 * @return the reservation - Reservation.
	 */
	public String getReservation()
	{
		return getReservation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RESERVATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.reservation</code> attribute. 
	 * @param value the reservation - Reservation.
	 */
	public void setReservation(final String value)
	{
		setReservation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.signatureDining</code> attribute.
	 * @return the signatureDining - Signature Dining.
	 */
	public String getSignatureDining(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SIGNATUREDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.signatureDining</code> attribute.
	 * @return the signatureDining - Signature Dining.
	 */
	public String getSignatureDining()
	{
		return getSignatureDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.signatureDining</code> attribute. 
	 * @param value the signatureDining - Signature Dining.
	 */
	public void setSignatureDining(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SIGNATUREDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.signatureDining</code> attribute. 
	 * @param value the signatureDining - Signature Dining.
	 */
	public void setSignatureDining(final String value)
	{
		setSignatureDining( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.specialAndUniqueDining</code> attribute.
	 * @return the specialAndUniqueDining - Special And Unique Dining.
	 */
	public String getSpecialAndUniqueDining(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SPECIALANDUNIQUEDINING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>DiningTips.specialAndUniqueDining</code> attribute.
	 * @return the specialAndUniqueDining - Special And Unique Dining.
	 */
	public String getSpecialAndUniqueDining()
	{
		return getSpecialAndUniqueDining( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.specialAndUniqueDining</code> attribute. 
	 * @param value the specialAndUniqueDining - Special And Unique Dining.
	 */
	public void setSpecialAndUniqueDining(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SPECIALANDUNIQUEDINING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>DiningTips.specialAndUniqueDining</code> attribute. 
	 * @param value the specialAndUniqueDining - Special And Unique Dining.
	 */
	public void setSpecialAndUniqueDining(final String value)
	{
		setSpecialAndUniqueDining( getSession().getSessionContext(), value );
	}
	
}
