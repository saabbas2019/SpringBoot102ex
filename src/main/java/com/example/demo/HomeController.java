package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myv1", "Hello everone one!");
        model.addAttribute("myv2", "This is Shukrat");
        return "hometemplate";
    }
}

