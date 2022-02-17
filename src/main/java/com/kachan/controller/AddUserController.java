package com.kachan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("addUser")
public class AddUserController {

    @GetMapping
    public String addUser() {
        return "addUser";
    }
}
