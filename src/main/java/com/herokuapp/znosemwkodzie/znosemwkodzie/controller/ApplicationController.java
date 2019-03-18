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

    @GetMapping("/spojChallenge")
    public String getSpojChallenge() {
        return "spojChallengeTemplate";
    }

    @GetMapping("/algorithmChallenge")
    public String getAlgorithmChallenge() {
        return "algorithmChallengeTemplate";
    }

    @GetMapping("/windowApplicationsChallenge")
    public String getWindowApplicationsChallenge() {
        return "windowApplicationsChallengeTemplate";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "aboutTemplate";
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