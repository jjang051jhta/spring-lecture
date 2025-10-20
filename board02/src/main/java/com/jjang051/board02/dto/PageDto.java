package com.jjang051.board02.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDto {
    private int page;
    private int size;
    //0~10,11~20
}
