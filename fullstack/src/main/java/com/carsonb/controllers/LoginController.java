package com.carsonb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.carsonb.models.LoginModel;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/form")
    public String displayLoginForm(Model model){
        
        model.addAttribute("loginModel", new LoginModel());

        return "loginForm.html";
    }

    @PostMapping("/processLogin")
    public String processLogin(LoginModel loginModel, Model model){
        
        model.addAttribute("loginModel", loginModel);

        return "loginResults.html";
    }
}
