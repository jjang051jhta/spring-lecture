package com.jjang051.db02.controller;

import com.jjang051.db02.dto.Member;
import com.jjang051.db02.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository  memberRepository;
    @GetMapping("/member/list")
    public String memberList(Model model){
        List<Member> memberList = memberRepository.findAll();
        model.addAttribute("memberList",memberList);
        return "member/list";
    }
}
