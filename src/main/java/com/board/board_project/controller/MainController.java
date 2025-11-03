package com.board.board_project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/") // => http:/localhost:8088/
public class MainController {
    @GetMapping("")
    public String test() {
        return "home/index";
    }
}
