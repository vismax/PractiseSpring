package com.baobao.controllers;

import com.baobao.model.Book;
import com.baobao.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.sql.ResultSet;

@Controller
public class BookController {

    @Autowired
    private BookRepository repo;

   @ResponseBody
   @RequestMapping(value = "/practice/book")
    public String book(@RequestBody Book book,
                       HttpServletResponse resp){
       ResultSet result=null;

       try{

           repo.insertBook(book);
           return "success";


       }catch(Exception e){
           e.printStackTrace();
           return e.getMessage();
       }



   }







}



