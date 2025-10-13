package com.jjang051.member.dto;

import lombok.*;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardDto {
    private int idx;
    private String title;
    private LocalDateTime regdate;
    private int hit;
    private String writer;
}
