/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.cnk.travelogix.jalo;

import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.EntityArrays;
import org.apache.commons.lang3.text.translate.LookupTranslator;

/**
 * 
 */
public class NetcoreEscapeUtils {

    /**
     * Translator object for escaping
     */
    public static final CharSequenceTranslator ESCAPE = new AggregateTranslator(new LookupTranslator(EntityArrays.BASIC_ESCAPE()),
	    new LookupTranslator(new String[][] { { "\u000c", "&#012;" }, { "\u0009", "&#009;" }, { "\u0025", "&#37;" }, { "\n", "&#010;" }, { "'", "&apos;" } }));;

    /**
     * @param input
     */
    public static String escape(final String input) {
	return ESCAPE.translate(input);
    }
    
    public static void main(String args[]) {

	String xmlWithSpecial = "\n ' \" & > < \f \t %";
	String xmlWithSpecial1 = "\n \n \n \n \n";
	System.out.println("Original unescaped XML String: " + xmlWithSpecial);
	System.out.println("Escaped XML String in Java: " + NetcoreEscapeUtils.escape(xmlWithSpecial));

    }

}
