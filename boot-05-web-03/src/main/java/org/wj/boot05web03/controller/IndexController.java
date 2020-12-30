package org.wj.boot05web03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(String username, String password) {

        return "main";
    }
}
