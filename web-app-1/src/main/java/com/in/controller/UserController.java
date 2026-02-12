package com.in.controller;

import com.in.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping(value = "/form")
    public String showUserForm(Model model){
        model.addAttribute("user",new User());
        return "user-form";
    }

    @PostMapping(value = "/form")
    public String register(@Valid  @ModelAttribute("user") User user, BindingResult bindingResult,Model model){
         if(bindingResult.hasErrors()){
             return "user-form";
         }
         model.addAttribute("message","User Registration Success");
         model.addAttribute("user",new User());
         return "user-form";
    }

}
