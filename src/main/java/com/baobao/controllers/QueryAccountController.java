package com.baobao.controllers;

import com.baobao.model.Account;
import com.baobao.model.Enter;
import com.baobao.repo.AccountRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.sql.ResultSet;
import java.util.List;

@Controller
public class QueryAccountController {
    @Autowired
    AccountRepository repo;


    @ResponseBody
    @RequestMapping(value="/practice/queryAccount")
    public  List<Account> query(@CookieValue("username")String username){

        try{
            return repo.queryAccount(username);

//            return "<html><>asdyfsdfiydufh</html>";

        }catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }

}
