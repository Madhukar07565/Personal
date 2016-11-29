/**
 * 
 */
package com.cnk.travelogix.common.storefront.controllers;

/**
 * @author I320212
 *
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cnk.travelogix.operations.bookingdocument.data.BookingDocumentData;
import com.cnk.travelogix.operations.bookingdocument.data.BookingDocumentData;

import java.util.List;

import com.cnk.travelogix.operations.facades.BookingDocumentFacade;


public class BookingDocumentsController
{

	
	private BookingDocumentFacade bookingdocumentFacade;
	

	
	 @RequestMapping(value = "/documents/"+"{orderCode:.*}")
    public String showBookingDocuments(@PathVariable("orderCode") final String orderCode, final Model model)
    {
		  
        final BookingDocumentData documents = bookingdocumentFacade.getBookingDocument(orderCode);
        model.addAttribute("documents", documents);
        return "CustomerDocumentListing";
    }
 
	 
	  @Autowired
	    public void setFacade(final BookingDocumentFacade facade)
	    {
	        this.bookingdocumentFacade = facade;
	    }
	 
	
	  
}
