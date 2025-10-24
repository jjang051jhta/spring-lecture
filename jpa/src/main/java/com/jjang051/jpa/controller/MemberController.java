package com.jjang051.jpa.controller;

import com.jjang051.jpa.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/signup")
    public String signup(){
        return "member/signup";
    }
    @PostMapping("/signup")
    public String signupProcess(){
        memberService.save();
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

}
