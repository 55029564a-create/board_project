package com.board.board_project.repository;


import com.board.board_project.dto.request.SignUpReq;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@RequiredArgsConstructor
public class MemberRepository {
    private final JdbcTemplate jdbcTemplate;
    public Long insertMember(SignUpReq signUpReq) {
        Long result = 0L;
        String sql = "insert into member (email, pwd, name, nickname) valuse (?, ?, ?, ?)";
        try {
            jdbcTemplate.update(sql, signUpReq.getEmail(),signUpReq.getPwd(),signUpReq.getName(),signUpReq.getNickname());
            result = jdbcTemplate.queryForObject("select member_seq.currval from dual", Long.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
