package com.jjang051.db02.repository;

import com.jjang051.db02.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    //세터 주입 방식,필드 주입 장식
    //@Autowired
    private final JdbcTemplate jdbcTemplate;

    //생성자 주입방식
    /*
    public MemberRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     */
    public List<Member> findAll(){
        String sql = "select * from member";
        List<Member> memberList =
                jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Member.class));
        return memberList;
    }
}
