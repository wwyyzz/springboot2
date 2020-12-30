package org.wj.boot05web03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model) {

        model.addAttribute("msg","hello atguigu");
        model.addAttribute("link", "www.sina.com");
        return "success";

    }
}
