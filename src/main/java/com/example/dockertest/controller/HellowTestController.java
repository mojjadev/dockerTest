package com.example.dockertest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowTestController {

    @RequestMapping("/hellow")
    public String getView(){
        return "HellowWorld";
    }
}
