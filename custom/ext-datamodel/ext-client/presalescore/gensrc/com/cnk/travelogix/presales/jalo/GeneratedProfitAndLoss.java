/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.PandLTragetProductVolume;
import de.hybris.platform.constants.CoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.c2l.Currency;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.ProfitAndLoss ProfitAndLoss}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedProfitAndLoss extends GenericItem
{
	/** Qualifier of the <code>ProfitAndLoss.currency</code> attribute **/
	public static final String CURRENCY = "currency";
	/** Qualifier of the <code>ProfitAndLoss.totalTravelExpectedSales</code> attribute **/
	public static final String TOTALTRAVELEXPECTEDSALES = "totalTravelExpectedSales";
	/** Qualifier of the <code>ProfitAndLoss.totalTravelExpectedIncome</code> attribute **/
	public static final String TOTALTRAVELEXPECTEDINCOME = "totalTravelExpectedIncome";
	/** Qualifier of the <code>ProfitAndLoss.targetProductVolumes</code> attribute **/
	public static final String TARGETPRODUCTVOLUMES = "targetProductVolumes";
	/** Qualifier of the <code>ProfitAndLoss.uploads</code> attribute **/
	public static final String UPLOADS = "uploads";
	/**
	* {@link OneToManyHandler} for handling 1:n TARGETPRODUCTVOLUMES's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<PandLTragetProductVolume> TARGETPRODUCTVOLUMESHANDLER = new OneToManyHandler<PandLTragetProductVolume>(
	PresalescoreConstants.TC.PANDLTRAGETPRODUCTVOLUME,
	false,
	"profitAndLoss",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	/**
	* {@link OneToManyHandler} for handling 1:n UPLOADS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Media> UPLOADSHANDLER = new OneToManyHandler<Media>(
	CoreConstants.TC.MEDIA,
	false,
	"profitAndLoss",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CURRENCY, AttributeMode.INITIAL);
		tmp.put(TOTALTRAVELEXPECTEDSALES, AttributeMode.INITIAL);
		tmp.put(TOTALTRAVELEXPECTEDINCOME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.currency</code> attribute.
	 * @return the currency - Currency type Profit And Loss
	 */
	public Currency getCurrency(final SessionContext ctx)
	{
		return (Currency)getProperty( ctx, CURRENCY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.currency</code> attribute.
	 * @return the currency - Currency type Profit And Loss
	 */
	public Currency getCurrency()
	{
		return getCurrency( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.currency</code> attribute. 
	 * @param value the currency - Currency type Profit And Loss
	 */
	public void setCurrency(final SessionContext ctx, final Currency value)
	{
		setProperty(ctx, CURRENCY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.currency</code> attribute. 
	 * @param value the currency - Currency type Profit And Loss
	 */
	public void setCurrency(final Currency value)
	{
		setCurrency( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.targetProductVolumes</code> attribute.
	 * @return the targetProductVolumes
	 */
	public Collection<PandLTragetProductVolume> getTargetProductVolumes(final SessionContext ctx)
	{
		return TARGETPRODUCTVOLUMESHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.targetProductVolumes</code> attribute.
	 * @return the targetProductVolumes
	 */
	public Collection<PandLTragetProductVolume> getTargetProductVolumes()
	{
		return getTargetProductVolumes( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.targetProductVolumes</code> attribute. 
	 * @param value the targetProductVolumes
	 */
	public void setTargetProductVolumes(final SessionContext ctx, final Collection<PandLTragetProductVolume> value)
	{
		TARGETPRODUCTVOLUMESHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.targetProductVolumes</code> attribute. 
	 * @param value the targetProductVolumes
	 */
	public void setTargetProductVolumes(final Collection<PandLTragetProductVolume> value)
	{
		setTargetProductVolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to targetProductVolumes. 
	 * @param value the item to add to targetProductVolumes
	 */
	public void addToTargetProductVolumes(final SessionContext ctx, final PandLTragetProductVolume value)
	{
		TARGETPRODUCTVOLUMESHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to targetProductVolumes. 
	 * @param value the item to add to targetProductVolumes
	 */
	public void addToTargetProductVolumes(final PandLTragetProductVolume value)
	{
		addToTargetProductVolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from targetProductVolumes. 
	 * @param value the item to remove from targetProductVolumes
	 */
	public void removeFromTargetProductVolumes(final SessionContext ctx, final PandLTragetProductVolume value)
	{
		TARGETPRODUCTVOLUMESHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from targetProductVolumes. 
	 * @param value the item to remove from targetProductVolumes
	 */
	public void removeFromTargetProductVolumes(final PandLTragetProductVolume value)
	{
		removeFromTargetProductVolumes( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.totalTravelExpectedIncome</code> attribute.
	 * @return the totalTravelExpectedIncome - TotalTravel ExpectedIncome for ProfitAndLoss
	 */
	public String getTotalTravelExpectedIncome(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALTRAVELEXPECTEDINCOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.totalTravelExpectedIncome</code> attribute.
	 * @return the totalTravelExpectedIncome - TotalTravel ExpectedIncome for ProfitAndLoss
	 */
	public String getTotalTravelExpectedIncome()
	{
		return getTotalTravelExpectedIncome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.totalTravelExpectedIncome</code> attribute. 
	 * @param value the totalTravelExpectedIncome - TotalTravel ExpectedIncome for ProfitAndLoss
	 */
	public void setTotalTravelExpectedIncome(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALTRAVELEXPECTEDINCOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.totalTravelExpectedIncome</code> attribute. 
	 * @param value the totalTravelExpectedIncome - TotalTravel ExpectedIncome for ProfitAndLoss
	 */
	public void setTotalTravelExpectedIncome(final String value)
	{
		setTotalTravelExpectedIncome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.totalTravelExpectedSales</code> attribute.
	 * @return the totalTravelExpectedSales - TotalTravel ExpectedSales for ProfitAndLoss
	 */
	public String getTotalTravelExpectedSales(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TOTALTRAVELEXPECTEDSALES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.totalTravelExpectedSales</code> attribute.
	 * @return the totalTravelExpectedSales - TotalTravel ExpectedSales for ProfitAndLoss
	 */
	public String getTotalTravelExpectedSales()
	{
		return getTotalTravelExpectedSales( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.totalTravelExpectedSales</code> attribute. 
	 * @param value the totalTravelExpectedSales - TotalTravel ExpectedSales for ProfitAndLoss
	 */
	public void setTotalTravelExpectedSales(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TOTALTRAVELEXPECTEDSALES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.totalTravelExpectedSales</code> attribute. 
	 * @param value the totalTravelExpectedSales - TotalTravel ExpectedSales for ProfitAndLoss
	 */
	public void setTotalTravelExpectedSales(final String value)
	{
		setTotalTravelExpectedSales( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.uploads</code> attribute.
	 * @return the uploads
	 */
	public Collection<Media> getUploads(final SessionContext ctx)
	{
		return UPLOADSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProfitAndLoss.uploads</code> attribute.
	 * @return the uploads
	 */
	public Collection<Media> getUploads()
	{
		return getUploads( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.uploads</code> attribute. 
	 * @param value the uploads
	 */
	public void setUploads(final SessionContext ctx, final Collection<Media> value)
	{
		UPLOADSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProfitAndLoss.uploads</code> attribute. 
	 * @param value the uploads
	 */
	public void setUploads(final Collection<Media> value)
	{
		setUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploads. 
	 * @param value the item to add to uploads
	 */
	public void addToUploads(final SessionContext ctx, final Media value)
	{
		UPLOADSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to uploads. 
	 * @param value the item to add to uploads
	 */
	public void addToUploads(final Media value)
	{
		addToUploads( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploads. 
	 * @param value the item to remove from uploads
	 */
	public void removeFromUploads(final SessionContext ctx, final Media value)
	{
		UPLOADSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from uploads. 
	 * @param value the item to remove from uploads
	 */
	public void removeFromUploads(final Media value)
	{
		removeFromUploads( getSession().getSessionContext(), value );
	}
	
}
