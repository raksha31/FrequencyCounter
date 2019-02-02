package com.sellics.research.dto;

import lombok.Data;

@Data
public class KeywordScoreResponseDto {
	public KeywordScoreResponseDto(String keyword, Integer score) {
		this.keyword = keyword;
		this.score = score;
	}
	private String keyword;
	private Integer score;
}
