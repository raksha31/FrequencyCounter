package com.sellics.research.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KeywordScoreResponseDto {
    private String keyword;
    private Integer score;
}
