package com.cozlinT.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String Testinit() {
        System.out.println("test");
        return "index";
    }
}
