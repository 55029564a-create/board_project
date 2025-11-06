package com.board.board_project.dto.member.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRes {
    private Long id;
    private String email;
    private String name;
    private String nickname;
    private boolean isLogin;
    private String loginFail;

}
