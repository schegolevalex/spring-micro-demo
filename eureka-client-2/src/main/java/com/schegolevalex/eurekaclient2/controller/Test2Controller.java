package com.schegolevalex.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Test2Controller {

    @GetMapping("/name")
    public String name() {
        return "Hello world";
    }
}
