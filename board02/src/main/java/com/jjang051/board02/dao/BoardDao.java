package com.jjang051.board02.dao;

import com.jjang051.board02.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {
    int writeBoard(BoardDto boardDto);
    List<BoardDto> findAll();

    BoardDto findById(int id);
}
