package com.example.myspringwebhelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {
    @GetMapping("/")
    String group() {
        return "group.html";
    }

    @GetMapping("/vlad")
    String vlad() {
        return "vlad.html";
    }

    @GetMapping("/anya")
    String anya() {
        return "anya.html";
    }
}
