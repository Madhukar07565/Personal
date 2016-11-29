/**
 * 
 */
package com.cnk.travelogix.common.facades.autoSuggestion;

import de.hybris.platform.commercefacades.search.data.AutocompleteSuggestionData;

import java.util.List;

/**
 * @author i313890
 *
 */
public interface AutoSuggestionFacade
{
	public List<AutocompleteSuggestionData> getSuggestedArea(String term);

	public List<AutocompleteSuggestionData> getSuggestedChain(String term);
	
	
}
