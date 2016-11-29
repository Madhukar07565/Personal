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

import org.springframework.web.client.RestTemplate;

/**
 *
 */
public class RestTemplateTest {
    
    public static void main(String[] args) {
	RestTemplate tem = new RestTemplate();
	
	final String forObject = tem.getForObject("https://www.googleapis.com/oauth2/v3/tokeninfo?id_token=eyJhbGciOiJSUzI1NiIsImtpZCI6IjhjMjkyMTE4MDk2YjY5ZWFlNWNmYjlhNzRhMjdlNTlhOGU2MzllZGQifQ.eyJpc3MiOiJhY2NvdW50cy5nb29nbGUuY29tIiwiYXRfaGFzaCI6IjNkMEFZbW9lVFo3aG1fRV9sQy1VdWciLCJhdWQiOiI3Mjk0MDk3MzQzMTctMzcya21ra2oyM2xrMGprM2Rnb2p2c2Vpa3IyaHB0a2ouYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTY4OTY1NjI5MDQxMzM1NzA4NDUiLCJlbWFpbF92ZXJpZmllZCI6dHJ1ZSwiYXpwIjoiNzI5NDA5NzM0MzE3LTM3Mmtta2tqMjNsazBqazNkZ29qdnNlaWtyMmhwdGtqLmFwcHMuZ29vZ2xldXNlcmNvbnRlbnQuY29tIiwiZW1haWwiOiJkZWVrc2hhLmFyM0BnbWFpbC5jb20iLCJpYXQiOjE0NjcxMDc1MDgsImV4cCI6MTQ2NzExMTEwOCwibmFtZSI6IkRlZWtzaGl0aGEgQXIiLCJnaXZlbl9uYW1lIjoiRGVla3NoaXRoYSIsImZhbWlseV9uYW1lIjoiQXIiLCJsb2NhbGUiOiJlbi1HQiJ9.PXiz_xQbcs5CtNi74JddLus1bhLB9qCbVekqDoOaOUzupsGIF3_h7uPyZcotLPCllxTOmkcW9wL8mcYJQk4PmPCRfWkO0OdMr-0Bg8gSvLn_n9XaxVBi4oLE9CjKhPwsOPSAnRl6KQlDVmab3uCd0rlgxuf7PLstMqFBjsyqDe2hIrYMBQtB9E9ZyZXK-tR_joNMRRczG14HEn-XU4-w0Xiu3AiwgRejUUsXuXmSC8WUbY2HgTaqLEWQAaTmWdsITIbOopYvPQXIK6QMPpWJGGhjcynHlmBp8f8e7l37V7-gDpchZydapDg2NarCP4ULazR7oHxcJoPt0beJuqQWBQ", String.class);
	
	System.out.println(forObject);
    }

}
