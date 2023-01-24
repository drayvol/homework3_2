package com.example.appname.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class FirstController {
    @GetMapping
    public String hw(){
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String second(){
        return "Alex <br> Project: RecipeBook <br> Was Created 25.01.2023 <br> This project is dedicated to recipes description";
    }
}
