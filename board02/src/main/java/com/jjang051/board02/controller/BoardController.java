package com.jjang051.board02.controller;

import com.jjang051.board02.dao.BoardDao;
import com.jjang051.board02.dto.BoardDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardDao boardDao;

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardDto> boardList = boardDao.findAll();
        model.addAttribute("boardList", boardList);
        return "board/list";
    }

    @GetMapping("/write")
    public String write(Model model) {
        model.addAttribute("boardDto", new BoardDto());
        return "board/write";
    }
    @PostMapping("/write")
    public String writeProcess(@Valid BoardDto boardDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "board/write";
        }
        System.out.println(boardDto);
        int result = boardDao.writeBoard(boardDto);
        if(result > 0) {
            return "redirect:/board/list";
        }
        return "board/write";
    }
    @GetMapping("/{id}/detail")
    public String write(@PathVariable("id") int id, Model model) {
        BoardDto boardDto = boardDao.findById(id);
        model.addAttribute("boardDto", boardDto);
        return "board/detail";
    }
}