package com.shop.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class MainItemDto {

    private Long id;

    private String itemNm;

    private String itemDetail;

    private String imgUrl;

    private Integer price;

    private LocalDateTime updateTime;

    private String createdBy;


    @QueryProjection
    public MainItemDto(Long id, String itemNm, String itemDetail,
                       String imgUrl,Integer price, LocalDateTime updateTime, String createdBy){
        this.id = id;
        this.itemNm = itemNm;
        this.itemDetail = itemDetail;
        this.imgUrl = imgUrl;
        this.price = price;
        this.updateTime = updateTime;
        this.createdBy = createdBy;
    }

}