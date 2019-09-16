package com.demo.userservice.web.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by zh-ma
 * Date 2019/9/16 ${Time}
 */
@RestController
@RequestMapping("/common")
public class HelloWorld {
    @GetMapping("/hello")
    public String world(@RequestParam String name) {
        return name + "success";
    }
}
