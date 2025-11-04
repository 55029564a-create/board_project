package com.board.board_project.service;

import com.board.board_project.dto.member.request.SignUpReq;
import com.board.board_project.dto.member.response.SignUpRes;

public interface MemberService {
    SignUpRes signUp(SignUpReq signUpReq);
}
