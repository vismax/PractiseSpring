package com.baobao.controllers;

import com.baobao.model.Enter;
import com.baobao.repo.EnterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.ResultSet;

@Controller
public class RegisterController {
    @Autowired
    private EnterRepository repo;
    @ResponseBody
    @RequestMapping(value = "/practice/enter")

      public String register(@RequestBody Enter enter){
        try{
            repo.insertEnter(enter);
            return "success";

        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }


      }


}
