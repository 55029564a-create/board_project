package com.board.board_project.service;

import com.board.board_project.dto.request.SignUpReq;

public interface MemberService {
    Long signUp(SignUpReq signUpReq);
}
