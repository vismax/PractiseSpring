package com.baobao.controllers;

import com.baobao.model.Enter;
import com.baobao.repo.EnterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;

@Controller
public class PassportController {


    @Autowired
    private EnterRepository repo;

    @ResponseBody
    @RequestMapping(value = "/practice/login")
    public String login(@RequestBody Enter enter,
                        HttpServletResponse response){
        ResultSet resultSet =null;

        try{

            resultSet = repo.queryEnter(enter.getUsername());

            if(resultSet.next()){
                if (enter.getPassword().equals(resultSet.getString("password"))) {
                    Cookie nameCookie = new Cookie("username", enter.getUsername());
                    nameCookie.setMaxAge(60*60*24);
                    nameCookie.setDomain("");
                    nameCookie.setPath("/");
                    response.addCookie(nameCookie);

                    Cookie passwordCookie = new Cookie("password", enter.getPassword());
                    passwordCookie.setMaxAge(60*60*24);
                    passwordCookie.setDomain("");
                    passwordCookie.setPath("/");
                    response.addCookie(passwordCookie);


                   return "success";
                } else {
                   return "password wrong";
                }
            }else{
                return "username not found";
            }

        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
