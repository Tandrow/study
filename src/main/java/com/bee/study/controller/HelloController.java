package com.bee.study.controller;

import com.bee.study.domain.req.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/index")
    public String index() {
        return "/hello.html";
    }

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

    @RequestMapping(value = "/login")
    @ResponseBody
    public Object testLogin(@Validated(UserInfo.Login.class) UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "参数错误";
        }
        return "login success";
    }

    @RequestMapping(value = "/reg")
    @ResponseBody
    public Object testReg(@Validated(UserInfo.Register.class) UserInfo userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "参数错误";
        }
        return "reg success";
    }

}
