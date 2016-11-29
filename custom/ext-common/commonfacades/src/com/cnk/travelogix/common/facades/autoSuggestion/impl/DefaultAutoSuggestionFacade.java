/**
 * 
 */
package com.cnk.travelogix.common.facades.autoSuggestion.impl;

import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;

import java.util.ArrayList;
import java.util.List;

import com.cnk.travelogix.common.facades.autoSuggestion.AutoSuggestionFacade;

/**
 * @author i313890
 *
 */
public class DefaultAutoSuggestionFacade implements AutoSuggestionFacade
{

	@Override
	public List<AutocompleteSuggestionData> getSuggestedArea(String term)
	{
		return this.mockArea();
	}

	@Override
	public List<AutocompleteSuggestionData> getSuggestedChain(String term)
	{
		return new ArrayList();
	}
	
	public List<AutocompleteSuggestionData> mockArea(){
		List<AutocompleteSuggestionData> list = new ArrayList<AutocompleteSuggestionData>();
		list.add(createAutocompleteSuggestionData("Africa"));
		list.add(createAutocompleteSuggestionData("Asia"));
		list.add(createAutocompleteSuggestionData("Europe"));
		list.add(createAutocompleteSuggestionData("North America"));
		list.add(createAutocompleteSuggestionData("Oceania"));
		list.add(createAutocompleteSuggestionData("South America"));
		return list;
	}
	private AutocompleteSuggestionData createAutocompleteSuggestionData(String term){
		AutocompleteSuggestionData data = new AutocompleteSuggestionData();
		data.setTerm(term);
		return data;
	}
	
	
}
