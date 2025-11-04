package com.board.board_project.dto.member.request;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SignUpReq {
    private String email;
    private String pwd;
    private String name;
    private String nickname;
}
