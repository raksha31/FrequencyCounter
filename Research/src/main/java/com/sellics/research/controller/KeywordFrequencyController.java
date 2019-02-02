package com.sellics.research.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sellics.research.dto.KeywordScoreResponseDto;
import com.sellics.research.service.KeywordFrequencyService;;

@RestController
@RequestMapping("/sellics")
public class KeywordFrequencyController {
	
	@Autowired
	KeywordFrequencyService keywordFrequencyService;
	
	@GetMapping("/keyword/frequency")
	KeywordScoreResponseDto generateKeywordScore(String keyword) throws JSONException {
		KeywordScoreResponseDto result=null;
		result = keywordFrequencyService.calculateKeywordScore(keyword);
		return result;
	}
}
