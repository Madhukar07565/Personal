package com.cnk.travelogix.sapintegrations.mappingtable.maintain.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cnk.travelogix.custom.mappingtable.maintain.AdditionalInfo;


public class MaintainMappingTableRequestData
{
	// Operation CREATE_INSERT,INSERT_UPDATE
	protected String operation;
	protected String id;
	protected String mappingTableClassId;
	protected String subscriberAccountId;
	protected List<AdditionalInfoData> additionalInfo;
	private Map<String, List<MappingTableRowData>> servicesMap = null;

	public void setServicesMap(final Map servicesMap)
	{
		this.servicesMap = servicesMap;
	}

	public Map<String, List<MappingTableRowData>> getServicesMap()
	{
		if (servicesMap == null)
		{
			return new HashMap<>();
		}
		return servicesMap;
	}

	/**
	 * Gets the value of the id property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the value of the id property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setId(final String value)
	{
		this.id = value;
	}

	/**
	 * Gets the value of the mappingTableClassId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getMappingTableClassId()
	{
		return mappingTableClassId;
	}

	/**
	 * Sets the value of the mappingTableClassId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setMappingTableClassId(final String value)
	{
		this.mappingTableClassId = value;
	}

	/**
	 * Gets the value of the subscriberAccountId property.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getSubscriberAccountId()
	{
		return subscriberAccountId;
	}

	/**
	 * Sets the value of the subscriberAccountId property.
	 *
	 * @param value
	 *           allowed object is {@link String }
	 *
	 */
	public void setSubscriberAccountId(final String value)
	{
		this.subscriberAccountId = value;
	}

	/**
	 * Gets the value of the additionalInfo property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the additionalInfo property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getAdditionalInfo().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link AdditionalInfo }
	 *
	 *
	 */
	public List<AdditionalInfoData> getAdditionalInfo()
	{
		if (additionalInfo == null)
		{
			additionalInfo = new ArrayList<AdditionalInfoData>();
		}
		return this.additionalInfo;
	}

	/**
	 * @return the operation
	 */
	public String getOperation()
	{
		return operation;
	}

	/**
	 * @param operation
	 *           the operation to set
	 */
	public void setOperation(final String operation)
	{
		this.operation = operation;
	}

}
