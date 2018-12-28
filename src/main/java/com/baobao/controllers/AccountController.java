package com.baobao.controllers;

import com.baobao.model.Account;
import com.baobao.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class AccountController {

    @Autowired
    private AccountRepository repo;

    @ResponseBody
    @RequestMapping(value="/practice/input")

    public String input(@RequestBody Account account){

        try {
             repo.insertAccount(account);


            return "success";

        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();

        }

    }






}
