package com.Portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String home() {
        return "main";
    }


    @GetMapping(value = "/about")
    public String about() {
        return "about";
    }

    @GetMapping(value = "/resume")
	public String resume() {
		return "resume";
	}

    @GetMapping(value = "/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping(value = "/work")
    public String work() {
        return "work";
    }
}
