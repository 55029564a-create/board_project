package com.board.board_project.dto.post.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDetailRes {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime createdAt;
}
