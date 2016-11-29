package com.cnk.travelogix.suppliers.common.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.cnk.travelogix.suppliers.air.converter.AirPriceConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRePriceConverter;
import com.cnk.travelogix.suppliers.air.converter.AirRetrievePNRConverter;
import com.cnk.travelogix.suppliers.air.converter.AirSellConverter;
import com.cnk.travelogix.suppliers.air.data.AirBookResponseWrapper;
import com.cnk.travelogix.suppliers.air.data.AirPriceResponseWrapper;
import com.coxandkings.integ.suppl.airinterface.AirInterfaceRS;

public class XmlToObject {
    public static void main(String[] args) {

	try {
	    String folderLocation = "C:/Hybris/hybris-commerce-suite-6.0/hybris/bin/custom/integrations/suppliers/testsrc/xmls/";
	    File file = new File(folderLocation + "03_OTA_RePriceResponse.xml");
	    JAXBContext jaxbContext = JAXBContext.newInstance(AirInterfaceRS.class);

	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    System.out.println("Strat Unmarshal");
	    AirInterfaceRS airInterfaceRS = (AirInterfaceRS) jaxbUnmarshaller.unmarshal(file);
	    System.out.println("End Unmarshal");
	    
	    AirPriceConverter converter = new AirPriceConverter();
	    AirSellConverter sellConverter = new AirSellConverter();
	    AirRePriceConverter rePriceConverter = new AirRePriceConverter();
	    AirRetrievePNRConverter retrievePNRConverter = new AirRetrievePNRConverter();
	    System.out.println("Strat Conversion");
	    //final AirPriceResponseWrapper fromOTAAirBookRS = sellConverter.fromOTAAirPriceRS(airInterfaceRS);
	    //final AirBookResponseWrapper fromOTAAirBookRS = retrievePNRConverter.fromOTAAirBookRS(airInterfaceRS);
	    final AirPriceResponseWrapper fromOTAAirPriceRS = rePriceConverter.fromOTAAirRePriceRS(airInterfaceRS);
	    System.out.println("End Conversion");
	} catch (JAXBException e) {
	    e.printStackTrace();
	}

    }
}