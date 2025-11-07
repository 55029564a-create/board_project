package com.board.board_project.controller;

import com.board.board_project.dto.member.response.LoginRes;
import com.board.board_project.service.MypageService;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/mypage") // localhost:8088/mypage
@RequiredArgsConstructor
public class MyPageController {

    private final MypageService mypageService;

    @GetMapping("")
    public String mypage(HttpSession session) {
        if (session.getAttribute("member") == null) {
            return "redirect:/member/login"; // redirect:/ => localhost:8088/
        }
        return "mypage/mypage";
    }

    @GetMapping("/nickname")
    public String nickname() {
        return "mypage/nickname";  // 템플릿 밑에있는 경로
    }
    @PostMapping("/nickname")
    public String nickname(@RequestParam String nickname, HttpSession session, Model model) {
        LoginRes loginRes = (LoginRes) session.getAttribute("member");
        System.out.println(nickname);
        System.out.println(loginRes.getId());
        boolean result = mypageService.updateNickname(nickname, loginRes.getId());
        if (result) {
            loginRes.setNickname(nickname);
            session.setAttribute("member", loginRes);
            return "mypage/mypage";
        }
        model.addAttribute("errorMsg", "이미 사용중인 닉네임 입니다.");
        return "mypage/nickname";
    }
}
