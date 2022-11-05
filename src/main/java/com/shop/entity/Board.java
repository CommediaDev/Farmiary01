package com.shop.entity;

import com.shop.dto.BoardFormDto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="board")
@Getter
@Setter
@ToString
public class Board extends BaseEntity {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String content;

    public void updateBoard(BoardFormDto boardFormDto) {
        this.title = boardFormDto.getTitle();
        this.content = boardFormDto.getContent();
    }
}
