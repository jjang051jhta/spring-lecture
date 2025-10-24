package com.jjang051.jpa.service;

import com.jjang051.jpa.entity.Member;
import com.jjang051.jpa.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public Member save(){
        Member member = Member.builder()
                .userID("hong")
                .userPW("1234")
                .userName("홍길동")
                .zipcode("12345")
                .userAddress("경기도 일산시 장항동 11")
                .userEmail("hong@daum.net")
                .build();
        Member insertedMember = memberRepository.save(member);
        return insertedMember;
    }
}
