package com.jjang051.board02.controller;

import com.jjang051.board02.dao.BoardDao;
import com.jjang051.board02.dto.BoardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
