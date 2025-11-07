package com.board.board_project.repository;

import com.board.board_project.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MypageRepository {
    private final JdbcTemplate jdbcTemplate;

    public boolean findByNickname(String nickname) {
        // Sql문 생성
        String sql = "select count(*) from member where nickname = ?";

        // 만든 SQL문
        Integer result = jdbcTemplate.queryForObject(sql, Integer.class, nickname);
        return result == 0; // 0이면 true 0이아니면 false


    }

    public void updateNickname(String nickname, Long id) {
        // sql문 생성
        String sql = "update member SET nickname = ? where id =?";

        // 빡세노 맞음
        jdbcTemplate.update(sql, nickname, id); // insert나 update는 jdbctemplate. ??() 을 쓴다


    }
}
