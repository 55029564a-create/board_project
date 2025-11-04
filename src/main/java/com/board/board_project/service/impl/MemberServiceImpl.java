package com.board.board_project.service.impl;


import com.board.board_project.domain.Member;
import com.board.board_project.dto.member.request.SignUpReq;
import com.board.board_project.dto.member.response.SignUpRes;
import com.board.board_project.repository.MemberRepository;
import com.board.board_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Fallback;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public SignUpRes signUp(SignUpReq signUpReq) {
        Member memberByEmail = memberRepository.findByEmail(signUpReq.getEmail());
        SignUpRes signUpRes = new SignUpRes();
        signUpRes.setSignUp(true);
        if (memberByEmail != null) {
            signUpRes.setSignUp(false);
            signUpRes.setEmailError("이미 사용중인 이메일 입니다.");
        }
        Member memberByNickname = memberRepository.findByNickname(signUpReq.getNickname());
        if (memberByNickname != null) {
            signUpRes.setSignUp(false);
            signUpRes.setNicknameError("이미 사용중인 닉네임 입니다.");
        }
        String encodePwd = passwordEncoder.encode(signUpReq.getPwd());
        signUpReq.setPwd(encodePwd);
        memberRepository.insertMember(signUpReq);
        return signUpRes;
    }
}
