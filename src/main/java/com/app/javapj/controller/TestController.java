package com.app.javapj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/")
    @ResponseBody
    public String listAllContact(){
       return  "Khanhnv";
    }
}
