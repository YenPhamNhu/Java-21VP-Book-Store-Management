package org.example.bookstoremanagement.controller;

import lombok.RequiredArgsConstructor;
import org.example.bookstoremanagement.entity.User;
import org.example.bookstoremanagement.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/all-user")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUser();
        model.addAttribute("users", users);
        return "index";
    }
}
