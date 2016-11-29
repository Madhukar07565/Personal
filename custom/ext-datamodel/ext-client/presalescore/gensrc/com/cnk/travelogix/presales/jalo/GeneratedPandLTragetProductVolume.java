/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.presales.jalo;

import com.cnk.travelogix.presales.core.constants.PresalescoreConstants;
import com.cnk.travelogix.presales.jalo.AbstractTargetProductVolume;
import com.cnk.travelogix.presales.jalo.ProfitAndLoss;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link com.cnk.travelogix.presales.jalo.PandLTragetProductVolume PandLTragetProductVolume}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPandLTragetProductVolume extends AbstractTargetProductVolume
{
	/** Qualifier of the <code>PandLTragetProductVolume.expectedIncome</code> attribute **/
	public static final String EXPECTEDINCOME = "expectedIncome";
	/** Qualifier of the <code>PandLTragetProductVolume.versionId</code> attribute **/
	public static final String VERSIONID = "versionId";
	/** Qualifier of the <code>PandLTragetProductVolume.profitAndLoss</code> attribute **/
	public static final String PROFITANDLOSS = "profitAndLoss";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n PROFITANDLOSS's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPandLTragetProductVolume> PROFITANDLOSSHANDLER = new BidirectionalOneToManyHandler<GeneratedPandLTragetProductVolume>(
	PresalescoreConstants.TC.PANDLTRAGETPRODUCTVOLUME,
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
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(AbstractTargetProductVolume.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(EXPECTEDINCOME, AttributeMode.INITIAL);
		tmp.put(VERSIONID, AttributeMode.INITIAL);
		tmp.put(PROFITANDLOSS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		PROFITANDLOSSHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.expectedIncome</code> attribute.
	 * @return the expectedIncome - ExpectedIncome of TragetProductVolume in profit and loss
	 */
	public BigDecimal getExpectedIncome(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, EXPECTEDINCOME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.expectedIncome</code> attribute.
	 * @return the expectedIncome - ExpectedIncome of TragetProductVolume in profit and loss
	 */
	public BigDecimal getExpectedIncome()
	{
		return getExpectedIncome( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.expectedIncome</code> attribute. 
	 * @param value the expectedIncome - ExpectedIncome of TragetProductVolume in profit and loss
	 */
	public void setExpectedIncome(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, EXPECTEDINCOME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.expectedIncome</code> attribute. 
	 * @param value the expectedIncome - ExpectedIncome of TragetProductVolume in profit and loss
	 */
	public void setExpectedIncome(final BigDecimal value)
	{
		setExpectedIncome( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.profitAndLoss</code> attribute.
	 * @return the profitAndLoss
	 */
	public ProfitAndLoss getProfitAndLoss(final SessionContext ctx)
	{
		return (ProfitAndLoss)getProperty( ctx, PROFITANDLOSS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.profitAndLoss</code> attribute.
	 * @return the profitAndLoss
	 */
	public ProfitAndLoss getProfitAndLoss()
	{
		return getProfitAndLoss( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss
	 */
	public void setProfitAndLoss(final SessionContext ctx, final ProfitAndLoss value)
	{
		PROFITANDLOSSHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.profitAndLoss</code> attribute. 
	 * @param value the profitAndLoss
	 */
	public void setProfitAndLoss(final ProfitAndLoss value)
	{
		setProfitAndLoss( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.versionId</code> attribute.
	 * @return the versionId - Version Id
	 */
	public Integer getVersionId(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, VERSIONID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.versionId</code> attribute.
	 * @return the versionId - Version Id
	 */
	public Integer getVersionId()
	{
		return getVersionId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @return the versionId - Version Id
	 */
	public int getVersionIdAsPrimitive(final SessionContext ctx)
	{
		Integer value = getVersionId( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @return the versionId - Version Id
	 */
	public int getVersionIdAsPrimitive()
	{
		return getVersionIdAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @param value the versionId - Version Id
	 */
	public void setVersionId(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, VERSIONID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @param value the versionId - Version Id
	 */
	public void setVersionId(final Integer value)
	{
		setVersionId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @param value the versionId - Version Id
	 */
	public void setVersionId(final SessionContext ctx, final int value)
	{
		setVersionId( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>PandLTragetProductVolume.versionId</code> attribute. 
	 * @param value the versionId - Version Id
	 */
	public void setVersionId(final int value)
	{
		setVersionId( getSession().getSessionContext(), value );
	}
	
}
