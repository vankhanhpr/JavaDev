package com.app.javapj.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/test")
public class TestController {
    @GetMapping("/TestController")
    public String listAllContact(){
       return  "Khanhnv12312";
    }
}
