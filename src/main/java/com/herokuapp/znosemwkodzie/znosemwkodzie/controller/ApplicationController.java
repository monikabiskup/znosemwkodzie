package com.herokuapp.znosemwkodzie.znosemwkodzie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/")
    public String sayHello() {
        return "welcomeTemplate";
    }


    @GetMapping("/main")
    public String getMain() {
        return "welcomeTemplate";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "aboutTemplate";
    }

    @GetMapping("/listOfUsers")
    public String getListOfUsers() {
        return "listOfUsersTemplate";
    }

    @GetMapping("/listOfGames")
    public String getListOfGames() {
        return "listOfGamesTemplate";
    }

    @GetMapping("/registrationForm")
    public String getRegistrationForm() {
        return "registrationFormTemplate";
    }

    @GetMapping("/contact")
    public String getContact() {
        return "contactTemplate";
    }

    @GetMapping("/faq")
    public String getFAQ() {
        return "FAQTemplate";
    }
}