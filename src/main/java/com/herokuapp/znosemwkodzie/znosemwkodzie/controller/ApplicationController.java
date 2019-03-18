package com.herokuapp.znosemwkodzie.znosemwkodzie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ApplicationController {

    @GetMapping("/main")
    public String sayHello() {
        return "welcomeTemplate";
    }

    @GetMapping("/spojChallenge")
    public String takeToSpojChallenge() {
        return "spojChallengeTemplate";
    }

    @GetMapping("/algorithmChallenge")
    public String takeToAlgorithmChallenge() {
        return "algorithmChallengeTemplate";
    }

    @GetMapping("/windowApplicationsChallenge")
    public String takeToWindowApplicationsChallenge() {
        return "windowApplicationsChallengeTemplate";
    }

    @GetMapping("/about")
    public String takeToAbout() {
        return "aboutTemplate";
    }

    @GetMapping("/contact")
    public String takeToContact() {
        return "contactTemplate";
    }

    @GetMapping("/faq")
    public String takeToFAQ() {
        return "FAQTemplate";
    }
}