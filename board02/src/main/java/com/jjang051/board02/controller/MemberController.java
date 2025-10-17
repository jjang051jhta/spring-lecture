package com.jjang051.board02.controller;


import com.jjang051.board02.dao.MemberDao;
import com.jjang051.board02.dto.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberDao memberDao;
    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("memberDto",new MemberDto());
        return "member/signup";
    }
    @PostMapping("/idCheck")
    @ResponseBody
    public Map<String, Boolean> idCheck(@RequestBody MemberDto memberDto){
        int result = memberDao.idCheck(memberDto);
        Map<String, Boolean> map = new HashMap<>();
        if(result > 0) {
            map.put("isDuplicate", true);
        } else {
            map.put("isDuplicate", false);
        }
        System.out.println("result==="+result);
        return map;
    }

}
