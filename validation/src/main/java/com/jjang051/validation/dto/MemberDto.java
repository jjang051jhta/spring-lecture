package com.jjang051.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    //sequence db에서 처리
    private int id;

    @NotBlank(message = "사용자 아이디는 필수입력사항입니다.")
    private String userID;

    @NotBlank(message = "비밀번호는 필수입력사항입니다.")
    @Size(min = 4, max = 16, message = "비민번호는 4글자 이상 16자 이하로 압력해주세요.")
    private String userPW;

    @NotBlank(message = "이름은 필수입력사항입니다.")
    private String userName;

    @Email(message = "이메일 형식에 맞게 입력해주세요.")
    private String userEmail;
}
