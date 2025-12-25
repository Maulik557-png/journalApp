package com.personal.journalApp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/journals")
public class AdditionController {

    @PostMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b){
        log.info("Adding a {} and b {}", a, b);
        return a+b;
    }
}
