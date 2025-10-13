package com.jjang051.board.controller;

import com.jjang051.board.dto.BoardDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//component scan의 대상이 된다.
@Controller
public class BoardController {
    private final List<BoardDto> boardDtoList = new ArrayList<>();

    @PostConstruct
    public void init(){
        boardDtoList.add(
                BoardDto.builder()
                        .idx(1)
                        .writer("장성호")
                        .hit(1)
                        .title("여기까지만 할 예정입니다.")
                        .content("안되는 건 돌아다니면서 봐줄테니 반드시 한번씩 해보세요.")
                        .regdate(LocalDateTime.now())
                        .build()
        );
        boardDtoList.add(
                BoardDto.builder()
                        .idx(2)
                        .writer("정형돈")
                        .hit(1)
                        .title("웨이러 미닛")
                        .content("spring boot는 어렵지 않습니다.")
                        .regdate(LocalDateTime.now().minusDays(1))
                        .build()
        );
        boardDtoList.add(
                BoardDto.builder()
                        .idx(3)
                        .writer("유재석")
                        .hit(1)
                        .title("졸리더라도 해보세요.")
                        .content("spring boot는 어렵지 않습니다. 진짜에요")
                        .regdate(LocalDateTime.now().minusDays(2))
                        .build()
        );
    }

    @GetMapping("/board/list")
    public String list(){
        return "board/list";
    }
}
