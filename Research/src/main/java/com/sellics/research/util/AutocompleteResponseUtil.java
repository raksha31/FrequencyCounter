package com.sellics.research.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Component;

@Component
public class AutocompleteResponseUtil {

	public List<String> getSuggestionList(String autocompleteResponse) throws JSONException {

		JSONArray arrJson = new JSONArray(autocompleteResponse);
		JSONArray suggestions = arrJson.getJSONArray(1);

		List<String> suggestionList = new ArrayList<>();
		
		for(int j = 0; j < suggestions.length(); j++) {
			suggestionList.add(suggestions.getString(j));
		}
		return suggestionList;
	}
}
