package com.jjang051.board02.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class BoardDto {
    private int id;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regdate;
    private int hit;
    private String password;
}
