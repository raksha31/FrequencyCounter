package com.sellics.research.service;

import com.sellics.research.dto.ScoreMatch;
import com.sellics.research.dto.SellicsResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.h2.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KeywordFrequencyServiceImpl implements KeywordFrequencyService {

    @Autowired
    private ScoreCalculator scoreCalculator;

    @Override
    public SellicsResponseDTO calculateKeywordScore(String inputString) {

        if (StringUtils.isNullOrEmpty(inputString))
            return new SellicsResponseDTO(inputString, 0);

        String partialString = "";
        Integer wordWeigtage = 100 / inputString.length();
        ScoreMatch scoreMatch = new ScoreMatch(100, false);

        for (int i = 0; i < inputString.length(); i++) {
            partialString += inputString.charAt(i);
            scoreMatch = scoreCalculator.calculateScoreForString(partialString, inputString.toLowerCase(), scoreMatch, wordWeigtage);
            if (scoreMatch.getMatch()) {
                return new SellicsResponseDTO(inputString, scoreMatch.getScore());
            }
        }
        return new SellicsResponseDTO(inputString, 0);
    }

}