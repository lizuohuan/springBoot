package com.lzh.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzh
 * @create 2017/3/27 10:20
 */
@RestController
@RequestMapping("/index")
public class TestController {

    @RequestMapping("/index")
    public String index(){
        return "Hello World";
    }
}
