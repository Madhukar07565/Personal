
package com.cnk.travelogix.custom.mappingtable.maintain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SubscriberMappingTableManagementServices", targetNamespace = "http://subscribermappingtable.ws.highdeal.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SubscriberMappingTableManagementServices {


    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.MappingTableOperationResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableCreateResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public MappingTableOperationResponse mappingTableCreate(
        @WebParam(name = "mappingTableCreateRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        CreateMappingTableRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.MappingTableOperationResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableMaintainResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public MappingTableOperationResponse mappingTableMaintain(
        @WebParam(name = "mappingTableMaintainRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        MaintainMappingTableRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.MappingTableOperationResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableCancelResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public MappingTableOperationResponse mappingTableCancel(
        @WebParam(name = "mappingTableCancelRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        CancelMappingTableRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.FindMappingTableResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableFindResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public FindMappingTableResponse mappingTableFind(
        @WebParam(name = "mappingTableFindRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        FindMappingTableRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.MappingTableRowOperationResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableRowMaintainResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public MappingTableRowOperationResponse mappingTableRowMaintain(
        @WebParam(name = "mappingTableRowMaintainRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        MaintainMappingTableRowRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns com.cnk.travelogix.custom.subscriber.mappingtblmgmt.MappingTableRowOperationResponse
     */
    @WebMethod
    @WebResult(name = "mappingTableRowCancelResponse", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
    public MappingTableRowOperationResponse mappingTableRowCancel(
        @WebParam(name = "mappingTableRowCancelRequest", targetNamespace = "http://schema.subscribermappingtablemanagement.ws.highdeal.com/", partName = "parameters")
        CancelMappingTableRowRequest parameters);

}
