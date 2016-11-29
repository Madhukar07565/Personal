/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Sep 4, 2016 7:13:30 PM                      ---
 * ----------------------------------------------------------------
 */
package com.cnk.travelogix.supplier.commercials.core.jalo;

import com.cnk.travelogix.supplier.commercials.core.advanced.signupbonus.jalo.SupplierSignUpBonusCommercialRecord;
import com.cnk.travelogix.supplier.commercials.core.constants.SuppliercommercialscoreConstants;
import com.cnk.travelogix.supplier.commercials.core.jalo.SupplierAdvanceCommercial;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Generated class for type {@link com.cnk.travelogix.supplier.commercials.core.jalo.SupplierSignUpBonusCommercial SupplierSignUpBonusCommercial}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedSupplierSignUpBonusCommercial extends SupplierAdvanceCommercial
{
	/** Qualifier of the <code>SupplierSignUpBonusCommercial.signUpBonusRecord</code> attribute **/
	public static final String SIGNUPBONUSRECORD = "signUpBonusRecord";
	/**
	* {@link OneToManyHandler} for handling 1:n SIGNUPBONUSRECORD's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<SupplierSignUpBonusCommercialRecord> SIGNUPBONUSRECORDHANDLER = new OneToManyHandler<SupplierSignUpBonusCommercialRecord>(
	SuppliercommercialscoreConstants.TC.SUPPLIERSIGNUPBONUSCOMMERCIALRECORD,
	true,
	"signUpBonusCommercial",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SupplierAdvanceCommercial.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercial.signUpBonusRecord</code> attribute.
	 * @return the signUpBonusRecord
	 */
	public Set<SupplierSignUpBonusCommercialRecord> getSignUpBonusRecord(final SessionContext ctx)
	{
		return (Set<SupplierSignUpBonusCommercialRecord>)SIGNUPBONUSRECORDHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>SupplierSignUpBonusCommercial.signUpBonusRecord</code> attribute.
	 * @return the signUpBonusRecord
	 */
	public Set<SupplierSignUpBonusCommercialRecord> getSignUpBonusRecord()
	{
		return getSignUpBonusRecord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercial.signUpBonusRecord</code> attribute. 
	 * @param value the signUpBonusRecord
	 */
	public void setSignUpBonusRecord(final SessionContext ctx, final Set<SupplierSignUpBonusCommercialRecord> value)
	{
		SIGNUPBONUSRECORDHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>SupplierSignUpBonusCommercial.signUpBonusRecord</code> attribute. 
	 * @param value the signUpBonusRecord
	 */
	public void setSignUpBonusRecord(final Set<SupplierSignUpBonusCommercialRecord> value)
	{
		setSignUpBonusRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to signUpBonusRecord. 
	 * @param value the item to add to signUpBonusRecord
	 */
	public void addToSignUpBonusRecord(final SessionContext ctx, final SupplierSignUpBonusCommercialRecord value)
	{
		SIGNUPBONUSRECORDHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to signUpBonusRecord. 
	 * @param value the item to add to signUpBonusRecord
	 */
	public void addToSignUpBonusRecord(final SupplierSignUpBonusCommercialRecord value)
	{
		addToSignUpBonusRecord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from signUpBonusRecord. 
	 * @param value the item to remove from signUpBonusRecord
	 */
	public void removeFromSignUpBonusRecord(final SessionContext ctx, final SupplierSignUpBonusCommercialRecord value)
	{
		SIGNUPBONUSRECORDHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from signUpBonusRecord. 
	 * @param value the item to remove from signUpBonusRecord
	 */
	public void removeFromSignUpBonusRecord(final SupplierSignUpBonusCommercialRecord value)
	{
		removeFromSignUpBonusRecord( getSession().getSessionContext(), value );
	}
	
}
