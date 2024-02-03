package org.example.bookstoremanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model){
        return "login/index";
    }

    @PostMapping("/logout")
    public String logout(Model model){
        return "index";
    }
}
