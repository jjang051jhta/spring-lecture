package com.jjang051.board02.controller;


import com.jjang051.board02.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("memberDto",new MemberDto());
        return "member/signup";
    }
}
