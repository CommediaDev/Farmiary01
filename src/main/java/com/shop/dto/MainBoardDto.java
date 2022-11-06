package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MainBoardDto {
	
	private Long id;
	
	private String title;
	
	private String content;
	
	private String imgUrl;

	private LocalDateTime regTime;

	private String createdBy;
	
	@QueryProjection	// Querydsl로 결과 조회 시 MainBoardDto 객체로 바로 받아 오도록 활용
	public MainBoardDto(Long id, String title, String content, String imgUrl, LocalDateTime regTime, String createdBy) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.imgUrl = imgUrl;
		this.regTime = regTime;
		this.createdBy = createdBy;
	}
}
