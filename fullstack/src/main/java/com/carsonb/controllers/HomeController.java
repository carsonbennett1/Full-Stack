package com.carsonb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

// Class treated by springboot as a place that is controlling other pages
@Controller
public class HomeController {

    // return a string from /test url
    // @GetMapping --> Look for anything with /test1 in browser bar
    // If so, trigger event (@ResponseBody)
    @GetMapping("/test1")
    @ResponseBody
    public String printHello(){
        return "Hello There!";
    }
    
    @GetMapping("/thyme")
    public String ShowHelloPage(Model model){
        model.addAttribute("message", "Have a great day :)");
        model.addAttribute("date", "2025-02-09");
        return "helloPage";
    }
}
