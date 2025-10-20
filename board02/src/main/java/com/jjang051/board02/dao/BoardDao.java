package com.jjang051.board02.dao;

import com.jjang051.board02.dto.BoardDto;
import com.jjang051.board02.dto.PageDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    int writeBoard(BoardDto boardDto);
    List<BoardDto> findAll(PageDto pageDto);

    BoardDto findById(int id);
    int deleteBoard(BoardDto boardDto);
    int totalPage();
}
