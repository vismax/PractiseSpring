package com.baobao.service;

import com.baobao.config.AppConfig;
import com.baobao.dao.AccountMapper;
import com.baobao.po.AccountBookPO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CityService {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountBookPO po = configApplicationContext.getBean(AccountMapper.class).getAccount(7);
        System.out.println();
    }

//    AccountMapper dao;
//    public void query(){
//        System.out.println(dao.query);
//    }
}
