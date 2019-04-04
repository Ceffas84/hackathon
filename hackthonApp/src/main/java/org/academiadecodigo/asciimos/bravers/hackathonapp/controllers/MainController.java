package org.academiadecodigo.asciimos.bravers.hackathonapp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {


    @GetMapping(path = "homepage")
    public String homePage() {
        return "redirect:/pages/homepage.html";
    }



}
