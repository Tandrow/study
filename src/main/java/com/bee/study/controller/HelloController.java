package com.bee.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(String name) {
        return "hello spring change";
    }

    @RequestMapping(value = "/live")
    @ResponseBody
    public String testLive() {
        return "live changes";
    }

}
