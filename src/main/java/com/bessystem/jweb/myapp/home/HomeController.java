package com.bessystem.jweb.myapp.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static Logger log = LoggerFactory.getLogger(HomeController.class);

    @GetMapping(value = {"/", "/home"})
    public String home(Model model) {
        System.out.println("======> Call in Home Controller...");
        log.info("Hello ---------->........中文测试");
        model.addAttribute("title", "欢迎来到 JWeb app...");
        return "home";
    }
}
