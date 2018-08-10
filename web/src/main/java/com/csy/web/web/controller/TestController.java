package com.csy.web.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("sb","sb");
        return "index";
    }
}
