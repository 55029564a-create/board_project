package com.board.board_project.dto.member.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SignUpRes {
    private boolean isSignUp;
    private String emailError;
    private String nicknameError;
}
