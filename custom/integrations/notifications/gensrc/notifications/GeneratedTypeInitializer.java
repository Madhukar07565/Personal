

package notifications;

import java.util.*;
import java.io.Serializable;
import de.hybris.platform.util.*;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.type.*;
import de.hybris.platform.persistence.enumeration.*;
import de.hybris.platform.persistence.property.PersistenceManager;
import de.hybris.platform.persistence.*;

/**
 * Generated by hybris Platform.
 */
@SuppressWarnings({"cast","unused","boxing","null", "PMD"})
public class GeneratedTypeInitializer extends AbstractTypeInitializer
{
	/**
	 * Generated by hybris Platform.
	 */
	public GeneratedTypeInitializer( ManagerEJB manager, Map params )
	{
		super( manager, params );
	}


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected void performRemoveObjects( ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// no-op by now
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateTypes
	
	
		createItemType(
			"SMSContext",
			"GenericItem",
			com.cnk.travelogix.jalo.SMSContext.class,
			"de.hybris.platform.persistence.notifications_SMSContext",
			false,
			null,
			false
		);
	
	}

	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performModifyTypes( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performModifyTypes
	

	
	
				single_createattr_SMSContext_smsNotification();
			
				single_createattr_SMSContext_toMobileNumber();
			

	}

	
	public void single_createattr_SMSContext_smsNotification() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"SMSContext", 
					"smsNotification",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	
	public void single_createattr_SMSContext_toMobileNumber() throws JaloBusinessException
	{
		
						Map sqlColumnDefinitions = null;
					
				createPropertyAttribute(
					"SMSContext", 
					"toMobileNumber",  
					null,
					"java.lang.String",
					de.hybris.platform.jalo.type.AttributeDescriptor.READ_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.WRITE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.OPTIONAL_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.REMOVE_FLAG|de.hybris.platform.jalo.type.AttributeDescriptor.SEARCH_FLAG,
					null,
					sqlColumnDefinitions
				);
			
	}
	


	/**
	 * Generated by hybris Platform.
	 */
	@Override
	protected final void performCreateObjects( final ManagerEJB manager, Map params ) throws JaloBusinessException
	{
		// performCreateObjects
	
	
				{
				Map customPropsMap = new HashMap();
				
				setItemTypeProperties(
					"SMSContext",
					false,
					true,
					true,
					null,
					customPropsMap
				);
				}
			
			single_setAttributeProperties_SMSContext_smsNotification();
		
			single_setAttributeProperties_SMSContext_toMobileNumber();
		
	}


		
						public void single_setAttributeProperties_SMSContext_smsNotification() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"SMSContext", 
								"smsNotification",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
						public void single_setAttributeProperties_SMSContext_toMobileNumber() throws JaloBusinessException
						{
							
							
							
							Map customPropsMap = new HashMap();
							
							setAttributeProperties(
								"SMSContext", 
								"toMobileNumber",
								false, 
								null,
								null,
								null,
								true,
								true,
								null,
								customPropsMap,
								null
							);
						}
					
}

	