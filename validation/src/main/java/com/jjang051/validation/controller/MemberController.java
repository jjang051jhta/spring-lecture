package com.jjang051.validation.controller;

import com.jjang051.validation.dto.MemberDto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("memberDto",new MemberDto());
        return "member/add";
    }
    @PostMapping("/add")
    public String addProcess(@Valid @ModelAttribute MemberDto memberDto,
                             BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            System.out.println(memberDto);
            model.addAttribute("msg",true);
            return "member/add";
        }
        System.out.println(memberDto);
        return "redirect:member/list";
    }

    @GetMapping("/{id}/detail")
    public String detail(@PathVariable("id") Integer id){
        return "member/detail";
    }
}
