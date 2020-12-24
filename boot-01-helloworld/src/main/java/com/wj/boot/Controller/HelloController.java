package com.wj.boot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, SpringBoot 2!";
    }
}
