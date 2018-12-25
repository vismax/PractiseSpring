package com.baobao.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;

@Controller()
public class HellowordController {


    @ResponseBody
    @RequestMapping("/hello")
    public String login(){

        return "hello world";
    }
}
