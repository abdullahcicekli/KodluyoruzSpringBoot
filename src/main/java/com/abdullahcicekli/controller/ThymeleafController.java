package com.abdullahcicekli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    @GetMapping("/thymeleaf1")
    //@ResponseBody
    public String getThymeleaf1(){
        return "thymeleaf1" ;
    }
    @GetMapping("thymeleaf2")
    public String getModel(Model model){
        model.addAttribute("isim","Sueda");
        model.addAttribute("isim","Aminenur");

        return "thymeleaf1";
    }
    @GetMapping("thymeleaf3")
    public String getModel2(Model model){
        model.addAttribute("isim","Sueda");
        model.addAttribute("isim","Aminenur");

        return "/thymeleaf_file/thymeleaf2";
    }
}
