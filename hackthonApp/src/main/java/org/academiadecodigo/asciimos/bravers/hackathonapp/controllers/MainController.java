package org.academiadecodigo.asciimos.bravers.hackathonapp.controllers;


import org.academiadecodigo.asciimos.bravers.hackathonapp.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping(path = "user/{id}")
    public String getUser() {

        return "/initialMood";
    }
}
