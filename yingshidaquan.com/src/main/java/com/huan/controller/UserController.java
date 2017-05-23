package com.huan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hs on 2017/5/21.
 */
@Controller
@RequestMapping("/yingshidaquan")
public class UserController {
    @RequestMapping("/login")
    public String login(){
        System.out.print("进来登录");
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        System.out.print("进来主界面");
        return "index";
    }
}
