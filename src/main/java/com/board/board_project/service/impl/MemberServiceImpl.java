package com.board.board_project.service.impl;


import com.board.board_project.controller.MemberController;
import com.board.board_project.dto.request.SignUpReq;
import com.board.board_project.repository.MemberRepository;
import com.board.board_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Long signUp(SignUpReq signUpReq) {
        signUpReq.setPwd(passwordEncoder.encode(signUpReq.getPwd()));
       Long id = memberRepository.insertMember(signUpReq);
        return id;
    }
}
