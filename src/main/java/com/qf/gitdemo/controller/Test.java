package com.qf.gitdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ChenShuaiJian
 * @Date 2019/1/19
 */
@Controller
@RequestMapping(value = "test")
public class Test {

    @RequestMapping(value = "add")
    @ResponseBody
    public String add(){
        System.out.println("git");
        System.out.println("gitup");
        System.out.println("github，能不能好好玩了？");
        System.out.println("干你娘，听我的");
        System.out.println("你丑你先说");
        System.out.println("行吧，你短听你的");
        System.out.print("buxiaode");
        System.out.println("abc");
        System.out.println("sdas");
        return  "ok";
    }
}
