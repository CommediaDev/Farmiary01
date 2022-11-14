package com.shop.dto;

import com.shop.entity.ItemImg;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter @Setter
public class ItemImgDto {

    private Long id;

    private String imgName;

    private String oriImgName;

    private String imgUrl;

    private String repImgYn;

    private static ModelMapper modelMapper = new ModelMapper();


    public static ItemImgDto of(ItemImg itemImg) {       //static 선언으로 ItemImgDto 생성하지 않아도 호출
        return modelMapper.map(itemImg,ItemImgDto.class);//ItemImg 엔티티를 파라미터로 받아서 ItemImg의  자료형과 멤버변수의 이름이 같을 때
                                                         //ItemImgDto로 값을 복사해서 반환
    }

}