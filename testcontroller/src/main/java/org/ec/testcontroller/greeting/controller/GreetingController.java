package org.ec.testcontroller.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String today(Model model) {
        Date now = new Date();
        model.addAttribute("now", now);
        return "greeting";
    }
}
