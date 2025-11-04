package com.board.board_project.controller;


import com.board.board_project.dto.member.request.SignUpReq;
import com.board.board_project.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/com/board/board_project/dto/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/signup")
    public String signup(Model model) {
        return "com/board/board_project/dto/member/signup";
    }
    @PostMapping("/signup")
    public String signUp(@ModelAttribute SignUpReq signUpReq) {
        Long id = memberService.signUp(signUpReq);
        return id != null ? "redirect:/" : "com/board/board_project/dto/member/signup";

    }
    @GetMapping("/login")
    public String login(){
        return "com/board/board_project/dto/member/login";
    }
}
