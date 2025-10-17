package com.jjang051.board02.dao;

import com.jjang051.board02.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
    int signup(MemberDto memberDto);
}
