
package com.cnk.travelogix.custom.zifwsb.inv.cancel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ZIFWS_INV_CANCEL", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ZIFWSINVCANCEL {


    /**
     * 
     * @param pBillingdoc
     * @param pUniqid
     * @return
     *     returns com.cnk.travelogix.custom.zifwsb.inv.cancel.ZifstStatusDoc
     */
    @WebMethod(operationName = "ZIffmBillingdocCancel", action = "urn:sap-com:document:sap:soap:functions:mc-style:ZIFWS_INV_CANCEL:ZIffmBillingdocCancelRequest")
    @WebResult(name = "Status", targetNamespace = "")
    @RequestWrapper(localName = "ZIffmBillingdocCancel", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancel")
    @ResponseWrapper(localName = "ZIffmBillingdocCancelResponse", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", className = "com.cnk.travelogix.custom.zifwsb.inv.cancel.ZIffmBillingdocCancelResponse")
    public ZifstStatusDoc zIffmBillingdocCancel(
        @WebParam(name = "PBillingdoc", targetNamespace = "")
        String pBillingdoc,
        @WebParam(name = "PUniqid", targetNamespace = "")
        String pUniqid);

}
