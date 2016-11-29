
package com.cnk.travelogix.sapintegrations.subscribe.account.data;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.cnk.travelogix.custom.subscribe.account.ExternalAccountOperationResponse;


/**
 * <p>
 * Java class for ExternalAccountMaintainBundleResponse complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ExternalAccountMaintainBundleResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schema.ws.highdeal.com/}Response">
 *       &lt;sequence>
 *         &lt;element ref="{http://schema.provisioning.ws.highdeal.com/}externalAccountMaintainResponse" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalAccountMaintainBundleResponse", propOrder =
{ "externalAccountMaintainResponse" })
public class ExternalAccountMaintainBundleResponse extends Response
{

	@XmlElement(namespace = "http://schema.provisioning.ws.highdeal.com/", required = true)
	protected List<ExternalAccountOperationResponseData> externalAccountMaintainResponse;

	/**
	 * Gets the value of the externalAccountMaintainResponse property.
	 *
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to
	 * the returned list will be present inside the JAXB object. This is why there is not a <CODE>set</CODE> method for
	 * the externalAccountMaintainResponse property.
	 *
	 * <p>
	 * For example, to add a new item, do as follows:
	 *
	 * <pre>
	 * getExternalAccountMaintainResponse().add(newItem);
	 * </pre>
	 *
	 *
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ExternalAccountOperationResponse }
	 *
	 *
	 */
	public List<ExternalAccountOperationResponseData> getExternalAccountMaintainResponse()
	{
		if (externalAccountMaintainResponse == null)
		{
			externalAccountMaintainResponse = new ArrayList<ExternalAccountOperationResponseData>();
		}
		return this.externalAccountMaintainResponse;
	}

}
