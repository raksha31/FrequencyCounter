package com.sellics.research.service;

import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Service;

import com.sellics.research.dto.KeywordScoreResponseDto;

@Service
public interface KeywordFrequencyService {
	
	public KeywordScoreResponseDto calculateKeywordScore(String keyword)throws JSONException;
}
