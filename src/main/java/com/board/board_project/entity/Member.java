package com.board.board_project.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
    private Long id;
    private String email;
    private String pwd;
    private String name;
    private String nickName;
    private LocalDateTime createAt;
}
