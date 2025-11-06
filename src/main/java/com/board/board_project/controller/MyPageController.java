package com.board.board_project.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage") // localhost:8088/mypage
@RequiredArgsConstructor
public class MyPageController {
    @GetMapping("")
    public String mypage(HttpSession session) {
        if (session.getAttribute("member") == null) {
            return "redirect:/member/login"; // redirect:/ => localhost:8088/
        }
        return "mypage/mypage";
    }
}
