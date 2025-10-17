package com.jjang051.board02.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDto {
    private int id;
    private String userID;
    private String userPW;
    private String userName;
    private String userEmail;
}
